package com.example.appthiblxa1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import com.example.appthiblxa1.Adapters.MyAdapter;
import com.example.appthiblxa1.Model.Anwser;
import com.example.appthiblxa1.Model.DeThiCauHoi;
import com.example.appthiblxa1.Model.ItemMenu;
import com.example.appthiblxa1.Model.Question;
import com.example.appthiblxa1.Model.Sentence;
import com.example.appthiblxa1.SQLite.BienBaoDAO;
import com.example.appthiblxa1.SQLite.CauHoiDAO;
import com.example.appthiblxa1.SQLite.XuphatDao;

import java.io.Serializable;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private GridView gvMenu;
    private ArrayList<ItemMenu> arr;
    private MyAdapter adapter;
    private CauHoiDAO cauHoiDAO;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gvMenu=findViewById(R.id.gvDanhMuc);
        arr=new ArrayList<>();
        arr.add(new ItemMenu(R.drawable.icon_thilt,"Ôn lý thuyết"));
        arr.add(new ItemMenu(R.drawable.icon_onlt,"Thi thử"));
        arr.add(new ItemMenu(R.drawable.icon_onth,"Ôn Sa hình"));
        arr.add(new ItemMenu(R.drawable.icon_bienbao,"Biển báo"));
        arr.add(new ItemMenu(R.drawable.icon_thith,"Thi thực hành"));
        arr.add(new ItemMenu(R.drawable.icon_xuphat,"Lỗi,mức phạt"));
        adapter=new MyAdapter(this,arr);
        gvMenu.setAdapter(adapter);
        cauHoiDAO = new CauHoiDAO(this);
        new DuLieu(cauHoiDAO);
        BienBaoDAO h=new BienBaoDAO(this);
        new DuLieu(h);

        XuphatDao xuphatDao = new XuphatDao(this);
        new DuLieu(xuphatDao);
        gvMenu.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i==0) {
                    Intent intent = new Intent(MainActivity.this, OnLyThuyet.class);
                    startActivity(intent);
                }
                if(i==1){
                    Intent intent=new Intent(MainActivity.this,DeThi.class);
                    startActivity(intent);
                }
                if(i==2){
                    Intent intent = new Intent(MainActivity.this, OnSaHinh.class);
                    startActivity(intent);
                }
                if(i==3) {
                    Intent intent = new Intent(MainActivity.this, BienBao.class);
                    startActivity(intent);
                }
                if(i==4)
                { Intent intent = new Intent(MainActivity.this, mainTH.class);
                    startActivity(intent);}
                if(i==5)
                { Intent intent = new Intent(MainActivity.this, XuphatActivity.class);
                    startActivity(intent);}
            }
        });
    }
}