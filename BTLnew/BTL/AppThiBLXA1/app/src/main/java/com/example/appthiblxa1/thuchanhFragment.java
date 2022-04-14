package com.example.appthiblxa1;

import android.app.Activity;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.appthiblxa1.Model.Sentence;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link thuchanhFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class thuchanhFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private ListView lstview;
//private Activity j;


    public thuchanhFragment() {
        // Required empty public constructor
    }
//    public thuchanhFragment(Activity k) {
//        // Required empty public constructor
//        j=k;
//    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment thuchanhFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static thuchanhFragment newInstance(String param1, String param2) {
        thuchanhFragment fragment = new thuchanhFragment();
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
        // Inflate the layout for this fragment

        View v= inflater.inflate(R.layout.fragment_thuchanh, container, false);
//        lstview=v.findViewById(R.id.lvi);
//        ArrayList<String> arrayList=new ArrayList<>();
//        arrayList.add("dvsdvdsv");
//        arrayList.add("vvvvv");
//        ArrayAdapter arrayAdapter=new ArrayAdapter
//                (j,R.layout.support_simple_spinner_dropdown_item,arrayList);
//        lstview.setAdapter(arrayAdapter);
        return  v;
    }
}