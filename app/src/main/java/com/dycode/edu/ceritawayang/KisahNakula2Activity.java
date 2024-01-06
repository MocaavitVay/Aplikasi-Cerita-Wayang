package com.dycode.edu.ceritawayang;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class KisahNakula2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kisah_nakula2);
    }

    public void onbtnNakula2Click(View view) {
        Intent intent = new Intent(KisahNakula2Activity.this, KisahNakula3Activity.class);
        startActivity(intent);
    }
}