package com.example.hmbs_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class LaporanActivity extends AppCompatActivity {

    // Deklarasi menu
    LinearLayout about, manager, report, product, forum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laporan); // Ganti jika layout berbeda

        ImageButton backButton = findViewById(R.id.back_button);
        backButton.setOnClickListener(v -> {
            Intent intent = new Intent(LaporanActivity.this, halamanActivity2.class);
            startActivity(intent);
            finish(); // opsional, supaya HubungiKamiActivity tidak tersisa di backstack
        });

        // Inisialisasi item menu
        about = findViewById(R.id.about);
        manager = findViewById(R.id.manager);
        report = findViewById(R.id.report);
        product = findViewById(R.id.product);
        forum = findViewById(R.id.forum);

        // Listener untuk masing-masing menu
        about.setOnClickListener(v -> {
            Intent intent = new Intent(LaporanActivity.this, HalamanActivity3.class);
            startActivity(intent);
        });

        manager.setOnClickListener(v -> {
            Intent intent = new Intent(LaporanActivity.this, KepengurusanActivity.class);
            startActivity(intent);
        });

        report.setOnClickListener(v -> {
            Intent intent = new Intent(LaporanActivity.this, LaporanActivity.class);
            startActivity(intent);
        });

        product.setOnClickListener(v -> {
            Intent intent = new Intent(LaporanActivity.this, ProdukActivity.class);
            startActivity(intent);
        });

        forum.setOnClickListener(v -> {
            Intent intent = new Intent(LaporanActivity.this, ForumActivity.class);
            startActivity(intent);
        });
    }
}
