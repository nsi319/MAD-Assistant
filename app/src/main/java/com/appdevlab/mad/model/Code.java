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
            "</LinearLayout>";

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
