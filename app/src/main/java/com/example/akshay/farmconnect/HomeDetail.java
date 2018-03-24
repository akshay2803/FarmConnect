package com.example.akshay.farmconnect;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class HomeDetail extends AppCompatActivity {

    Integer[]imgid={R.drawable.agri1,R.drawable.agri2,R.drawable.agri3,R.drawable.agri4,R.drawable.agri5,R.drawable.agri6,R.drawable.agri7
            ,R.drawable.agri8,R.drawable.agri9,R.drawable.agri10};
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
