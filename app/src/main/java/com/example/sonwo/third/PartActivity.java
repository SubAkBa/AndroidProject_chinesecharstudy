package com.example.sonwo.third;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.*;
import android.widget.*;

import java.util.ArrayList;

public class PartActivity extends AppCompatActivity {
    GridView partgrid;
    ItemManager manager;
    PartAdapter partadapter;

    ArrayList<PartItem> partitemlist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_part);

        partgrid = (GridView)findViewById(R.id.partgrid);

        manager = new ItemManager();

        manager.AddPartItems();
        partitemlist = manager.getPartItems();

        partadapter = new PartAdapter(this);

        for(int i=0;i<partitemlist.size();i++)
            partadapter.addItem(partitemlist.get(i));

        partgrid.setAdapter(partadapter);

        partgrid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String clickpart = partitemlist.get(i).getPart();

                Intent partit = new Intent();
                partit.putExtra("part", clickpart);
                setResult(RESULT_OK, partit);

                finish();
            }
        });
    }
}
