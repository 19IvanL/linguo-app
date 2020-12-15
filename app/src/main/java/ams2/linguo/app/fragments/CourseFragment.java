package ams2.linguo.app.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import ams2.linguo.app.R;

import java.util.ArrayList;
import java.util.Arrays;

public class CourseFragment extends Fragment{

    Spinner spinnerCourses, spinnerStarted;
    Button btnAddCourse, btnCategories;

    ArrayList<String> coursesAvailable = new ArrayList<>(Arrays.asList("Ingles", "Frances", "Italiano", "Portugues", "Aleman", "Ruso", "Catalan", "Esperanto", "Guarani", "Sueco"));
    ArrayList<String> coursesStarted = new ArrayList<>();

    public CourseFragment() {}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_course, container, false);
        //Creating Spinner and setting the AdapterView
        spinnerCourses = (Spinner) v.findViewById(R.id.spinnerCourses);
        spinnerStarted = (Spinner) v.findViewById(R.id.spinnerStarted);
        btnAddCourse = (Button) v.findViewById(R.id.addCourse);
        btnAddCourse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addCourse();
            }
        });
        btnCategories = (Button) v.findViewById(R.id.btnCategories);
        btnCategories.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (spinnerStarted.getSelectedItem() != null && spinnerStarted.getSelectedItem().toString().equals("Ingles")){
                    showSelectedFragment(new CategoriesFragment());
                }
                else{
                    Toast.makeText(getActivity().getBaseContext(),"El curso seleccionado aun no tiene categorias", Toast.LENGTH_SHORT).show();
                }
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

    private void showSelectedFragment(Fragment fragment){
        getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment)
                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                .commit();
    }


}