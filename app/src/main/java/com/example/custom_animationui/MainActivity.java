package com.example.custom_animationui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button, button1, button2, button4, button5, button6;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        textView = findViewById(R.id.text);
        button1 = findViewById(R.id.button2);
        button2 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        FragmentManager fragmentManager = getSupportFragmentManager();

        FragmentTransaction transaction = fragmentManager.beginTransaction();
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                transaction.setCustomAnimations(R.anim.rotate, R.anim.righttoleft);
                transaction.replace(R.id.main, new Dashbord_Fragment());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                transaction.setCustomAnimations(R.anim.zoomin, R.anim.zoomout);
                transaction.replace(R.id.main, new Dashbord_Fragment());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation3 = AnimationUtils.loadAnimation(MainActivity.this, R.anim.righttoleft);
                textView.startAnimation(animation3);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animatio1 = AnimationUtils.loadAnimation(MainActivity.this, R.anim.fadeout);
                textView.startAnimation(animatio1);
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.blink_anim);
                textView.startAnimation(animation);
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Animation no1
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.bounce);
                Toast.makeText(MainActivity.this, "Bouns Animation", Toast.LENGTH_SHORT).show();
                textView.startAnimation(animation);

            }
        });
    }
}