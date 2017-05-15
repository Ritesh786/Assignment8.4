package com.collegeproject.fujitsu.assignment84;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Fujitsu on 15/05/2017.
 */

public class mAdapter  extends BaseAdapter {

    private LayoutInflater mLayoutInflater;
    private ArrayList<CustomeClass> dummyData;


    public mAdapter(Context Contex, ArrayList<CustomeClass> mDummydata) {

        dummyData = mDummydata;

        mLayoutInflater = LayoutInflater.from(Contex);
    }

    @Override
    public int getCount() {
        return dummyData.size();
    }

    @Override
    public Object getItem(int position) {
        return dummyData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        CustomeClass  custome = (CustomeClass) getItem(position);
        convertView = mLayoutInflater.inflate(R.layout.showdetail,parent,false);
        TextView nametxt = (TextView) convertView.findViewById(R.id.nametxt);
        //       TextView remarkdate = (TextView) convertView.findViewById(R.id.remark_date);
        TextView phonetxt = (TextView) convertView.findViewById(R.id.phonetxt);
        TextView dobtxt = (TextView) convertView.findViewById(R.id.dobtxt);

        nametxt.setText(custome.getName());
        phonetxt.setText(custome.getPhone());
        dobtxt.setText(custome.getDate());


        return convertView;
    }
}


