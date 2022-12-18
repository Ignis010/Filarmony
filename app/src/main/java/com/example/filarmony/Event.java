package com.example.filarmony;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class Event extends AppCompatActivity implements View.OnClickListener {

    ImageView poster;
    TextView title, seats, leader, time, price, type;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);

        Bundle arguments = getIntent().getExtras();
        poster = findViewById(Integer.parseInt(arguments.get("hello").toString()));
    }

    @Override
    public void onClick(View view) {
        Intent intent;

        switch (view.getId()){
            case R.id.menu:
                intent = new Intent(this, Catalog.class);
                startActivity(intent);
        }
    }
}