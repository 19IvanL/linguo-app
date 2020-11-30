package com.example.linguo.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;

import com.example.linguo.LessonActivity;
import com.example.linguo.R;

public class CategoriesFragment extends Fragment {

    public CategoriesFragment() {}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_categories, container, false);
        Button startButton = view.findViewById(R.id.startExercice);
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), LessonActivity.class);
                intent.putExtra("lesson_id", 1);
                startActivity(intent);
            }
        });
        return view;
    }
}