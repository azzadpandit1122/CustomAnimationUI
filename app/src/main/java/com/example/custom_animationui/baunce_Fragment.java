package com.example.custom_animationui;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.airbnb.lottie.LottieAnimationView;

public class baunce_Fragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_baunce_, container, false);
        LottieAnimationView animationView = view.findViewById(R.id.lottieAnimationView3);
        animationView.animate().translationX(1600).setStartDelay(500).setDuration(700);
        Button button = view.findViewById(R.id.speed);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        return view;
    }
}