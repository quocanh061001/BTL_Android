package com.example.appthiblxa1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.appthiblxa1.Model.Anwser;
import com.example.appthiblxa1.Model.DeThiCauHoi;
import com.example.appthiblxa1.Model.Question;
import com.example.appthiblxa1.Model.Sentence;

import java.util.ArrayList;

public class DeThi extends AppCompatActivity {
    private Button btnDe;
    private ArrayList<Question> q;
    private ArrayList<Anwser> a;
    private ArrayList<DeThiCauHoi> d;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_de_thi);
        btnDe=findViewById(R.id.btnDe1);
        btnDe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1=new Intent(DeThi.this,DeThiBLX.class);
                Bundle bundle=new Bundle();
                bundle.putInt("key",1);
                intent1.putExtras(bundle);
                startActivity(intent1);
            }
        });
    }
}