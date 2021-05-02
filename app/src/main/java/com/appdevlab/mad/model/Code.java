package com.appdevlab.mad.model;

public class Code {

    private String textXml ="        <?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
            "        <androidx.coordinatorlayout.widget.CoordinatorLayout\n" +
            "            xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
            "            xmlns:tools=\"http://schemas.android.com/tools\"\n" +
            "            android:layout_width=\"match_parent\"\n" +
            "            android:layout_height=\"match_parent\"\n" +
            "            android:fitsSystemWindows=\"true\"\n" +
            "            tools:context=\".MainActivity\">\n" +
            "\n" +
            "        <ScrollView\n" +
            "            android:layout_width=\"match_parent\"\n" +
            "            android:layout_height=\"match_parent\" >\n" +
            "\n" +
            "            <LinearLayout\n" +
            "                android:layout_width=\"match_parent\"\n" +
            "                android:layout_height=\"wrap_content\"\n" +
            "                android:orientation=\"vertical\"\n" +
            "                android:padding=\"16dp\">\n" +
            "\n" +
            "\n" +
            "            <TextView\n" +
            "                android:id=\"@+id/textView\"\n" +
            "                android:layout_width=\"match_parent\"\n" +
            "                android:layout_height=\"wrap_content\"\n" +
            "                android:ems=\"10\"\n" +
            "                android:text=\"THIS IS A TEXTVIEW\"\n" +
            "                android:textSize=\"15sp\"\n" +
            "                android:textColor=\"@android:color/black\" />\n" +
            "\n" +
            "        <EditText\n" +
            "            android:layout_width=\"match_parent\"\n" +
            "            android:layout_height=\"wrap_content\"\n" +
            "            android:ems=\"10\"\n" +
            "            android:inputType=\"textPersonName\"\n" +
            "            android:hint=\"Full Name\"\n" +
            "            android:drawableStart=\"@drawable/ic_person_grey_24dp\"\n" +
            "            android:drawablePadding=\"8dp\"\n" +
            "            />\n" +
            "\n" +
            "        <EditText\n" +
            "            android:layout_width=\"match_parent\"\n" +
            "            android:layout_height=\"wrap_content\"\n" +
            "            android:ems=\"10\"\n" +
            "            android:inputType=\"textMultiLine\"\n" +
            "            android:text=\"Hey!!\\nI am Naren Sairam from Chennai.\\nCSE, NIT Trichy '22\"\n" +
            "            android:drawableStart=\"@drawable/ic_short_text_grey_24dp\"\n" +
            "            android:drawablePadding=\"8dp\"/>\n" +
            "\n" +
            "        <EditText\n" +
            "            android:layout_width=\"match_parent\"\n" +
            "            android:layout_height=\"wrap_content\"\n" +
            "            android:ems=\"10\"\n" +
            "            android:inputType=\"textPassword\"\n" +
            "            android:hint=\"Webmail Password\"\n" +
            "            android:drawableStart=\"@drawable/ic_lock_grey_24dp\"\n" +
            "            android:drawableTintMode=\"multiply\"\n" +
            "            android:drawablePadding=\"8dp\"/>\n" +
            "\n" +
            "        <EditText\n" +
            "            android:layout_width=\"match_parent\"\n" +
            "            android:layout_height=\"wrap_content\"\n" +
            "            android:ems=\"10\"\n" +
            "            android:inputType=\"number\"\n" +
            "            android:text=\"1800\"\n" +
            "            android:drawableStart=\"@drawable/ic_looks_one_grey_24dp\"\n" +
            "            android:drawablePadding=\"8dp\"/>\n" +
            "\n" +
            "\n" +
            "        <EditText\n" +
            "            android:layout_width=\"match_parent\"\n" +
            "            android:layout_height=\"wrap_content\"\n" +
            "            android:ems=\"10\"\n" +
            "            android:inputType=\"numberSigned\"\n" +
            "            android:text=\"-18000\"\n" +
            "            android:drawableStart=\"@drawable/ic_plus_one_grey_24dp\"\n" +
            "            android:drawablePadding=\"8dp\"/>\n" +
            "\n" +
            "        <EditText\n" +
            "            android:layout_width=\"match_parent\"\n" +
            "            android:layout_height=\"wrap_content\"\n" +
            "            android:ems=\"10\"\n" +
            "            android:inputType=\"numberDecimal\"\n" +
            "            android:text=\"1800.23\"/>\n" +
            "\n" +
            "\n" +
            "\n" +
            "        <EditText\n" +
            "            android:layout_width=\"match_parent\"\n" +
            "            android:layout_height=\"wrap_content\"\n" +
            "            android:ems=\"10\"\n" +
            "            android:inputType=\"textEmailAddress\"\n" +
            "            android:text=\"106118062@nitt.edu\"\n" +
            "            android:hint=\"Email address\"\n" +
            "            android:drawableStart=\"@drawable/ic_email_grey_24dp\"\n" +
            "            android:drawablePadding=\"8dp\"/>\n" +
            "\n" +
            "\n" +
            "        <EditText\n" +
            "            android:layout_width=\"match_parent\"\n" +
            "            android:layout_height=\"wrap_content\"\n" +
            "            android:ems=\"10\"\n" +
            "            android:inputType=\"phone\"\n" +
            "            android:hint=\"Phone Number\"\n" +
            "            android:drawableStart=\"@drawable/ic_phone_grey_24dp\"\n" +
            "            android:drawablePadding=\"8dp\"/>\n" +
            "\n" +
            "\n" +
            "\n" +
            "        <EditText\n" +
            "            android:layout_width=\"match_parent\"\n" +
            "            android:layout_height=\"wrap_content\"\n" +
            "            android:ems=\"10\"\n" +
            "            android:inputType=\"date\"\n" +
            "            android:drawableStart=\"@drawable/ic_date_range_grey_24dp\"\n" +
            "            android:drawablePadding=\"8dp\"/>\n" +
            "\n" +
            "\n" +
            "\n" +
            "    </LinearLayout>\n" +
            "</ScrollView>\n" +
            "\n" +
            "    </androidx.coordinatorlayout.widget.CoordinatorLayout>";

    private String textJava = "package com.appdevlab.mad;\n" +
            "\n" +
            "import android.os.Bundle;\n" +
            "import androidx.appcompat.app.AppCompatActivity;\n" +
            "\n" +
            "public class MainActivity extends AppCompatActivity {\n" +
            "\n" +
            "   @Override\n" +
            "   protected void onCreate(Bundle savedInstanceState) {\n" +
            "       super.onCreate(savedInstanceState);\n" +
            "       setContentView(R.layout.activity_main);\n" +
            "}\n" +
            "}\n";

    private String textJavaLocation = "java/MainActivity.java";
    private String textXmlLocation = "res/layout/activity_main.xml";




    private String buttonXml ="<LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
            "   xmlns:tools=\"http://schemas.android.com/tools\"\n" +
            "   android:layout_width=\"match_parent\"\n" +
            "   android:layout_height=\"match_parent\"\n" +
            "   android:orientation=\"vertical\"\n" +
            "   tools:context=\".MainActivity\">\n" +
            "\n" +
            "<!--Button Types -->\n" +
            "\n" +
            "   <Button\n" +
            "       android:id=\"@+id/btn_default\"\n" +
            "       android:layout_width=\"match_parent\"\n" +
            "       android:layout_height=\"wrap_content\"\n" +
            "       android:layout_marginBottom=\"8dp\"\n" +
            "       android:text=\"Default Button\" />\n" +
            "\n" +
            "   <Button\n" +
            "       android:id=\"@+id/btn_borderless\"\n" +
            "       style=\"@style/Widget.AppCompat.Button.Borderless\"\n" +
            "       android:layout_width=\"match_parent\"\n" +
            "       android:layout_height=\"wrap_content\"\n" +
            "       android:layout_marginBottom=\"8dp\"\n" +
            "       android:text=\"Borderless Button\" />\n" +
            "\n" +
            "   <Button\n" +
            "       android:id=\"@+id/btn_borderless_colored\"\n" +
            "       style=\"@style/Widget.AppCompat.Button.Borderless.Colored\"\n" +
            "       android:layout_width=\"match_parent\"\n" +
            "       android:layout_height=\"wrap_content\"\n" +
            "       android:layout_marginBottom=\"8dp\"\n" +
            "       android:text=\"Borderless Colored Button\" />\n" +
            "\n" +
            "   <Button\n" +
            "       android:id=\"@+id/btn_bar_alertdialog\"\n" +
            "       style=\"@style/Widget.AppCompat.Button.ButtonBar.AlertDialog\"\n" +
            "       android:layout_width=\"match_parent\"\n" +
            "       android:layout_height=\"wrap_content\"\n" +
            "       android:layout_marginBottom=\"8dp\"\n" +
            "       android:text=\"ButtonBar AlertDialog\" />\n" +
            "\n" +
            "   <Button\n" +
            "       android:id=\"@+id/btn_colored\"\n" +
            "       style=\"@style/Widget.AppCompat.Button.Colored\"\n" +
            "       android:layout_width=\"match_parent\"\n" +
            "       android:layout_height=\"wrap_content\"\n" +
            "       android:layout_marginBottom=\"8dp\"\n" +
            "       android:text=\"Colored Button\" />\n" +
            "\n" +
            "\n" +
            "   <com.google.android.material.button.MaterialButton\n" +
            "       android:layout_width=\"match_parent\"\n" +
            "       android:layout_height=\"wrap_content\"\n" +
            "       android:id=\"@+id/btn_material\"\n" +
            "       style=\"@style/Widget.AppCompat.Button.Small\"\n" +
            "       android:theme=\"@style/Theme.MaterialComponents.DayNight\"\n" +
            "       android:layout_marginBottom=\"8dp\"\n" +
            "       android:text=\"Material Button\" />\n" +
            "\n" +
            "\n" +
            "<!--Image Button -->\n" +
            "\n" +
            "<LinearLayout\n" +
            "   android:layout_width=\"match_parent\"\n" +
            "   android:layout_height=\"wrap_content\"\n" +
            "   android:layout_marginBottom=\"8dp\"\n" +
            "   android:orientation=\"horizontal\">\n" +
            "\n" +
            "   <ImageButton\n" +
            "       android:id=\"@+id/imageButton1\"\n" +
            "       style=\"@android:style/Widget.DeviceDefault.Light.ImageButton\"\n" +
            "       android:layout_width=\"wrap_content\"\n" +
            "       android:layout_height=\"wrap_content\"\n" +
            "       android:layout_weight=\"1\"\n" +
            "       android:backgroundTint=\"@color/colorPrimaryDark\"\n" +
            "       android:src=\"@drawable/ic_android_black_24dp\"\n" +
            "       android:tint=\"@android:color/white\" />\n" +
            "   <ImageButton\n" +
            "       android:id=\"@+id/imageButton2\"\n" +
            "       android:layout_width=\"wrap_content\"\n" +
            "       android:layout_height=\"wrap_content\"\n" +
            "       android:layout_weight=\"1\"\n" +
            "       android:scaleType=\"fitCenter\"\n" +
            "       android:tint=\"@color/colorPrimaryDark\"\n" +
            "       app:srcCompat=\"@drawable/ic_person_add_black_24dp\" />\n" +
            "\n" +
            "   <ImageButton\n" +
            "       android:id=\"@+id/imageButton3\"\n" +
            "       android:layout_width=\"wrap_content\"\n" +
            "       android:layout_height=\"wrap_content\"\n" +
            "       android:layout_weight=\"1\"\n" +
            "       android:backgroundTint=\"@color/colorAccent\"\n" +
            "       android:scaleType=\"fitCenter\"\n" +
            "       android:tint=\"@android:color/white\"\n" +
            "       app:srcCompat=\"@drawable/ic_find_in_page_black_24dp\" />\n" +
            "\n" +
            "\n" +
            "</LinearLayout>\n" +
            "\n" +
            "\n" +
            "<!--Toggle Button -->\n" +
            "\n" +
            "<ToggleButton\n" +
            "   android:id=\"@+id/toggleButton\"\n" +
            "   android:layout_width=\"match_parent\"\n" +
            "   android:layout_height=\"wrap_content\"\n" +
            "   android:layout_marginBottom=\"8dp\"\n" +
            "   android:backgroundTint=\"@android:color/holo_blue_light\"\n" +
            "   android:textOn=\"BUTTON IS ON\"\n" +
            "   android:textOff=\"BUTTON IS OFF\"\n" +
            "   />\n" +
            "\n" +
            "<!--Switch -->\n" +
            "\n" +
            "<Switch\n" +
            "   android:id=\"@+id/switch1\"\n" +
            "   android:layout_width=\"match_parent\"\n" +
            "   android:layout_height=\"wrap_content\"\n" +
            "   android:layout_marginBottom=\"8dp\"\n" +
            "   android:text=\"Switch\" />\n" +
            "\n" +
            "<Switch\n" +
            "   android:id=\"@+id/switch2\"\n" +
            "   android:layout_width=\"match_parent\"\n" +
            "   android:layout_height=\"wrap_content\"\n" +
            "   android:layout_marginBottom=\"8dp\"\n" +
            "   android:showText=\"true\"\n" +
            "   android:splitTrack=\"false\"\n" +
            "   android:text=\"Switch (Y/N)\"\n" +
            "   android:textOff=\"N\"\n" +
            "   android:textOn=\"Y\"\n" +
            "   tools:checked=\"false\" />\n" +
            "\n" +
            "<!-- CheckBox -->\n" +
            "\n" +
            "<CheckBox\n" +
            "   android:id=\"@+id/checkBox\"\n" +
            "   android:layout_width=\"match_parent\"\n" +
            "   android:layout_height=\"wrap_content\"\n" +
            "   android:text=\"Age >= 18\" />\n" +
            "\n" +
            "<!--    Radio Button-->\n" +
            "\n" +
            "<TextView\n" +
            "   android:id=\"@+id/radio_selected_text\"\n" +
            "   android:layout_width=\"match_parent\"\n" +
            "   android:layout_height=\"wrap_content\"\n" +
            "   android:text=\"Selected : None\"\n" +
            "   android:textAlignment=\"center\"\n" +
            "   android:textColor=\"@android:color/black\"\n" +
            "   android:textStyle=\"bold\" />\n" +
            "\n" +
            "<RadioGroup\n" +
            "   android:id=\"@+id/radio_group\"\n" +
            "   android:layout_width=\"match_parent\"\n" +
            "   android:layout_height=\"wrap_content\">\n" +
            "\n" +
            "   <RadioButton\n" +
            "       android:id=\"@+id/rb_1\"\n" +
            "       android:layout_width=\"match_parent\"\n" +
            "       android:layout_height=\"wrap_content\"\n" +
            "       android:layout_weight=\"1\"\n" +
            "       android:text=\"Android Native (Java)\" />\n" +
            "\n" +
            "   <RadioButton\n" +
            "       android:id=\"@+id/rb_2\"\n" +
            "       android:layout_width=\"match_parent\"\n" +
            "       android:layout_height=\"wrap_content\"\n" +
            "       android:layout_weight=\"1\"\n" +
            "       android:text=\"Flutter (Dart)\" />\n" +
            "\n" +
            "   <RadioButton\n" +
            "       android:id=\"@+id/rb_3\"\n" +
            "       android:layout_width=\"match_parent\"\n" +
            "       android:layout_height=\"wrap_content\"\n" +
            "       android:layout_weight=\"1\"\n" +
            "       android:text=\"React Native (JS)\" />\n" +
            "</RadioGroup>\n" +
            "\n" +
            "</LinearLayout>\n";

