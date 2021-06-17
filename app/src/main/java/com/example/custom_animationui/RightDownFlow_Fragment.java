package com.example.custom_animationui;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

import java.time.Instant;


public class RightDownFlow_Fragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_right_down_flow_, container, false);
        ImageView imageView = view.findViewById(R.id.imageView);
        imageView.animate().translationY(-10000).setStartDelay(4000).setStartDelay(5000);
        LottieAnimationView view1 = view.findViewById(R.id.lottieAnimationView2);
        view1.animate().translationY(3000).setStartDelay(1000).setStartDelay(5000);
        TextView textView = view.findViewById(R.id.textView);
        textView.animate().translationY(-16000).setStartDelay(2000);

        Button button = view.findViewById(R.id.backtohome);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), MainActivity.class);
                startActivity(intent);
            }
        });
        Button button1=view.findViewById(R.id.next);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.mainlayout,new baunce_Fragment()).commit();
            }
        });

        return view;
    }
}