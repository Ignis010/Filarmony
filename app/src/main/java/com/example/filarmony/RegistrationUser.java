package com.example.filarmony;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegistrationUser extends AppCompatActivity {

    EditText login, email, number, surname, password, password_2;
    Button btnRegistration, btnToUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_user);

        login = (EditText) findViewById(R.id.login);
        email = (EditText) findViewById(R.id.email);
        number = (EditText) findViewById(R.id.number);
        surname = (EditText) findViewById(R.id.surname);
        password = (EditText) findViewById(R.id.password);
        password_2 = (EditText) findViewById(R.id.password2);
        btnRegistration = (Button) findViewById(R.id.btnLogin);
        btnToUser = (Button) findViewById(R.id.btnWorker);

        String strLogin = login.getText().toString();
        String strEmail = email.getText().toString();
        String strNumber = number.getText().toString();
        String strSurname = surname.getText().toString();
        String strPassword = password.getText().toString();



        btnToUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RegistrationUser.this, LoginUser.class);
                startActivity(intent);
            }
        });
    }
}