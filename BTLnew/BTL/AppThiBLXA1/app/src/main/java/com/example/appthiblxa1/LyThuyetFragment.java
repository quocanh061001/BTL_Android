package com.example.appthiblxa1;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.appthiblxa1.Adapters.MyAnwserAdapter;
import com.example.appthiblxa1.Model.Anwser;
import com.example.appthiblxa1.Model.Question;
import com.example.appthiblxa1.Model.Sentence;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link LyThuyetFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class LyThuyetFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private Sentence sentence;
    private Activity activity;
    private ListView lst;
    private MyAnwserAdapter adapter;
    private TextView txtCauHoi,txtCau;
    public LyThuyetFragment(Activity activity,Sentence sentence) {
        this.activity=activity;
        this.sentence=sentence;
    }

    public LyThuyetFragment() {
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment LyThuyetFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static LyThuyetFragment newInstance(String param1, String param2) {
        LyThuyetFragment fragment = new LyThuyetFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_ly_thuyet, container, false);
        lst=v.findViewById(R.id.lstAnwser);
        txtCauHoi=v.findViewById(R.id.txtCauHoi);
        txtCauHoi.setText("Câu hỏi : "+sentence.getQuestion().getCauHoi());
        adapter=new MyAnwserAdapter(activity,sentence.getAnwsers());
        lst.setAdapter(adapter);
        return v;
    }
}