package com.example.appthiblxa1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class Result extends AppCompatActivity {
    private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        btn=findViewById(R.id.btnHKQ);
        Bundle bundle=getIntent().getExtras();
        int kq=bundle.getInt("kq");
        btn.setText(""+kq);
    }
}