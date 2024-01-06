package com.dycode.edu.ceritawayang;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class KisahYudhistira2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kisah_yudhistira2);
    }

    public void onbtnnext1Click(View view) {
        Intent intent = new Intent(KisahYudhistira2Activity.this, KisahYudhistira3Activity.class);
        startActivity(intent);
    }
}