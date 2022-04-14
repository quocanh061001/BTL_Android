package com.example.appthiblxa1.Model;

public class XuPhat {
    private Integer MaXuPhat;
    private String NoiDung;
    private String MucXuPhat;

    public XuPhat(Integer maxuphat, String noiDung, String mucXuPhat) {
        MaXuPhat = maxuphat;
        NoiDung = noiDung;
        MucXuPhat = mucXuPhat;
    }



    public Integer getMaxuphat() {
        return MaXuPhat;
    }

    public void setMaxuphat(Integer maxuphat) {
        MaXuPhat = maxuphat;
    }

    public String getNoiDung() {
        return NoiDung;
    }

    public void setNoiDung(String noiDung) {
        NoiDung = noiDung;
    }

    public String getMucXuPhat() {
        return MucXuPhat;
    }

    public void setMucXuPhat(String mucXuPhat) {
        MucXuPhat = mucXuPhat;
    }
}
