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

/**
 * Created by abhay on 3/22/2018.
 */

public class CustomListview extends ArrayAdapter <String> {
    private String[] cropArray;
    private String[] desc;
    private Integer[] imgid;
    private Activity context;

    public CustomListview(){}
  /*  public CustomListview(CropSaleFragment context, String[]cropArray, String[]desc, Integer[] imgid ) {
         this.context=context;
        this.desc=desc;
        this.imgid=imgid;

    }*/

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View r=convertView;
        ViewHolder viewHolder=null;
        if(r==null)
        {
            LayoutInflater layoutInflater=context.getLayoutInflater();
            r=layoutInflater.inflate(R.layout.listview_layout,null,true);
            r.setTag(viewHolder);
        }
        else
        {
            viewHolder=(ViewHolder)r.getTag();

        }
        viewHolder.tv1.setImageResource(imgid[position]);
        viewHolder.tv2.setText(cropArray[position]);
        viewHolder.tv3.setText(desc[position]);

        return r;
    }
    class ViewHolder
    {
      ImageView tv1;
      TextView tv2;
      TextView tv3;
      ViewHolder(View v)
      {
         tv1=(ImageView) v.findViewById(R.id.imageView);
         tv2=(TextView)  v.findViewById(R.id.textView1);
         tv2=(TextView)  v.findViewById(R.id.textView2);



      }



    }
}
