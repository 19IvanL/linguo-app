package com.example.linguo.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.example.linguo.R;

public class Course_Fragment extends Fragment{

    Spinner spinnerCursos, spinnerComenzados;

    String[] cursos = {"Ingles", "Frances", "Italiano", "Portugues", "Aleman", "Ruso", "Catalan", "Espeanto", "Guarani", "Sueco"};

    public Course_Fragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_course_, container, false);
        //Creating Spinner and setting the AdapterView
       spinnerCursos = (Spinner) v.findViewById(R.id.spinnerCursos);
        ArrayAdapter<String> cursosAdapter = new ArrayAdapter<String>(this.getActivity(), android.R.layout.simple_spinner_item, cursos);
        cursosAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerCursos.setAdapter(cursosAdapter);
        spinnerComenzados = (Spinner) v.findViewById(R.id.spinnerComenzados);
        return v;
    }
}