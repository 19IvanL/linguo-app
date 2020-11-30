package com.example.linguo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.linguo.fragments.OpenTranslationExerciseFragment;
import com.example.linguo.fragments.OpenTranslationExerciseFragment2;
import com.example.linguo.fragments.OpenTranslationExerciseFragment3;
import com.example.linguo.fragments.ShopFragment;

import java.util.ArrayList;

public class LessonActivity extends AppCompatActivity {

    private int exerciseNum = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson);
        getIntent().getExtras().getInt("lesson_id");
        showSelectedFragment(new OpenTranslationExerciseFragment());
        Button button = findViewById(R.id.nextButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Real counting xd
                exerciseNum++;
                if (exerciseNum == 1)
                    showSelectedFragment(new OpenTranslationExerciseFragment2());
                else if (exerciseNum == 2)
                    showSelectedFragment(new OpenTranslationExerciseFragment3());
                else if (exerciseNum == 3)
                    showSelectedFragment(new OpenTranslationExerciseFragment());
                if (exerciseNum == 3)
                    exerciseNum = 0;
            }
        });
    }

    // TODO Data access
    private ArrayList getExercises() {
        return null;
    }

    private void showSelectedFragment(Fragment fragment){
        getSupportFragmentManager().beginTransaction().replace(R.id.exerciseFragment, fragment)
                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                .commit();
    }

}