package com.dycode.edu.ceritawayang;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

public class ProfileActivity extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {
        View view = LayoutInflater.from(getContext()).inflate(R.layout.activity_profile, container, false);

        // Temukan ImageButton dengan ID kisahArjuna1ImageButton
        Button AkunButton = view.findViewById(R.id.AkunButton);

        // Tambahkan onClickListener untuk menangani klik pada ImageButton
        AkunButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Panggil metode yang akan menangani klik di sini
                onAkunClick(v);
            }
        });

        // Temukan ImageButton dengan ID kisahArjuna1ImageButton
        Button KeamananButton = view.findViewById(R.id.KeamananButton);

        // Tambahkan onClickListener untuk menangani klik pada ImageButton
        KeamananButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Panggil metode yang akan menangani klik di sini
                onKeamananClick(v);
            }
        });

        // Temukan ImageButton dengan ID kisahArjuna1ImageButton
        Button PengaturanButton = view.findViewById(R.id.PengaturanButton);

        // Tambahkan onClickListener untuk menangani klik pada ImageButton
        PengaturanButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Panggil metode yang akan menangani klik di sini
                onPengaturanClick(v);
            }
        });

        return view;
    }

    // Metode yang akan dipanggil saat ImageButton KisahBima1ImageButton diklik
    public void onAkunClick(View view) {
        // Intent untuk memulai KisahBima1Activity
        Intent intent = new Intent(getActivity(), EditprofileActivity.class);
        startActivity(intent);
    }

    // Metode yang akan dipanggil saat ImageButton KisahBima1ImageButton diklik
    public void onKeamananClick(View view) {
        // Intent untuk memulai KisahBima1Activity
        Intent intent = new Intent(getActivity(), KeamananActivity.class);
        startActivity(intent);
    }

    // Metode yang akan dipanggil saat ImageButton KisahBima1ImageButton diklik
    public void onPengaturanClick(View view) {
        // Intent untuk memulai KisahBima1Activity
        Intent intent = new Intent(getActivity(), PengaturanActivity.class);
        startActivity(intent);
    }

}