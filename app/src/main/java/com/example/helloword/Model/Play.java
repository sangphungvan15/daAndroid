package com.example.helloword.Model;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

@Generated("jsonschema2pojo")
public class Play implements Serializable {

    @SerializedName("Idplaylist")
    @Expose
    private String idplaylist;
    @SerializedName("Ten")
    @Expose
    private String ten;
    @SerializedName("Hinhplaylist")
    @Expose
    private String hinhplaylist;
    @SerializedName("Icon")
    @Expose
    private String icon;

    public String getIdplaylist() {
        return idplaylist;
    }

    public void setIdplaylist(String idplaylist) {
        this.idplaylist = idplaylist;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getHinhplaylist() {
        return hinhplaylist;
    }

    public void setHinhplaylist(String hinhplaylist) {
        this.hinhplaylist = hinhplaylist;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
}