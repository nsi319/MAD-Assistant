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

public class CodeFragment extends Fragment {

    public CodeFragment() {

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_code,container,false);
        String code, location;
        Bundle bundle = this.getArguments();
        if(bundle != null) {
            code = bundle.getString("code");
            location = bundle.getString("location");
        }
        else {
            code = "NO CODE SNIPPET AVAILABLE";
            location = "";
        }
        Toast.makeText(view.getContext(),code.substring(0,10) + " : " + location,Toast.LENGTH_SHORT).show();
        ((TextView)view.findViewById(R.id.tv_code)).setText(code);

        location = "File Location: " + location;
        ((TextView) view.findViewById(R.id.tv_file_location)).setText(location);

        return  view;
    }
}
