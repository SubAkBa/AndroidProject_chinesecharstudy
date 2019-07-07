package com.example.sonwo.third;

import android.content.*;
import android.util.*;
import android.view.*;
import android.widget.*;


public class HanJaItemView extends LinearLayout {
    TextView hanja, busu, hoon, umm;

    public HanJaItemView(Context context){
        super(context);
        init(context);
    }

    public HanJaItemView(Context context, AttributeSet attrs){
        super(context, attrs);
        init(context);
    }

    public void init(Context context){
        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.hanja_item, this, true);

        hanja = (TextView)findViewById(R.id.hanja);
        busu = (TextView)findViewById(R.id.busu);
        hoon = (TextView)findViewById(R.id.hoon);
        umm = (TextView)findViewById(R.id.umm);
    }

    public void setHanja(String hanjastr){ hanja.setText(hanjastr); }
    public void setBusu(String busustr){ busu.setText(busustr); }
    public void setHoon(String hoonstr){ hoon.setText(hoonstr); }
    public void setUmm(String ummstr){ umm.setText(ummstr); }
}
