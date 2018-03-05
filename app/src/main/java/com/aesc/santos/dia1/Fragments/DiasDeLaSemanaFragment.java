package com.aesc.santos.dia1.Fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.aesc.santos.dia1.Adaptadores.DayOfWeekAdapter;
import com.aesc.santos.dia1.R;

import java.util.ArrayList;


public class DiasDeLaSemanaFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;
    private ArrayList<String> mDatosDiadDeLaSemana;
    private RecyclerView mRecyclerView;

    public DiasDeLaSemanaFragment() {
        // Required empty public constructor
    }

    public static DiasDeLaSemanaFragment newInstance(String param1, String param2) {
        DiasDeLaSemanaFragment fragment = new DiasDeLaSemanaFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_dias_de_la_semana, container, false);

         mDatosDiadDeLaSemana = new ArrayList<>();

         init();

         mRecyclerView = view.findViewById(R.id.recyclerDayOfWeek);
         mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
         DayOfWeekAdapter adapter = new DayOfWeekAdapter(getContext(),mDatosDiadDeLaSemana);
         mRecyclerView.setAdapter(adapter);

        return view;
    }

    private void init (){
        mDatosDiadDeLaSemana.add("Lunes");
        mDatosDiadDeLaSemana.add("Martes");
        mDatosDiadDeLaSemana.add("Miercoles");
        mDatosDiadDeLaSemana.add("Jueves");
        mDatosDiadDeLaSemana.add("Viernes");
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
