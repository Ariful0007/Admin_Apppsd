package com.example.admin_apppsd;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.firestore.FirebaseFirestore;

public class MainActivity extends AppCompatActivity {
    EditText name, age, job, village, post, game, email, pass, pass_1;
    Button okey;
    FirebaseFirestore firebaseFirestore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = findViewById(R.id.name);
        age = findViewById(R.id.age);
        job = findViewById(R.id.job);
        village = findViewById(R.id.village);
        post = findViewById(R.id.post);
        game = findViewById(R.id.game);
        email = findViewById(R.id.email);
        pass = findViewById(R.id.pass);
        pass_1 = findViewById(R.id.pass_1);
        okey = findViewById(R.id.submit);
        firebaseFirestore = FirebaseFirestore.getInstance();
        okey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(name.getText().toString()) || TextUtils.isEmpty(age.getText().toString())
                        || TextUtils.isEmpty(job.getText().toString()) || TextUtils.isEmpty(village.getText().toString())
                        || TextUtils.isEmpty(post.getText().toString()) || TextUtils.isEmpty(game.getText().toString())
                        || TextUtils.isEmpty(email.getText().toString()) || TextUtils.isEmpty(pass.getText().toString())
                        || TextUtils.isEmpty(pass_1.getText().toString())) {
                    Toast.makeText(MainActivity.this, "Error", Toast.LENGTH_SHORT).show();
                    return;
                } else {
                    data_insert data_insert = new data_insert()
                }


            }
        });
    }
}