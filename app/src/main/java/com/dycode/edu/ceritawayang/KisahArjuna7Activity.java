package com.dycode.edu.ceritawayang;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class KisahArjuna7Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kisah_arjuna7);
    }

    public void onbtnKembaliClick(View view) {
        Intent intent = new Intent(KisahArjuna7Activity.this, KisahArjuna1Activity.class);
        startActivity(intent);
    }
}