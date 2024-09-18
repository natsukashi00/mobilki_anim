package com.example.prakt1;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Octavia2 extends AppCompatActivity {

    private ImageView img;
    private Button btn1;
    private Button btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_octavia2);
        img=findViewById(R.id.img);
        btn1=findViewById(R.id.start_tween);
        btn2=findViewById(R.id.pause_tween);

        Animation dogAnimation = AnimationUtils.loadAnimation(this,R.anim.dog_anim);
        img.startAnimation(dogAnimation);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                img.startAnimation(dogAnimation);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                img.clearAnimation();
            }
        });
    }
}