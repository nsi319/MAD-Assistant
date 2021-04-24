package com.appdevlab.mad.code;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.appdevlab.mad.R;

public class JavaCodeFragment extends Fragment {
    String code;

    public  JavaCodeFragment () {

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_java_code,container,false);

        if(this.getArguments() != null)
            code = this.getArguments().getString("code");
        else
            code = "NO CODE SNIPPET AVAILABLE";


        ((TextView)view.findViewById(R.id.tv_java_code)).setText(code);


        return  view;
    }
}
