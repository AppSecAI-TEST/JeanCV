package com.jandewu.jeancv.Fragment;


import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.jandewu.jeancv.R;

import butterknife.BindView;
import butterknife.ButterKnife;


/**
 * A simple {@link Fragment} subclass.
 */
public class NotesFragment extends Fragment {
    public static final String TAG = NotesFragment.class.getSimpleName();
    public static final String NOTATKA = "notatka";
    private SharedPreferences sharedPreferences;

    @BindView(R.id.notesEditText)
    EditText editText;

    public static NotesFragment newInstance() {

        NotesFragment fragment = new NotesFragment();
        return fragment;
    }


    public NotesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_notes, container, false);
        ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onResume(){
        super.onResume();
        editText.setText(sharedPreferences.getString(NOTATKA,""));
    }


    @Override
    public void onPause(){
        super.onPause();
        String costam = editText.getText().toString();
        saveToSharedPreferences(costam);
    }

    private void saveToSharedPreferences(String costam) {
        SharedPreferences sharedPreferences = getActivity().getSharedPreferences("notatki", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(NOTATKA, costam);
        editor.apply();
    }

    @Override
    public void onStop(){
        super.onStop();
        Log.d(TAG,"on Pause");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        sharedPreferences =getActivity().getSharedPreferences("notatki", Context.MODE_PRIVATE );

    }
}
