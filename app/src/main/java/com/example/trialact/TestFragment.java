package com.example.trialact;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link TestFragment#newInstance} factory method to
 * create an instance of this fragment.
 *
 */
public class TestFragment extends Fragment {

    String str="Frag1";
    public TestFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(str,"Created");
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        Log.i(str,"Attached");
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.i(str,"View Created");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.i(str,"Started");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i(str,"Resume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i(str,"Pause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.i(str,"Stopped");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.i(str,"View Destroy");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i(str,"Destroyed");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.i(str,"Detached");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Log.i(str,"Create View");
        return inflater.inflate(R.layout.fragment_test, container, false);
    }
}