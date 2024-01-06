package com.dycode.edu.ceritawayang;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class KisahBima2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kisah_bima2);
    }

    public void onbtnnexttClick(View view) {
        Intent intent = new Intent(KisahBima2Activity.this, KisahBima3Activity.class);
        startActivity(intent);
    }
}