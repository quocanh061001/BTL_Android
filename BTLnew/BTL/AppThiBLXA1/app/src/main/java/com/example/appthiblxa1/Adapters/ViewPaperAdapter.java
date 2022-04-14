package com.example.appthiblxa1.Adapters;

import android.app.Activity;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import java.util.ArrayList;

import com.example.appthiblxa1.LyThuyetFragment;
import com.example.appthiblxa1.Model.Anwser;
import com.example.appthiblxa1.Model.Question;
import com.example.appthiblxa1.Model.Sentence;
import com.example.appthiblxa1.SaHinhFragment;

public class ViewPaperAdapter extends FragmentStateAdapter {
    private  Activity activity;
    private ArrayList<Sentence> sentences;
    public ViewPaperAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle,
                            Activity activity,ArrayList<Sentence> sentences ) {
        super(fragmentManager, lifecycle);
        this.activity=activity;
        this.sentences=sentences;
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        if(sentences.get(position).getQuestion().getImageBB()!=0||sentences.get(position).getQuestion().getImageSH()!=0)
            return new SaHinhFragment(activity,sentences.get(position));
        return new LyThuyetFragment(activity,sentences.get(position));
    }

    @Override
    public int getItemCount() {
        return sentences.size();
    }

}
