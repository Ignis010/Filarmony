package com.example.filarmony;

import androidx.appcompat.app.AppCompatActivity;

import android.app.SearchManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Catalog extends AppCompatActivity implements View.OnClickListener{

    Button btnLater;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catalog);
    }

    @Override
    public void onClick(View view) {
        Intent intent;

        switch (view.getId()){
            case R.id.later:
                intent = new Intent(this, Event.class);
                intent.putExtra("image", R.drawable.f9d6d5940f84d5e25a9fd39762234b83);
                startActivity(intent);
            case R.id.later2:
                intent = new Intent(this, Event.class);
                intent.putExtra("image", R.drawable._7799602bdb407b40641180f6c5a7f92);
                startActivity(intent);
            case R.id.later3:
                intent = new Intent(this, Event.class);
                intent.putExtra("image", R.drawable._07a53cd0c34cfaf7c0d8154786414ca);
                startActivity(intent);
        }
    }
}