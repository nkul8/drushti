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
        homeGridItems.add(new HomeGridItem(R.drawable.sagar_dhumal,"Sagar Dhumal"));
        homeGridItems.add(new HomeGridItem(R.drawable.vinayak_dhoot,"Vinayak Dhoot"));
        homeGridItems.add(new HomeGridItem(R.drawable.bhavana,"Bhavana Kutwal"));
        homeGridItems.add(new HomeGridItem(R.drawable.bhuleshwar,"Bhuleshwar B."));
        homeGridItems.add(new HomeGridItem(R.drawable.mohsin,"Mohsin Shaikh"));
        homeGridItems.add(new HomeGridItem(R.drawable.swapnil,"Swapnil Walunj"));

        HomeGridItemAdapter homeGridItemAdapter = new HomeGridItemAdapter(this, homeGridItems);


        ListView listView = (ListView) findViewById(R.id.team_list_item);
        listView.setAdapter(homeGridItemAdapter);
    }
}