    private String buttonJava = "package com.appdevlab.mad;\n" +
            "\n" +
            "import android.os.Bundle;\n" +
            "import androidx.appcompat.app.AppCompatActivity;\n" +
            "\n" +
            "public class MainActivity extends AppCompatActivity {\n" +
            "\n" +
            "   @Override\n" +
            "   protected void onCreate(Bundle savedInstanceState) {\n" +
            "       super.onCreate(savedInstanceState);\n" +
            "       setContentView(R.layout.activity_main);\n" +
            "}\n" +
            "}\n";;

    private String buttonJavaLocation = "java/MainActivity.java";
    private String buttonXmlLocation = "res/layout/activity_main.xml";



    private String seekXml = "<LinearLayout\n" +
            "\txmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
            "\txmlns:tools=\"http://schemas.android.com/tools\"\n" +
            "    android:layout_width=\"match_parent\"\n" +
            "    android:layout_height=\"match_parent\"\n" +
            "    android:fitsSystemWindows=\"true\"\n" +
            "    android:orientation=\"vertical\"\n" +
            "    android:padding=\"16dp\"\n" +
            "    tools:context=\".MainActivity\"\n" +
            "    >\n" +
            "\t<!--Seekbar-->\n" +
            "\t<SeekBar\n" +
            "        android:id=\"@+id/seekBar1\"\n" +
            "        android:layout_width=\"match_parent\"\n" +
            "        android:layout_height=\"wrap_content\"\n" +
            "        android:layout_marginTop=\"8dp\"\n" +
            "        android:layout_marginBottom=\"10dp\"\n" +
            "        android:progress=\"45\"\n" +
            "        />\n" +
            "\t<!--Seekbar (Discrete)-->\n" +
            "\t<SeekBar\n" +
            "        android:id=\"@+id/seekBar2\"\n" +
            "        style=\"@style/Widget.AppCompat.SeekBar.Discrete\"\n" +
            "        android:layout_width=\"match_parent\"\n" +
            "        android:layout_height=\"wrap_content\"\n" +
            "        android:layout_marginTop=\"8dp\"\n" +
            "        android:layout_marginBottom=\"10dp\"\n" +
            "        android:max=\"10\"\n" +
            "        android:progress=\"6\" />\n" +
            "\t<!--Progress Bar (Horizontal)-->\n" +
            "\t<ProgressBar\n" +
            "        android:id=\"@+id/progressBar1\"\n" +
            "        style=\"@android:style/Widget.DeviceDefault.ProgressBar.Horizontal\"\n" +
            "        android:indeterminateOnly=\"true\"\n" +
            "        android:layout_width=\"match_parent\"\n" +
            "        android:layout_height=\"wrap_content\"\n" +
            "        android:layout_marginTop=\"8dp\"\n" +
            "        android:layout_marginBottom=\"10dp\"\n" +
            "        />\n" +
            "\t<!--Progress Bar (Circular)-->\n" +
            "\t<ProgressBar\n" +
            "        android:id=\"@+id/progressBar2\"\n" +
            "        style=\"@style/Widget.AppCompat.ProgressBar\"\n" +
            "        android:layout_width=\"match_parent\"\n" +
            "        android:layout_height=\"wrap_content\"\n" +
            "        android:layout_marginTop=\"8dp\"\n" +
            "        android:layout_marginBottom=\"10dp\"\n" +
            "        />\n" +
            "</LinearLayout> \n";

    private String seekJava = "package com.appdevlab.mad;\n" +
            "\n" +
            "import android.os.Bundle;\n" +
            "import android.widget.ProgressBar;\n" +
            "import android.widget.SeekBar;\n" +
            "import android.widget.Toast;\n" +
            "\n" +
            "import androidx.appcompat.app.AppCompatActivity;\n" +
            "\n" +
            "public class MainActivity extends AppCompatActivity {\n" +
            "\n" +
            "    SeekBar seekBar1, seekBar2;\n" +
            "    ProgressBar progressBar1, progressBar2;\n" +
            "\n" +
            "    @Override\n" +
            "    protected void onCreate(Bundle savedInstanceState) {\n" +
            "        super.onCreate(savedInstanceState);\n" +
            "        setContentView(R.layout.activity_main);\n" +
            "\n" +
            "        seekBar1 = findViewById(R.id.seekBar1);\n" +
            "        seekBar2 = findViewById(R.id.seekBar2);\n" +
            "        progressBar1 = findViewById(R.id.progressBar1);\n" +
            "        progressBar2 = findViewById(R.id.progressBar2);\n" +
            "\n" +
            "        seekBar1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {\n" +
            "            @Override\n" +
            "            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {\n" +
            "                Toast.makeText(getApplicationContext(), String.format(\"Seekbar progress %s%s\", progress,\"%\"),Toast.LENGTH_SHORT).show();\n" +
            "            }\n" +
            "\n" +
            "            @Override\n" +
            "            public void onStartTrackingTouch(SeekBar seekBar) {\n" +
            "\n" +
            "            }\n" +
            "\n" +
            "            @Override\n" +
            "            public void onStopTrackingTouch(SeekBar seekBar) {\n" +
            "\n" +
            "            }\n" +
            "        });\n" +
            "\n" +
            "        seekBar2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {\n" +
            "            @Override\n" +
            "            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {\n" +
            "                Toast.makeText(getApplicationContext(),\"Seekbar (Discrete) progress: \" + String.valueOf(progress),Toast.LENGTH_SHORT).show();\n" +
            "            }\n" +
            "\n" +
            "            @Override\n" +
            "            public void onStartTrackingTouch(SeekBar seekBar) {\n" +
            "\n" +
            "            }\n" +
            "\n" +
            "            @Override\n" +
            "            public void onStopTrackingTouch(SeekBar seekBar) {\n" +
            "\n" +
            "            }\n" +
            "        });\n" +
            "\n" +
            "    }\n" +
            "}\n";

    private String seekJavaLocation = "java/MainActivity.java";
    private String seekXmlLocation = "res/layout/activity_main.xml";




    private String pickerXml = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
            "<LinearLayout\n" +
            "\txmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
            "\txmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
            "\txmlns:tools=\"http://schemas.android.com/tools\"\n" +
            "    android:layout_width=\"match_parent\"\n" +
            "    android:layout_height=\"match_parent\"\n" +
            "    android:orientation=\"vertical\"\n" +
            "    android:layout_margin=\"16dp\"\n" +
            "    tools:context=\".MainActivity\">\n" +
            "\n" +
            "  <!--Date Picker -->\n" +
            "\n" +
            "\t<androidx.cardview.widget.CardView\n" +
            "        android:layout_width=\"wrap_content\"\n" +
            "        android:layout_height=\"wrap_content\"\n" +
            "        android:layout_gravity=\"center\"\n" +
            "        android:foregroundGravity=\"center\"\n" +
            "        app:cardBackgroundColor=\"@android:color/holo_blue_light\"\n" +
            "        app:cardCornerRadius=\"10dp\">\n" +
            "\t\t<Button\n" +
            "            android:id=\"@+id/btn_date_picker\"\n" +
            "            android:layout_width=\"wrap_content\"\n" +
            "            android:layout_height=\"wrap_content\"\n" +
            "            android:layout_gravity=\"center\"\n" +
            "            android:paddingLeft=\"8dp\"\n" +
            "            android:paddingRight=\"8dp\"\n" +
            "            android:textAllCaps=\"false\"\n" +
            "            android:drawablePadding=\"5dp\"\n" +
            "            android:textSize=\"16sp\"\n" +
            "            android:background=\"@android:color/holo_blue_light\"\n" +
            "            android:textColor=\"@android:color/black\"\n" +
            "            android:text=\"No date chosen\" />\n" +
            "\t</androidx.cardview.widget.CardView>\n" +
            "\n" +
            "\n" +
            "  <!--Time Picker -->\n" +
            "  \n" +
            "\t<androidx.cardview.widget.CardView\n" +
            "        android:layout_width=\"wrap_content\"\n" +
            "        android:layout_height=\"wrap_content\"\n" +
            "        android:layout_gravity=\"center\"\n" +
            "        android:foregroundGravity=\"center\"\n" +
            "        app:cardBackgroundColor=\"@android:color/holo_green_light\"\n" +
            "        app:cardCornerRadius=\"10dp\">\n" +
            "\t\t<Button\n" +
            "            android:id=\"@+id/btn_time_picker\"\n" +
            "            android:layout_width=\"wrap_content\"\n" +
            "            android:layout_height=\"wrap_content\"\n" +
            "            android:layout_gravity=\"center\"\n" +
            "            android:paddingLeft=\"8dp\"\n" +
            "            android:paddingRight=\"8dp\"\n" +
            "            android:textAllCaps=\"false\"\n" +
            "            android:drawablePadding=\"5dp\"\n" +
            "            android:textSize=\"16sp\"\n" +
            "            android:background=\"@android:color/holo_green_light\"\n" +
            "            android:textColor=\"@android:color/black\"\n" +
            "            android:text=\"No time chosen\" />\n" +
            "\t</androidx.cardview.widget.CardView>\n" +
            "\n" +
            "  <!--Number Picker -->\n" +
            "\t<NumberPicker\n" +
            "        android:id=\"@+id/numberPicker\"\n" +
            "        android:layout_width=\"match_parent\"\n" +
            "        android:layout_height=\"wrap_content\" />\n" +
            "</LinearLayout>\n";

