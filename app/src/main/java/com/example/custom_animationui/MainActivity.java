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
        // fregment init

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                transaction.setCustomAnimations(R.anim.righttoleft, R.anim.lefttoright);
                transaction.replace(R.id.main, new Dashbord_Fragment());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                transaction.setCustomAnimations(R.anim.blink_anim, R.anim.lefttoright);
                transaction.replace(R.id.main, new Left_to_Right_Fragment());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                transaction.setCustomAnimations(R.anim.fadeout, R.anim.fadein);
                transaction.replace(R.id.main, new Fade_out_Fragment());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                transaction.setCustomAnimations(R.anim.sample_anim, R.anim.fadeout);
                transaction.replace(R.id.main, new FADEIN_Fragment());
                transaction.addToBackStack(null);
                transaction.commit();
//
//                fragment = new lunes_gestionar();
//
//                FragmentTransaction ft =  getSupportFragmentManager().beginTransaction();
//                ft.replace(R.id.fragment,fragment)
//                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN).commit();
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                transaction.setCustomAnimations(R.anim.bounce, R.anim.blink_anim);
                transaction.replace(R.id.main, new baunse_Fragment());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Animation no1
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                transaction.setCustomAnimations(R.anim.righttoleft, R.anim.righttoleft);
                transaction.replace(R.id.main, new Dashbord_Fragment());
                transaction.addToBackStack(null);
                transaction.commit();

            }
        });
    }
}