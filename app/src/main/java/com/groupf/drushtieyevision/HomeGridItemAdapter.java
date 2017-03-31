package com.groupf.drushtieyevision;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class HomeGridItemAdapter extends ArrayAdapter<HomeGridItem> {

    public HomeGridItemAdapter(Activity context, ArrayList<HomeGridItem> homeGridItems){
        super(context, 0, homeGridItems);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        HomeGridItem currentGridItem = getItem(position);


        TextView numberTextView = (TextView) listItemView.findViewById(R.id.grid_item_text);

        numberTextView.setText(currentGridItem.getmItemName());

        ImageView iconView = (ImageView) listItemView.findViewById(R.id.grid_item_icon);

        iconView.setImageResource(currentGridItem.getmImageResourceId());


        return listItemView;
    }

}
