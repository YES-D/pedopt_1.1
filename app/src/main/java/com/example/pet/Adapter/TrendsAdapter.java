package com.example.pet.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.GranularRoundedCorners;
import com.example.pet.Domain.TrendSDomain;
import com.example.pet.R;

import java.util.ArrayList;

public class TrendsAdapter extends RecyclerView.Adapter<TrendsAdapter.Viewholder> {
    ArrayList<TrendSDomain> items;
    Context context;

    public TrendsAdapter(ArrayList<TrendSDomain> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public TrendsAdapter.Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflator= LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholder_trnd_list,parent,false);
        context= parent.getContext();
        return new Viewholder(inflator);
    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, int position) {
        holder.title.setText(items.get(position).getTitle());
        holder.subtitle.setText(items.get(position).getSubtitle());

        int drawableResourceId=holder.itemView.getResources().getIdentifier(items.get(position).getPicAddress(),"drawable",holder.itemView.getContext().getPackageName());
        Glide.with(holder.itemView.getContext());
        load(drawableResourceId);
        tranform(new GranularRoundedCorners(30,30,0,0));
        into(holder.picc);






    }

    private void into(ImageView picc) {
    }

    private void tranform(GranularRoundedCorners granularRoundedCorners) {
    }

    private void load(int drawableResourceId) {
    }

    @Override
    public int getItemCount() {

        return items.size();
    }

    public class  Viewholder extends RecyclerView.ViewHolder{
TextView title,subtitle;
ImageView picc;
        public Viewholder(@NonNull View itemView) {
            super(itemView);
            title=itemView.findViewById(R.id.titleTxt);
            subtitle=itemView.findViewById(R.id.subtitleTxt);
            picc=itemView.findViewById(R.id.picc);
        }
    }
}
