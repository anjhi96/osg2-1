package com.example.anjhiflash.myintent;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class TopFragment extends Fragment {

    public TopFragment(){
        //
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        //inflate the layout for this fragment
        View view2 = inflater.inflate(R.layout.fragment_top, container, false);

        //Mencari button dalam view set aksi ketika di klik
        view2.findViewById(R.id.buttonTop).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //peritnah intent untuk share ke sosmed
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.putExtra(intent.EXTRA_TEXT, "Hallo Haiii!!! Disini Indra Aliyudin, apa kabar semuanyaaa??? Semoga selalu dalam lindungan-Nya");
                intent.setType("text/plain");

                //menjalankan perintah intent implisit
                startActivity(Intent.createChooser(intent, "Share To:"));
            }
        });
        return view2;
    }
}