    private String pickerJava = "package com.appdevlab.mad;\n" +
            "\n" +
            "import android.app.DatePickerDialog;\n" +
            "import android.app.TimePickerDialog;\n" +
            "import android.os.Bundle;\n" +
            "import android.view.View;\n" +
            "import android.widget.Button;\n" +
            "import android.widget.DatePicker;\n" +
            "import android.widget.NumberPicker;\n" +
            "import android.widget.TimePicker;\n" +
            "import android.widget.Toast;\n" +
            "\n" +
            "import androidx.appcompat.app.AppCompatActivity;\n" +
            "\n" +
            "import java.util.Calendar;\n" +
            "\n" +
            "public class MainActivity extends AppCompatActivity {\n" +
            "\n" +
            "    Button btnDatePicker, btnTimePicker;\n" +
            "    NumberPicker numberPicker;\n" +
            "\n" +
            "    int mDay, mMonth, mYear;\n" +
            "\n" +
            "    @Override\n" +
            "    protected void onCreate(Bundle savedInstanceState) {\n" +
            "        super.onCreate(savedInstanceState);\n" +
            "        setContentView(R.layout.activity_main);\n" +
            "\n" +
            "        btnDatePicker = findViewById(R.id.btn_date_picker);\n" +
            "        btnTimePicker = findViewById(R.id.btn_time_picker);\n" +
            "        numberPicker = findViewById(R.id.numberPicker);\n" +
            "\n" +
            "        numberPicker.setMaxValue(10);\n" +
            "        numberPicker.setMinValue(0);\n" +
            "        numberPicker.setValue(3);\n" +
            "\n" +
            "\n" +
            "        // Date Picker\n" +
            "        btnDatePicker.setOnClickListener(new View.OnClickListener() {\n" +
            "            @Override\n" +
            "            public void onClick(View v) {\n" +
            "                Calendar mcurrentDate = Calendar.getInstance();\n" +
            "                mDay = mcurrentDate.get(Calendar.DAY_OF_MONTH);\n" +
            "                mMonth = mcurrentDate.get(Calendar.MONTH);\n" +
            "                mYear = mcurrentDate.get(Calendar.YEAR);\n" +
            "\n" +
            "                DatePickerDialog datePickerDialog = new DatePickerDialog(PickerActivity.this, R.style.DateDialogTheme, new DatePickerDialog.OnDateSetListener() {\n" +
            "                    @Override\n" +
            "                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {\n" +
            "                        month = month + 1;\n" +
            "                        String date = String.format(\"%02d\",dayOfMonth) + \"/\" + String.format(\"%02d\",month) + \"/\" + String.format(\"%04d\",year);\n" +
            "                        btnDatePicker.setText(date);\n" +
            "                        Toast.makeText(getApplicationContext(),\"Selected date: \" + date, Toast.LENGTH_SHORT).show();\n" +
            "                    }\n" +
            "                }, mYear, mMonth,mDay);\n" +
            "\n" +
            "                datePickerDialog.show();\n" +
            "            }\n" +
            "        });\n" +
            "\n" +
            "        // Time Picker\n" +
            "        btnTimePicker.setOnClickListener(new View.OnClickListener() {\n" +
            "            @Override\n" +
            "            public void onClick(View v) {\n" +
            "                Calendar mcurrentTime = Calendar.getInstance();\n" +
            "                int hour = mcurrentTime.get(Calendar.HOUR_OF_DAY);\n" +
            "                int minute = mcurrentTime.get(Calendar.MINUTE);\n" +
            "\n" +
            "                TimePickerDialog timePickerDialog = new TimePickerDialog(PickerActivity.this, R.style.TimeDialogTheme, new TimePickerDialog.OnTimeSetListener() {\n" +
            "                    @Override\n" +
            "                    public void onTimeSet(TimePicker timePicker, int selectedHour, int selectedMinute) {\n" +
            "                        String time = selectedHour + \":\" + selectedMinute;\n" +
            "                        btnTimePicker.setText(time);\n" +
            "                        Toast.makeText(getApplicationContext(),\"Selected time: \" + time, Toast.LENGTH_SHORT).show();\n" +
            "\n" +
            "                    }\n" +
            "                }, hour, minute, true);\n" +
            "\n" +
            "                timePickerDialog.setTitle(\"Select Time\");\n" +
            "                timePickerDialog.show();\n" +
            "            };\n" +
            "        });\n" +
            "\n" +
            "        // Number Picker\n" +
            "        numberPicker.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {\n" +
            "            @Override\n" +
            "            public void onValueChange(NumberPicker picker, int oldVal, int newVal) {\n" +
            "                Toast.makeText(getApplicationContext(),\"Selected number: \" + newVal,Toast.LENGTH_SHORT).show();\n" +
            "            }\n" +
            "        });\n" +
            "    }\n" +
            "}\n";

    private String pickerJavaLocation = "java/MainActivity.java";
    private String pickerXmlLocation = "res/layout/activity_main.xml";


    private String spinnerXml = "<LinearLayout\n" +
            "\txmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
            "\txmlns:tools=\"http://schemas.android.com/tools\"\n" +
            "        android:layout_width=\"match_parent\"\n" +
            "        android:layout_height=\"match_parent\"\n" +
            "\txmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
            "        android:orientation=\"vertical\"\n" +
            "        android:layout_margin=\"16dp\"\n" +
            "        tools:context=\".MainActivity\">\n" +
            "    \n" +
            "    <!--Spinner (Dialog)-->\n" +
            "    \n" +
            "\t<RelativeLayout\n" +
            "        android:layout_width=\"match_parent\"\n" +
            "        android:layout_height=\"wrap_content\"\n" +
            "        android:layout_marginLeft=\"5dp\"\n" +
            "        android:layout_marginTop=\"15dp\"\n" +
            "        android:layout_marginRight=\"5dp\"\n" +
            "        android:layout_marginBottom=\"15dp\"\n" +
            "        android:orientation=\"horizontal\">\n" +
            "\t\t<Spinner\n" +
            "            android:id=\"@+id/spinner_dialog\"\n" +
            "            android:layout_width=\"match_parent\"\n" +
            "            android:layout_height=\"wrap_content\"\n" +
            "            android:layout_marginLeft=\"5dp\"\n" +
            "            android:background=\"@android:color/transparent\"\n" +
            "            android:spinnerMode=\"dialog\"\n" +
            "            android:textSize=\"16sp\" />\n" +
            "\t\t<ImageView\n" +
            "            android:layout_width=\"wrap_content\"\n" +
            "            android:layout_height=\"wrap_content\"\n" +
            "            android:layout_alignParentRight=\"true\"\n" +
            "            android:layout_marginRight=\"20dp\"\n" +
            "            android:src=\"@drawable/ic_arrow_drop_down_black_24dp\" />\n" +
            "\t</RelativeLayout>\n" +
            "\t\n" +
            "    <!--Spinner (Dropdown)-->\n" +
            "\n" +
            "\t<RelativeLayout\n" +
            "        android:layout_width=\"match_parent\"\n" +
            "        android:layout_height=\"wrap_content\"\n" +
            "        android:layout_marginLeft=\"5dp\"\n" +
            "        android:layout_marginTop=\"15dp\"\n" +
            "        android:layout_marginRight=\"5dp\"\n" +
            "        android:layout_marginBottom=\"15dp\"\n" +
            "        android:orientation=\"horizontal\">\n" +
            "\t\t<Spinner\n" +
            "            android:id=\"@+id/spinner_dropdown\"\n" +
            "            android:layout_width=\"match_parent\"\n" +
            "            android:layout_height=\"wrap_content\"\n" +
            "            android:layout_marginLeft=\"5dp\"\n" +
            "            android:background=\"@android:color/transparent\"\n" +
            "            android:spinnerMode=\"dropdown\"\n" +
            "            android:textSize=\"16sp\" />\n" +
            "\t\t<ImageView\n" +
            "            android:layout_width=\"wrap_content\"\n" +
            "            android:layout_height=\"wrap_content\"\n" +
            "            android:layout_alignParentRight=\"true\"\n" +
            "            android:layout_marginRight=\"20dp\"\n" +
            "            android:src=\"@drawable/ic_arrow_drop_down_black_24dp\" />\n" +
            "\t</RelativeLayout>\n" +
            "</LinearLayout>";

    private String spinnerJava = "package com.appdevlab.mad;\n" +
            "\n" +
            "import android.os.Bundle;\n" +
            "import android.util.Log;\n" +
            "import android.view.View;\n" +
            "import android.widget.AdapterView;\n" +
            "import android.widget.ArrayAdapter;\n" +
            "import android.widget.Spinner;\n" +
            "import android.widget.TextView;\n" +
            "import android.widget.Toast;\n" +
            "\n" +
            "import androidx.annotation.Nullable;\n" +
            "import androidx.appcompat.app.ActionBar;\n" +
            "import androidx.appcompat.app.AppCompatActivity;\n" +
            "import java.util.ArrayList;\n" +
            "import java.util.List;\n" +
            "\n" +
            "public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {\n" +
            "\n" +
            "    Spinner spinnerDropdown, spinnerDialog;\n" +
            "    @Override\n" +
            "    protected void onCreate(@Nullable Bundle savedInstanceState) {\n" +
            "        super.onCreate(savedInstanceState);\n" +
            "        setContentView(R.layout.activity_main);\n" +
            "\n" +
            "        spinnerDropdown = (Spinner) findViewById(R.id.spinner_dropdown);\n" +
            "        spinnerDialog = (Spinner) findViewById(R.id.spinner_dialog);\n" +
            "\n" +
            "        spinnerDropdown.setOnItemSelectedListener(this);\n" +
            "        spinnerDialog.setOnItemSelectedListener(this);\n" +
            "\n" +
            "        List<String> places = new ArrayList<String>();\n" +
            "        places.add(\"BARN Hall\");\n" +
            "        places.add(\"Octagon Computer Center\");\n" +
            "        places.add(\"Lecture Hall Complex (LHC)\");\n" +
            "        places.add(\"Shopping Center\");\n" +
            "        places.add(\"CSE Department\");\n" +
            "\n" +
            "\n" +
            "        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, places);\n" +
            "        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);\n" +
            "\n" +
            "        spinnerDropdown.setAdapter(arrayAdapter);\n" +
            "        spinnerDialog.setAdapter(arrayAdapter);\n" +
            "\n" +
            "    }\n" +
            "\n" +
            "    @Override\n" +
            "    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {\n" +
            "        Toast.makeText(getApplicationContext(),parent.getItemAtPosition(position).toString() + \" selected\",Toast.LENGTH_SHORT).show();\n" +
            "    }\n" +
            "\n" +
            "    @Override\n" +
            "    public void onNothingSelected(AdapterView<?> parent) {\n" +
            "\n" +
            "    }\n" +
            "}\n";

