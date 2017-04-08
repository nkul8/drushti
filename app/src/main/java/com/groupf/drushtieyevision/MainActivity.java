package com.groupf.drushtieyevision;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       /* ArrayList<HomeGridItem> homeGridItems = new ArrayList<HomeGridItem>();
        homeGridItems.add(new HomeGridItem(R.drawable.test_image, "About"));
        homeGridItems.add(new HomeGridItem(R.drawable.test_image, "Donate"));
        homeGridItems.add(new HomeGridItem(R.drawable.test_image, "Event & Gallery"));
        homeGridItems.add(new HomeGridItem(R.drawable.test_image, "Team"));
        homeGridItems.add(new HomeGridItem(R.drawable.test_image, "Feedback"));
        homeGridItems.add(new HomeGridItem(R.drawable.test_image, "Contact"));


        HomeGridItemAdapter homeGridItemAdapter = new HomeGridItemAdapter(this, homeGridItems);

        // Get a reference to the ListView, and attach the adapter to the listView.
       /* GridView gView = (GridView) findViewById(R.id.gridview_home);
        gView.setAdapter(homeGridItemAdapter);*/
    }

   public void mAbout(View view){
        Intent intent = new Intent(this,about.class);
        startActivity(intent);
    }
    public void mDonate(View view){
        Intent intent = new Intent(this,donorActivity.class);
        startActivity(intent);
    }
    public void mGallery(View view){
        Intent intent = new Intent(this, com.groupf.drushtieyevision.Gallery.class);
        startActivity(intent);
    }
    public void mTeam(View view){
        Intent intent = new Intent(this,TeamMembers.class);
        startActivity(intent);
    }
    public void mFeed(View view){
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:"));
        intent.putExtra(Intent.EXTRA_EMAIL,new String[] { "drushtivision@gmail.com" });
        intent.putExtra(Intent.EXTRA_SUBJECT,"APP FEEDBACK");
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }
    public void mContact(View view){
        Intent intent = new Intent(this,ContactActivity.class);
        startActivity(intent);
    }

}

