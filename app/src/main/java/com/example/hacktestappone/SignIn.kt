package com.example.hacktestappone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SignIn : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)
        val navigateToSignUp = findViewById<Button>(R.id.signUpNavigateBtn);

        navigateToSignUp.setOnClickListener {
            val intent = Intent(this,SignUp::class.java);
            startActivity(intent);
            finish();
        }
    }
}