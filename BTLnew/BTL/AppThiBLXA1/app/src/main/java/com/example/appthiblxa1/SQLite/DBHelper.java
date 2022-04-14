package com.example.appthiblxa1.SQLite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DBHelper extends SQLiteOpenHelper {
    private static final String DB_Name="DB_ThiBLXA1";
    public DBHelper(@Nullable Context context) {
        super(context, DB_Name, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sqlCretable_CauHoi="Create table CauHoi(" +
                "MaCauHoi Integer primary key," +
                "NoiDungCauHoi Text," +
                "HinhBienBao Integer," +
                "HinhSaHinh Integer)";

        String sqlCretable_DapAn="Create table DapAn(" +
                "MaDapAn Integer primary key," +
                "MaCauHoi Integer,"+
                "NoiDung Text," +
                "DapAnDung Integer," +
                "DaDuocChon Integer)" ;
        db.execSQL(sqlCretable_CauHoi);
        db.execSQL(sqlCretable_DapAn);


        String sqlCretable_DeThi="Create table if not exists DeThi(MaDeThi Integer primary key)";
        db.execSQL(sqlCretable_DeThi);
        String sqlCretable_DeThiCauHoi="Create table if not exists DeThiCauHoi(" +
                "MaDeThi Integer," +
                "MaCauHoi Integer," +
                "primary key(MaDeThi,MaCauHoi))";
        db.execSQL(sqlCretable_DeThiCauHoi);


        String sqlCretable_BienBao="Create table if not exists BienBao(" +
                "MaBien Integer primary key," +
                "MaLoai Integer," +
                "HinhAnh Integer," +
                "TenBien Text)"
                ;
        db.execSQL(sqlCretable_BienBao);
        String sqlCretable_LoaiBien="Create table if not exists LoaiBien(" +
                "MaLoai Integer primary key," +
                "TenLoai Text)"
                ;
        db.execSQL(sqlCretable_LoaiBien);


        String sqlCreatetable_Xuphat="Create table if not exists Xuphat(" +
                "MaXuPhat Integer primary key, " +
                "NoiDung String, "+
                "MucXuPhat String)";
        db.execSQL(sqlCreatetable_Xuphat);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("Drop table if exists CauHoi");
        db.execSQL("Drop table if exists DeThi");
        db.execSQL("Drop table if exists DeThi_CauHoi");
        db.execSQL("Drop table if exists DapAn");
        onCreate(db);
    }
}
