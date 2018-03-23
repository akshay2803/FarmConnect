package com.example.akshay.farmconnect;

import android.app.Activity;
import android.content.Context;
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
    private String[] cropArray;
    private String[] desc;
    private Integer[] imgid;
    private Activity context;


    public CustomListview(String[] cropArray, String[] desc, Integer[] imgid){
        this.cropArray=cropArray;
        this.imgid=imgid;
        this.desc=desc;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = (View) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.listview_layout, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.tv2.setText(cropArray[position]);
        holder.img1.setImageResource(imgid[position]);
        holder.tv3.setText(desc[position]);
    }

    @Override
    public int getItemCount() {
        return desc.length;
    }

    
  /*  public CustomListview(CropSaleFragment context, String[]cropArray, String[]desc, Integer[] imgid ) {
         this.context=context;
        this.desc=desc;
        this.imgid=imgid;

    }*/

    public static class ViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        ImageView img1;
        TextView tv2;
        TextView tv3;
        public ViewHolder(View v) {
            super(v);
            img1=(ImageView) v.findViewById(R.id.imageView);
            tv2=(TextView)  v.findViewById(R.id.textView1);
            tv3=(TextView)  v.findViewById(R.id.textView2);
        }
    }
}
