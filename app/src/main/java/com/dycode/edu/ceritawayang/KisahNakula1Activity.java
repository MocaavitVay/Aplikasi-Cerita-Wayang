package com.dycode.edu.ceritawayang;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class KisahNakula1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kisah_nakula1);
    }

    public void onBerbayarNakulaClick(View view) {
        Intent intent = new Intent(KisahNakula1Activity.this, Pembayaran1Activity.class);
        startActivity(intent);
    }
}