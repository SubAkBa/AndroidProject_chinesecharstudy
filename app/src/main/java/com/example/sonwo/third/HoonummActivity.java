package com.example.sonwo.third;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.*;
import android.widget.*;


import java.util.*;

public class HoonummActivity extends AppCompatActivity {
    int count = 0;
    TextView hanjatv, busutv, ummtv, hoontv, meantv, processingtv;
    ItemManager manager = new ItemManager();
    ArrayList<HanJaItem> hanjaitems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hoonumm);

        manager.AddHanJaItems();

        hanjaitems = manager.getHanjaitems();

        hanjatv = (TextView)findViewById(R.id.hanja);
        hoontv = (TextView)findViewById(R.id.hoon);
        busutv = (TextView)findViewById(R.id.busu);
        ummtv = (TextView)findViewById(R.id.umm);
        meantv = (TextView)findViewById(R.id.mean);
        processingtv = (TextView)findViewById(R.id.processing);

        hanjatv.setText(hanjaitems.get(count).getHanja());
        hoontv.setText("");
        ummtv.setText("");
        busutv.setText("");
        meantv.setText("");
        processingtv.setText((count+1) + " / " + hanjaitems.size());

        hanjatv.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                int action = motionEvent.getAction();

                if(action == MotionEvent.ACTION_UP){
                    hoontv.setText(hanjaitems.get(count).getHoon());
                    ummtv.setText(hanjaitems.get(count).getUmm());
                    busutv.setText(hanjaitems.get(count).getBusu());
                    meantv.setText(hanjaitems.get(count).getMean());
                }

                return true;
            }
        });

        Button prevbtn1 = (Button)findViewById(R.id.prevbtn1);
        prevbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(count - 99 > 0){
                    count -= 100;
                    hanjatv.setText(hanjaitems.get(count).getHanja());
                    hoontv.setText("");
                    ummtv.setText("");
                    busutv.setText("");
                    meantv.setText("");
                    processingtv.setText((count+1) + " / " + hanjaitems.size());
                }
            }
        });

        Button prevbtn2 = (Button)findViewById(R.id.prevbtn2);
        prevbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(count - 9 > 0){
                    count -= 10;
                    hanjatv.setText(hanjaitems.get(count).getHanja());
                    hoontv.setText("");
                    ummtv.setText("");
                    busutv.setText("");
                    meantv.setText("");
                    processingtv.setText((count+1) + " / " + hanjaitems.size());
                }
            }
        });

        Button prevbtn3 = (Button)findViewById(R.id.prevbtn3);
        prevbtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(count > 0){
                    count--;
                    hanjatv.setText(hanjaitems.get(count).getHanja());
                    hoontv.setText("");
                    ummtv.setText("");
                    busutv.setText("");
                    meantv.setText("");
                    processingtv.setText((count+1) + " / " + hanjaitems.size());
                }
            }
        });

        Button nextbtn1 = (Button)findViewById(R.id.nextbtn1);
        nextbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(count + 1 < hanjaitems.size()){
                    count++;
                    hanjatv.setText(hanjaitems.get(count).getHanja());
                    hoontv.setText("");
                    ummtv.setText("");
                    busutv.setText("");
                    meantv.setText("");
                    processingtv.setText((count+1) + " / " + hanjaitems.size());
                }
            }
        });

        Button nextbtn2 = (Button)findViewById(R.id.nextbtn2);
        nextbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(count + 10 < hanjaitems.size()){
                    count += 10;
                    hanjatv.setText(hanjaitems.get(count).getHanja());
                    hoontv.setText("");
                    ummtv.setText("");
                    busutv.setText("");
                    meantv.setText("");
                    processingtv.setText((count+1) + " / " + hanjaitems.size());
                }
            }
        });

        Button nextbtn3 = (Button)findViewById(R.id.nextbtn3);
        nextbtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(count + 100 < hanjaitems.size()){
                    count += 100;
                    hanjatv.setText(hanjaitems.get(count).getHanja());
                    hoontv.setText("");
                    ummtv.setText("");
                    busutv.setText("");
                    meantv.setText("");
                    processingtv.setText((count+1) + " / " + hanjaitems.size());
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int curId = item.getItemId();

        switch(curId){
            case R.id.menu_search:
                Intent searchit = new Intent(getApplicationContext(), SearchActivity.class);
                startActivity(searchit);
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}
