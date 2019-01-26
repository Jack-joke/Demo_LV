package com.example.dell.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class TinhTongActivity extends AppCompatActivity {
    TextView tv_kq;
    EditText edt_SoA,edt_SoB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tinh_tong);
        //Anh Xa
        tv_kq = findViewById(R.id.tv_kq);
        edt_SoA = findViewById(R.id.edt_SoA);
        edt_SoB = findViewById(R.id.edt_SoB);

    }

    public void btntinhTong(View view) {
        double x = Double.parseDouble(edt_SoA.getText().toString());
        double y = Double.parseDouble(edt_SoB.getText().toString());
        double kq = x+y;
        tv_kq.setText(kq+"");
    }
}
