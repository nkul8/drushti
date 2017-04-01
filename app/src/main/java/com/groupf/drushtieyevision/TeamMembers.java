package com.groupf.drushtieyevision;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class TeamMembers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_team_members);

        ArrayList<HomeGridItem> homeGridItems = new ArrayList<HomeGridItem>();
        homeGridItems.add(new HomeGridItem(R.drawable.sagar_dhumal,"Sagar Dhumal","post"));
        homeGridItems.add(new HomeGridItem(R.drawable.vinayak_dhoot,"Vinayak Dhoot","post"));
        homeGridItems.add(new HomeGridItem(R.drawable.bhavana,"Bhavana Kutwal","post"));
        homeGridItems.add(new HomeGridItem(R.drawable.bhuleshwar,"Bhuleshwar B.","post"));
        homeGridItems.add(new HomeGridItem(R.drawable.mohsin,"Mohsin Shaikh","post"));
        homeGridItems.add(new HomeGridItem(R.drawable.swapnil,"Swapnil Walunj","post"));

        TeamMemberAdapter teamMemberAdapter = new TeamMemberAdapter(this, homeGridItems);


        ListView listView = (ListView) findViewById(R.id.team_list_item);
        listView.setAdapter(teamMemberAdapter);
    }
}
