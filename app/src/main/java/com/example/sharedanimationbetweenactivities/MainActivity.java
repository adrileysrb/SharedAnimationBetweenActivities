package com.example.sharedanimationbetweenactivities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ConstraintLayout constraintLayout = findViewById(R.id.constraintLayout);
        TextView textView = findViewById(R.id.activity_main_nameTextView);
        TextView textView2 = findViewById(R.id.activity_main_DescriptionTextView);
        ImageView imageView = findViewById(R.id.activity_main_profileImageView);
        ImageView imageView2 = findViewById(R.id.imageView4);
        RequestOptions options = new RequestOptions()
                .circleCrop();
        Glide.with(this).load(R.drawable.a).apply(options).into(imageView);
        constraintLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                Pair[] pairs = new Pair[4];
                pairs[0] = new Pair<View, String>(imageView, "profileimageTransition");
                pairs[1] = new Pair<View, String>(textView, "nameTransition");
                pairs[2] = new Pair<View, String>(textView2, "descriptionTransition");
                pairs[3] = new Pair<View, String>(imageView2, "logoTransition");
                ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(MainActivity.this, pairs);

                startActivity(intent, options.toBundle());

            }
        });
    }
}