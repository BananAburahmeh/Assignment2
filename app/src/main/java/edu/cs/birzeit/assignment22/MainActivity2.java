package edu.cs.birzeit.assignment22;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.EditText;


public class MainActivity2 extends AppCompatActivity {
    private EditText edtWork;
    private EditText edtEdu;
    private SharedPreferences prefs;
    private SharedPreferences.Editor editor;
    public static final String Edu= "Education";
    public static final String Work = "Work";
    String EduStr,WorkStr;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        setupViews();
        setupSharedPrefs();
        loadPrefs();
    }



    public void btnSaveOnClick(View v) {
        EduStr = edtWork.getText().toString();
        WorkStr = edtWork.getText().toString();

        editor.putString(Edu, EduStr);
        editor.putString(Work, WorkStr);
        editor.commit();
    }


    private  void setupViews(){
        edtWork = findViewById(R.id.edtWork);
        edtEdu = findViewById(R.id.edtEdu);

    }

    private  void setupSharedPrefs(){
        prefs = PreferenceManager.getDefaultSharedPreferences(this );
        editor = prefs.edit();
    }

    private void loadPrefs(){
        EduStr = prefs.getString(Edu, "");
        WorkStr = prefs.getString(Work, "");

        edtEdu.setText(EduStr);
        edtWork.setText(WorkStr);


    }
}