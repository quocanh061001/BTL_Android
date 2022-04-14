package com.example.appthiblxa1.Adapters;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.appthiblxa1.Model.ItemMenu;
import com.example.appthiblxa1.R;

import java.util.ArrayList;

public class MyAdapter extends BaseAdapter {
    private Activity activity;
    private ArrayList<ItemMenu> itemMenu;
    private LayoutInflater inflater;

    public MyAdapter(Activity activity, ArrayList<ItemMenu> itemMenu) {
        this.activity = activity;
        this.itemMenu = itemMenu;
        this.inflater = (LayoutInflater) activity.getSystemService(activity.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return itemMenu.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v=view;
        if(v==null){
            v=inflater.inflate(R.layout.menuitem,null);
            ImageView img=v.findViewById(R.id.imgIcon);
            img.setImageResource(itemMenu.get(i).getImage());
            TextView txt=v.findViewById(R.id.txtNameItem);
            txt.setText(itemMenu.get(i).getName());
        }
        return v;
    }
}
