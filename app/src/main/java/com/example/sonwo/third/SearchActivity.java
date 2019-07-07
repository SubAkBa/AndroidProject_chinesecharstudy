package com.example.sonwo.third;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.*;
import android.widget.*;

import java.util.ArrayList;

public class SearchActivity extends AppCompatActivity {
    public static final int REQUEST_CODE_BUSU = 314;
    public static final int REQUEST_CODE_PART = 315;

    TextView busutext, parttext;
    Spinner spinner;
    LinearLayout hoonpart, busupart, partpart;
    EditText hoontext, ummtext;
    ListView listView;

    String[] itemstr = {"훈음", "부수", "부분한자"};

    ArrayList<HanJaItem> hanjaitemlist;
    ArrayList<String> spinneritem;
    SpinnerAdapter sadapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        final HanjaAdapter adapter = new HanjaAdapter(this);
        final HanjaAdapter busuadapter = new HanjaAdapter(this);
        ItemManager manager = new ItemManager();

        manager.AddHanJaItems();
        hanjaitemlist = manager.getHanjaitems();

        busutext = (TextView)findViewById(R.id.busutext);
        parttext = (TextView)findViewById(R.id.parttext);

        hoonpart = (LinearLayout)findViewById(R.id.hoonpart);
        busupart = (LinearLayout)findViewById(R.id.busupart);
        partpart = (LinearLayout)findViewById(R.id.partpart);

        hoontext = (EditText)findViewById(R.id.hoontext);
        ummtext = (EditText)findViewById(R.id.ummtext);

        listView = (ListView)findViewById(R.id.listView);

        Button hoonbtn = (Button)findViewById(R.id.hoonbtn);
        hoonbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                adapter.removeItem();

                String hoons = hoontext.getText().toString();
                String umms = ummtext.getText().toString();

                for(int i=0;i<hanjaitemlist.size();i++){
                    String[] itemshoon = hanjaitemlist.get(i).getHoon().split("/");
                    String[] itemsumm = hanjaitemlist.get(i).getUmm().split("/");

                    if(!hoons.equals("") && !umms.equals("")){
                        for(int j=0;j<itemshoon.length;j++){
                            for(int k=0;k<itemsumm.length;k++){
                                if(itemshoon[j].equals(hoons) && itemsumm[k].equals(umms))
                                    adapter.addItem(hanjaitemlist.get(i));
                            }
                        }
                    }
                    else if(!hoons.equals("")){
                        for(int j=0;j<itemshoon.length;j++) {
                            if (itemshoon[j].equals(hoons))
                                adapter.addItem(hanjaitemlist.get(i));
                        }
                    }
                    else if(!umms.equals("")){
                        for(int k=0;k<itemsumm.length;k++) {
                            if (itemsumm[k].equals(umms))
                                adapter.addItem(hanjaitemlist.get(i));
                        }
                    }
                }

                listView.setAdapter(adapter);

                hoontext.setText("");
                ummtext.setText("");
            }
        });

        Button searchbusu = (Button)findViewById(R.id.searchbusu);
        searchbusu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent busuit = new Intent(getApplicationContext(), SearchbusuActivity.class);
                startActivityForResult(busuit, REQUEST_CODE_BUSU);
            }
        });

        Button busubtn = (Button)findViewById(R.id.busubtn);
        busubtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String busustr = busutext.getText().toString();
                if(busustr.equals("부수"))
                    Toast.makeText(getApplicationContext(), "부수를 선택해주세요 !", Toast.LENGTH_LONG).show();
                else{
                    adapter.removeItem();
                    for(int i=0;i<hanjaitemlist.size();i++){
                        if(hanjaitemlist.get(i).getBusu().equals(busustr))
                            adapter.addItem(hanjaitemlist.get(i));
                    }

                    listView.setAdapter(adapter);
                }
            }
        });

        Button searchpart = (Button)findViewById(R.id.searchpart);
        searchpart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent partit = new Intent(getApplicationContext(), PartActivity.class);
                startActivityForResult(partit, REQUEST_CODE_PART);
            }
        });

        Button partbtn = (Button)findViewById(R.id.partbtn);
        partbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String partstr = parttext.getText().toString();
                if(partstr.equals("부분한자"))
                    Toast.makeText(getApplicationContext(), "부분한자를 선택해주세요 !", Toast.LENGTH_LONG).show();
                else{
                    adapter.removeItem();
                    for(int i=0;i<hanjaitemlist.size();i++){
                        if(hanjaitemlist.get(i).getPart().equals(partstr))
                            adapter.addItem(hanjaitemlist.get(i));
                    }

                    listView.setAdapter(adapter);
                }
            }
        });

        spinner = (Spinner)findViewById(R.id.spinner);
        spinneritem = new ArrayList<String>();
        for(int i=0;i<itemstr.length;i++)
            spinneritem.add(itemstr[i]);
        sadapter = new SpinnerAdapter(this, spinneritem);
        spinner.setAdapter(sadapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                if(itemstr[i].equals("훈음")) {
                    hoonpart.setVisibility(View.VISIBLE);
                    busupart.setVisibility(View.INVISIBLE);
                    partpart.setVisibility(View.INVISIBLE);

                }
                else if(itemstr[i].equals("부수")){
                    hoonpart.setVisibility(View.INVISIBLE);
                    busupart.setVisibility(View.VISIBLE);
                    partpart.setVisibility(View.INVISIBLE);
                }
                else if(itemstr[i].equals("부분한자")){
                    hoonpart.setVisibility(View.INVISIBLE);
                    busupart.setVisibility(View.INVISIBLE);
                    partpart.setVisibility(View.VISIBLE);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {}
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == REQUEST_CODE_BUSU) {
            busutext.setText(data.getExtras().getString("busu"));
        }
        else if(requestCode == REQUEST_CODE_PART)
            parttext.setText(data.getExtras().getString("part"));
    }

}
