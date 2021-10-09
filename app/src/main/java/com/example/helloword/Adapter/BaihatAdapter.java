package com.example.helloword.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.helloword.Model.Baihat;
import com.example.helloword.R;
import com.example.helloword.Service.APIService;
import com.example.helloword.Service.Dataservice;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class BaihatAdapter extends RecyclerView.Adapter<BaihatAdapter.ViewHolder>  {
    Context context;
    ArrayList<Baihat> baihatArrayList;

    public BaihatAdapter(Context context, ArrayList<Baihat> baihatArrayList) {
        this.context = context;
        this.baihatArrayList = baihatArrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.dong_baihat,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Baihat baihat = baihatArrayList.get(position);
        holder.txtcasi.setText(baihat.getTencasi());
        holder.txtten.setText(baihat.getTenbaihat());
        Picasso.with(context).load(baihat.getHinhbaihat()).into(holder.imghinh);

    }

    @Override
    public int getItemCount() {
        return baihatArrayList.size();
    }

    public class  ViewHolder extends RecyclerView.ViewHolder{
        TextView txtten,txtcasi;
        ImageView imghinh,imgluotthich;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtten = itemView.findViewById(R.id.textviewbaihat);
            txtcasi = itemView.findViewById(R.id.textviewcasibaihat);
            imghinh = itemView.findViewById(R.id.imageviewbaihat);
            imgluotthich = imghinh.findViewById(R.id.imageviewluotthich);

        }
    }
}
