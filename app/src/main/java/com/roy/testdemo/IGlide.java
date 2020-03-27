package com.roy.testdemo;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/**
 * author : Roy
 * date   : 2020/3/24 15:06
 * desc   :
 * version: 1.0
 */
public interface IGlide {
    void into(ImageView imageView);
    void errorImage(int image);
    void errorImage(String url);
    void placeholder(Drawable drawable);
    void placeholder(int resource);

}