    private String spinnerJavaLocation = "java/MainActivity.java";
    private String spinnerXmlLocation = "res/layout/activity_main.xml";


    private String menuXml = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
            "<LinearLayout\n" +
            "\txmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
            "\txmlns:tools=\"http://schemas.android.com/tools\"\n" +
            "    android:layout_width=\"match_parent\"\n" +
            "    android:layout_height=\"match_parent\"\n" +
            "\txmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
            "    android:orientation=\"vertical\"\n" +
            "    android:padding=\"16dp\"\n" +
            "    tools:context=\".MainActivity\">\n" +
            "    \n" +
            "    <!--Context Menu-->\n" +
            "    \n" +
            "\t<ListView\n" +
            "        android:id=\"@+id/contextList\"\n" +
            "        android:layout_width=\"match_parent\"\n" +
            "        android:layout_height=\"wrap_content\"\n" +
            "        android:layout_margin=\"5dp\" />\n" +
            "        \n" +
            "        \n" +
            "    <!--Popup Menu-->\n" +
            "    \n" +
            "\t<androidx.cardview.widget.CardView\n" +
            "        android:layout_width=\"wrap_content\"\n" +
            "        android:layout_height=\"wrap_content\"\n" +
            "        android:layout_gravity=\"center\"\n" +
            "        android:foregroundGravity=\"center\"\n" +
            "        app:cardBackgroundColor=\"@android:color/holo_blue_light\"\n" +
            "        app:cardCornerRadius=\"10dp\">\n" +
            "\t\t<Button\n" +
            "            android:id=\"@+id/btn_popup_menu\"\n" +
            "            android:layout_width=\"wrap_content\"\n" +
            "            android:layout_height=\"wrap_content\"\n" +
            "            android:layout_gravity=\"center\"\n" +
            "            android:paddingLeft=\"8dp\"\n" +
            "            android:paddingRight=\"8dp\"\n" +
            "            android:textAllCaps=\"false\"\n" +
            "            android:drawablePadding=\"5dp\"\n" +
            "            android:textSize=\"16sp\"\n" +
            "            android:background=\"@android:color/holo_blue_light\"\n" +
            "            android:textColor=\"@android:color/black\"\n" +
            "            android:text=\"Click to show popup menu\" />\n" +
            "\t</androidx.cardview.widget.CardView>\n" +
            "</LinearLayout>\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n";

    private String menuJava = "package com.appdevlab.mad;\n" +
            "\n" +
            "import android.content.Context;\n" +
            "import android.os.Bundle;\n" +
            "import android.view.ContextMenu;\n" +
            "import android.view.MenuInflater;\n" +
            "import android.view.MenuItem;\n" +
            "import android.view.View;\n" +
            "import android.widget.AdapterView;\n" +
            "import android.widget.ArrayAdapter;\n" +
            "import android.widget.Button;\n" +
            "import android.widget.ListView;\n" +
            "import android.widget.PopupMenu;\n" +
            "import android.widget.TextView;\n" +
            "import android.widget.Toast;\n" +
            "\n" +
            "import androidx.annotation.NonNull;\n" +
            "import androidx.annotation.Nullable;\n" +
            "import androidx.appcompat.app.ActionBar;\n" +
            "import androidx.appcompat.app.AppCompatActivity;\n" +
            "\n" +
            "import java.util.ArrayList;\n" +
            "import java.util.List;\n" +
            "\n" +
            "public class MainActivity extends AppCompatActivity {\n" +
            "\n" +
            "    Button btnPopupMenu;\n" +
            "\n" +
            "    @Override\n" +
            "    protected void onCreate(@Nullable Bundle savedInstanceState) {\n" +
            "        super.onCreate(savedInstanceState);\n" +
            "        setContentView(R.layout.activity_main);\n" +
            "\n" +
            "\n" +
            "        // Context Menu\n" +
            "        List<String> places = new ArrayList<String>();\n" +
            "        places.add(\"BARN Hall\");\n" +
            "        places.add(\"Octagon Computer Center\");\n" +
            "        places.add(\"Lecture Hall Complex (LHC)\");\n" +
            "        places.add(\"Shopping Center\");\n" +
            "        places.add(\"CSE Department\");\n" +
            "\n" +
            "        ListView contextList = findViewById(R.id.contextList);\n" +
            "        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,places);\n" +
            "        contextList.setAdapter(arrayAdapter);\n" +
            "        registerForContextMenu(contextList);\n" +
            "\n" +
            "\n" +
            "        // Popup Menu\n" +
            "        btnPopupMenu = (Button) findViewById(R.id.btn_popup_menu);\n" +
            "\n" +
            "        btnPopupMenu.setOnClickListener(new View.OnClickListener() {\n" +
            "            @Override\n" +
            "            public void onClick(View v) {\n" +
            "                PopupMenu popupMenu = new PopupMenu(getApplicationContext(),btnPopupMenu);\n" +
            "                popupMenu.getMenuInflater().inflate(R.menu.menu_list,popupMenu.getMenu());\n" +
            "\n" +
            "                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {\n" +
            "                    @Override\n" +
            "                    public boolean onMenuItemClick(MenuItem item) {\n" +
            "                        Toast.makeText(getApplicationContext(),\"Selected option \" + item.getTitle().toString(),Toast.LENGTH_SHORT).show();\n" +
            "                        return true;\n" +
            "                    }\n" +
            "                });\n" +
            "\n" +
            "                popupMenu.show();\n" +
            "            }\n" +
            "        });\n" +
            "\n" +
            "    }\n" +
            "\n" +
            "    @Override\n" +
            "    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {\n" +
            "        super.onCreateContextMenu(menu, v, menuInfo);\n" +
            "        MenuInflater inflater = getMenuInflater();\n" +
            "        inflater.inflate(R.menu.menu_list,menu);\n" +
            "        menu.setHeaderTitle(\"Select an option\");\n" +
            "    }\n" +
            "\n" +
            "    @Override\n" +
            "    public boolean onContextItemSelected(@NonNull MenuItem item) {\n" +
            "\n" +
            "        AdapterView.AdapterContextMenuInfo menuInfo = (AdapterView.AdapterContextMenuInfo) item.getMenuInfo();\n" +
            "        String place = ((TextView)menuInfo.targetView.findViewById(android.R.id.text1)).getText().toString();\n" +
            "\n" +
            "        switch (item.getItemId()) {\n" +
            "            case R.id.add:\n" +
            "                Toast.makeText(getApplicationContext(),\"Selected Add for \" + place,Toast.LENGTH_SHORT).show();\n" +
            "                break;\n" +
            "            case R.id.edit:\n" +
            "                Toast.makeText(getApplicationContext(),\"Selected Edit for \" + place,Toast.LENGTH_SHORT).show();\n" +
            "                break;\n" +
            "            case R.id.delete:\n" +
            "                Toast.makeText(getApplicationContext(),\"Selected Delete for \" + place,Toast.LENGTH_SHORT).show();\n" +
            "                break;\n" +
            "            default:\n" +
            "                return false;\n" +
            "        }\n" +
            "        return true;\n" +
            "    }\n" +
            "\n" +
            "\n" +
            "}\n";

    private String menuXml2 = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
            "<menu xmlns:android=\"http://schemas.android.com/apk/res/android\">\n" +
            "    <item android:id=\"@+id/add\"\n" +
            "        android:title=\"Add\" />\n" +
            "    <item android:id=\"@+id/edit\"\n" +
            "        android:title=\"Edit\" />\n" +
            "    <item android:id=\"@+id/delete\"\n" +
            "        android:title=\"Delete\" />\n" +
            "</menu>";


    private String menuJavaLocation = "java/MainActivity.java";
    private String menuXmlLocation = "res/layout/activity_main.xml";
    private String menuXml2Location = "res/menu/menu_list.xml";


