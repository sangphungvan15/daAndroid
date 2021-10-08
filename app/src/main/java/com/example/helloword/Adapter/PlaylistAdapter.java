package com.example.helloword.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.helloword.Model.Play;
import com.example.helloword.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class PlaylistAdapter extends ArrayAdapter<Play> {
    public PlaylistAdapter(@NonNull Context context, int resource, @NonNull List<Play> objects) {
        super(context, resource, objects);
    }
    class Viewholder{
        TextView txttenplaylist;
        ImageView imgbackground,imgplaylist;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Viewholder viewholder = null;
        if(convertView == null){
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.dong_playlist,null);
            viewholder = new Viewholder();
            viewholder.txttenplaylist = convertView.findViewById(R.id.textviewtenplaylist);
            viewholder.imgplaylist = convertView.findViewById(R.id.imageviewplaylist);
            viewholder.imgbackground = convertView.findViewById(R.id.imageviewbackgroundplaylist);
            convertView.setTag(viewholder);

        } else {
            viewholder = (Viewholder) convertView.getTag();
        }
        Play play = getItem(position);
        Picasso.with(getContext()).load(play.getHinhplaylist()).into(viewholder.imgbackground);
        Picasso.with(getContext()).load(play.getIcon()).into(viewholder.imgplaylist);
        viewholder.txttenplaylist.setText(play.getTen());
        return convertView;
    }
}
