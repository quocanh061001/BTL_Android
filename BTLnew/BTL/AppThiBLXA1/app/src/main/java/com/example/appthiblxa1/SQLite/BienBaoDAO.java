package com.example.appthiblxa1.SQLite;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.appthiblxa1.Model.ItemBienBao;

import java.util.ArrayList;

public class BienBaoDAO {
    private SQLiteDatabase db;


    public BienBaoDAO(Context context) {
        DBHelper dbHelper = new DBHelper(context);
        db=dbHelper.getWritableDatabase();

    }
    public  ArrayList<ItemBienBao> getAllBienBao(){
        ArrayList<ItemBienBao> List =new ArrayList<>();
        String sql=" select MaBien,MaLoai,TenBien,HinhAnh from BienBao ";
        Cursor cursor = db.rawQuery(sql,null);
        ArrayList<ItemBienBao> itemBienBaos = new ArrayList<>();
        ItemBienBao b;
        if (cursor != null)
            while (cursor.moveToNext()) {

                b = new ItemBienBao(cursor.getInt(0), cursor.getInt(1), cursor.getString(2),cursor.getInt(3));
                
                List.add(b);
            }
        return List;
    }

    public void  insertBienBao(ItemBienBao a){
        ContentValues value = new ContentValues();
        value.put("MaBien",a.getId());
        value.put("MaLoai",a.getMaloai());
        value.put("HinhAnh",a.getImage());
        value.put("TenBien",a.getName());
        db.insert("BienBao",null,value);
    }
    public void deleteBienBao(){
        String sql="delete from BienBao";
        db.execSQL(sql);
    }

    public void close(){
        db.close();
    }

}
