package com.example.anjhiflash.myintent;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class BottomFragment extends Fragment {

    public BottomFragment(){
        //
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        // Inflate the  layout for this fragment
        View view = inflater.inflate(R.layout.fragment_bottom, container, false);

        //Mencari button dalam view dan set aksi ketika di klik
        view.findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                //memulai activity baru, SecondActivity
                startActivity(new Intent(getActivity(),SecondActivity.class));
            }
        });
        return view;
    }
}
