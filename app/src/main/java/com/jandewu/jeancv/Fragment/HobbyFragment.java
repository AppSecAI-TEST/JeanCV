package com.jandewu.jeancv.Fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.jandewu.jeancv.Model.PhoneItem;
import com.jandewu.jeancv.R;
import com.jandewu.jeancv.View.CvRow;

import butterknife.BindView;
import butterknife.ButterKnife;


/**
 * A simple {@link Fragment} subclass.
 */
public class HobbyFragment extends Fragment {


    @BindView(R.id.HobbyFragmentContainer)
    LinearLayout container;


    public static HobbyFragment newInstance() {
        HobbyFragment fragment = new HobbyFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_hobby, container, false);
        ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        final PhoneItem phoneItem = new PhoneItem();
        CvRow phoneRow = new CvRow(getActivity(), phoneItem);
        container.addView(phoneRow);
    }
}