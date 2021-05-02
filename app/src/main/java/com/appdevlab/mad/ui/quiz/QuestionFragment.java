package com.appdevlab.mad.ui.quiz;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.appdevlab.mad.R;

public class QuestionFragment extends Fragment {

    String title, question, answer, option1, option2, option3, option4;

    public QuestionFragment(String title, String question, String answer, String option1, String option2, String option3, String option4) {
        this.title = title;
        this.question = question;
        this.answer = answer;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.option4 = option4;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_question,container,false);

        ((TextView)view.findViewById(R.id.title)).setText(title);
        ((TextView)view.findViewById(R.id.question)).setText(question);
        ((RadioButton)view.findViewById(R.id.option1)).setText(option1);
        ((RadioButton)view.findViewById(R.id.option2)).setText(option2);
        ((RadioButton)view.findViewById(R.id.option3)).setText(option3);
        ((RadioButton)view.findViewById(R.id.option4)).setText(option4);

        RadioGroup radioGroup = view.findViewById(R.id.radio_group);

        TextView result = view.findViewById(R.id.result);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (((RadioButton)group.findViewById(checkedId)).getText().toString().equals(answer)) {
                    result.setVisibility(View.VISIBLE);
                    result.setText("Correct Answer");
                    result.setTextColor(getResources().getColor(android.R.color.holo_green_dark));
                }
                else {
                    result.setVisibility(View.VISIBLE);
                    result.setText("Incorrect Answer");
                    result.setTextColor(getResources().getColor(android.R.color.holo_red_dark));
                }
            }
        });

        return view;
    }
}
