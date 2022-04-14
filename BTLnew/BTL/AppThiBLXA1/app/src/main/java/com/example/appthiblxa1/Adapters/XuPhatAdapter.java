package com.example.appthiblxa1.Adapters;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.appthiblxa1.Model.XuPhat;
import com.example.appthiblxa1.R;

import java.util.ArrayList;

public class XuPhatAdapter extends BaseAdapter {


    private Activity activity;
    private ArrayList<XuPhat> data;
    private LayoutInflater inflater;

    public XuPhatAdapter(Activity activity, ArrayList<XuPhat> data) {
        this.activity = activity;
        this.data = data;
        inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int i) {
        return data.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v = view;
        if(v==null)
        {
            v=inflater.inflate(R.layout.xuphat, null);

            TextView nd = v.findViewById(R.id.tvNoiDung);
            nd.setText(data.get(i).getNoiDung());
            TextView mucxuphat = v.findViewById(R.id.tvMucXuPhat);
            mucxuphat.setText(data.get(i).getMucXuPhat());
        }
        return v;
    }
}
