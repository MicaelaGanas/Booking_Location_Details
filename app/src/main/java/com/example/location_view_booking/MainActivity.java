package com.example.location_view_booking;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageSlider imageSlider = findViewById(R.id.imageSlider);
        ArrayList<SlideModel> slideModels = new ArrayList<>();

        slideModels.add(new SlideModel(R.drawable.one, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.two, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.three, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.four, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.five, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.six, ScaleTypes.FIT));

        imageSlider.setImageList(slideModels, ScaleTypes.FIT);

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