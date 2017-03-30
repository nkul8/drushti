package com.groupf.drushtieyevision;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.widget.GridView;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<HomeGridItem> homeGridItems = new ArrayList<HomeGridItem>();
        homeGridItems.add(new HomeGridItem(R.drawable.test_image,"About"));
        homeGridItems.add(new HomeGridItem(R.drawable.test_image,"Donate"));
        homeGridItems.add(new HomeGridItem(R.drawable.test_image,"Event & Gallery"));
        homeGridItems.add(new HomeGridItem(R.drawable.test_image,"Team"));
        homeGridItems.add(new HomeGridItem(R.drawable.test_image,"Feedback"));
        homeGridItems.add(new HomeGridItem(R.drawable.test_image,"Contact"));


        HomeGridItemAdapter homeGridItemAdapter = new HomeGridItemAdapter(this, homeGridItems);

        // Get a reference to the ListView, and attach the adapter to the listView.
        GridView gView = (GridView) findViewById(R.id.gridview_home);
        gView.setAdapter(homeGridItemAdapter);


    }

}

