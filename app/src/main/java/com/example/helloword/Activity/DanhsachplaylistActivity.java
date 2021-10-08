package com.example.helloword.Activity;



import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.example.helloword.Adapter.DanhsachplaylistAdapter;
import com.example.helloword.Model.Play;
import com.example.helloword.R;
import com.example.helloword.Service.APIService;
import com.example.helloword.Service.Dataservice;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class DanhsachplaylistActivity extends AppCompatActivity {
    Toolbar toolbar;
    RecyclerView recyclerViewdanhsachcacplaylist;
    DanhsachplaylistAdapter danhsachplaylistAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_danhsachplaylist);
        anhxa();
        init();
        GetData();
    }

    private void GetData() {
        Dataservice dataservice = APIService.getService();
        Call<List<Play>> callback = dataservice.Getdanhsachplaylist();
        callback.enqueue(new Callback<List<Play>>() {
            @Override
            public void onResponse(Call<List<Play>> call, Response<List<Play>> response) {
                ArrayList<Play> mangplaylist = (ArrayList<Play>) response.body();
                danhsachplaylistAdapter = new DanhsachplaylistAdapter(DanhsachplaylistActivity.this,mangplaylist);
                recyclerViewdanhsachcacplaylist.setLayoutManager(new GridLayoutManager(DanhsachplaylistActivity.this,2));
                recyclerViewdanhsachcacplaylist.setAdapter(danhsachplaylistAdapter);


            }

            @Override
            public void onFailure(Call<List<Play>> call, Throwable t) {

            }
        });
    }

    private void init() {
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Play List");
        toolbar.setTitleTextColor(getResources().getColor(R.color.mautim));
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });



    }

    private void anhxa() {
        toolbar = findViewById(R.id.toobardanhsachplaylist);
        recyclerViewdanhsachcacplaylist = findViewById(R.id.recyclerviewdanhsachcaplaylist);
    }
}