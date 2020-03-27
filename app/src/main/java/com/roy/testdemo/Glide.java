package com.roy.testdemo;

import android.content.Context;

/**
 * author : Roy
 * date   : 2020/3/24 15:03
 * desc   :
 * version: 1.0
 */
public class Glide {
    private Glide(){}
    private static Glide glide;

    public Loder init(){
        return new ImLoder();
    }
    public static Glide getInstance(){
        if(null == glide){
            synchronized (Glide.class){
                if(null == glide){
                    glide = new Glide();
                }
            }
        }
        return glide;
    }

    public  ImageLoader.Builder with(Context context){
        return new ImageLoader.Builder(context);
    }

}
