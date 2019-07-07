package com.example.sonwo.third;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;

public class PartAdapter extends BaseAdapter {
    ArrayList<PartItem> items = new ArrayList<PartItem>();
    Context context;

    public PartAdapter(Context context){ this.context = context; }

    public void removeItem(){
        items.clear();
    }

    public void addItem(PartItem item){
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
        PartItemView v = new PartItemView(context);
        PartItem item = items.get(i);

        v.setPart(item.getPart());

        return v;
    }
}
