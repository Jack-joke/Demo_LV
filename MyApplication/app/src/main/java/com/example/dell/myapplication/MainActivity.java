package com.example.dell.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ToA(View view) {
    }

    public void ToB(View view) {
        Intent it = new Intent(MainActivity.this, TinhHieuActivity.class);
        startActivity(it);
    }
}
