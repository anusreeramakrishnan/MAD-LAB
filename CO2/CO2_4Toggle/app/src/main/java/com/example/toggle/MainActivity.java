package com.example.toggle;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    ToggleButton toggleButton;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toggleButton = findViewById(R.id.toggle);
        imageView = findViewById(R.id.imaageview);

        imageView.setImageDrawable(getResources().getDrawable(R.drawable.ic_power_off));

        toggleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (toggleButton.isChecked()){
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.lighton));
                }else{
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.lightoff));
                }
            }
        });
    }
}