package com.dycode.edu.ceritawayang;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class KisahYudhistira1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kisah_yudhistira1);
    }

    public void onMulaiBacaAClick(View view) {
        Intent intent = new Intent(KisahYudhistira1Activity.this, KisahYudhistira2Activity.class);
        startActivity(intent);
    }
}