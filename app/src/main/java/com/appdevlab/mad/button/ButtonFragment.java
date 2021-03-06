package com.appdevlab.mad.button;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import com.appdevlab.mad.R;

import java.util.ArrayList;


public class ButtonFragment extends Fragment {

    Button btnDefault, btnBorderless, btnBorderlessColored, btnColored, btnMaterial, btnBarAlertDialog;

    public ButtonFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final View view = inflater.inflate(R.layout.fragment_button, container, false);


        btnDefault = view.findViewById(R.id.btn_default);
        btnBorderless = view.findViewById(R.id.btn_borderless);
        btnBorderlessColored = view.findViewById(R.id.btn_borderless_colored);
        btnColored = view.findViewById(R.id.btn_colored);
        btnMaterial = view.findViewById(R.id.btn_material);
        btnBarAlertDialog = view.findViewById(R.id.btn_bar_alertdialog);



        ArrayList<Button> buttons = new ArrayList<Button>();
        buttons.add(btnDefault);
        buttons.add(btnBorderless);
        buttons.add(btnBorderlessColored);
        buttons.add(btnColored);
        buttons.add(btnMaterial);
        buttons.add(btnBarAlertDialog);

        for(Button b : buttons) {
            b.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(getActivity(),b.getText().toString() + " clicked",Toast.LENGTH_SHORT).show();
                }
            });
        }

        return view;
    }

}
