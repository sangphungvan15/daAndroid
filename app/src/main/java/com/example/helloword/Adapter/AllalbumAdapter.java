package com.example.helloword.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.helloword.Activity.DanhsachalbumMainActivity;
import com.example.helloword.Activity.DanhsachbaihatMainActivity;
import com.example.helloword.Model.Album;
import com.example.helloword.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class AllalbumAdapter extends RecyclerView.Adapter<AllalbumAdapter.ViewHolder> {
    Context context;
    ArrayList<Album> albumArrayList;

    public AllalbumAdapter(Context context, ArrayList<Album> albumArrayList) {
        this.context = context;
        this.albumArrayList = albumArrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.dong_allalbum,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Album album= albumArrayList.get(position);
        Picasso.with(context).load(album.getHinhalbum()).into(holder.imgallbum);
        holder.txttenallalbum.setText(album.getTenAlbum());

    }

    @Override
    public int getItemCount() {
        return albumArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView imgallbum;
        TextView txttenallalbum;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imgallbum = itemView.findViewById(R.id.imageviewallalbum);
            txttenallalbum = itemView.findViewById(R.id.textviewtenallalbum);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(context, DanhsachbaihatMainActivity.class);
                    intent.putExtra("album",albumArrayList.get(getPosition()));
                    context.startActivity(intent);
                }
            });
        }
    }
}
