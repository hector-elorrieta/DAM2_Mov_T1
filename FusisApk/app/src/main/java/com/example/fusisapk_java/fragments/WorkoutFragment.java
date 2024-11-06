package com.example.fusisapk_java.fragments;

import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.fusisapk_java.AldagaiOrokorrak;
import com.example.fusisapk_java.R;


public class WorkoutFragment extends Fragment {

    private Button btnWorkout;
    private Button btnHistoriala;
    private TextView textWorkErabiltzaile, textWorkMaila;

    AldagaiOrokorrak aldagaiOrokorrak = new AldagaiOrokorrak();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_workout, container, false);
        Log.e("Erabiltzailea", aldagaiOrokorrak.erabiltzaileLogueatuta.getErabiltzailea());

        CardView linkprofila = view.findViewById(R.id.cardViewProfila);
        btnWorkout = view.findViewById(R.id.btnWorkout);
        btnHistoriala = view.findViewById(R.id.btnHistoriala);
        textWorkErabiltzaile = view.findViewById(R.id.textWorkErabiltzaile);
        textWorkMaila = view.findViewById(R.id.textWorkMaila);


        textWorkErabiltzaile.setText(aldagaiOrokorrak.erabiltzaileLogueatuta.getErabiltzailea());
        textWorkMaila.setText("Maila: " + aldagaiOrokorrak.erabiltzaileLogueatuta.getMaila());

        linkprofila.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PerfilFragment profilFragment = new PerfilFragment();
                FragmentTransaction transaction = getParentFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, profilFragment);
                transaction.addToBackStack(null);
                transaction.commit();

            }
        });






        return view;
    }
}
