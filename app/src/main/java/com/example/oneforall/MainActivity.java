package com.example.oneforall;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.helper.widget.Carousel;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.google.android.material.card.MaterialCardView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    @SuppressLint("UseCompatLoadingForDrawables")
    List<Drawable> drawable = new ArrayList<>();

    @SuppressLint("UseCompatLoadingForDrawables")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        drawable.add(this.getResources().getDrawable(R.drawable.facebook_icon));
        setupCarousel();
    }

    private void setupCarousel() {
        Carousel carousel = findViewById(R.id.carousel);
        int numImages = drawable.size();

        carousel.setAdapter(new Carousel.Adapter() {
            @Override
            public int count() {
                return numImages;
            }

            @Override
            public void populate(View view, int index) {
                view.setBackground(drawable.get(index));
                // need to implement this to populate the view at the given index
            }

            @Override
            public void onNewItem(int index) {
                // called when an item is set
            }
        });
    }
}