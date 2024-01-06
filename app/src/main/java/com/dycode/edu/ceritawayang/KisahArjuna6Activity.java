package com.dycode.edu.ceritawayang;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class KisahArjuna6Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kisah_arjuna6);
    }

    public void onbtnnext6Click(View view) {
        Intent intent = new Intent(KisahArjuna6Activity.this, KisahArjuna7Activity.class);
        startActivity(intent);
    }
}