package com.example.sdklibrary;

import android.content.Context;

import io.mob.resu.reandroidsdk.ReAndroidSDK;

public class SdkClass {
    public void SdkMethod(Context context){
    ReAndroidSDK.getInstance(context.getApplicationContext()).onLocationUpdate(13.23,34.32);
        System.out.println("LOCATION-UPDATE");
    }
}
