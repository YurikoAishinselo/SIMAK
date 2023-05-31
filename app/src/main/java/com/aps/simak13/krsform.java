package com.aps.simak13;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class krsform extends AppCompatActivity {
    private FirebaseDatabase mDatabase;
    private DatabaseReference mReference;
    EditText NIM, name, prodi, matkul, semester;
    ImageButton addKRS;
    String NIMdb, namedb, prodidb, matkuldb, semesterdb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_krsform);
        mDatabase = FirebaseDatabase.getInstance();
        mReference = mDatabase.getReference("KRS");
        NIM = (EditText) findViewById(R.id.NIMKRS);
        name = (EditText) findViewById(R.id.usernameKRS);
        prodi = (EditText) findViewById(R.id.prodiKRS);
        matkul = (EditText) findViewById(R.id.mataKuliahKRS);
        semester = (EditText) findViewById(R.id.semesterKRS);
        addKRS = (ImageButton) findViewById(R.id.addFeeback);

        addKRS.setOnClickListener(v -> {
            NIMdb = NIM.getText().toString();
            namedb = name.getText().toString();
            prodidb = prodi.getText().toString();
            matkuldb = matkul.getText().toString();
            semesterdb = semester.getText().toString();
            mReference.child(NIMdb).setValue(new krsDb(NIMdb, namedb, prodidb, matkuldb, semesterdb));
            Toast.makeText(this,"KRS Successfully Inserted",Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, academic.class);
            startActivity(intent);
        });
    }

}