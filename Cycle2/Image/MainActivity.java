package com.example.sjcet.image;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;
    private Button toggleButton;
    private boolean isImage1Displayed = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageView);
        toggleButton = findViewById(R.id.toggleButton);

        toggleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Toggle between the two images
                if (isImage1Displayed) {
                    imageView.setImageResource(R.drawable.image2);
                } else {
                    imageView.setImageResource(R.drawable.image1);
                }
                isImage1Displayed = !isImage1Displayed;
            }
        });
    }
}
