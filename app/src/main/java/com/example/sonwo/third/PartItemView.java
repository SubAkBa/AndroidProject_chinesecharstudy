package com.example.sonwo.third;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.*;

public class PartItemView extends LinearLayout {
    TextView part;

    public PartItemView(Context context){
        super(context);
        init(context);
    }

    public PartItemView(Context context, AttributeSet attrs){
        super(context, attrs);
        init(context);
    }

    public void init(Context context){
        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.part_item, this, true);

        part = (TextView)findViewById(R.id.part);
    }

    public void setPart(String partstr){ part.setText(partstr); }
}
