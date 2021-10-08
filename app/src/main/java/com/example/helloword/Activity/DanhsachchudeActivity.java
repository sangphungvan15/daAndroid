package com.example.helloword.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.example.helloword.Adapter.DanhsachchudeAdapter;
import com.example.helloword.Model.ChuDe;
import com.example.helloword.R;
import com.example.helloword.Service.APIService;
import com.example.helloword.Service.Dataservice;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class DanhsachchudeActivity extends AppCompatActivity {
    RecyclerView recyclerViewallchude;
    Toolbar toolbarallchude;
    DanhsachchudeAdapter danhsachchudeAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_danhsachchude);
        init();
        GetData();
    }

    private void GetData() {
        Dataservice dataservice = APIService.getService();
        Call<List<ChuDe>> callback = dataservice.GetAllChude();
        callback.enqueue(new Callback<List<ChuDe>>() {
            @Override
            public void onResponse(Call<List<ChuDe>> call, Response<List<ChuDe>> response) {
                ArrayList<ChuDe> mangchude = (ArrayList<ChuDe>) response.body();
                danhsachchudeAdapter = new DanhsachchudeAdapter(DanhsachchudeActivity.this,mangchude);
                recyclerViewallchude.setLayoutManager(new GridLayoutManager(DanhsachchudeActivity.this,1));
                recyclerViewallchude.setAdapter(danhsachchudeAdapter);

            }

            @Override
            public void onFailure(Call<List<ChuDe>> call, Throwable t) {

            }
        });
    }

    private void init() {
        recyclerViewallchude = findViewById(R.id.recylerviewallchude);
        toolbarallchude = findViewById(R.id.toobarallchude);
        setSupportActionBar(toolbarallchude);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Tất Cả Chủ Đề");
        toolbarallchude.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}