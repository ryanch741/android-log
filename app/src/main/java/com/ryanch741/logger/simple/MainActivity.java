package com.ryanch741.logger.simple;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.ryanch741.logger.Log;
import com.ryanch741.logger.LogServiceHelper;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        LogServiceHelper.init(getApplication(), "/sdcard/ryanch741", "ryanch741_test_");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onTestClick(View view) {
        Log.e("AAAAA", "aaaaaaaaaaaaa");
        Log.flush();
    }
}
