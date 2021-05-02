package com.appdevlab.mad.ui.quiz;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.appdevlab.mad.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import static android.view.View.GONE;

public class QuizFragment extends Fragment {

    int qno = 1;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_quiz,container,false);


        addNewQuestion(qno);

        view.findViewById(R.id.next).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                qno++;
                addNewQuestion(qno);

                if(qno==7)
                    view.findViewById(R.id.next).setVisibility(GONE);
            }
        });

        return view;
    }

    private void addNewQuestion(int qno) {

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference databaseReference = database.getReference("quiz");


        databaseReference.child("question" + qno).get().addOnCompleteListener(new OnCompleteListener<DataSnapshot>() {
            @Override
            public void onComplete(@NonNull Task<DataSnapshot> task) {
                if (!task.isSuccessful()) {
                    Log.e("MY_LOG_TAG", "Error getting data", task.getException());
                    Toast.makeText(getActivity(),"Error fetching questions",Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(getActivity(),"Fetched questions successfully",Toast.LENGTH_SHORT).show();
                    String title = "QUESTION " + qno;
                    String value = String.valueOf(task.getResult().getValue());
                    String question = value.split("!!ans!!")[0];
                    String []options = value.split("!!ans!!")[1].split(";");

                    QuestionFragment questionFragment = new QuestionFragment(title,question,options[0],options[1],options[2],options[3]);

                    FragmentTransaction fragmentTransaction = getChildFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.frame,questionFragment);
                    fragmentTransaction.commit();

                }
            }
        });
    }
}
