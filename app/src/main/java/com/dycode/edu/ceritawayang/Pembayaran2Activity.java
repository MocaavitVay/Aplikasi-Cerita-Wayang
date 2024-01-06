package com.dycode.edu.ceritawayang;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Pembayaran2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pembayaran2);
    }

    public void Perbarui(View view) {
        Intent intent = new Intent(Pembayaran2Activity.this, Kisaharjuna2Activity.class);
        startActivity(intent);
    }

    public void Sudah(View view) {
        Intent intent = new Intent(Pembayaran2Activity.this, KisahNakula2Activity.class);
        startActivity(intent);
    }
}