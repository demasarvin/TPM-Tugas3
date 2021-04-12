package com.example.tugas3;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class FootballAdapter extends RecyclerView.Adapter<FootballAdapter.FootballViewHolder>{
    private Context context;
    private ArrayList<FootballModel> listFootball;

    public FootballAdapter(Context context, ArrayList<FootballModel> datalist) {
        this.context = context;
        this.listFootball = datalist;
    }


    public class FootballViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view =layoutInflater.inflate(R.layout.item_football, parent, false);
        return new FootballViewHolder(view);
    }

    public void onBindViewHolder(HeroViewHolder holder, int position) {
        String image = listFootball.get(position).getImage();
        String name = listFootball.get(position).getName();
        String desc = listFootball.get(position).getDesc();

        Glide.with(holder.itemView.getContext()).load(listFootball.get(position).getImage()).into(holder.image);
        holder.name.setText(name);
        holder.desc.setText(desc);

        try {

            holder.btnPreview.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    openDetailActivity(image, name, desc);
                }
            });

            holder.btnShare.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    shareFootball(name, desc);
                }
            });
        }catch (Exception e) {
            Log.d("DetailActivity", "MyErr : " + e);
        }
    }

    @NonNull
    @Override
    public FootballViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view =layoutInflater.inflate(R.layout.item_football, parent, false);
        return new FootballViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FootballViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return (listFootball != null) ? listFootball.size() : 0;
    }

    public static class HeroViewHolder extends RecyclerView.ViewHolder{
        private final ImageView image;
        private final TextView name, desc;
        private final Button btnPreview, btnShare;

        public HeroViewHolder(View itemView){
            super(itemView);
            image = (ImageView)itemView.findViewById(R.id.logo_image);
            name = (TextView)itemView.findViewById(R.id.club_name);
            desc = (TextView)itemView.findViewById(R.id.club_desc);
            btnPreview = (Button)itemView.findViewById(R.id.btnPreview);
            btnShare = (Button)itemView.findViewById(R.id.btnShare);
        }
    }

    public void openDetailActivity(@NonNull String ...hero) {
        Intent i = new Intent(context, DetailActivity.class);
        i.putExtra("IMAGE_KEY", hero[0]);
        i.putExtra("NAME_KEY", hero[1]);
        i.putExtra("ROLE_KEY", hero[2]);
        i.putExtra("LORE_KEY", hero[3]);
        context.startActivity(i);
    }

    public void shareFootball(@NonNull String ...football) {
        Intent sendIntent = new Intent();
        sendIntent.setAction(Intent.ACTION_SEND);
        sendIntent.putExtra(Intent.EXTRA_TEXT, football[0] + "\n\n" + football[1]);
        sendIntent.setType("text/plain");

        Intent shareIntent = Intent.createChooser(sendIntent, null);
        context.startActivity(shareIntent);
    }
}
