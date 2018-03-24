package com.example.akshay.farmconnect;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;



/**
 * A simple {@link Fragment} subclass.
 */
public class CropSaleFragment extends Fragment {
    RecyclerView lv;
    RecyclerView.LayoutManager mLayoutManager;


    String[]cropArray = {"Rice","Wheat","Barley","Maize",

            "Oats","Millets","Pulses","Cotton","Sugarcane","Jute"};
    Integer[]imgid={R.drawable.rice,R.drawable.wheat,R.drawable.barley,R.drawable.maize,R.drawable.oats,R.drawable.millets,R.drawable.pulses
    ,R.drawable.cotton,R.drawable.sugarcane,R.drawable.jute};

    public CropSaleFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.fragment_crop_sale, container, false);
        lv= v.findViewById(R.id.listCrop);
        CustomListview customListview=new CustomListview(getActivity(),cropArray ,imgid);
        mLayoutManager = new LinearLayoutManager(getContext());
        lv.setLayoutManager(mLayoutManager);
        lv.setAdapter(customListview);
        return v;
    }

}