    private String materialXml = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
            "<androidx.coordinatorlayout.widget.CoordinatorLayout\n" +
            "\txmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
            "\txmlns:tools=\"http://schemas.android.com/tools\"\n" +
            "    android:id=\"@+id/coordinator\"\n" +
            "    android:layout_width=\"match_parent\"\n" +
            "    android:layout_height=\"match_parent\"\n" +
            "\txmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
            "    android:orientation=\"vertical\"\n" +
            "    tools:context=\".MainActivity\"\n" +
            "    >\n" +
            "\t<androidx.core.widget.NestedScrollView\n" +
            "        android:id=\"@+id/layout\"\n" +
            "        android:layout_width=\"match_parent\"\n" +
            "        android:layout_height=\"match_parent\"\n" +
            "        android:padding=\"10dp\"\n" +
            "        app:layout_behavior=\"@string/appbar_scrolling_view_behavior\">\n" +
            "\t\t<LinearLayout\n" +
            "            android:layout_width=\"match_parent\"\n" +
            "            android:layout_height=\"match_parent\"\n" +
            "            android:orientation=\"vertical\">\n" +
            "\t\t    \n" +
            "    <!--Floating Action Button (FAB)-->\n" +
            "\n" +
            "\t\t\t<com.google.android.material.floatingactionbutton.FloatingActionButton\n" +
            "        android:id=\"@+id/fab\"\n" +
            "        android:layout_width=\"wrap_content\"\n" +
            "        android:layout_height=\"wrap_content\"\n" +
            "        android:layout_gravity=\"center_horizontal\"\n" +
            "        android:layout_margin=\"@dimen/fab_margin\"\n" +
            "        android:elevation=\"10dp\"\n" +
            "        android:backgroundTint=\"@android:color/holo_red_light\"\n" +
            "        android:src=\"@drawable/ic_play_arrow_black_24dp\" />\n" +
            "        \n" +
            "    <!--CardView-->\n" +
            "        \n" +
            "\t\t\t<com.google.android.material.card.MaterialCardView\n" +
            "        android:id=\"@+id/edit_profile_card\"\n" +
            "        android:layout_width=\"match_parent\"\n" +
            "        android:layout_height=\"wrap_content\"\n" +
            "        android:layout_margin=\"10dp\"\n" +
            "        android:theme=\"@style/Theme.MaterialComponents.DayNight\"\n" +
            "        app:cardCornerRadius=\"10dp\"\n" +
            "        app:cardElevation=\"10dp\"\n" +
            "        android:layout_gravity=\"center\"\n" +
            "        app:cardBackgroundColor=\"@android:color/white\"\n" +
            "        app:state_dragged=\"false\">\n" +
            "\t\t\t\t<RelativeLayout\n" +
            "            android:layout_width=\"match_parent\"\n" +
            "            android:layout_height=\"wrap_content\"\n" +
            "            android:padding=\"16dp\"\n" +
            "            >\n" +
            "\t\t\t\t\t<ImageView\n" +
            "                android:layout_width=\"80dp\"\n" +
            "                android:layout_height=\"80dp\"\n" +
            "                android:id=\"@+id/image\"\n" +
            "                android:src=\"@drawable/naren\"\n" +
            "                android:layout_alignParentLeft=\"true\"\n" +
            "                android:layout_alignParentTop=\"true\"\n" +
            "                android:layout_marginRight=\"16dp\"\n" +
            "                />\n" +
            "\t\t\t\t\t<TextView\n" +
            "                android:layout_width=\"wrap_content\"\n" +
            "                android:layout_height=\"wrap_content\"\n" +
            "                android:id=\"@+id/name\"\n" +
            "                android:text=\"Naren Sairam\"\n" +
            "                android:textColor=\"@android:color/black\"\n" +
            "                android:textStyle=\"bold\"\n" +
            "                android:layout_toRightOf=\"@+id/image\"\n" +
            "                android:layout_alignParentTop=\"true\"\n" +
            "                android:textSize=\"18sp\"\n" +
            "                />\n" +
            "\t\t\t\t\t<TextView\n" +
            "                android:layout_width=\"wrap_content\"\n" +
            "                android:layout_height=\"wrap_content\"\n" +
            "                android:id=\"@+id/position\"\n" +
            "                android:text=\"App Developer\"\n" +
            "                android:textColor=\"@android:color/black\"\n" +
            "                android:layout_toRightOf=\"@+id/image\"\n" +
            "                android:layout_below=\"@+id/name\"\n" +
            "                android:textSize=\"16sp\"\n" +
            "                />\n" +
            "\t\t\t\t\t<TextView\n" +
            "                android:layout_width=\"wrap_content\"\n" +
            "                android:layout_height=\"wrap_content\"\n" +
            "                android:id=\"@+id/dept\"\n" +
            "                android:text=\"CSE, NIT Trichy\"\n" +
            "                android:textColor=\"@android:color/darker_gray\"\n" +
            "                android:layout_toRightOf=\"@+id/image\"\n" +
            "                android:layout_below=\"@+id/position\"\n" +
            "                android:textSize=\"14sp\"\n" +
            "                />\n" +
            "\t\t\t\t</RelativeLayout>\n" +
            "\t\t\t</com.google.android.material.card.MaterialCardView>\n" +
            "\t\t\t\n" +
            "\t\t<!--Bottom Sheet-->\n" +
            "        \n" +
            "\t\t\t<com.google.android.material.button.MaterialButton\n" +
            "        android:id=\"@+id/open_bottom_sheet\"\n" +
            "        android:layout_width=\"wrap_content\"\n" +
            "        android:layout_height=\"wrap_content\"\n" +
            "        android:layout_gravity=\"center_horizontal\"\n" +
            "        android:elevation=\"10dp\"\n" +
            "        android:theme=\"@style/Theme.MaterialComponents.DayNight\"\n" +
            "        android:text=\"OPEN BOTTOM SHEET\"\n" +
            "        />\n" +
            "        \n" +
            "    <!--Snackbar-->\n" +
            "        \n" +
            "\t\t\t<com.google.android.material.button.MaterialButton\n" +
            "        android:id=\"@+id/btn_default_snackbar\"\n" +
            "        android:layout_width=\"wrap_content\"\n" +
            "        android:layout_height=\"wrap_content\"\n" +
            "        android:layout_gravity=\"center_horizontal\"\n" +
            "        android:elevation=\"10dp\"\n" +
            "        android:theme=\"@style/Theme.MaterialComponents.DayNight\"\n" +
            "        android:backgroundTint=\"@android:color/holo_orange_light\"\n" +
            "        android:text=\"SHOW DEFAULT SNACKBAR\"\n" +
            "        />\n" +
            "\t\t\t<com.google.android.material.button.MaterialButton\n" +
            "        android:id=\"@+id/btn_action_snackbar\"\n" +
            "        android:layout_width=\"wrap_content\"\n" +
            "        android:layout_height=\"wrap_content\"\n" +
            "        android:layout_gravity=\"center_horizontal\"\n" +
            "        android:elevation=\"10dp\"\n" +
            "        android:theme=\"@style/Theme.MaterialComponents.DayNight\"\n" +
            "        android:backgroundTint=\"@android:color/holo_orange_light\"\n" +
            "        android:text=\"SHOW ACTION CALL SNACKBAR\"\n" +
            "        />\n" +
            "\t\t</LinearLayout>\n" +
            "\t</androidx.core.widget.NestedScrollView>\n" +
            "\t<RelativeLayout\n" +
            "        android:id=\"@+id/bottom_sheet\"\n" +
            "        android:layout_width=\"match_parent\"\n" +
            "        android:layout_height=\"wrap_content\"\n" +
            "        android:background=\"@android:color/white\"\n" +
            "        android:gravity=\"center\"\n" +
            "        android:padding=\"10dp\"\n" +
            "        android:clipToPadding=\"true\"\n" +
            "        android:elevation=\"10dp\"\n" +
            "        app:behavior_hideable=\"true\"\n" +
            "        app:layout_behavior=\"com.google.android.material.bottomsheet.BottomSheetBehavior\">\n" +
            "\t\t<ImageView\n" +
            "            android:layout_width=\"80dp\"\n" +
            "            android:layout_height=\"80dp\"\n" +
            "            android:id=\"@+id/logo\"\n" +
            "            android:src=\"@drawable/nit\"\n" +
            "            android:layout_alignParentLeft=\"true\"\n" +
            "            android:layout_alignParentTop=\"true\"\n" +
            "            android:layout_marginRight=\"16dp\"\n" +
            "            />\n" +
            "\t\t<TextView\n" +
            "            android:layout_width=\"wrap_content\"\n" +
            "            android:layout_height=\"wrap_content\"\n" +
            "            android:id=\"@+id/college\"\n" +
            "            android:text=\"National Institute of Technology\"\n" +
            "            android:textColor=\"@android:color/black\"\n" +
            "            android:textStyle=\"bold\"\n" +
            "            android:layout_toRightOf=\"@+id/logo\"\n" +
            "            android:layout_alignParentTop=\"true\"\n" +
            "            android:textSize=\"16sp\"\n" +
            "            />\n" +
            "\t\t<TextView\n" +
            "            android:layout_width=\"wrap_content\"\n" +
            "            android:layout_height=\"wrap_content\"\n" +
            "            android:id=\"@+id/place\"\n" +
            "            android:text=\"Tiruchirapalli\"\n" +
            "            android:layout_toRightOf=\"@+id/logo\"\n" +
            "            android:layout_below=\"@+id/college\"\n" +
            "            android:textSize=\"14sp\"\n" +
            "            />\n" +
            "\t\t<com.google.android.material.button.MaterialButton\n" +
            "            android:id=\"@+id/close_bottom_sheet\"\n" +
            "            android:layout_width=\"wrap_content\"\n" +
            "            android:layout_height=\"wrap_content\"\n" +
            "            android:layout_below=\"@+id/place\"\n" +
            "            android:layout_alignParentRight=\"true\"\n" +
            "            android:layout_gravity=\"center_horizontal\"\n" +
            "            android:backgroundTint=\"@android:color/holo_red_light\"\n" +
            "            android:elevation=\"10dp\"\n" +
            "            android:text=\"CLOSE\"\n" +
            "            android:theme=\"@style/Theme.MaterialComponents.DayNight\" />\n" +
            "\t</RelativeLayout>\n" +
            "</androidx.coordinatorlayout.widget.CoordinatorLayout>\n" +
            "\n" +
            "\n";

    private String materialJava = "package com.appdevlab.mad;\n" +
            "\n" +
            "import android.annotation.SuppressLint;\n" +
            "import android.graphics.Color;\n" +
            "import android.os.Bundle;\n" +
            "import android.view.View;\n" +
            "import android.widget.TextView;\n" +
            "import android.widget.Toast;\n" +
            "\n" +
            "import androidx.annotation.Nullable;\n" +
            "import androidx.appcompat.app.ActionBar;\n" +
            "import androidx.appcompat.app.AppCompatActivity;\n" +
            "import androidx.coordinatorlayout.widget.CoordinatorLayout;\n" +
            "\n" +
            "import com.google.android.material.bottomsheet.BottomSheetBehavior;\n" +
            "import com.google.android.material.button.MaterialButton;\n" +
            "import com.google.android.material.floatingactionbutton.FloatingActionButton;\n" +
            "import com.google.android.material.snackbar.Snackbar;\n" +
            "\n" +
            "public class MainActivity extends AppCompatActivity {\n" +
            "    FloatingActionButton floatingActionButton;\n" +
            "\n" +
            "    MaterialButton openBottomSheet,closeBottomSheet;\n" +
            "    BottomSheetBehavior bottomSheetBehavior;\n" +
            "\n" +
            "    CoordinatorLayout coordinatorLayout;\n" +
            "    MaterialButton btnDefaultSnackbar, btnActionSnackbar;\n" +
            "\n" +
            "    @Override\n" +
            "    protected void onCreate(@Nullable Bundle savedInstanceState) {\n" +
            "        super.onCreate(savedInstanceState);\n" +
            "        setContentView(R.layout.activity_main);\n" +
            "\n" +
            "\n" +
            "        // FAB\n" +
            "        floatingActionButton = findViewById(R.id.fab);\n" +
            "        floatingActionButton.setOnClickListener(new View.OnClickListener() {\n" +
            "            @Override\n" +
            "            public void onClick(View v) {\n" +
            "                Toast.makeText(getApplicationContext(),\"Clicked on Floating Action Button\",Toast.LENGTH_SHORT).show();\n" +
            "            }\n" +
            "        });\n" +
            "\n" +
            "        //Bottom Sheet\n" +
            "        openBottomSheet = findViewById(R.id.open_bottom_sheet);\n" +
            "        closeBottomSheet = findViewById(R.id.close_bottom_sheet);\n" +
            "\n" +
            "        View bottomSheet = findViewById(R.id.bottom_sheet);\n" +
            "\n" +
            "        bottomSheetBehavior = BottomSheetBehavior.from(bottomSheet);\n" +
            "        bottomSheetBehavior.setState(BottomSheetBehavior.STATE_HIDDEN);\n" +
            "\n" +
            "        openBottomSheet.setOnClickListener(new View.OnClickListener() {\n" +
            "            @Override\n" +
            "            public void onClick(View v) {\n" +
            "                if(bottomSheetBehavior.getState() != BottomSheetBehavior.STATE_EXPANDED) {\n" +
            "                    Toast.makeText(getApplicationContext(),\"Opening Bottom Sheet\",Toast.LENGTH_SHORT).show();\n" +
            "                    bottomSheetBehavior.setState(BottomSheetBehavior.STATE_EXPANDED);\n" +
            "                }\n" +
            "                else\n" +
            "                    Toast.makeText(getApplicationContext(),\"Bottom Sheet is already open\",Toast.LENGTH_SHORT).show();\n" +
            "            }\n" +
            "        });\n" +
            "\n" +
            "        closeBottomSheet.setOnClickListener(new View.OnClickListener() {\n" +
            "            @Override\n" +
            "            public void onClick(View v) {\n" +
            "                Toast.makeText(getApplicationContext(),\"Closing Bottom Sheet\",Toast.LENGTH_SHORT).show();\n" +
            "                bottomSheetBehavior.setState(BottomSheetBehavior.STATE_HIDDEN);\n" +
            "            }\n" +
            "        });\n" +
            "\n" +
            "\n" +
            "        // Snackbar\n" +
            "        coordinatorLayout = findViewById(R.id.coordinator);\n" +
            "        btnDefaultSnackbar = findViewById(R.id.btn_default_snackbar);\n" +
            "        btnActionSnackbar = findViewById(R.id.btn_action_snackbar);\n" +
            "\n" +
            "        btnDefaultSnackbar.setOnClickListener(new View.OnClickListener() {\n" +
            "            @Override\n" +
            "            public void onClick(View v) {\n" +
            "                Snackbar.make(coordinatorLayout,\"This is a default snackbar\", Snackbar.LENGTH_LONG).show();\n" +
            "            }\n" +
            "        });\n" +
            "\n" +
            "        btnActionSnackbar.setOnClickListener(new View.OnClickListener() {\n" +
            "            @Override\n" +
            "            public void onClick(View v) {\n" +
            "\n" +
            "                Snackbar snackbar = Snackbar.make(coordinatorLayout,\"Message Deleted\",Snackbar.LENGTH_LONG)\n" +
            "                        .setAction(\"UNDO\", new View.OnClickListener() {\n" +
            "                            @Override\n" +
            "                            public void onClick(View v) {\n" +
            "                                Snackbar.make(coordinatorLayout,\"Message Restored\",Snackbar.LENGTH_SHORT).show();\n" +
            "                            }\n" +
            "                        });\n" +
            "                snackbar.show();\n" +
            "            }\n" +
            "        });\n" +
            "    }\n" +
            "}\n";

