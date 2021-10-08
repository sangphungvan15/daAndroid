package com.example.helloword.Model;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class ChudeTheloai {

    @SerializedName("Theloai")
    @Expose
    private List<TheLoai> theloai = null;
    @SerializedName("Chude")
    @Expose
    private List<ChuDe> chude = null;

    public List<TheLoai> getTheloai() {
        return theloai;
    }

    public void setTheloai(List<TheLoai> theloai) {
        this.theloai = theloai;
    }

    public List<ChuDe> getChude() {
        return chude;
    }

    public void setChude(List<ChuDe> chude) {
        this.chude = chude;
    }



}
