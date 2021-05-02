package com.appdevlab.mad.button;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.appdevlab.mad.R;
public class ToggleSwitchButtonFragment extends Fragment {


    public ToggleSwitchButtonFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_toggle_switch_button, container, false);
    }

}
