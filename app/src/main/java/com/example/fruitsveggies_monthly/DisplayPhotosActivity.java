package com.example.fruitsveggies_monthly;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DisplayPhotosActivity extends AppCompatActivity {

    String[] months = {"January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "Decemeber"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_photos);

        Food fruit = (Food) getIntent().getExtras().getParcelable("fruit");
        Food veggie = (Food) getIntent().getExtras().getParcelable("veggie");

        ImageView imageView1 = findViewById(R.id.fruit);
        ImageView imageView2 = findViewById(R.id. veggie);
        imageView1.setImageResource(fruit.getDrawablePath());
        imageView2.setImageResource(veggie.getDrawablePath());

        TextView textView1 = findViewById(R.id.textView1);
        textView1.setText(fruit.getName());

        TextView textView2 = findViewById(R.id.textView2);
        textView2.setText(veggie.getName());

        TextView textView3 = findViewById(R.id.textView3);
        textView3.setText(months[fruit.getMonth()-1]);
        }
    }
