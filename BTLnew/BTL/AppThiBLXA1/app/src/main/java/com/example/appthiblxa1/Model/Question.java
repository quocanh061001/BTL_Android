package com.example.appthiblxa1.Model;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;

public class Question{
    private int id;
    private String CauHoi;
    private int imageBB;
    private int imageSH;
    public int getId(){return id;}
    public void setId(int id){this.id=id;}
    public String getCauHoi() {
        return CauHoi;
    }
    public void setCauHoi(String cauHoi) {
        CauHoi = cauHoi;
    }
    public int getImageBB() {

        return imageBB;
    }
    public void setImageBB(int image) {
        imageBB = image;
    }
    public int getImageSH() {

        return imageSH;
    }
    public void setImageSH(int image) {
        imageSH = image;
    }
    public Question(int id,String cauHoi,int imageBB,int imageSH) {
        this.id=id;
        CauHoi = cauHoi;
        this.imageSH=imageSH;
        this.imageBB=imageBB;
    }
}
