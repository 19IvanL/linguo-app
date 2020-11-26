package com.example.linguo.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.linguo.MainActivity;
import com.example.linguo.R;

import java.util.ArrayList;
import java.util.Arrays;

public class Course_Fragment extends Fragment{

    Spinner spinnerCourses, spinnerStarted;
    Button btnAddCourse;

    ArrayList<String> coursesAvailable = new ArrayList<>(Arrays.asList("Ingles", "Frances", "Italiano", "Portugues", "Aleman", "Ruso", "Catalan", "Espeanto", "Guarani", "Sueco"));
    ArrayList<String> coursesStarted = new ArrayList<>();

    public Course_Fragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_course_, container, false);
        //Creating Spinner and setting the AdapterView
        spinnerCourses = (Spinner) v.findViewById(R.id.spinnerCourses);
        spinnerStarted = (Spinner) v.findViewById(R.id.spinnerStarted);
        btnAddCourse = (Button) v.findViewById(R.id.addCourse);
        btnAddCourse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addCourse();
                //Toast.makeText(getActivity().getBaseContext(),"Hola", Toast.LENGTH_SHORT).show();
            }
        });
        setSpinnerCourses();
        setSpinnerStarted();

        return v;
    }

    private void setSpinnerCourses(){
        ArrayAdapter<String> cursosAdapter = new ArrayAdapter<String>(this.getActivity(), android.R.layout.simple_spinner_item, coursesAvailable);
        cursosAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerCourses.setAdapter(cursosAdapter);
    }

    private void setSpinnerStarted(){
        ArrayAdapter<String> startedAdapter = new ArrayAdapter<String>(this.getActivity(), android.R.layout.simple_spinner_item, coursesStarted);
        startedAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerStarted.setAdapter(startedAdapter);
    }

    private void addCourse(){
        if (!coursesAvailable.isEmpty()){
            String search = spinnerCourses.getSelectedItem().toString();
            for (int i = 0; i<coursesAvailable.size(); i++){
                if (search.equals(coursesAvailable.get(i))){
                    coursesAvailable.remove(i);
                    coursesStarted.add(search);
                }
            }
            setSpinnerCourses();
            setSpinnerStarted();
        }
        else{
            Toast.makeText(getActivity().getBaseContext(), "No has seleccionado ningún curso para añadir", Toast.LENGTH_LONG).show();
        }

    }


}