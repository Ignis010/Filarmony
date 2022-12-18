package com.example.filarmony;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginUser extends AppCompatActivity implements View.OnClickListener {

    EditText login, password;
    Button btnLogin, btnToRegistration, btnToWorker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_user);

        login = (EditText) findViewById(R.id.login);
        password = (EditText) findViewById(R.id.password);
        btnLogin = (Button) findViewById(R.id.btnLogin);
        btnToRegistration = (Button) findViewById(R.id.btnRegistration);
        btnToWorker = (Button) findViewById(R.id.btnWorker);

        btnToRegistration.setOnClickListener(this);
        btnToWorker.setOnClickListener(this);
        btnLogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent;
        Toast toast;
        String rightLogin = "Aizu";
        String rightPassword = "HimeraGriff";

        String mLogin = login.getText().toString();
        String mPassword = password.getText().toString();
        switch (view.getId()){
            case R.id.btnRegistration:
                intent = new Intent(LoginUser.this, RegistrationUser.class);
                startActivity(intent);
            case R.id.btnWorker:
                intent = new Intent(LoginUser.this, LoginWorker.class);
                startActivity(intent);
            case R.id.btnLogin:
                if ((mLogin.equals(rightLogin)) & (mPassword.equals(rightPassword))) {
                    intent = new Intent(LoginUser.this, Catalog.class);
                    startActivity(intent);
                }
                else {
                    toast = Toast.makeText(getApplicationContext(),"Не правильный логин или пароль!",
                            Toast.LENGTH_SHORT);
                    toast.show();
                }
        }
    }
}