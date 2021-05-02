package com.appdevlab.mad.ui.quiz;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.appdevlab.mad.R;
import com.appdevlab.mad.model.InternetConnectivity;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.snackbar.Snackbar;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static android.view.View.GONE;
import static android.view.View.VISIBLE;

public class QuizFragment extends Fragment {

    int qno = 1;
    int total ;
    ArrayList<String> questions;

    Button back,next;
    InternetConnectivity internetConnectivity;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_quiz,container,false);

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference databaseReference = database.getReference("quiz");

        LoadQuestionFragment loadQuestionFragment = new LoadQuestionFragment();
        FragmentTransaction fragmentTransaction = getChildFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.frame,loadQuestionFragment);
        fragmentTransaction.commit();

        databaseReference.child("total").get().addOnCompleteListener(new OnCompleteListener<DataSnapshot>() {
            @Override
            public void onComplete(@NonNull Task<DataSnapshot> task) {
                if (!task.isSuccessful()) {
                    total = 0;
                }
                else {
                    total = Integer.parseInt(task.getResult().getValue().toString());
                    questions = new ArrayList<>();
                    for(int i=1;i<=total;i++)
                        questions.add(String.valueOf(i));
                    Collections.shuffle(questions);

                    View root  = view.findViewById(R.id.coordinator);

                    internetConnectivity = new InternetConnectivity();

                    next = view.findViewById(R.id.next);
                    back = view.findViewById(R.id.back);


                    if(internetConnectivity.isInternetAvailable())
                        addNewQuestion(qno);
                    else
                        Snackbar.make(root,"No Internet Connection", Snackbar.LENGTH_LONG).show();

                    next.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            qno++;
                            if(internetConnectivity.isInternetAvailable())
                                addNewQuestion(qno);
                            else
                                Snackbar.make(root,"No Internet Connection", Snackbar.LENGTH_LONG).show();
                        }
                    });

                    back.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            qno--;

                            if(internetConnectivity.isInternetAvailable())
                                addNewQuestion(qno);
                            else
                                Snackbar.make(root,"No Internet Connection", Snackbar.LENGTH_LONG).show();
                        }
                    });
                }
            }
        });


        return view;
    }

    private void addNewQuestion(int qno) {

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference databaseReference = database.getReference("quiz");

        LoadQuestionFragment loadQuestionFragment = new LoadQuestionFragment();
        FragmentTransaction fragmentTransaction = getChildFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.frame,loadQuestionFragment);
        fragmentTransaction.commit();

        String q = questions.get(qno-1);

        databaseReference.child("question" + q).get().addOnCompleteListener(new OnCompleteListener<DataSnapshot>() {
            @Override
            public void onComplete(@NonNull Task<DataSnapshot> task) {
                if (!task.isSuccessful()) {
                    Log.e("MY_LOG_TAG", "Error getting data", task.getException());
                    Toast.makeText(getActivity(),"Error fetching questions",Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(getActivity(),"Fetched question " + qno + " successfully",Toast.LENGTH_SHORT).show();
                    String title = "QUESTION " + qno;
                    String value = String.valueOf(task.getResult().getValue());
                    value = value.trim();
                    String question = value.split("!!ans!!")[0];
                    String []options = value.split("!!ans!!")[1].split(";");

                    String answer = options[0];

                    List<String> optionsList = Arrays.asList(options);
                    Collections.shuffle(optionsList);


                    QuestionFragment questionFragment = new QuestionFragment(title,question,answer,optionsList.get(0),optionsList.get(1),optionsList.get(2),optionsList.get(3));
                    FragmentTransaction fragmentTransaction = getChildFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.frame,questionFragment);
                    fragmentTransaction.commit();

                    if(qno>1)
                        back.setVisibility(VISIBLE);
                    else
                        back.setVisibility(GONE);

                    if(qno==total)
                        next.setVisibility(GONE);
                    else
                        next.setVisibility(VISIBLE);
                }
            }
        });
    }
}
