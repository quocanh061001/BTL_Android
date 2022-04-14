package com.example.appthiblxa1.Model;

import android.os.Parcel;
import android.os.Parcelable;

public class DeThiCauHoi {
    private int MaDeThi;
    private int MaCauHoi;

    public DeThiCauHoi(int maDeThi, int maCauHoi) {
        MaDeThi = maDeThi;
        MaCauHoi = maCauHoi;
    }

    public int getMaDeThi() {
        return MaDeThi;
    }

    public int getMaCauHoi() {
        return MaCauHoi;
    }
}
