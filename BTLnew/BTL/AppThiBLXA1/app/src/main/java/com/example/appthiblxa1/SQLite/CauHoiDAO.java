package com.example.appthiblxa1.SQLite;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.widget.Toast;

import com.example.appthiblxa1.MainActivity;
import com.example.appthiblxa1.Model.Anwser;
import com.example.appthiblxa1.Model.DeThiCauHoi;
import com.example.appthiblxa1.Model.Question;
import com.example.appthiblxa1.Model.Sentence;

import java.util.ArrayList;
import java.util.List;

public class CauHoiDAO {
    private SQLiteDatabase db;
    public CauHoiDAO(Context context){
        DBHelper dbHelper=new DBHelper(context);
        db=dbHelper.getWritableDatabase();
    }
    public void insertDeThi(int made)
    {
        ContentValues value=new ContentValues();
        value.put("MaDeThi",made);
        db.insert("DeThi",null,value);
    }
    public ArrayList<Sentence> getSentence(String sql){
        ArrayList<Sentence> list = new ArrayList<>();
            Cursor cursor = db.rawQuery(sql,null);

            ArrayList<Anwser> anwsers = new ArrayList<>();
            ArrayList<Question> questions = new ArrayList<>();
            ArrayList<Integer> ar=new ArrayList<>();
            Question q;
            if (cursor != null)
                while (cursor.moveToNext()) {
                     q = new Question(cursor.getInt(0), cursor.getString(1), cursor.getInt(2), cursor.getInt(3));
                     if(ar.contains(q.getId())==false){
                         questions.add(q);
                         ar.add(q.getId());
                     }
                    Anwser a = new Anwser(cursor.getInt(4), cursor.getInt(0), cursor.getString(5), cursor.getInt(6),
                            cursor.getInt(7) == 0 ? false : true);
                    anwsers.add(a);
                }
            ArrayList<Anwser> anwsers1=new ArrayList<>();
            for(Question qs:questions){
                for(Anwser a:anwsers){
                    if(a.getMaCauHoi()==qs.getId()) anwsers1.add(a);
                }
                list.add(new Sentence(qs,anwsers1));
                anwsers1.clear();
            }

        return list;
    }
    public ArrayList<Sentence> getAllSentence(){

        ArrayList<Sentence>lst=new ArrayList<>();
            String sql = "select CauHoi.MaCauHoi,NoiDungCauHoi,HinhBienBao,HinhSaHinh," +
                    "MaDapAn,NoiDung,DapAnDung,DaDuocChon from CauHoi inner join DapAn on CauHoi.MaCauHoi=DapAn.MaCauHoi" +
                    " where HinhSaHinh=0";
            lst = getSentence(sql);
        return lst;
    }
    public ArrayList<Sentence> getAll(){
        ArrayList<Sentence>lst=new ArrayList<>();
            String sql = "select CauHoi.MaCauHoi,NoiDungCauHoi,HinhBienBao,HinhSaHinh," +
                    "MaDapAn,NoiDung,DapAnDung,DaDuocChon from CauHoi inner join DapAn on CauHoi.MaCauHoi=DapAn.MaCauHoi";
            lst = getSentence(sql);
        return lst;
    }
    public ArrayList<Sentence> getAllSentenceSH(){

        ArrayList<Sentence>lst=new ArrayList<>();
            String sql = "select CauHoi.MaCauHoi,NoiDungCauHoi,HinhBienBao,HinhSaHinh," +
                    "MaDapAn,NoiDung,DapAnDung,DaDuocChon from CauHoi inner join DapAn on CauHoi.MaCauHoi=DapAn.MaCauHoi" +
                    " where HinhSaHinh > 0";
            lst = getSentence(sql);
               return lst;
    }
    public void insertDeThiCauHoi(int MaDe,int MaCauHoi){
        ContentValues value=new ContentValues();
        value.put("MaDeThi",MaDe);
        value.put("MaCauHoi",MaCauHoi);
        db.insert("DeThiCauHoi",null,value);
    }
    public ArrayList<DeThiCauHoi> getAllDeThiCauHoi(String sql){
        ArrayList<DeThiCauHoi> list = new ArrayList<>();
        Cursor cursor = db.rawQuery(sql,null);
        if (cursor != null)
            while (cursor.moveToNext()) {
               DeThiCauHoi d=new DeThiCauHoi(cursor.getInt(0),cursor.getInt(1));
               list.add(d);
            }
        return list;
    }
    public ArrayList<DeThiCauHoi> getDeThiCauHoi(){
        ArrayList<DeThiCauHoi>lst=new ArrayList<>();
            String sql = "select * from DeThiCauHoi";
            lst = getAllDeThiCauHoi(sql);
              return lst;
    }
    public void insertCauHoi(Question q){
        ContentValues value=new ContentValues();
        value.put("MaCauHoi",q.getId());
        value.put("NoiDungCauHoi",q.getCauHoi());
        value.put("HinhSaHinh",q.getImageSH());
        value.put("HinhBienBao",q.getImageBB());
        db.insert("CauHoi",null,value);
    }
    public void insertDapAn(Anwser a){
        ContentValues value=new ContentValues();
        value.put("MaDapAn",a.getId());
        value.put("MaCauHoi",a.getMaCauHoi());
        value.put("NoiDung",a.getContent());
        value.put("DapAnDung",a.getValue());
        value.put("DaDuocChon",0);
        db.insert("DapAn",null,value);
    }
    public void deleteCauHoi(){
        String sql="delete from CauHoi ";
                db.execSQL(sql);
    }
    public void deleteDapAn(){
        String sql="delete from DapAN";
        db.execSQL(sql);
    }
    public void deleteCauHoiID(int id){
        String sql="delete from CauHoi where MaCauHoi="+id;
        db.execSQL(sql);
    }
    public void deleteDapAnID(int id){
        String sql="delete from DapAn where MaDapAn="+id;
        db.execSQL(sql);
    }
    public void close(){
        db.close();
    }
}
