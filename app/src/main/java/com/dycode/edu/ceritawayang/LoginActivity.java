package com.dycode.edu.ceritawayang;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }



    public void Daftar(View view) {
        Intent intent = new Intent(LoginActivity.this, DaftarActivity.class);
        startActivity(intent);
    }

    public void Masuk(View view) {
        Intent intent = new Intent(LoginActivity.this, MainActivity2.class);
        startActivity(intent);
    }
}