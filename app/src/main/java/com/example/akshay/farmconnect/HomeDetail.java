package com.example.akshay.farmconnect;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class HomeDetail extends AppCompatActivity {

    Integer[] imgid={R.drawable.rice,R.drawable.wheat,R.drawable.barley,R.drawable.maize,R.drawable.oats,R.drawable.millets,R.drawable.pulses};
    int position;
    ImageView imgView;
    String name="hgh";
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_detail);

        if(getIntent()!=null){
            Bundle bundle=getIntent().getExtras();
            name=(String) bundle.get("array");
            position=(int) bundle.get("position");
        }
        imgView=findViewById(R.id.imgView);
        imgView.setImageResource(imgid[position]);
        textView=findViewById(R.id.textdetail);
        textView.setText(name);
    }
}
