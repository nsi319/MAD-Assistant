package com.appdevlab.mad.code;

import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;
import android.text.Html;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.appdevlab.mad.R;

import br.tiagohm.codeview.CodeView;
import br.tiagohm.codeview.Language;
import br.tiagohm.codeview.Theme;
import io.github.kbiakov.codeview.highlight.ColorTheme;


public class CodeFragment extends Fragment {

    public CodeFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_code,container,false);

        String code, location;
        code = "NO CODE SNIPPET AVAILABLE";
        location = "";
        Bundle bundle = this.getArguments();
        if(bundle != null) {
            code = bundle.getString("code");
            location = bundle.getString("location");
        }

        CodeView codeView = (CodeView) view.findViewById(R.id.tv_code);

        codeView.setTheme(Theme.DRACULA)
                .setCode(code)
                .setLanguage(Language.JAVA)
                .setWrapLine(true)
                .setFontSize(7)
                .setZoomEnabled(true)
                .setShowLineNumber(true)
                .setStartLineNumber(0)
                .apply();
        codeView.setShowLineNumber(true).setStartLineNumber(1).apply();
//        codeView.highlightCode("java");
//        codeView.setCodeContent(code);
//        codeView.setColorTheme(ColorTheme.MONOKAI);


        ((TextView) view.findViewById(R.id.tv_file_location)).setText("Location: " + location);

        TextView copyCode = (TextView) view.findViewById(R.id.tv_copy_code);

        final String copyCodeText = code;
        copyCode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClipboardManager clipboardManager = (ClipboardManager) view.getContext().getSystemService(Context.CLIPBOARD_SERVICE);
                clipboardManager.setText(copyCodeText);
                Toast.makeText(getActivity(), "Code copied to clipboard", Toast.LENGTH_SHORT).show();
            }
        });

        return  view;
    }
}
