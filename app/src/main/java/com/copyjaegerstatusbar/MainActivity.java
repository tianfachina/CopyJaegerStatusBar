package com.copyjaegerstatusbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.statusbarlib.StatusBarUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        StatusBarUtil.setColor(this, getResources().getColor(R.color.colorPrimary), 0);
    }
}
