package com.example.leasfirstapp;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.fragment.app.FragmentActivity;

public class LaunchActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(LaunchActivity.this, MainActivity.class);
                startActivity(intent);
                LaunchActivity.this.finish();
            }
        }, 3000);
    }
}
