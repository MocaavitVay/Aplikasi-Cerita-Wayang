package com.dycode.edu.ceritawayang;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class KeamananActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_keamanan);
    }

    public void KataSandi(View view) {
        Intent intent = new Intent(KeamananActivity.this, KataSandiActivity.class);
        startActivity(intent);
    }

    public void AktivitasLogin(View view) {
        Intent intent = new Intent(KeamananActivity.this, AktivitasLoginActivity.class);
        startActivity(intent);
    }

    public void InfoLogin(View view) {
        Intent intent = new Intent(KeamananActivity.this, InfoLoginActivity.class);
        startActivity(intent);
    }
}