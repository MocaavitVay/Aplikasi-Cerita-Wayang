package com.dycode.edu.ceritawayang;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DaftarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar);
    }

    public void Daftar(View view) {
        Intent intent = new Intent(DaftarActivity.this, MainActivity2.class);
        startActivity(intent);
    }

    public void Masuk(View view) {
        Intent intent = new Intent(DaftarActivity.this, LoginActivity.class);
        startActivity(intent);
    }
}