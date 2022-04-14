package com.example.appthiblxa1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.appthiblxa1.Adapters.ViewPaperAdapter;
import com.example.appthiblxa1.Model.Anwser;
import com.example.appthiblxa1.Model.Question;
import com.example.appthiblxa1.Model.Sentence;
import com.example.appthiblxa1.SQLite.CauHoiDAO;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import java.util.ArrayList;

public class OnSaHinh extends AppCompatActivity {
    private Button btnBack;
    private TabLayout tab;
    private ViewPager2 paper;
    private ViewPaperAdapter adapter;
    private ArrayList<Sentence> sentence;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_sa_hinh);
        tab=findViewById(R.id.tabSH);
        paper=findViewById(R.id.paperSH);
        btnBack=findViewById(R.id.btnBackSH);
        FragmentManager fragmentManager=getSupportFragmentManager();
        Intent intent=getIntent();
        sentence=new ArrayList<>();
        CauHoiDAO c=new CauHoiDAO(this);
        for(Sentence s:c.getAllSentenceSH()){
            if(s.getQuestion().getImageSH()!=0) sentence.add(s);
        }
        adapter=new ViewPaperAdapter(fragmentManager,getLifecycle(),this,sentence);
        paper.setAdapter(adapter);
        TabLayoutMediator tabLayoutMediator=new TabLayoutMediator(tab, paper, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {

            }
        });
        tabLayoutMediator.attach();
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();

            }
        });
    }
}