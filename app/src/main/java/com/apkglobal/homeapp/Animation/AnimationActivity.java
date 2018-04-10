package com.apkglobal.homeapp.Animation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.apkglobal.homeapp.R;

public class AnimationActivity extends AppCompatActivity {

    ImageView iv_icon;
    Animation animation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation);

        iv_icon = (ImageView)findViewById(R.id.iv_icon);
        animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate);
        iv_icon.startAnimation(animation);

    }
}
