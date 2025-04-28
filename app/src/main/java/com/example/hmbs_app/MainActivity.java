package com.example.hmbs_app;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button loginButton;
    TextView welcomeText;
    ImageView logoHima;

    private final String fullText = "SELAMAT DATANG";
    private int index = 0;
    private final long delay = 100; // Delay antar karakter (ms)
    private Handler handler = new Handler();

    private Runnable characterAdder = new Runnable() {
        @Override
        public void run() {
            if (index <= fullText.length()) {
                welcomeText.setText(fullText.substring(0, index));
                index++;
                handler.postDelayed(this, delay);
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Sesuaikan dengan layout kamu

        loginButton = findViewById(R.id.loginButton);
        welcomeText = findViewById(R.id.welcomeText);
        logoHima = findViewById(R.id.logoHima);

        // Animasi teks keluar satu per satu
        welcomeText.setText("");
        handler.postDelayed(characterAdder, delay);

        // Animasi tombol login (fade + slide up)
        Animation loginAnim = AnimationUtils.loadAnimation(this, R.anim.login_button_anim);
        loginButton.startAnimation(loginAnim);

        // Animasi logo (fade + scale)
        Animation logoAnim = AnimationUtils.loadAnimation(this, R.anim.logo_anim);
        logoHima.startAnimation(logoAnim);

        // Aksi klik tombol login
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, halamanActivity2.class);
                startActivity(intent);
            }
        });
    }
}