    private String materialJavaLocation = "java/MainActivity.java";
    private String materialXmlLocation = "res/layout/activity_main.xml";


    private String sqliteJava = "package com.appdevlab.mad;\n" +
            "\n" +
            "import android.os.Bundle;\n" +
            "import android.text.Html;\n" +
            "import android.view.Gravity;\n" +
            "import android.view.View;\n" +
            "import android.widget.TextView;\n" +
            "import android.widget.Toast;\n" +
            "\n" +
            "import androidx.annotation.Nullable;\n" +
            "import androidx.appcompat.app.ActionBar;\n" +
            "import androidx.appcompat.app.AppCompatActivity;\n" +
            "\n" +
            "import com.appdevlab.mad.model.Student;\n" +
            "\n" +
            "import java.util.List;\n" +
            "\n" +
            "import static android.view.View.GONE;\n" +
            "\n" +
            "public class MainActivity extends AppCompatActivity {\n" +
            "\n" +
            "    TextView name, roll, rollUpdate, nameUpdate, reset, studentList;\n" +
            "    int found = -1;\n" +
            "    DatabaseManager databaseManager;\n" +
            "    Student student;\n" +
            "\n" +
            "    @Override\n" +
            "    protected void onCreate(@Nullable Bundle savedInstanceState) {\n" +
            "        super.onCreate(savedInstanceState);\n" +
            "        setContentView(R.layout.activity_main);\n" +
            "\n" +
            "        // Add Student\n" +
            "        roll = findViewById(R.id.roll);\n" +
            "        name = findViewById(R.id.name);\n" +
            "\n" +
            "        findViewById(R.id.add).setOnClickListener(new View.OnClickListener() {\n" +
            "            @Override\n" +
            "            public void onClick(View v) {\n" +
            "                if(roll.getText().toString().equals(\"\") || name.getText().toString().equals(\"\"))\n" +
            "                    Toast.makeText(getApplicationContext(),\"Please enter required fields\", Toast.LENGTH_SHORT).show();\n" +
            "                else {\n" +
            "                    databaseManager = new DatabaseManager(getApplicationContext());\n" +
            "                    databaseManager.open();\n" +
            "\n" +
            "                    Student student = new Student(roll.getText().toString(),name.getText().toString());\n" +
            "\n" +
            "                    Boolean res = databaseManager.addStudent(student);\n" +
            "                    if(res) {\n" +
            "                        Toast.makeText(getApplicationContext(), \"New Student: \" + name.getText().toString() + \" added successfully\", Toast.LENGTH_SHORT).show();\n" +
            "                    }\n" +
            "                    else\n" +
            "                        Toast.makeText(getApplicationContext(),\"New Student addition unsuccessful\",Toast.LENGTH_SHORT).show();\n" +
            "                }\n" +
            "            }\n" +
            "        });\n" +
            "\n" +
            "        // Update\n" +
            "\n" +
            "        rollUpdate = findViewById(R.id.roll_update);\n" +
            "        nameUpdate = findViewById(R.id.name_update);\n" +
            "        reset = findViewById(R.id.reset);\n" +
            "\n" +
            "\n" +
            "        reset.setOnClickListener(new View.OnClickListener() {\n" +
            "            @Override\n" +
            "            public void onClick(View v) {\n" +
            "                found = -1;\n" +
            "                rollUpdate.setEnabled(true);\n" +
            "                findViewById(R.id.nameLayout).setVisibility(View.GONE);\n" +
            "                findViewById(R.id.updateCard).setVisibility(View.GONE);\n" +
            "                findViewById(R.id.findCard).setVisibility(View.VISIBLE);\n" +
            "                nameUpdate.setText(\"\");\n" +
            "                rollUpdate.setText(\"\");\n" +
            "            }\n" +
            "        });\n" +
            "\n" +
            "        if(found==-1) {\n" +
            "            findViewById(R.id.nameLayout).setVisibility(GONE);\n" +
            "        }\n" +
            "        else {\n" +
            "            findViewById(R.id.nameLayout).setVisibility(View.VISIBLE);\n" +
            "        }\n" +
            "\n" +
            "        findViewById(R.id.find).setOnClickListener(new View.OnClickListener() {\n" +
            "            @Override\n" +
            "            public void onClick(View v) {\n" +
            "                DatabaseManager databaseManager = new DatabaseManager(getApplicationContext());\n" +
            "                databaseManager.open();\n" +
            "\n" +
            "                if(rollUpdate.getText().toString().equals(\"\")) {\n" +
            "                    Toast.makeText(getApplicationContext(),\"Please enter roll number\", Toast.LENGTH_SHORT).show();\n" +
            "                }\n" +
            "                else {\n" +
            "                    student = databaseManager.getStudent(rollUpdate.getText().toString());\n" +
            "                    if (student == null) {\n" +
            "                        Toast.makeText(getApplicationContext(), \"Student: \" + rollUpdate.getText().toString() + \" not found\", Toast.LENGTH_SHORT).show();\n" +
            "                        found = -1;\n" +
            "                    } else {\n" +
            "                        Toast.makeText(getApplicationContext(), \"Student: \" + rollUpdate.getText().toString() + \" found!\", Toast.LENGTH_SHORT).show();\n" +
            "                        rollUpdate.setEnabled(false);\n" +
            "                        found = 1;\n" +
            "                        findViewById(R.id.nameLayout).setVisibility(View.VISIBLE);\n" +
            "                        findViewById(R.id.updateCard).setVisibility(View.VISIBLE);\n" +
            "                        findViewById(R.id.findCard).setVisibility(GONE);\n" +
            "                        nameUpdate.setText(student.name);\n" +
            "                        rollUpdate.setText(student.roll);\n" +
            "                    }\n" +
            "                }\n" +
            "            }\n" +
            "        });\n" +
            "\n" +
            "        findViewById(R.id.update).setOnClickListener(new View.OnClickListener() {\n" +
            "            @Override\n" +
            "            public void onClick(View v) {\n" +
            "                if(rollUpdate.getText().equals(\"\") || nameUpdate.getText().equals(\"\"))\n" +
            "                    Toast.makeText(getApplicationContext(),\"Please enter required fields\", Toast.LENGTH_SHORT).show();\n" +
            "                else {\n" +
            "                    DatabaseManager databaseManager = new DatabaseManager(getApplicationContext());\n" +
            "                    databaseManager.open();\n" +
            "\n" +
            "                    Student student = new Student(rollUpdate.getText().toString(),nameUpdate.getText().toString());\n" +
            "                    Boolean res = databaseManager.updateStudent(student);\n" +
            "\n" +
            "                    if(res) {\n" +
            "                        Toast.makeText(getApplicationContext(), \"Student: \" + rollUpdate.getText().toString() + \" updated successfully\", Toast.LENGTH_SHORT).show();\n" +
            "                    }\n" +
            "                    else\n" +
            "                        Toast.makeText(getApplicationContext(),\"Student updation failed\",Toast.LENGTH_SHORT).show();\n" +
            "                }\n" +
            "            }\n" +
            "        });\n" +
            "\n" +
            "\n" +
            "        // Get all students\n" +
            "        studentList = findViewById(R.id.studentList);\n" +
            "        findViewById(R.id.get).setOnClickListener(new View.OnClickListener() {\n" +
            "            @Override\n" +
            "            public void onClick(View v) {\n" +
            "                DatabaseManager databaseManager = new DatabaseManager(getApplicationContext());\n" +
            "                databaseManager.open();\n" +
            "                List<Student> students = databaseManager.getAllStudents();\n" +
            "                if(students.size()==0) {\n" +
            "                    studentList.setText(Html.fromHtml(\"<b>There are no students in database</b>\"));\n" +
            "                    studentList.setGravity(Gravity.CENTER);\n" +
            "                    studentList.setTextSize(15);\n" +
            "                }\n" +
            "                else {\n" +
            "                    String text = \"\";\n" +
            "                    for(Student student : students)\n" +
            "                        text = text + \"<b>Name: </b>\" + student.name + \"<br><b>Roll: </b>\" + student.roll + \"<br><br>\";\n" +
            "\n" +
            "                    studentList.setText(Html.fromHtml(text));\n" +
            "                    studentList.setGravity(Gravity.NO_GRAVITY);\n" +
            "\n" +
            "                }\n" +
            "            }\n" +
            "        });\n" +
            "\n" +
            "\n" +
            "    }\n" +
            "}\n";

