package com.dycode.edu.ceritawayang;

import static com.dycode.edu.ceritawayang.R.id.KisahBima1ImageButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class BerandaActivity extends Fragment {

    public BerandaActivity() {
        // Diperlukan konstruktor kosong saat membuat fragment.
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate layout untuk fragment ini
        View view = inflater.inflate(R.layout.activity_beranda, container, false);

        // Temukan ImageButton dengan ID kisahArjuna1ImageButton
        ImageButton kisahArjuna1Button = view.findViewById(R.id.kisahArjuna1ImageButton);

        // Tambahkan onClickListener untuk menangani klik pada ImageButton
        kisahArjuna1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Panggil metode yang akan menangani klik di sini
                onKisahArjuna1Click(v);
            }
        });

        // Temukan ImageButton dengan ID KisahYudhistira1ImageButton
        ImageButton KisahYudhistira1ImageButton = view.findViewById(R.id.KisahYudhistira1ImageButton);

        // Tambahkan onClickListener untuk menangani klik pada ImageButton
        KisahYudhistira1ImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Panggil metode yang akan menangani klik di sini
                onKisahYudhistira1Click(v);
            }
        });


        ImageButton KisahBima1ImageButton = view.findViewById(R.id.KisahBima1ImageButton);

        // Tambahkan onClickListener untuk menangani klik pada ImageButton
        KisahBima1ImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Panggil metode yang akan menangani klik di sini
                onKisahBima1Click(v);
            }
        });

        // Temukan ImageButton dengan ID KisahYudhistira1ImageButton
        TextView TextArjunaTextView = view.findViewById(R.id.TextArjunaTextView);

        // Tambahkan onClickListener untuk menangani klik pada ImageButton
        TextArjunaTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Panggil metode yang akan menangani klik di sini
                onTextArjunaClick(v);
            }
        });

        // Temukan ImageButton dengan ID KisahYudhistira1ImageButton
        TextView TextNakulaTextView = view.findViewById(R.id.TextNakulaTextView);

        // Tambahkan onClickListener untuk menangani klik pada ImageButton
        TextNakulaTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Panggil metode yang akan menangani klik di sini
                onTextNakulaClick(v);
            }
        });

        return view;
    }

    // Metode yang akan dipanggil saat ImageButton kisahArjuna1ImageButton diklik
    public void onKisahArjuna1Click(View view) {
        // Intent untuk memulai KisahArjuna1Activity
        Intent intent = new Intent(getActivity(), KisahArjuna1Activity.class);
        startActivity(intent);
    }

    // Metode yang akan dipanggil saat ImageButton KisahYudhistira1ImageButton diklik
    public void onKisahYudhistira1Click(View view) {
        // Intent untuk memulai KisahYudhistira1Activity
        Intent intent = new Intent(getActivity(), KisahYudhistira1Activity.class);
        startActivity(intent);
    }

    // Metode yang akan dipanggil saat ImageButton KisahBima1ImageButton diklik
    public void onKisahBima1Click(View view) {
        // Intent untuk memulai KisahBima1Activity
        Intent intent = new Intent(getActivity(), KisahBima1Activity.class);
        startActivity(intent);
    }

    // Metode yang akan dipanggil saat ImageButton kisahArjuna1ImageButton diklik
    public void onTextArjunaClick(View view) {
        // Intent untuk memulai KisahArjuna1Activity
        Intent intent = new Intent(getActivity(), KisahArjuna1Activity.class);
        startActivity(intent);
    }

    // Metode yang akan dipanggil saat ImageButton kisahArjuna1ImageButton diklik
    public void onTextNakulaClick(View view) {
        // Intent untuk memulai KisahArjuna1Activity
        Intent intent = new Intent(getActivity(), KisahNakula1Activity.class);
        startActivity(intent);
    }
}
