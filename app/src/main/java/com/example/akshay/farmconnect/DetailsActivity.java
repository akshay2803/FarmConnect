package com.example.akshay.farmconnect;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    String name;
    String[] price1={"150","100"};
    String[] price2;
    Integer[] imgid={R.drawable.rice,R.drawable.wheat,R.drawable.barley,R.drawable.maize,R.drawable.oats,R.drawable.millets,R.drawable.pulses};
    int position;
    ImageView imgView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        if(getIntent()!=null){
            Bundle bundle=getIntent().getExtras();
            name=(String) bundle.get("array");
            position=(int) bundle.get("position");
        }
        imgView=findViewById(R.id.imgView);
        imgView.setImageResource(imgid[position]);

    }
}
