package com.groupf.drushtieyevision;


public class HomeGridItem {
    private String mItemName;
    private int mImageResourceId;
    private String mItemId;

    public HomeGridItem(int imageResourceId,String itemName){
        mImageResourceId = imageResourceId;
        mItemName = itemName;
    }
    public HomeGridItem(int imageResourceId,String name, String post){
        mImageResourceId = imageResourceId;
        mItemName = name;
        mItemId = post;
    }

    public int getmImageResourceId(){
        return mImageResourceId;
    }

    public String getmItemName(){ return mItemName; }

    public String getmItemId(){ return mItemId; }
}
