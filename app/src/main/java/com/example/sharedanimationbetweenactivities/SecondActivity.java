package com.example.sharedanimationbetweenactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        ImageView imageView = findViewById(R.id.imageView);
        RequestOptions options = new RequestOptions()
                .circleCrop();
        Glide.with(this).load(R.drawable.a).apply(options).into(imageView);

        TextView textView = findViewById(R.id.textView2);
        textView.setText("Aluno no Instituto Federal Goiano \nBacharelado em Sistemas de Informação");
    }
}