package com.example.sonwo.third;

import android.content.Context;
import android.view.*;
import android.widget.BaseAdapter;

import java.util.ArrayList;

public class BusuAdapter extends BaseAdapter {
    ArrayList<BusuItem> items = new ArrayList<BusuItem>();
    Context context;

    public BusuAdapter(Context context){ this.context = context; }

    public void removeItem(){
        items.clear();
    }

    public void addItem(BusuItem item){
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
        BusuItemView v = new BusuItemView(context);
        BusuItem item = items.get(i);

        v.setBusu(item.getBusu());

        return v;
    }

}
