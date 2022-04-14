package com.example.appthiblxa1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.example.appthiblxa1.Adapters.XuPhatAdapter;
import com.example.appthiblxa1.Model.XuPhat;
import com.example.appthiblxa1.SQLite.XuphatDao;

import java.util.ArrayList;

public class XuphatActivity extends AppCompatActivity {
    Button back;
    ListView lvXuPhat;
    ArrayList<XuPhat> lstXuPhat;
    XuPhatAdapter XuphatAdapter;
    XuphatDao xuphatDao;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xuphat);
        lvXuPhat = findViewById(R.id.lvXuPhat);
        back = findViewById(R.id.btn_back);
        xuphatDao = new XuphatDao(this);
            lstXuPhat = xuphatDao.GetAllMucXuPhat();
            XuphatAdapter = new XuPhatAdapter(this, lstXuPhat);
            lvXuPhat.setAdapter(XuphatAdapter);
             back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}