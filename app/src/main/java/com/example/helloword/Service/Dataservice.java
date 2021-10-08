package com.example.helloword.Service;

import com.example.helloword.Model.Album;
import com.example.helloword.Model.Baihat;
import com.example.helloword.Model.ChuDe;
import com.example.helloword.Model.ChudeTheloai;
import com.example.helloword.Model.Play;
import com.example.helloword.Model.Quangcao;
import com.example.helloword.Model.TheLoai;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface Dataservice {
    @GET("bannerquangcao.php")
    Call<List<Quangcao>> GetDataBanner();

    @GET("playlist.php")
    Call<List<Play>> GetPlaylistCurrentDay();

    @GET("chudetheloai.php")
    Call<ChudeTheloai> GetCategorymusic();

    @GET("album.php")
    Call<List<Album>> GetAlbum();

    @GET("baihathot.php")
    Call<List<Baihat>> GetBaiHat();

    @FormUrlEncoded
    @POST("danhsachbaihat.php")
    Call<List<Baihat>> Getdanhsachbaihatquangcao(@Field("idquangcao") String idquangcao);

    @FormUrlEncoded
    @POST("danhsachbaihat.php")
    Call<List<Baihat>> Getdanhsachbaihattheoplaylist(@Field("idplaylist") String idplaylist );

    @GET("danhsachplaylist.php")
    Call<List<Play>> Getdanhsachplaylist();

    @FormUrlEncoded
    @POST("danhsachbaihat.php")
    Call<List<Baihat>> Getdanhsachbaihattheloai(@Field("idtheloai") String idtheloai);

    @GET("tatcachude.php")
    Call<List<ChuDe>> GetAllChude();

    @FormUrlEncoded
    @POST("theloaitheochude.php")
    Call<List<TheLoai>> Gettheloaitheochude(@Field("idchude") String idchude);

    @GET("tatcaclbum.php")
    Call<List<Album>> GetAllalbum();

    @FormUrlEncoded
    @POST("danhsachbaihat.php")
    Call<List<Baihat>> Getdanhsachbaihattheoalbum(@Field("idalbum") String idalbum);

    @FormUrlEncoded
    @POST("updateluotthich.php")
    Call<String> Updateluotthich(@Field("luotthich") String luotthich, @Field("idbaihat") String idbaihat);




}
