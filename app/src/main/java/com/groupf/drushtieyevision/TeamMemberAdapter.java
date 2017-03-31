package com.groupf.drushtieyevision;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class TeamMemberAdapter extends ArrayAdapter<HomeGridItem> {

    public TeamMemberAdapter(Activity context, ArrayList<HomeGridItem> homeGridItems){
        super(context, 0, homeGridItems);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.team_member, parent, false);
        }
        final HomeGridItem currentGridItem = getItem(position);

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.team_member_name);

        nameTextView.setText(currentGridItem.getmItemName());

        TextView postTextView = (TextView) listItemView.findViewById(R.id.team_member_post);

        postTextView.setText(currentGridItem.getmItemId());

        ImageView imageview = (ImageView) listItemView.findViewById(R.id.team_member_image);

        imageview.setImageResource(currentGridItem.getmImageResourceId());

        return listItemView;
    }
}
