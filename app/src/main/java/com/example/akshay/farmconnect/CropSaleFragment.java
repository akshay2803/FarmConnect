package com.example.akshay.farmconnect;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;



/**
 * A simple {@link Fragment} subclass.
 */
public class CropSaleFragment extends Fragment {
    ListView lv;

    String[]cropArray = {"Rice","Wheat","Barley","Maize",
            "Oats"};
    String[]desc={"50kg","40kg","30kg","60kg","90kg"};
    Integer[]imgid={R.drawable.rice,R.drawable.wheat,R.drawable.barley,R.drawable.maize,R.drawable.oats};
    public CropSaleFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.fragment_crop_sale, container, false);
        lv=(ListView) v.findViewById(R.id.listCrop);
        //CustomListview customListview=new CustomListview(this,cropArray,desc,imgid);
        return v;
    }



}
