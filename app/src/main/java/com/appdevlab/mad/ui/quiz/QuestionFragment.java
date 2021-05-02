package com.appdevlab.mad.ui.quiz;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.appdevlab.mad.R;

public class QuestionFragment extends Fragment {

    String title, question, option1, option2, option3, option4;

    public QuestionFragment(String title, String question, String option1, String option2, String option3, String option4) {
        this.title = title;
        this.question = question;
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

        return view;
    }
}
