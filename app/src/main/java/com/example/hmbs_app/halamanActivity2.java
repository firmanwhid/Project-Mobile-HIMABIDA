package com.example.hmbs_app;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class halamanActivity2 extends AppCompatActivity {

    CardView aboutCard, managerCard, productCard, reportCard, forumCard, callmeCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman2); // Sesuaikan dengan nama layout XML kamu

        // Inisialisasi CardView
        aboutCard = findViewById(R.id.about);
        managerCard = findViewById(R.id.manager);
        productCard = findViewById(R.id.product);
        reportCard = findViewById(R.id.report);
        forumCard = findViewById(R.id.forum);
        callmeCard = findViewById(R.id.callme);

        // Aksi klik tiap CardView
        aboutCard.setOnClickListener(v -> {
            Intent intent = new Intent(this, HalamanActivity3.class);
            startActivity(intent);
        });

        managerCard.setOnClickListener(v -> {
            Intent intent = new Intent(this, KepengurusanActivity.class);
            startActivity(intent);
        });

        productCard.setOnClickListener(v -> {
            Intent intent = new Intent(this, ProdukActivity.class);
            startActivity(intent);
        });

        reportCard.setOnClickListener(v -> {
            Intent intent = new Intent(this, LaporanActivity.class);
            startActivity(intent);
        });

        forumCard.setOnClickListener(v -> {
            Intent intent = new Intent(this, ForumActivity.class);
            startActivity(intent);
        });

        callmeCard.setOnClickListener(v -> {
            Intent intent = new Intent(this, HubungiKamiActivity.class);
            startActivity(intent);
        });
    }
}
