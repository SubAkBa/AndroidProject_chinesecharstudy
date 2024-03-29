package com.example.sonwo.third;

import android.content.Context;
import android.view.*;
import android.widget.*;

import java.util.ArrayList;

public class SpinnerAdapter extends BaseAdapter {
    Context context;
    ArrayList<String> data;
    LayoutInflater inflater;


    public SpinnerAdapter(Context context, ArrayList<String> data){
        this.context = context;
        this.data = data;
        inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }


    @Override
    public int getCount() {
        if(data!=null)
            return data.size();
        else
            return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null) {
            convertView = inflater.inflate(R.layout.spinner_normal, parent, false);
        }

        if(data != null){
            String text = data.get(position);
            ((TextView)convertView.findViewById(R.id.spinneritemtv)).setText(text);
        }

        return convertView;
    }

    @Override
    public View getDropDownView(int position, View convertView, ViewGroup parent) {
        if(convertView == null){
            convertView = inflater.inflate(R.layout.spinner_dropdown, parent, false);
        }

        String text = data.get(position);
        ((TextView)convertView.findViewById(R.id.spinneritemtv)).setText(text);

        return convertView;
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

}