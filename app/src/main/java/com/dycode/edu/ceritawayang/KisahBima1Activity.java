package com.dycode.edu.ceritawayang;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class KisahBima1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kisah_bima1);
    }

    public void onMulaiBaca2Click(View view) {
        Intent intent = new Intent(KisahBima1Activity.this, KisahBima2Activity.class);
        startActivity(intent);
    }
}