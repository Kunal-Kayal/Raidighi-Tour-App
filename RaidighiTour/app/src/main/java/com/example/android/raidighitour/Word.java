package com.example.android.raidighitour;

public class Word {

     private  String mImagedescription;
     private  int mImageResourcesId;

     public Word( String imagedescription, int imageResourcesId ){
         this.mImagedescription=imagedescription;
         this.mImageResourcesId=imageResourcesId;
     }

    public String getmImagedescription() {
        return mImagedescription;
    }

    public int getmImageResourcesId() {
        return mImageResourcesId;
    }

    @Override
    public String toString() {
        return "Word{" +
                "mImagedescription='" + mImagedescription + '\'' +
                ", mImageResourcesId=" + mImageResourcesId +
                '}';
    }
}
