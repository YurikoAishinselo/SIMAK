package com.aps.simak13;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import com.google.firebase.auth.FirebaseAuthException;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class login extends AppCompatActivity {

    EditText usernameEditText;
    EditText passwordEditText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Button loginBtn = findViewById(R.id.loginButton);
        usernameEditText = findViewById(R.id.NIMmahasiswa);
        passwordEditText = findViewById(R.id.passwordMahasiswa);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = usernameEditText.getText().toString();
                String password = passwordEditText.getText().toString();

                // Add your own validation logic here
                if (username.equals("2021") && password.equals("pass")) {
                    Intent loginMove = new Intent(login.this, MainActivity.class);
                    startActivity(loginMove);
                } else {
                    Toast.makeText(login.this, "Invalid username or password", Toast.LENGTH_LONG).show();
                }
            }
        });

//        Button about = (Button) findViewById(R.id.aboutBtn);
//        about.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(login.this, about.class);
//                startActivity(intent);
//            }
//        });

    }}