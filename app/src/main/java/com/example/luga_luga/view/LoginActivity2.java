package com.example.luga_luga.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.luga_luga.R;
import com.example.luga_luga.view.MainActivity;

public class LoginActivity2 extends AppCompatActivity {

    private Button buttonlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);

        buttonlogin = findViewById(R.id.bot_login);

        Intent intent = new Intent(this, MainActivity.class);
        buttonlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent);
            }

        });
    }
}