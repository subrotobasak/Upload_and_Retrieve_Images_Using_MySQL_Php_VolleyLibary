package com.example.upload_and_retrieve_images_using_mysql_php_volleylibary.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.upload_and_retrieve_images_using_mysql_php_volleylibary.Model.ModelImage;
import com.example.upload_and_retrieve_images_using_mysql_php_volleylibary.R;


import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<ImageViewHOlder> {

    private Context context;
    private List<ModelImage> imageList;

    public MyAdapter(Context context, List<ModelImage> imageList) {
        this.context = context;
        this.imageList = imageList;
    }

    @NonNull
    @Override
    public ImageViewHOlder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_layout_item, parent, false);
        return new ImageViewHOlder(view);


    }

    @Override
    public void onBindViewHolder(@NonNull ImageViewHOlder holder, int position) {


        Glide.with(context).load(imageList.get(position).getImageurl()).into(holder.imageView);


    }

    @Override
    public int getItemCount() {
        return imageList.size();
    }
}

class ImageViewHOlder extends RecyclerView.ViewHolder {

    ImageView imageView;

    public ImageViewHOlder(@NonNull View itemView) {
        super(itemView);

        imageView = itemView.findViewById(R.id.cardViewImageViewId);
    }
}