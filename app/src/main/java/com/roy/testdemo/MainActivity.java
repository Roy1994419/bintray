package com.roy.testdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView  imageView = findViewById(R.id.iv);
      EditText et = findViewById(R.id.et);
       Glide.getInstance().with(this)
               .setUrl("https://ss0.bdstatic.com/94oJfD_bAAcT8t7mm9GUKT-xh_/timg?image&quality=100&size=b4000_4000&sec=1585038357&di=92f0cca8f4dc58ce3fee3e6653399952&src=http://a4.att.hudong.com/21/09/01200000026352136359091694357.jpg")
              .into(imageView);

       et.addTextChangedListener(new TextWatcher() {
           @Override
           public void beforeTextChanged(CharSequence s, int start, int count, int after) {

           }

           @Override
           public void onTextChanged(CharSequence s, int start, int before, int count) {

           }

           @Override
           public void afterTextChanged(Editable s) {
              // s.append("123");
               Log.e("----",s.toString());
           }
       });
    }
}
