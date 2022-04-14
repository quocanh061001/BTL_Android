package com.example.appthiblxa1.Model;

public class ItemBienBao  {
    private int Image;
    private int Id;
    private int Maloai;
    private String Name;





    public int getId() {
        return Id;
    }
    public void setId(int id) {
        this.Id = id;
    }

    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }

    public int getImage() {
        return Image;
    }
    public void setImage(int image) {
        Image = image;
    }

    public int getMaloai() {
        return Maloai;
    }

    public void setMaloai(int maloai) {
        Maloai = maloai;
    }

    public ItemBienBao(int id, int maloai, String name, int image) {
        this.Image=image;
        this.Maloai=maloai;
        this.Id = id;
        Name = name;
    }

}
