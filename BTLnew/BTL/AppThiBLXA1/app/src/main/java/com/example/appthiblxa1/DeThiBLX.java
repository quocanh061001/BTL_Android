package com.example.appthiblxa1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.appthiblxa1.Adapters.ViewPaperAdapter;
import com.example.appthiblxa1.Model.Anwser;
import com.example.appthiblxa1.Model.DeThiCauHoi;
import com.example.appthiblxa1.Model.Question;
import com.example.appthiblxa1.Model.Sentence;
import com.example.appthiblxa1.SQLite.CauHoiDAO;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import java.util.ArrayList;

public class DeThiBLX extends AppCompatActivity  {
    private TabLayout tab;
    private ViewPager2 paper;
    private Button btnBack;
    private ArrayList<Sentence> sentence;
    private ArrayList<Question> questions;
    private ArrayList<Anwser> anwsers;
    private ViewPaperAdapter adapter;
    private TextView txttime;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_de_thi_blx);
        tab=findViewById(R.id.tabDeThi);
        paper=findViewById(R.id.pageDT);
        btnBack=findViewById(R.id.btnBackDT);
        txttime=findViewById(R.id.txtTime);
        FragmentManager fragmentManager=getSupportFragmentManager();
        Intent intent=getIntent();
        int MaDe=intent.getExtras().getInt("key");
        ArrayList<DeThiCauHoi> dt=new ArrayList<>();
        CauHoiDAO c=new CauHoiDAO(this);
        dt=c.getDeThiCauHoi();
        sentence=c.getAll();
        ArrayList<Sentence> s=new ArrayList<>();
        for(DeThiCauHoi dtch:dt){
            if(dtch.getMaDeThi()==MaDe){
                for(Sentence s1:sentence){
                    if(s1.getQuestion().getId()==dtch.getMaCauHoi()) s.add(s1);
                }
            }
        }
        adapter=new ViewPaperAdapter(fragmentManager,getLifecycle(),this,s);
        paper.setAdapter(adapter);
        TabLayoutMediator tabLayoutMediator=new TabLayoutMediator(tab, paper, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {

            }
        });
        tabLayoutMediator.attach();
        CountDownTimer Timer = new CountDownTimer(19*59*30000, 1000) {
            int m=19,s=59;
            public void onTick(long millisUntilFinished) {

                if( m>=0 && s>0){
                    s--;
                    txttime.setText(m+":"+s);
                }else if(m>0 && s==0){
                    m=m-1;
                    s=59;
                    txttime.setText(m+":"+s);
                }else if(m==0 && s==0){
                    onFinish();
                }

            }
            public void onFinish() {
                finish();
            }
        }.start();
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

}