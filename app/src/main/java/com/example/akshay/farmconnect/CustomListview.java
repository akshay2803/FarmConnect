package com.example.akshay.farmconnect;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


public class CustomListview extends RecyclerView.Adapter<CustomListview.ViewHolder> {
    private String[] array;
    private Integer[] image;
    private Activity context;


    public CustomListview(Activity context,String[] array, Integer[] image){
        this.array=array;
        this.context=context;
        this.image=image;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = (View) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.listview_layout, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        holder.tv2.setText(array[position]);
        holder.img1.setImageResource(image[position]);
        holder.v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(context,DetailsActivity.class);
                intent.putExtra("array",array[position]);
                intent.putExtra("img",image[position]);
                intent.putExtra("position",position);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return array.length;
    }


    public static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        // each data item is just a string in this case

        ImageView img1;
        View v;
        TextView tv2;
        public ViewHolder(View v) {
            super(v);
            this.v=v;
            v.setOnClickListener(this);
            img1=(ImageView) v.findViewById(R.id.imageView);
            tv2=(TextView)  v.findViewById(R.id.textView1);
        }

        @Override
        public void onClick(View view) {



        }
    }
}
