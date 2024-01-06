package com.dycode.edu.ceritawayang;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class KisahNakula4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kisah_nakula4);
    }

    public void onbtnKembali1Click(View view) {
        Intent intent = new Intent(KisahNakula4Activity.this, KisahNakula1Activity.class);
        startActivity(intent);
    }
}