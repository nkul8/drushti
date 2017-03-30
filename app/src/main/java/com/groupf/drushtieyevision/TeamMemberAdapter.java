package com.groupf.drushtieyevision;

import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

import static android.R.attr.start;

/**
 * Created by sourabh on 3/30/2017.
 */

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

        View listview = (ListView) listItemView.findViewById(R.id.team_list_item);
        // Cache row position inside the button using `setTag`
        listview.setTag(position);
        // Attach the click event handler
        listview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO: get code for the intents
            }
        });

        return listItemView;
    }
}
