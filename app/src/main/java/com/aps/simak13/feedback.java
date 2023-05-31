package com.aps.simak13;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class feedback extends AppCompatActivity {
    EditText name, feedback;
    private FirebaseDatabase mDatabase;
    private DatabaseReference mReference;
    ImageButton addFeedback;
    String feedbackname, feedbackComment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);
        mDatabase = FirebaseDatabase.getInstance();
        mReference = mDatabase.getReference("Feedback");
        name = (EditText) findViewById(R.id.feedbackName);
        feedback = (EditText) findViewById(R.id.feedbackComment);
        addFeedback = (ImageButton) findViewById(R.id.addFeeback);

        addFeedback.setOnClickListener(v -> {
            feedbackname = name.getText().toString();
            feedbackComment = feedback.getText().toString();
            mReference.child(feedbackname).setValue(new feedbackDb(feedbackComment, feedbackname));
            Toast.makeText(this,"Feedback Successfully Added",Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, profile.class);
            startActivity(intent);

        });
    }

}