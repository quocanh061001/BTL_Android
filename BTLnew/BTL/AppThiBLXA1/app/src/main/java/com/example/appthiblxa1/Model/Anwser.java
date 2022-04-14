package com.example.appthiblxa1.Model;

import android.os.Parcel;
import android.os.Parcelable;

public class Anwser{
    private int id;
    private int MaCauHoi;
    private String Content;
    private boolean Ststus;
    private int value;
    public Anwser(int id,int MaCauHoi,String content, int value,boolean ststus) {
        this.id=id;
        this.MaCauHoi=MaCauHoi;
        Content = content;
        this.value=value;
        Ststus = ststus;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public int getMaCauHoi() {
        return MaCauHoi;
    }

    public void setMaCauHoi(int maCauHoi) {
        this.MaCauHoi = maCauHoi;
    }
    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
    public boolean isStstus() {
        return Ststus;
    }

    public void setStstus(boolean ststus) {
        Ststus = ststus;
    }
}
