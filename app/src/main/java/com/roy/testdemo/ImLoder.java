package com.roy.testdemo;

import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

/**
 * author : Roy
 * date   : 2020/3/24 16:10
 * desc   :
 * version: 1.0
 */
public class ImLoder implements Loder {
    @Override
    public void load(ImageLoader imageLoader) {
        if (imageLoader != null) {
            RequestOptions options = new RequestOptions();
            if(imageLoader.placeHolder !=null) {
                options.placeholder(imageLoader.placeHolder);
            }
            Glide.with(imageLoader.context)
                    .load(imageLoader.url)
                    .apply(options)
                    .into((ImageView) imageLoader.targetView);
        }
    }
}
