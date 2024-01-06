package com.dycode.edu.ceritawayang;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Pembayaran1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pembayaran1);
    }

    public void Bayar3(View view) {
        Intent intent = new Intent(Pembayaran1Activity.this, Pembayaran3Activity.class);
        startActivity(intent);
    }
}