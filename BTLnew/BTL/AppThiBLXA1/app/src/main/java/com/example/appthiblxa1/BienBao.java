package com.example.appthiblxa1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.example.appthiblxa1.Adapters.MyBienBaoAdapter;
import com.example.appthiblxa1.Model.ItemBienBao;
import com.example.appthiblxa1.SQLite.BienBaoDAO;

import java.util.ArrayList;

public class BienBao extends AppCompatActivity {
    private Button btnBack;
    private ListView lstBB;
    private ArrayList<ItemBienBao> itemBienBaos;
    private MyBienBaoAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bien_bao);
        btnBack=findViewById(R.id.btnBackBB);
        lstBB=findViewById(R.id.lstBB);
        BienBaoDAO bbd=new BienBaoDAO(this);
        itemBienBaos=bbd.getAllBienBao();
        adapter=new MyBienBaoAdapter(this, itemBienBaos);
        lstBB.setAdapter(adapter);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();

            }
        });
    }
}