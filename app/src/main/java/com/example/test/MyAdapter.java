package com.example.test;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyAdapter extends ArrayAdapter<String> {
    private final Context context;
    private final String[] itemNames;
    private final int[] itemImages;
    private final String[] itemQuantities;
    private final int[] itemQuantityImages;
    private final String[] itemTimes;
    private final int[] itemTimeImages;
    private final int cookingImage;

    public MyAdapter(Context context, String[] itemNames, int[] itemImages, String[] itemQuantities, int[] itemQuantityImages,
                     String[] itemTimes, int[] itemTimeImages, int cookingImage) {
        super(context, R.layout.list_item, itemNames);
        this.context = context;
        this.itemNames = itemNames;
        this.itemImages = itemImages;
        this.itemQuantities = itemQuantities;
        this.itemQuantityImages = itemQuantityImages;
        this.itemTimes = itemTimes;
        this.itemTimeImages = itemTimeImages;
        this.cookingImage = cookingImage;
    }

    static class ViewHolder {
        TextView nameTextView;
        ImageView itemImageView;
        TextView quantityTextView;
        ImageView quantityImageView;
        TextView timeTextView;
        ImageView timeImageView;
        ImageView cookingImageView;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;

        if (convertView == null) {
            LayoutInflater inflater = LayoutInflater.from(context);
            convertView = inflater.inflate(R.layout.list_item, parent, false);

            holder = new ViewHolder();
            holder.nameTextView = convertView.findViewById(R.id.txt);
            holder.itemImageView = convertView.findViewById(R.id.img);
            holder.quantityTextView = convertView.findViewById(R.id.txt2);
            holder.quantityImageView = convertView.findViewById(R.id.img2);
            holder.timeTextView = convertView.findViewById(R.id.txt3);
            holder.timeImageView = convertView.findViewById(R.id.img3);
            holder.cookingImageView = convertView.findViewById(R.id.img4);

            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        holder.nameTextView.setText(itemNames[position]);
        holder.itemImageView.setImageResource(itemImages[position]);
        holder.quantityTextView.setText(itemQuantities[position]);
        holder.quantityImageView.setImageResource(itemQuantityImages[position]);
        holder.timeTextView.setText(itemTimes[position]);
        holder.timeImageView.setImageResource(itemTimeImages[position]);
        holder.cookingImageView.setImageResource(cookingImage);

        return convertView;
    }
}
