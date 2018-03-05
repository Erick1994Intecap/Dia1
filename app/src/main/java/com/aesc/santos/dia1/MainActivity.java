package com.aesc.santos.dia1;

import android.app.FragmentManager;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.aesc.santos.dia1.Fragments.DiasDeLaSemanaFragment;

public class MainActivity extends AppCompatActivity implements DiasDeLaSemanaFragment.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DiasDeLaSemanaFragment principal = new DiasDeLaSemanaFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.main_container, principal).addToBackStack(null).commit();
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
