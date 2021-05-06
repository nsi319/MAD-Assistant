package com.appdevlab.mad.ui.quiz;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.util.Log;
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

import java.util.Locale;

public class QuestionFragment extends Fragment {

    String title, question, answer, option1, option2, option3, option4;
    TextToSpeech textToSpeech;


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

        textToSpeech = new TextToSpeech(getActivity(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if(status==TextToSpeech.SUCCESS) {
                    int ttsLanguage = textToSpeech.setLanguage(Locale.US);
                    if(ttsLanguage == TextToSpeech.LANG_MISSING_DATA || ttsLanguage == TextToSpeech.LANG_NOT_SUPPORTED) {
                        Log.d("MY_LOG_TAG","Language not supported");
                    }
                    Log.d("MY_LOG_TAG","TTS init successful");
                }
                else
                    Log.d("MY_LOG_TAG","TTS init unsuccessful");
            }
        });

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (((RadioButton)group.findViewById(checkedId)).getText().toString().equals(answer)) {
                    result.setVisibility(View.VISIBLE);
                    result.setText("Correct Answer");
                    result.setTextColor(getResources().getColor(android.R.color.holo_green_dark));

                    textToSpeech.speak("Hurray!!! that's the correct answer",TextToSpeech.QUEUE_FLUSH,null);
                }
                else {
                    result.setVisibility(View.VISIBLE);
                    result.setText("Incorrect Answer");
                    result.setTextColor(getResources().getColor(android.R.color.holo_red_dark));
                    textToSpeech.speak("Oops!!! your answer is incorrect",TextToSpeech.QUEUE_FLUSH,null);
                }
            }
        });

        return view;
    }
}
