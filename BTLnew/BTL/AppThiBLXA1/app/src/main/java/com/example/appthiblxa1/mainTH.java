package com.example.appthiblxa1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import java.util.ArrayList;

public class mainTH extends AppCompatActivity {
    private Button tvth;
    private TabLayout layoutTH;
    private ViewPager2 vipagerTH;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_thuc_hanh);
        tvth=findViewById(R.id.btnBackTH);
        layoutTH=findViewById(R.id.tablayout);
        vipagerTH=findViewById(R.id.viewp);
        pageth pagerTH=new pageth(this);
        vipagerTH.setAdapter(pagerTH);
        new TabLayoutMediator(layoutTH, vipagerTH, (tab, position) -> {
            switch (position)
            {
                case 0:
                    tab.setText("Luật thi");
                    break;
                case 1:
                    tab.setText("Kinh nghiệm thi");
                    break;

            }
        }).attach();
        tvth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();

            }
        });



    }
}