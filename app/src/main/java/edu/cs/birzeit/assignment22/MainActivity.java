package edu.cs.birzeit.assignment22;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    private Spinner spinner;
    private EditText edtName;
    private EditText edtEmail;
    private EditText edtAdd;
    private EditText edtPhone;
    private EditText edtAge;
    private EditText edtHobbies;
    private RadioGroup rdg;
    private Button save;
    private Button next;
    private SharedPreferences prefs;
    private SharedPreferences.Editor editor;
    public static final String Name = "Name";
    public static final String Email= "Email";
    public static final String Address = "Address";
    public static final String Gender = "Gender";
    public static final String Phone = "Phone";
    public static final String Age = "Age";
    public static final String Language = "Language";
    public static final String Hobbies = "Hobbies" ;
    String nameStr,emailStr,addressStr,genderStr,phoneStr,ageStr,languagesStr,hobbiesStr;



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupViews();
        setupSharedPrefs();
        loadPrefs();
    }
                public void btnSaveOnClick(View v) {
                    nameStr = edtName.getText().toString();
                    emailStr = edtEmail.getText().toString();
                    addressStr = edtAdd.getText().toString();
//                    genderStr = rdg
                    phoneStr = edtPhone.getText().toString();
                    ageStr = edtAge.getText().toString();
                    languagesStr = spinner.getSelectedItem().toString();
                    hobbiesStr = edtHobbies.getText().toString();

                    editor.putString(Name, nameStr);
                    editor.putString(Email, emailStr);
                    editor.putString(Address,addressStr);
                    editor.putString(Gender,genderStr);
                    editor.putString(Phone,phoneStr);
                    editor.putString(Age,ageStr);
                    editor.putString(Language,languagesStr);
                    editor.putString(Hobbies,hobbiesStr);
                    editor.commit();
                }

            public void btnNextOnClick(View view) {
                Intent intent = new Intent(MainActivity.this , MainActivity2.class);
                startActivity(intent);
            }

    private  void setupViews(){
        edtName = findViewById(R.id.edtName);
        edtEmail = findViewById(R.id.edtEmail);
        edtAdd = findViewById(R.id.edtAdd);
        edtPhone = findViewById(R.id.edtPhone);
        edtAge = findViewById(R.id.edtAge);
        edtHobbies = findViewById(R.id.edtHobbies);
        RadioGroup rdg = (RadioGroup) findViewById(R.id.rdg);
        spinner = (Spinner) findViewById(R.id.edtSpin);
        PopulateSpinner();
        save = findViewById(R.id.btnSave);
        next = findViewById(R.id.btnNext);
    }
    private  void setupSharedPrefs(){
        prefs = PreferenceManager.getDefaultSharedPreferences(this );
        editor = prefs.edit();
    }
    private void loadPrefs(){
        nameStr = prefs.getString(Name, "");
        emailStr = prefs.getString(Email, "");
        addressStr = prefs.getString(Address,"");
        genderStr = prefs.getString(Gender,"");
        phoneStr = prefs.getString(Phone, "");
        ageStr = prefs.getString(Age, "");
        languagesStr = prefs.getString(Language,"");
        hobbiesStr = prefs.getString(Language,"");

        edtName.setText(nameStr);
        edtEmail.setText(emailStr);
        edtAdd.setText(addressStr);
        edtPhone.setText(phoneStr);
        edtAge.setText(ageStr);
        spinner.setSelected(Boolean.parseBoolean(languagesStr));
        edtHobbies.setText(hobbiesStr);


    }
    private void PopulateSpinner() {
        ArrayList<String> data = new ArrayList<>();
        data.add("English");
        data.add("Arabic");
        data.add("Spanish");
        data.add("French");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, data  );
        spinner.setAdapter(adapter);
    }
}