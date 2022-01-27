package com.example.labproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class memo extends AppCompatActivity {

    Spinner DepartmentSpinner, SectionSpinner;
    EditText nameEditText, secText, dText, cgText, idText;
    Button bt;
    TextView SecView, nameView, searchID, cgView,dtView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_memo);
        DepartmentSpinner = findViewById(R.id.spinnerDepartment);
        SectionSpinner = findViewById(R.id.spinnerSec);
        nameEditText = findViewById(R.id.editTextName);
        idText = findViewById(R.id.editTextID);
        bt = findViewById(R.id.btn);
        cgText = findViewById(R.id.editTextcg);


        SecView = findViewById(R.id.SecView);
        cgView = findViewById(R.id.cgView);
        nameView = findViewById(R.id.NameView);
        dtView = findViewById(R.id.DView);
        searchID = findViewById(R.id.idSrch);

        ArrayAdapter<CharSequence> departmentAdapter = ArrayAdapter.createFromResource(this, R.array.department, android.R.layout.simple_spinner_item);
        departmentAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        DepartmentSpinner.setAdapter(departmentAdapter);

        ArrayAdapter<CharSequence> sectionAdapter = ArrayAdapter.createFromResource(this, R.array.section, android.R.layout.simple_spinner_item);
        sectionAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        SectionSpinner.setAdapter(sectionAdapter);



    }

    public void saveBtn(View view) {

        String n = nameEditText.getText().toString();
        String i = idText.getText().toString();
        String s = SectionSpinner.getSelectedItem().toString();
        String d =DepartmentSpinner.getSelectedItem().toString();
        String cg = cgText.getText().toString();
        insertion data = new insertion(n, s, d, cg);


        // Write a message to the database
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("students");
        myRef.child(i).setValue(data);
        Toast.makeText(this, "Data saved Successfully", Toast.LENGTH_SHORT).show();

        idText.setText("");
        nameEditText.setText("");
        cgText.setText("");



    }

    public void showData(View view) {
        String searchData = searchID.getText().toString();
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("students").child(searchData);
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                String n, cg, d, s;
                n = snapshot.child("name").getValue().toString();
                d = snapshot.child("department").getValue().toString();
                s = snapshot.child("section").getValue().toString();
                cg = snapshot.child("cgpa").getValue().toString();

                nameView.setText("Name: " + n);
                dtView.setText("Department: " + d);
                SecView.setText("Section: " + s);
                cgView.setText("CGPA: " + cg);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }
}