package com.example.practmobnom7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SignIn extends AppCompatActivity implements View.OnClickListener {
    Button btOn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_in);
        btOn = findViewById(R.id.button);
        btOn.setOnClickListener(this);
        }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(this, Profile.class);
        startActivity(intent);

    }
}