package com.example.location_view_booking;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class expand_text_view extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView text1 = findViewById(R.id.text1);
        TextView text2 = findViewById(R.id.text2);

        ImageView button1 = findViewById(R.id.btn1);
        ImageView button2 = findViewById(R.id.btn2);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (text1.getVisibility() == View.GONE) {
                    text1.setVisibility(View.VISIBLE);
                    button1.setImageResource(R.drawable.baseline_keyboard_arrow_up_24);
                } else {
                    text1.setVisibility(View.GONE);
                    button1.setImageResource(R.drawable.baseline_keyboard_arrow_down_24);

                }
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (text2.getVisibility() == View.GONE) {
                    text2.setVisibility(View.VISIBLE);
                    button2.setImageResource(R.drawable.baseline_keyboard_arrow_up_24);
                } else {
                    text2.setVisibility(View.GONE);
                    button2.setImageResource(R.drawable.baseline_keyboard_arrow_down_24);

                }
            }
        });

    }
}


