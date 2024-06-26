package com.example.costumecardview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class costumeaddapter extends BaseAdapter {

    Context context;
    int resource;
    ArrayList<travel> arrayList;

    public costumeaddapter(Context context, int resource, ArrayList<travel> arrayList) {
        this.context = context;
        this.resource = resource;
        this.arrayList = arrayList;
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public travel getItem(int position) {
        return arrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public void add(travel travel){
        arrayList.add(travel);
        notifyDataSetChanged();
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view=convertView;
        if (view == null) {
            view= LayoutInflater.from(this.context).inflate(R.layout.modelview,parent,false);

        }
        ImageView imageView_country=view.findViewById(R.id.travel_image);
        TextView destimation_name=view.findViewById(R.id.desitiantion_contry);
        TextView contryname=view.findViewById(R.id.contry);
        travel travel=getItem(position);
        imageView_country.setImageResource(travel.getImageresource());
        destimation_name.setText(travel.getDesitantion_contry());
        contryname.setText(travel.getCountry());


        return view;
    }
}
