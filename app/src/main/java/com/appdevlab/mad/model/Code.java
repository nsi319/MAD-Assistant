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
}
