package com.appdevlab.mad.component.button;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.appdevlab.mad.R;

public class RadioButtonFragment extends Fragment {

    RadioGroup radioGroup;
    TextView tvRadioSelected;

    public RadioButtonFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_radio_button, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();

        radioGroup = getActivity().findViewById(R.id.radio_group);
        tvRadioSelected = getActivity().findViewById(R.id.radio_selected_text);

        radioGroup.setOnCheckedChangeListener((rg, i) -> {
            switch (i){
                case R.id.rb_1:
                    tvRadioSelected.setText("Selected : Option 1");
                    break;
                case R.id.rb_2:
                    tvRadioSelected.setText("Selected : Option 2");
                    break;
                case R.id.rb_3:
                    tvRadioSelected.setText("Selected : Option 3");
                    break;
            }
        });


    }
}
