package com.example.sonwo.third;

import android.content.*;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button hoonumm = (Button)findViewById(R.id.hoonumm);
        hoonumm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hoonit = new Intent(getApplicationContext(), HoonummActivity.class);
                startActivity(hoonit);
            }
        });

        final Button hanjawriting = (Button)findViewById(R.id.hanjawriting);
        hanjawriting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent writingit = new Intent(getApplicationContext(), WritingActivity.class);
                startActivity(writingit);
            }
        });

        final Button interpre = (Button)findViewById(R.id.interpretation);
        interpre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent interit = new Intent(getApplicationContext(), InterpretationActivity.class);
                startActivity(interit);
            }
        });

        final Button exitbtn = (Button)findViewById(R.id.exitbtn);
        exitbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showMessage();
            }
        });
    }

    private void showMessage(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("종료알림");
        builder.setMessage("종료하시겠습니까?");
        builder.setIcon(android.R.drawable.ic_dialog_alert);
        builder.setPositiveButton("종료", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();
            }
        });

        builder.setNegativeButton("취소", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {}
        });

        AlertDialog dialog = builder.create();
        dialog.show();
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
