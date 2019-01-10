package com.example.anjhiflash.myintent;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class SecondActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // mencari button pada layout, kemudian set aksi ketika diklik
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // keluar dari activity dan masuk ke activity sebelumnya
                finish();
            }
        });
    }
}
