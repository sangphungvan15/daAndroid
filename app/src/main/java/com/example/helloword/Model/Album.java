package com.example.helloword.Model;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

@Generated("jsonschema2pojo")
public class Album implements Serializable {

    @SerializedName("Idalbum")
    @Expose
    private String idalbum;
    @SerializedName("TenAlbum")
    @Expose
    private String tenAlbum;
    @SerializedName("Tencasi")
    @Expose
    private String tencasi;
    @SerializedName("Hinhalbum")
    @Expose
    private String hinhalbum;

    public String getIdalbum() {
        return idalbum;
    }

    public void setIdalbum(String idalbum) {
        this.idalbum = idalbum;
    }

    public String getTenAlbum() {
        return tenAlbum;
    }

    public void setTenAlbum(String tenAlbum) {
        this.tenAlbum = tenAlbum;
    }

    public String getTencasi() {
        return tencasi;
    }

    public void setTencasi(String tencasi) {
        this.tencasi = tencasi;
    }

    public String getHinhalbum() {
        return hinhalbum;
    }

    public void setHinhalbum(String hinhalbum) {
        this.hinhalbum = hinhalbum;
    }

}