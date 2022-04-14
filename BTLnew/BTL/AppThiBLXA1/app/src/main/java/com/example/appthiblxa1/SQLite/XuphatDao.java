package com.example.appthiblxa1.SQLite;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.appthiblxa1.Model.XuPhat;

import java.util.ArrayList;

public class XuphatDao {
    private SQLiteDatabase db;
    private Context c;
    public XuphatDao(Context context){
        DBHelper dbHelper=new DBHelper(context);
        db=dbHelper.getWritableDatabase();
        c=context;
    }
    public void AddMucXuPhat(XuPhat xuPhat){

        ContentValues cv = new ContentValues();

        cv.put("MaXuPhat", xuPhat.getMaxuphat());
        cv.put("NoiDung", xuPhat.getNoiDung());
        cv.put("MucXuPhat", xuPhat.getMucXuPhat());

        db.insert("Xuphat",null, cv);
    }

    public ArrayList<XuPhat> GetAllMucXuPhat(){
        ArrayList<XuPhat> returnList = new ArrayList<XuPhat>();
        String queryString = "SELECT MaXuPhat, NoiDung, MucXuPhat FROM Xuphat";

        Cursor cursor = db.rawQuery(queryString, null);

        if(cursor.moveToFirst()){
            do{
                int maxuphat=cursor.getInt(0);
                String noidung = cursor.getString(1);
                String mucxuphat=cursor.getString(2);

                XuPhat xuphat= new XuPhat(maxuphat, noidung, mucxuphat);
                returnList.add(xuphat);
            }while(cursor.moveToNext());
        }else{

        }
        cursor.close();
        db.close();
        return returnList;
    }
    public void DeleteRecord(){
        db.execSQL("delete from Xuphat");
        db.close();
    }
}