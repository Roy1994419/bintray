package com.roy.testdemo;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;

/**
 * author : Roy
 * date   : 2020/3/24 15:50
 * desc   :
 * version: 1.0
 */
public class ImageLoader  {

    public String url;
    public String uri;
    public View targetView;
    public Context context;
    public Drawable placeHolder;
   public ImageLoader(Builder builder){
        if(builder ==null) throw new NullPointerException("builder is null");
          this.url = builder.url;
          this.uri = builder.uri;
          this.targetView = builder.targetView;
          this.context = builder.context;
          this.placeHolder = builder.placeHolder;
          Glide.getInstance().init().load(this);
   }





    static class Builder{
        private String url;
        private String uri;
        private View targetView;
        private Context context;
        private Drawable  placeHolder;
        public Builder(Context context){
            this.context = context;
            //可以默认初始化值
        }

        public Builder setUrl(String url){
            this.url = url;
            return this;
        }

        public Builder setUri (String uri){
            this.uri = uri;
            return this;
        }

        public Builder setPlaceHolder(Drawable  placeHolder){
            this.placeHolder = placeHolder;
            return this;
        }


        public void into(View targetView){
            this.targetView = targetView;
             new ImageLoader(this);
        }
    }
}
