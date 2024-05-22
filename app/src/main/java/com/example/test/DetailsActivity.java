package com.example.test;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);


        ImageView detailImage = findViewById(R.id.detail_image);
        TextView detailName = findViewById(R.id.detail_name);
        TextView detailDescription = findViewById(R.id.detail_description);

        Intent intent = getIntent();
        String name = intent.getStringExtra("tittle");
        int image = intent.getIntExtra("image", 0);
        String description = intent.getStringExtra("description");

        detailName.setText(name);
        detailImage.setImageResource(image);
        detailDescription.setText(description);
    }
}