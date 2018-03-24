package com.example.akshay.farmconnect;


import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class MarketTodayFragment extends Fragment {

    RecyclerView lv;
    RecyclerView.LayoutManager mLayoutManager;


    String[] marketArray={"HYV Seeds","Cattle feeds","Cattle Medics","Drip Irrigation Pipes","Chemical Fertilizers",
            "Organic Fertilizers","Farm Machinery","Pesticides-Organic","Plant Growth Nutrients"};
    Integer[]imgid1={R.drawable.hyvseeds,R.drawable.cattlefeeds,R.drawable.cattlemedicine,R.drawable.drippipes,R.drawable.chemicalfertilisers,R.drawable.organicferti
            ,R.drawable.farmmachine,R.drawable.pesticideorganic,R.drawable.plantgrowth};


    public MarketTodayFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_market_today, container, false);
        lv= v.findViewById(R.id.listCrop1);
        CustomListview customListview=new CustomListview(getActivity(),marketArray , imgid1);
        mLayoutManager = new LinearLayoutManager(getContext());
        lv.setLayoutManager(mLayoutManager);
        lv.setAdapter(customListview);
        return v;
    }
}
