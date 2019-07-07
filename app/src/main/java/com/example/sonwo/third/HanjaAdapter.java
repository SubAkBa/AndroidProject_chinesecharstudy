package com.example.sonwo.third;

import android.content.Context;
import android.view.*;
import android.widget.BaseAdapter;

import java.util.ArrayList;

public class HanjaAdapter extends BaseAdapter {
    ArrayList<HanJaItem> items = new ArrayList<HanJaItem>();
    Context context;

    public HanjaAdapter(Context context){ this.context = context; }

    public void removeItem(){
        items.clear();
    }

    public void addItem(HanJaItem item){
        items.add(item);
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int i) {
        return items.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        HanJaItemView v = new HanJaItemView(context);
        HanJaItem item = items.get(i);

        v.setHanja(item.getHanja());
        v.setBusu(item.getBusu());
        v.setHoon(item.getHoon());
        v.setUmm(item.getUmm());

        return v;
    }
}