package com.example.custom_animationui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.airbnb.lottie.LottieAnimationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LottieAnimationView lottieAnimationView = findViewById(R.id.lottieAnimationView);
        lottieAnimationView.animate().translationY(1400).setDuration(1000).setStartDelay(4000);
        LottieAnimationView backgraound = findViewById(R.id.backgraound);
        backgraound.animate().translationY(-1600).setDuration(1000).setStartDelay(4000);

        Handler handler = new Handler();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                transaction.setCustomAnimations(R.anim.lefttoright,R.anim.righttoleft);
                transaction.replace(R.id.mainlayout, new dashbord_Fragment());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        };

        handler.postDelayed(runnable, 5000); // load some time to



    }

}