    private String sqliteXml = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
            "<ScrollView\n" +
            "\txmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
            "\txmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
            "\txmlns:tools=\"http://schemas.android.com/tools\"\n" +
            "    android:layout_width=\"match_parent\"\n" +
            "    android:layout_height=\"match_parent\"\n" +
            "    android:orientation=\"vertical\"\n" +
            "    android:paddingHorizontal=\"10dp\"\n" +
            "    android:scrollbars=\"none\"\n" +
            "    tools:context=\".MainActivity\">\n" +
            "    \n" +
            "\t<LinearLayout\n" +
            "        android:layout_width=\"match_parent\"\n" +
            "        android:layout_height=\"match_parent\"\n" +
            "        android:orientation=\"vertical\" >\n" +
            "\t    \n" +
            "\t<!--Insert Student-->\n" +
            "            \n" +
            "\t\t<LinearLayout\n" +
            "            android:layout_width=\"match_parent\"\n" +
            "            android:layout_height=\"wrap_content\"\n" +
            "            >\n" +
            "\t\t\t<TextView\n" +
            "                android:layout_width=\"wrap_content\"\n" +
            "                android:layout_height=\"wrap_content\"\n" +
            "                android:text=\"Roll Number:   \"\n" +
            "                android:layout_marginTop=\"10dp\"\n" +
            "                android:layout_marginLeft=\"5dp\"\n" +
            "                android:layout_marginRight=\"5dp\"\n" +
            "                android:layout_marginBottom=\"10dp\"\n" +
            "                android:textColor=\"@android:color/black\"\n" +
            "                android:textSize=\"15sp\"\n" +
            "                android:textStyle=\"bold\"></TextView>\n" +
            "\t\t\t<EditText\n" +
            "                android:id=\"@+id/roll\"\n" +
            "                android:layout_width=\"match_parent\"\n" +
            "                android:layout_height=\"wrap_content\"\n" +
            "                android:layout_marginTop=\"10dp\"\n" +
            "                android:layout_marginLeft=\"5dp\"\n" +
            "                android:layout_marginRight=\"5dp\"\n" +
            "                android:layout_marginBottom=\"10dp\"\n" +
            "                android:ems=\"10\"\n" +
            "                android:textSize=\"15sp\"\n" +
            "                android:hint=\"Roll Number\"\n" +
            "                android:inputType=\"number\"\n" +
            "                android:autofillHints=\"\" />\n" +
            "\t\t</LinearLayout>\n" +
            "\t\t\n" +
            "\t\t<LinearLayout\n" +
            "            android:layout_width=\"match_parent\"\n" +
            "            android:layout_height=\"wrap_content\"\n" +
            "            >\n" +
            "\t\t\t<TextView\n" +
            "                android:layout_width=\"wrap_content\"\n" +
            "                android:layout_height=\"wrap_content\"\n" +
            "                android:text=\"Full Name:       \"\n" +
            "                android:layout_marginTop=\"10dp\"\n" +
            "                android:layout_marginLeft=\"5dp\"\n" +
            "                android:layout_marginRight=\"5dp\"\n" +
            "                android:layout_marginBottom=\"10dp\"\n" +
            "                android:textColor=\"@android:color/black\"\n" +
            "                android:textSize=\"15sp\"\n" +
            "                android:textStyle=\"bold\"></TextView>\n" +
            "\t\t\t<EditText\n" +
            "                android:id=\"@+id/name\"\n" +
            "                android:layout_width=\"match_parent\"\n" +
            "                android:layout_height=\"wrap_content\"\n" +
            "                android:layout_marginTop=\"10dp\"\n" +
            "                android:layout_marginLeft=\"5dp\"\n" +
            "                android:layout_marginRight=\"5dp\"\n" +
            "                android:layout_marginBottom=\"10dp\"\n" +
            "                android:ems=\"10\"\n" +
            "                android:textSize=\"15sp\"\n" +
            "                android:hint=\"Full Name\"\n" +
            "                android:inputType=\"textPersonName\"\n" +
            "                android:autofillHints=\"\" />\n" +
            "\t\t</LinearLayout>\n" +
            "\t\t\n" +
            "\t\t<androidx.cardview.widget.CardView\n" +
            "            android:layout_width=\"wrap_content\"\n" +
            "            android:layout_height=\"wrap_content\"\n" +
            "            android:layout_gravity=\"center\"\n" +
            "            android:layout_margin=\"20dp\"\n" +
            "            android:foregroundGravity=\"center\"\n" +
            "            app:cardBackgroundColor=\"@android:color/holo_green_dark\"\n" +
            "            app:cardCornerRadius=\"10dp\">\n" +
            "\t\t\t<Button\n" +
            "                android:id=\"@+id/add\"\n" +
            "                android:layout_width=\"wrap_content\"\n" +
            "                android:layout_height=\"wrap_content\"\n" +
            "                android:layout_gravity=\"center\"\n" +
            "                android:paddingLeft=\"10dp\"\n" +
            "                android:textStyle=\"bold\"\n" +
            "                android:paddingRight=\"10dp\"\n" +
            "                android:textSize=\"14sp\"\n" +
            "                android:drawablePadding=\"5dp\"\n" +
            "                android:drawableLeft=\"@drawable/ic_person_add_black_24dp\"\n" +
            "                android:background=\"@android:color/holo_green_light\"\n" +
            "                style=\"@style/Widget.MaterialComponents.Button.TextButton\"\n" +
            "                android:textColor=\"@android:color/black\"\n" +
            "                android:text=\"ADD STUDENT\" />\n" +
            "\t\t</androidx.cardview.widget.CardView>\n" +
            "\t\t\n" +
            "\t\t<RelativeLayout\n" +
            "            android:layout_width=\"match_parent\"\n" +
            "            android:layout_height=\"wrap_content\">\n" +
            "\t\t    \n" +
            "\t\t<!--Update Student-->\n" +
            "            \n" +
            "\t\t\t<TextView\n" +
            "                android:id=\"@+id/reset\"\n" +
            "                android:layout_width=\"match_parent\"\n" +
            "                android:layout_height=\"wrap_content\"\n" +
            "                android:drawablePadding=\"2dp\"\n" +
            "                android:foregroundGravity=\"right\"\n" +
            "                android:gravity=\"right|end\"\n" +
            "                android:layout_marginTop=\"10dp\"\n" +
            "                android:text=\"RESET\"\n" +
            "                android:textColor=\"@android:color/holo_green_light\"\n" +
            "                android:textStyle=\"bold\" />\n" +
            "\t\t</RelativeLayout>\n" +
            "\t\t<LinearLayout\n" +
            "            android:layout_width=\"match_parent\"\n" +
            "            android:layout_height=\"wrap_content\"\n" +
            "            android:id=\"@+id/rollLayout\"\n" +
            "            >\n" +
            "\t\t\t<TextView\n" +
            "                android:layout_width=\"wrap_content\"\n" +
            "                android:layout_height=\"wrap_content\"\n" +
            "                android:text=\"Roll Number:   \"\n" +
            "                android:layout_marginTop=\"10dp\"\n" +
            "                android:layout_marginLeft=\"5dp\"\n" +
            "                android:layout_marginRight=\"5dp\"\n" +
            "                android:layout_marginBottom=\"10dp\"\n" +
            "                android:textColor=\"@android:color/black\"\n" +
            "                android:textSize=\"15sp\"\n" +
            "                android:textStyle=\"bold\"></TextView>\n" +
            "\t\t\t<EditText\n" +
            "                android:id=\"@+id/roll_update\"\n" +
            "                android:layout_width=\"match_parent\"\n" +
            "                android:layout_height=\"wrap_content\"\n" +
            "                android:layout_marginTop=\"10dp\"\n" +
            "                android:layout_marginLeft=\"5dp\"\n" +
            "                android:layout_marginRight=\"5dp\"\n" +
            "                android:layout_marginBottom=\"10dp\"\n" +
            "                android:ems=\"10\"\n" +
            "                android:textSize=\"15sp\"\n" +
            "                android:hint=\"Roll Number\"\n" +
            "                android:inputType=\"number\"\n" +
            "                android:autofillHints=\"\" />\n" +
            "\t\t</LinearLayout>\n" +
            "\t\t<LinearLayout\n" +
            "            android:layout_width=\"match_parent\"\n" +
            "            android:layout_height=\"wrap_content\"\n" +
            "            android:id=\"@+id/nameLayout\"\n" +
            "            android:visibility=\"gone\"\n" +
            "            >\n" +
            "\t\t\t<TextView\n" +
            "                android:layout_width=\"wrap_content\"\n" +
            "                android:layout_height=\"wrap_content\"\n" +
            "                android:text=\"Full Name:       \"\n" +
            "                android:layout_marginTop=\"10dp\"\n" +
            "                android:layout_marginLeft=\"5dp\"\n" +
            "                android:layout_marginRight=\"5dp\"\n" +
            "                android:layout_marginBottom=\"10dp\"\n" +
            "                android:textColor=\"@android:color/black\"\n" +
            "                android:textSize=\"15sp\"\n" +
            "                android:textStyle=\"bold\"></TextView>\n" +
            "\t\t\t<EditText\n" +
            "                android:id=\"@+id/name_update\"\n" +
            "                android:layout_width=\"match_parent\"\n" +
            "                android:layout_height=\"wrap_content\"\n" +
            "                android:layout_marginTop=\"10dp\"\n" +
            "                android:layout_marginLeft=\"5dp\"\n" +
            "                android:layout_marginRight=\"5dp\"\n" +
            "                android:layout_marginBottom=\"10dp\"\n" +
            "                android:ems=\"10\"\n" +
            "                android:textSize=\"15sp\"\n" +
            "                android:hint=\"Full Name\"\n" +
            "                android:inputType=\"textPersonName\"\n" +
            "                android:autofillHints=\"\" />\n" +
            "\t\t</LinearLayout>\n" +
            "\t\t<androidx.cardview.widget.CardView\n" +
            "            android:id=\"@+id/updateCard\"\n" +
            "            android:visibility=\"gone\"\n" +
            "            android:layout_width=\"wrap_content\"\n" +
            "            android:layout_height=\"wrap_content\"\n" +
            "            android:layout_gravity=\"center\"\n" +
            "            android:layout_margin=\"20dp\"\n" +
            "            android:foregroundGravity=\"center\"\n" +
            "            app:cardBackgroundColor=\"@android:color/holo_orange_light\"\n" +
            "            app:cardCornerRadius=\"10dp\">\n" +
            "\t\t\t<Button\n" +
            "                android:id=\"@+id/update\"\n" +
            "                android:layout_width=\"wrap_content\"\n" +
            "                android:layout_height=\"wrap_content\"\n" +
            "                android:layout_gravity=\"center\"\n" +
            "                android:paddingLeft=\"10dp\"\n" +
            "                android:textStyle=\"bold\"\n" +
            "                android:paddingRight=\"10dp\"\n" +
            "                android:textSize=\"14sp\"\n" +
            "                android:drawablePadding=\"5dp\"\n" +
            "                android:drawableLeft=\"@drawable/ic_person_add_black_24dp\"\n" +
            "                android:background=\"@android:color/holo_green_light\"\n" +
            "                style=\"@style/Widget.MaterialComponents.Button.TextButton\"\n" +
            "                android:textColor=\"@android:color/black\"\n" +
            "                android:text=\"UPDATE STUDENT\" />\n" +
            "\t\t</androidx.cardview.widget.CardView>\n" +
            "\t\t<androidx.cardview.widget.CardView\n" +
            "            android:id=\"@+id/findCard\"\n" +
            "            android:layout_width=\"wrap_content\"\n" +
            "            android:layout_height=\"wrap_content\"\n" +
            "            android:layout_gravity=\"center\"\n" +
            "            android:layout_margin=\"20dp\"\n" +
            "            android:foregroundGravity=\"center\"\n" +
            "            app:cardBackgroundColor=\"@android:color/holo_orange_light\"\n" +
            "            app:cardCornerRadius=\"10dp\">\n" +
            "\t\t\t<Button\n" +
            "                android:id=\"@+id/find\"\n" +
            "                android:layout_width=\"wrap_content\"\n" +
            "                android:layout_height=\"wrap_content\"\n" +
            "                android:layout_gravity=\"center\"\n" +
            "                android:paddingLeft=\"10dp\"\n" +
            "                android:textStyle=\"bold\"\n" +
            "                android:paddingRight=\"10dp\"\n" +
            "                android:textSize=\"14sp\"\n" +
            "                android:drawablePadding=\"5dp\"\n" +
            "                android:drawableLeft=\"@drawable/ic_find_in_page_black_24dp\"\n" +
            "                android:background=\"@android:color/holo_green_light\"\n" +
            "                style=\"@style/Widget.MaterialComponents.Button.TextButton\"\n" +
            "                android:textColor=\"@android:color/black\"\n" +
            "                android:text=\"FIND STUDENT\" />\n" +
            "\t\t</androidx.cardview.widget.CardView>\n" +
            "\t\t\n" +
            "\t<!--View All Students-->\n" +
            "\t\n" +
            "\t\t<androidx.cardview.widget.CardView\n" +
            "            android:id=\"@+id/getAllCard\"\n" +
            "            android:layout_width=\"wrap_content\"\n" +
            "            android:layout_height=\"wrap_content\"\n" +
            "            android:layout_gravity=\"center\"\n" +
            "            android:layout_margin=\"20dp\"\n" +
            "            android:foregroundGravity=\"center\"\n" +
            "            app:cardBackgroundColor=\"@android:color/holo_blue_dark\"\n" +
            "            app:cardCornerRadius=\"10dp\">\n" +
            "\t\t\t<Button\n" +
            "                android:id=\"@+id/get\"\n" +
            "                android:layout_width=\"wrap_content\"\n" +
            "                android:layout_height=\"wrap_content\"\n" +
            "                android:layout_gravity=\"center\"\n" +
            "                android:paddingLeft=\"10dp\"\n" +
            "                android:textStyle=\"bold\"\n" +
            "                android:paddingRight=\"10dp\"\n" +
            "                android:textSize=\"14sp\"\n" +
            "                android:drawablePadding=\"5dp\"\n" +
            "                android:drawableLeft=\"@drawable/ic_group_black_24dp\"\n" +
            "                android:background=\"@android:color/holo_green_light\"\n" +
            "                style=\"@style/Widget.MaterialComponents.Button.TextButton\"\n" +
            "                android:textColor=\"@android:color/black\"\n" +
            "                android:text=\"GET ALL STUDENTS\" />\n" +
            "\t\t</androidx.cardview.widget.CardView>\n" +
            "\t\t<TextView\n" +
            "            android:id=\"@+id/studentList\"\n" +
            "            android:layout_width=\"match_parent\"\n" +
            "            android:layout_height=\"wrap_content\"\n" +
            "            android:text=\"\"\n" +
            "            android:padding=\"15dp\"\n" +
            "            android:textColor=\"@android:color/black\"\n" +
            "            />\n" +
            "\t</LinearLayout>\n" +
            "</ScrollView>";

