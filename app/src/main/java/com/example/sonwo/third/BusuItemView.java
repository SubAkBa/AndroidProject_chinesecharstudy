package com.example.sonwo.third;

import android.content.Context;
import android.util.AttributeSet;
import android.view.*;
import android.widget.*;

public class BusuItemView extends LinearLayout {
    TextView busu;

    public BusuItemView(Context context){
        super(context);
        init(context);
    }

    public BusuItemView(Context context, AttributeSet attrs){
        super(context, attrs);
        init(context);
    }

    public void init(Context context){
        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.busu_item, this, true);

        busu = (TextView)findViewById(R.id.busu);
    }

    public void setBusu(String busustr){ busu.setText(busustr); }
}
