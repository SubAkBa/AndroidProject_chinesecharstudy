package com.example.sonwo.third;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.*;
import android.widget.*;

import java.util.ArrayList;

public class InterpretationActivity extends AppCompatActivity {
    int count = 0;
    TextView hanjatv, hoonummtv, intertv, processingtv;
    ItemManager manager = new ItemManager();
    ArrayList<InterpretationItem> interitems;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interpretation);

        manager.AddInterItems();

        interitems = manager.getInterItems();

        hanjatv = (TextView)findViewById(R.id.hanja);
        hoonummtv = (TextView)findViewById(R.id.hoonumm);
        intertv = (TextView)findViewById(R.id.interpretation);
        processingtv = (TextView)findViewById(R.id.processing);

        hanjatv.setText(interitems.get(count).getHanja());
        hoonummtv.setText("");
        intertv.setText("");

        processingtv.setText((count+1) + " / " + interitems.size());

        hanjatv.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                int action = motionEvent.getAction();

                if(action == MotionEvent.ACTION_UP){
                    hoonummtv.setText(interitems.get(count).getHoonumm());
                    intertv.setText(interitems.get(count).getInterpre());
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
                    hanjatv.setText(interitems.get(count).getHanja());
                    hoonummtv.setText("");
                    intertv.setText("");
                    processingtv.setText((count+1) + " / " + interitems.size());
                }
            }
        });

        Button prevbtn2 = (Button)findViewById(R.id.prevbtn2);
        prevbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(count - 9 > 0){
                    count -= 10;
                    hanjatv.setText(interitems.get(count).getHanja());
                    hoonummtv.setText("");
                    intertv.setText("");
                    processingtv.setText((count+1) + " / " + interitems.size());
                }
            }
        });

        Button prevbtn3 = (Button)findViewById(R.id.prevbtn3);
        prevbtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(count > 0){
                    count--;
                    hanjatv.setText(interitems.get(count).getHanja());
                    hoonummtv.setText("");
                    intertv.setText("");
                    processingtv.setText((count+1) + " / " + interitems.size());
                }
            }
        });

        Button nextbtn1 = (Button)findViewById(R.id.nextbtn1);
        nextbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(count + 1 < interitems.size()){
                    count++;
                    hanjatv.setText(interitems.get(count).getHanja());
                    hoonummtv.setText("");
                    intertv.setText("");
                    processingtv.setText((count+1) + " / " + interitems.size());
                }
            }
        });

        Button nextbtn2 = (Button)findViewById(R.id.nextbtn2);
        nextbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(count + 10 < interitems.size()){
                    count += 10;
                    hanjatv.setText(interitems.get(count).getHanja());
                    hoonummtv.setText("");
                    intertv.setText("");
                    processingtv.setText((count+1) + " / " + interitems.size());
                }
            }
        });

        Button nextbtn3 = (Button)findViewById(R.id.nextbtn3);
        nextbtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(count + 100 < interitems.size()){
                    count += 100;
                    hanjatv.setText(interitems.get(count).getHanja());
                    hoonummtv.setText("");
                    intertv.setText("");
                    processingtv.setText((count+1) + " / " + interitems.size());
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
