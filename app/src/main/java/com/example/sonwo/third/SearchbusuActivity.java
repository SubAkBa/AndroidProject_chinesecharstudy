package com.example.sonwo.third;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.*;
import android.widget.*;

import java.util.ArrayList;

public class SearchbusuActivity extends AppCompatActivity {
    TextView strtext;
    GridView[] str = new GridView[10];
    Spinner strspinner;

    String[] strokeitems = {"선택", "1 획", "2 획", "3 획", "4 획", "5 획", "6 획", "7 획", "8 획", "9 획", "10 획이상"};
    ItemManager manager;

    ArrayList<BusuItem> busuitemlist;
    ArrayList<String> spinneritem;
    BusuAdapter busuadapter;
    SpinnerAdapter sadapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_searchbusu);

        strtext = (TextView)findViewById(R.id.strtext);

        str[0] = (GridView)findViewById(R.id.stroke1);
        str[1] = (GridView)findViewById(R.id.stroke2);
        str[2] = (GridView)findViewById(R.id.stroke3);
        str[3] = (GridView)findViewById(R.id.stroke4);
        str[4] = (GridView)findViewById(R.id.stroke5);
        str[5] = (GridView)findViewById(R.id.stroke6);
        str[6] = (GridView)findViewById(R.id.stroke7);
        str[7] = (GridView)findViewById(R.id.stroke8);
        str[8] = (GridView)findViewById(R.id.stroke9);
        str[9] = (GridView)findViewById(R.id.stroke10);

        busuadapter = new BusuAdapter(this);

        manager = new ItemManager();

        strspinner = (Spinner)findViewById(R.id.strspinner);
        spinneritem = new ArrayList<String>();
        for(int i=0;i<strokeitems.length;i++)
            spinneritem.add(strokeitems[i]);
        sadapter = new SpinnerAdapter(this, spinneritem);
        strspinner.setAdapter(sadapter);

        strspinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if(!strokeitems[i].equals("선택")) {
                    String[] strstr = strokeitems[i].split(" ");
                    int index = Integer.parseInt(strstr[0]);

                    strtext.setText(strstr[0].concat(" " + strstr[1]));

                    manager.AddBusuItems(index);
                    busuitemlist = manager.getBusuitems();

                    busuadapter.removeItem();

                    for (int j = 0; j < busuitemlist.size(); j++)
                        busuadapter.addItem(busuitemlist.get(j));

                    str[index - 1].setAdapter(busuadapter);

                    for (int k = 0; k < str.length; k++) {
                        if ((index - 1) == k)
                            str[k].setVisibility(View.VISIBLE);
                        else
                            str[k].setVisibility(View.INVISIBLE);
                    }
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {}
        });

        for(int j=0;j<str.length;j++) {
            str[j].setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    String clickbusu = busuitemlist.get(i).getBusu();

                    Intent busuit = new Intent();
                    busuit.putExtra("busu", clickbusu);
                    setResult(RESULT_OK, busuit);

                    finish();
                }
            });
        }

    }

}
