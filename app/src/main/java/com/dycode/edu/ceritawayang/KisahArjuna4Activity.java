package com.dycode.edu.ceritawayang;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class KisahArjuna4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kisah_arjuna4);
    }

    public void onbtnnext4Click(View view) {
        Intent intent = new Intent(KisahArjuna4Activity.this, KisahArjuna6Activity.class);
        startActivity(intent);
    }
}