    private String sqliteDatabase = "package com.appdevlab.mad;\n" +
            "\n" +
            "import android.content.Context;\n" +
            "import android.database.sqlite.*;\n" +
            "\n" +
            "\n" +
            "public class StudentDatabase extends SQLiteOpenHelper {\n" +
            "    // Database Info\n" +
            "    public static final String DATABASE_NAME = \"studentDB\";\n" +
            "    public static final int DATABASE_VERSION = 1;\n" +
            "\n" +
            "    // Table Names\n" +
            "    public static final String TABLE_STUDENT = \"student\";\n" +
            "\n" +
            "    // Student Table Columns\n" +
            "    public static final String KEY_STUDENT_ROLL = \"roll\";\n" +
            "    public static final String KEY_STUDENT_NAME = \"name\";\n" +
            "\n" +
            "    public StudentDatabase(Context context) {\n" +
            "        super(context, DATABASE_NAME, null, DATABASE_VERSION);\n" +
            "    }\n" +
            "\n" +
            "    @Override\n" +
            "    public void onConfigure(SQLiteDatabase db) {\n" +
            "        super.onConfigure(db);\n" +
            "        db.setForeignKeyConstraintsEnabled(true);\n" +
            "    }\n" +
            "\n" +
            "    @Override\n" +
            "    public void onCreate(SQLiteDatabase db) {\n" +
            "\n" +
            "        String CREATE_STUDENT_TABLE = \"CREATE TABLE \" + TABLE_STUDENT +\n" +
            "                \"(\" +\n" +
            "                KEY_STUDENT_ROLL + \" TEXT PRIMARY KEY,\" + // Define a primary key\n" +
            "                KEY_STUDENT_NAME + \" TEXT\" +\n" +
            "                \")\";\n" +
            "\n" +
            "        db.execSQL(CREATE_STUDENT_TABLE);\n" +
            "    }\n" +
            "\n" +
            "    @Override\n" +
            "    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {\n" +
            "        if (oldVersion != newVersion) {\n" +
            "            db.execSQL(\"DROP TABLE IF EXISTS \" + TABLE_STUDENT);\n" +
            "            onCreate(db);\n" +
            "        }\n" +
            "    }\n" +
            "\n" +
            "}";

    private String sqliteDbManager = "package com.appdevlab.mad;\n" +
            "\n" +
            "import android.content.ContentValues;\n" +
            "import android.content.Context;\n" +
            "import android.database.Cursor;\n" +
            "import android.database.SQLException;\n" +
            "import android.database.sqlite.SQLiteDatabase;\n" +
            "import android.util.Log;\n" +
            "\n" +
            "import com.appdevlab.mad.model.Student;\n" +
            "\n" +
            "import java.util.ArrayList;\n" +
            "import java.util.List;\n" +
            "\n" +
            "import static com.appdevlab.mad.StudentDatabase.KEY_STUDENT_NAME;\n" +
            "import static com.appdevlab.mad.StudentDatabase.KEY_STUDENT_ROLL;\n" +
            "import static com.appdevlab.mad.StudentDatabase.TABLE_STUDENT;\n" +
            "\n" +
            "\n" +
            "public class DatabaseManager {\n" +
            "    private StudentDatabase dbHelper;\n" +
            "    private Context context;\n" +
            "\n" +
            "    private SQLiteDatabase database;\n" +
            "\n" +
            "    public DatabaseManager(Context c) {\n" +
            "        this.context = c;\n" +
            "    }\n" +
            "\n" +
            "    public DatabaseManager open() throws SQLException {\n" +
            "        dbHelper = new StudentDatabase(context);\n" +
            "        database = dbHelper.getWritableDatabase();\n" +
            "        return this;\n" +
            "    }\n" +
            "\n" +
            "\n" +
            "    public boolean addStudent(Student student) {\n" +
            "        database.beginTransaction();\n" +
            "        try {\n" +
            "            ContentValues values = new ContentValues();\n" +
            "            values.put(KEY_STUDENT_ROLL, student.roll);\n" +
            "            values.put(KEY_STUDENT_NAME, student.name);\n" +
            "\n" +
            "            database.insertOrThrow(TABLE_STUDENT, null, values);\n" +
            "            database.setTransactionSuccessful();\n" +
            "        } catch (Exception e) {\n" +
            "            Log.d(\"MY_LOG_MESSAGE\", \"Error while trying to add student to database\");\n" +
            "            return false;\n" +
            "        } finally {\n" +
            "            database.endTransaction();\n" +
            "        }\n" +
            "        return true;\n" +
            "    }\n" +
            "\n" +
            "    public Student getStudent(String roll) {\n" +
            "        Student student = new Student();\n" +
            "        String GET_TEAM =\n" +
            "                String.format(\"SELECT * FROM %s WHERE %s=%s\",\n" +
            "                        TABLE_STUDENT,KEY_STUDENT_ROLL,roll);\n" +
            "\n" +
            "        Cursor cursor = database.rawQuery(GET_TEAM, null);\n" +
            "        try {\n" +
            "            if (cursor.moveToFirst()) {\n" +
            "                student.roll = cursor.getString(cursor.getColumnIndex(KEY_STUDENT_ROLL));\n" +
            "                student.name = cursor.getString(cursor.getColumnIndex(KEY_STUDENT_NAME));\n" +
            "                return  student;\n" +
            "            }\n" +
            "        } catch (Exception e) {\n" +
            "            Log.d(\"MY_LOG_MESSAGE\", \"Error while trying to get student from database\");\n" +
            "        } finally {\n" +
            "            if (cursor != null && !cursor.isClosed()) {\n" +
            "                cursor.close();\n" +
            "            }\n" +
            "        }\n" +
            "        return null;\n" +
            "    }\n" +
            "\n" +
            "    public List<Student> getAllStudents() {\n" +
            "        List<Student> students = new ArrayList<>();\n" +
            "\n" +
            "        String GET_ALL_STUDENTS =\n" +
            "                String.format(\"SELECT * FROM %s\",\n" +
            "                        TABLE_STUDENT);\n" +
            "\n" +
            "\n" +
            "        Cursor cursor = database.rawQuery(GET_ALL_STUDENTS, null);\n" +
            "        try {\n" +
            "            if (cursor.moveToFirst()) {\n" +
            "                do {\n" +
            "                    Student student = new Student();\n" +
            "                    student.roll = cursor.getString(cursor.getColumnIndex(KEY_STUDENT_ROLL));\n" +
            "                    student.name = cursor.getString(cursor.getColumnIndex(KEY_STUDENT_NAME));\n" +
            "                    students.add(student);\n" +
            "                } while(cursor.moveToNext());\n" +
            "            }\n" +
            "        } catch (Exception e) {\n" +
            "            Log.d(\"MY_LOG_MESSAGE\", \"Error while trying to get student from database\");\n" +
            "        } finally {\n" +
            "            if (cursor != null && !cursor.isClosed()) {\n" +
            "                cursor.close();\n" +
            "            }\n" +
            "        }\n" +
            "        return students;\n" +
            "    }\n" +
            "\n" +
            "    public boolean updateStudent(Student student) {\n" +
            "        database.beginTransaction();\n" +
            "        try {\n" +
            "            ContentValues values = new ContentValues();\n" +
            "            values.put(KEY_STUDENT_ROLL, student.roll);\n" +
            "            values.put(KEY_STUDENT_NAME, student.name);\n" +
            "\n" +
            "            database.update(TABLE_STUDENT, values,\"roll = ?\", new String[]{student.roll});\n" +
            "            database.setTransactionSuccessful();\n" +
            "        } catch (Exception e) {\n" +
            "            Log.d(\"MY_LOG_MESSAGE\", \"Error while trying to update student to database\");\n" +
            "            return false;\n" +
            "        } finally {\n" +
            "            database.endTransaction();\n" +
            "        }\n" +
            "        return true;\n" +
            "    }\n" +
            "}";

    private String sqliteStudent = "package com.appdevlab.mad.model;\n" +
            "\n" +
            "public class Student {\n" +
            "    public String roll;\n" +
            "    public String name;\n" +
            "\n" +
            "    public  Student() {\n" +
            "    }\n" +
            "\n" +
            "    public Student(String roll, String name) {\n" +
            "        this.roll = roll;\n" +
            "        this.name = name;\n" +
            "    }\n" +
            "}";


    private String sqliteJavaLocation = "java/MainActivity.java";
    private String sqliteXmlLocation = "res/layout/activity_main.xml";
    private String sqliteDatabaseLocation = "java/StudentDatabase.java";
    private String sqliteDbManagerLocation = "java/DatabaseManager.java";
    private String sqliteStudentLocation = "java/model/Student.java";

    public String getSqliteJava() {
        return sqliteJava;
    }

    public String getSqliteXml() {
        return sqliteXml;
    }

    public String getSqliteDatabase() {
        return sqliteDatabase;
    }

    public String getSqliteDbManager() {
        return sqliteDbManager;
    }

    public String getSqliteStudent() {
        return sqliteStudent;
    }

    public String getSqliteJavaLocation() {
        return sqliteJavaLocation;
    }

    public String getSqliteXmlLocation() {
        return sqliteXmlLocation;
    }

    public String getSqliteDatabaseLocation() {
        return sqliteDatabaseLocation;
    }

    public String getSqliteDbManagerLocation() {
        return sqliteDbManagerLocation;
    }

    public String getSqliteStudentLocation() {
        return sqliteStudentLocation;
    }


    public String getMaterialXml() {
        return materialXml;
    }

    public String getMaterialJava() {
        return materialJava;
    }

    public String getMaterialJavaLocation() {
        return materialJavaLocation;
    }

    public String getMaterialXmlLocation() {
        return materialXmlLocation;
    }

    public String getMenuXml() {
        return menuXml;
    }

    public String getMenuJava() {
        return menuJava;
    }

    public String getMenuXml2() {
        return menuXml2;
    }

    public String getMenuJavaLocation() {
        return menuJavaLocation;
    }

    public String getMenuXmlLocation() {
        return menuXmlLocation;
    }

    public String getMenuXml2Location() {
        return menuXml2Location;
    }

    public String getTextXml() {
        return textXml;
    }

    public String getTextJava() {
        return textJava;
    }

    public String getTextJavaLocation() {
        return textJavaLocation;
    }

    public String getTextXmlLocation() {
        return textXmlLocation;
    }


    public String getSeekXml() {
        return seekXml;
    }

    public String getSeekJava() {
        return seekJava;
    }

    public String getSeekJavaLocation() {
        return seekJavaLocation;
    }

    public String getSeekXmlLocation() {
        return seekXmlLocation;
    }

    public String getButtonXml() {
        return buttonXml;
    }

    public String getButtonJava() {
        return buttonJava;
    }

    public String getButtonJavaLocation() {
        return buttonJavaLocation;
    }

    public String getButtonXmlLocation() {
        return buttonXmlLocation;
    }

    public String getPickerXml() {
        return pickerXml;
    }

    public String getPickerJava() {
        return pickerJava;
    }

    public String getPickerJavaLocation() {
        return pickerJavaLocation;
    }

    public String getPickerXmlLocation() {
        return pickerXmlLocation;
    }

    public String getSpinnerXml() {
        return spinnerXml;
    }

    public String getSpinnerJava() {
        return spinnerJava;
    }

    public String getSpinnerJavaLocation() {
        return spinnerJavaLocation;
    }

    public String getSpinnerXmlLocation() {
        return spinnerXmlLocation;
    }
}
