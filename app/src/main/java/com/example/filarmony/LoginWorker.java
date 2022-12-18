package com.example.filarmony;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginWorker extends AppCompatActivity {


    EditText login, password;
    Button btnLogIn, btnToUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_worker);

        login = (EditText) findViewById(R.id.login);
        password = (EditText) findViewById(R.id.password);
        btnLogIn = (Button) findViewById(R.id.btnLogin);
        btnToUser = (Button) findViewById(R.id.btnUser);

        btnToUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginWorker.this, LoginUser.class);
                startActivity(intent);
            }
        });

    }
}