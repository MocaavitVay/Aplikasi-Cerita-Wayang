package com.dycode.edu.ceritawayang;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class KisahNakula3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kisah_nakula3);
    }
    public void onbtnNakula3Click(View view) {
        Intent intent = new Intent(KisahNakula3Activity.this, KisahNakula4Activity.class);
        startActivity(intent);
    }
}