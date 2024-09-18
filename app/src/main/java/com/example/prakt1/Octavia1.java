package com.example.prakt1;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Octavia1 extends AppCompatActivity {

    private ImageView anim;
    private Button btn1;
    private  Button btn2;
    private AnimationDrawable frameAnim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_octavia1);

        anim = findViewById(R.id.anim_cat);
        btn1 = findViewById(R.id.btn1_btn);
        btn2 = findViewById(R.id.btn2_btn);

        frameAnim = (AnimationDrawable) anim.getDrawable();
        frameAnim.start();

        btn1.setOnClickListener(v -> {
            if (!frameAnim.isRunning())
            {
                frameAnim.start();
            }
        });

        btn2.setOnClickListener(v -> {
            if (frameAnim.isRunning())
            {
                frameAnim.stop();
            }
        });
    }
}