package com.example.appthiblxa1.Adapters;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.appthiblxa1.Model.ItemBienBao;
import com.example.appthiblxa1.R;

import java.util.ArrayList;

public class MyBienBaoAdapter extends BaseAdapter {

    private Activity activity;
    private ArrayList<ItemBienBao> itemBienBaos;
    private LayoutInflater inflater;

    public MyBienBaoAdapter(Activity activity, ArrayList<ItemBienBao> itemBienBaos){
        this.activity=activity;
        this.itemBienBaos=itemBienBaos;
        inflater=(LayoutInflater)  activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() {
        return itemBienBaos.size();
    }

    @Override
    public Object getItem(int i) {
        return itemBienBaos.get(i);
    }

    @Override
    public long getItemId(int i) { return itemBienBaos.get(i).getId();
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v=view;
        if(v==null){
            v=inflater.inflate(R.layout.item_bien_bao,null);
            ImageView img=v.findViewById(R.id.imgBB);
            img.setImageResource(itemBienBaos.get(i).getImage());
            TextView txtmabien =v.findViewById(R.id.txtMaBien);
            txtmabien.setText(itemBienBaos.get(i).getId()+"");
            TextView txttenbien=v.findViewById(R.id.txtTenBien);
            txttenbien.setText(itemBienBaos.get(i).getName());
        }
        return v;
    }
}
