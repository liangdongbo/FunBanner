package com.leon.loopviewpager;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.FrameLayout;

import com.leon.loopviewpagerlib.FunBanner;

/**
 * Created by Leon on 2017/3/1.
 */

public class DemoActivity extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo);
        init();
    }

    private void init() {
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.content_frame);
        FunBanner.Builder builder = new FunBanner.Builder(this);
        FunBanner funBanner = builder.setEnableAutoLoop(true)
                .setImageResIds(ImagesProvider.NATIVE_IMAGES)
                .setDotSelectedColor(Color.GREEN)
                .setHeightWidthRatio(0.5556f)
                .setLoopInterval(5000)
                .setEnableAutoLoop(true)
                .setIndicatorBackgroundColor(R.color.indicator_bg)
                .build();
        frameLayout.addView(funBanner);
    }
}
