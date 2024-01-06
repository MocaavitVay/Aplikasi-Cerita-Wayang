package com.dycode.edu.ceritawayang;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Kisaharjuna2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kisaharjuna2);
    }

    public void onbtnArjuna2Click(View view) {
        Intent intent = new Intent(Kisaharjuna2Activity.this, KisahArjuna3Activity.class);
        startActivity(intent);
    }
}