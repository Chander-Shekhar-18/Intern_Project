package com.example.intern_project;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class ExampleAdapter extends RecyclerView.Adapter<ExampleAdapter.ExampleViewHolder> {

    private Context context;
    private ArrayList<ExampleItem> exampleList;

    public ExampleAdapter(Context context, ArrayList<ExampleItem> exampleList) {
        this.context = context;
        this.exampleList = exampleList;
    }

    @NonNull
    @Override
    public ExampleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.example_item, parent, false);
        return new ExampleViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ExampleViewHolder holder, int position) {
        ExampleItem currentItem = exampleList.get(position);
        String imageUrl = currentItem.getImageUrl();
        String name = currentItem.getName();
        String agency = currentItem.getAgency();
        String status = currentItem.getStatus();
        String wikiLink = currentItem.getWikiLink();

        Picasso.get()
                .load(imageUrl)
                .fit()
                .centerInside()
                .into(holder.profileImage);
        holder.txtViewName.setText("Name : "+name);
        holder.txtViewStatus.setText("status : "+status);
        holder.txtViewAgency.setText("Agency : "+agency);
        holder.txtViewWikiLink.setText("Wikipedia : "+wikiLink);
    }

    @Override
    public int getItemCount() {
        return exampleList.size();
    }

    public class ExampleViewHolder extends RecyclerView.ViewHolder {

        public CircleImageView profileImage;
        public TextView txtViewName, txtViewAgency, txtViewWikiLink, txtViewStatus;

        public ExampleViewHolder(@NonNull View itemView) {
            super(itemView);
            profileImage = itemView.findViewById(R.id.image_profile);
            txtViewName = itemView.findViewById(R.id.tectViewName);
            txtViewAgency = itemView.findViewById(R.id.txtViewAgency);
            txtViewWikiLink = itemView.findViewById(R.id.textViewWiki);
            txtViewStatus = itemView.findViewById(R.id.txtViewStatus);
        }
    }
}















