package com.dycode.edu.ceritawayang;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class KisahArjuna3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kisah_arjuna3);
    }

    public void onbtnnext3Click(View view) {
        Intent intent = new Intent(KisahArjuna3Activity.this, KisahArjuna4Activity.class);
        startActivity(intent);
    }
}