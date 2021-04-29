package com.appdevlab.mad.ui.tutorial;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import com.appdevlab.mad.ButtonActivity;
import com.appdevlab.mad.MaterialActivity;
import com.appdevlab.mad.MenuActivity;
import com.appdevlab.mad.PickerActivity;
import com.appdevlab.mad.R;
import com.appdevlab.mad.SQLiteActivity;
import com.appdevlab.mad.SeekbarActivity;
import com.appdevlab.mad.SpinnerActivity;
import com.appdevlab.mad.TextActivity;

public class TutorialFragment extends Fragment {
    GridLayout gridLayout;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_tutorial,container,false);

        gridLayout = (GridLayout) view.findViewById(R.id.gridLayout);

        setGridItemClickEvent(gridLayout);

        return view;
    }

    private void setGridItemClickEvent(GridLayout gridLayout) {

        for (int i = 0; i < gridLayout.getChildCount(); i++) {

            CardView cardView = (CardView) gridLayout.getChildAt(i);

            final int index = i;

            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent;
                    switch (index) {
                        case 0:
                            Toast.makeText(getActivity(), "Welcome to TextView & EditText", Toast.LENGTH_SHORT).show();
                            intent = new Intent(getActivity(), TextActivity.class);
                            startActivity(intent);
                            break;
                        case 1:
                            Toast.makeText(getActivity(), "Welcome to Buttons", Toast.LENGTH_SHORT).show();
                            intent = new Intent(getActivity(), ButtonActivity.class);
                            startActivity(intent);
                            break;
                        case 2:
                            Toast.makeText(getActivity(), "Welcome to Seekbar & Progressbar", Toast.LENGTH_SHORT).show();
                            intent = new Intent(getActivity(), SeekbarActivity.class);
                            startActivity(intent);
                            break;
                        case 3:
                            Toast.makeText(getActivity(), "Welcome to Pickers", Toast.LENGTH_SHORT).show();
                            intent = new Intent(getActivity(), PickerActivity.class);
                            startActivity(intent);
                            break;
                        case 4:
                            Toast.makeText(getActivity(), "Welcome to Spinners & Dropdown", Toast.LENGTH_SHORT).show();
                            intent = new Intent(getActivity(), SpinnerActivity.class);
                            startActivity(intent);
                            break;
                        case 5:
                            Toast.makeText(getActivity(), "Welcome to Menu", Toast.LENGTH_SHORT).show();
                            intent = new Intent(getActivity(), MenuActivity.class);
                            startActivity(intent);
                            break;
                        case 6:
                            Toast.makeText(getActivity(), "Welcome to Material Design", Toast.LENGTH_SHORT).show();
                            intent = new Intent(getActivity(), MaterialActivity.class);
                            startActivity(intent);
                            break;
                        case 7:
                            Toast.makeText(getActivity(), "Welcome to SQLite Database", Toast.LENGTH_SHORT).show();
                            intent = new Intent(getActivity(), SQLiteActivity.class);
                            startActivity(intent);
                            break;

                    }
                }
            });

        }
    }
}
