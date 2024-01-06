package com.dycode.edu.ceritawayang;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Pembayaran3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pembayaran3);
    }

    public void lanjutkan(View view) {
        Intent intent = new Intent(Pembayaran3Activity.this, Pembayaran2Activity.class);
        startActivity(intent);
    }
}