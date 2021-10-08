package com.example.helloword.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.helloword.Activity.DanhsachtheloaithechudeMainActivity;
import com.example.helloword.Model.ChuDe;
import com.example.helloword.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class DanhsachchudeAdapter extends RecyclerView.Adapter<DanhsachchudeAdapter.ViewHoder> {
    Context context;
    ArrayList<ChuDe> mangchude;

    public DanhsachchudeAdapter(Context context, ArrayList<ChuDe> mangchude) {
        this.context = context;
        this.mangchude = mangchude;
    }

    @NonNull
    @Override
    public ViewHoder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.dong_danhsachchude,parent,false);
        return new ViewHoder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHoder holder, int position) {
        ChuDe chuDe = mangchude.get(position);
        Picasso.with(context).load(chuDe.getHinhchude()).into(holder.imgchude);

    }

    @Override
    public int getItemCount() {
        return mangchude.size();
    }

    public class ViewHoder extends RecyclerView.ViewHolder{
        ImageView imgchude;

        public ViewHoder(@NonNull View itemView) {
            super(itemView);
            imgchude = itemView.findViewById(R.id.imageviewcacchude);
            imgchude.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(context, DanhsachtheloaithechudeMainActivity.class);
                    intent.putExtra("chude",mangchude.get(getPosition()));
                    context.startActivity(intent);
                }
            });

        }
    }
}
