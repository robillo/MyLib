package com.robillo.mylibrary;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

/**
 * Created by robinkamboj on 10/08/17.
 */

public class MyFunctions {

    public String returnStars(int n){
        String temp = "";
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                temp = temp + "*";
            }
            temp = temp + "\n";
        }
        return temp;
    }
}
