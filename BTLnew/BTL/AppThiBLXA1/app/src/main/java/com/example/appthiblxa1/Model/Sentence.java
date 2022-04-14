package com.example.appthiblxa1.Model;


import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;
import java.util.ArrayList;

public class Sentence {
    private Question question;
    private ArrayList<Anwser> anwsers;

    public Sentence(Question question, ArrayList<Anwser> anwsers) {
        this.question = question;
        ArrayList<Anwser> anwserArrayList=new ArrayList<>();
        for(Anwser a:anwsers) anwserArrayList.add(a);
        this.anwsers = anwserArrayList;
    }
    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public ArrayList<Anwser> getAnwsers() {
        return anwsers;
    }

    public void setAnwsers(ArrayList<Anwser> anwsers) {
        ArrayList<Anwser> anwserArrayList=new ArrayList<>();
        for(Anwser a:anwsers) anwserArrayList.add(a);
        this.anwsers = anwserArrayList;
    }

}
