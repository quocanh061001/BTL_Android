package com.example.appthiblxa1.Adapters;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;

import com.example.appthiblxa1.Model.Anwser;
import com.example.appthiblxa1.R;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class MyAnwserAdapter extends BaseAdapter {
    private Activity activity;
    private ArrayList<Anwser> arrAnwser;
    private LayoutInflater inflater;
    private Map<Integer,CheckBox> ChkPo;
    private int ok=0;
    public MyAnwserAdapter(Activity activity,ArrayList<Anwser> anwsers) {
        this.activity=activity;
        this.arrAnwser=anwsers;
        inflater=(LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        ChkPo=new HashMap<Integer,CheckBox>();
        for(Anwser ans:arrAnwser){
            if(ans.isStstus()) {
                ok=1;break;
            }
        }
    }
    @Override
    public int getCount() {
        return arrAnwser.size();
    }

    @Override
    public Object getItem(int i) {
        return arrAnwser.get(i);
    }

    @Override
    public long getItemId(int i) {
        return arrAnwser.get(i).getId();
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v=view;
        if(v==null){
            v=inflater.inflate(R.layout.anwser_layout,null);
            CheckBox chk=v.findViewById(R.id.chkAnwser);
            chk.setText(arrAnwser.get(i).getContent());
            chk.setChecked(arrAnwser.get(i).isStstus());
            chk.setChecked(arrAnwser.get(i).isStstus());
            if(arrAnwser.get(i).isStstus()&&arrAnwser.get(i).getValue()==0) chk.setBackgroundColor(Color.RED);
            if(ok==1&&arrAnwser.get(i).getValue()==1) chk.setBackgroundColor(Color.GREEN);
            if(arrAnwser.get(i).isStstus()&&arrAnwser.get(i).getValue()==1) chk.setBackgroundColor(Color.GREEN);
            ChkPo.put(i,chk);
            chk.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    arrAnwser.get(i).setStstus(chk.isChecked());
                    Set<Integer> set=ChkPo.keySet();
                    for(Integer in:set){
                        if(arrAnwser.get(in).isStstus()&&arrAnwser.get(in).getValue()==0) ChkPo.get(in).setBackgroundColor(Color.RED);
                        else if(arrAnwser.get(in).isStstus()&&arrAnwser.get(in).getValue()==1) {
                            ChkPo.get(in).setBackgroundColor(Color.GREEN);
                        }
                        else if(!arrAnwser.get(in).isStstus()&&arrAnwser.get(in).getValue()==1)
                            ChkPo.get(in).setBackgroundColor(Color.GREEN);
                    }
                }
            });
        }
        return v;
    }

}
