package com.example.appthiblxa1;

import android.app.Activity;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.appthiblxa1.Adapters.MyAnwserAdapter;
import com.example.appthiblxa1.Model.Sentence;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link SaHinhFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SaHinhFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private ImageView img;
    private Activity activity;
    private Sentence sentence;
    private ListView lstDs;
    private TextView txtCauHoi;
    public  SaHinhFragment(Activity activity, Sentence sentence){
        this.activity=activity;
        this.sentence=sentence;
    }
    public SaHinhFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment SaHinhFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static SaHinhFragment newInstance(String param1, String param2) {
        SaHinhFragment fragment = new SaHinhFragment();
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
        View v=inflater.inflate(R.layout.fragment_sa_hinh, container, false);
        txtCauHoi=v.findViewById(R.id.txtCauHoiSH);
        txtCauHoi.setText("Câu hỏi: "+sentence.getQuestion().getCauHoi());
        img=v.findViewById(R.id.imgSH);
        if(sentence.getQuestion().getImageSH()==0)
        img.setImageResource(sentence.getQuestion().getImageBB());
        else img.setImageResource(sentence.getQuestion().getImageSH());
        lstDs=v.findViewById(R.id.lstDS);
        MyAnwserAdapter adapter=new MyAnwserAdapter(activity,sentence.getAnwsers());
        lstDs.setAdapter(adapter);
        // Inflate the layout for this fragmen
        return v;
    }

}