package com.example.testbooks;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView textQuestion;
    Button btnGetQuestion;

    Patterns patterns = new Patterns();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textQuestion = (TextView) findViewById(R.id.text_question);
        btnGetQuestion = (Button) findViewById(R.id.btn_question);


        btnGetQuestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random random = new Random();
                textQuestion.setText(patterns.getQuestionPattern[random.nextInt(patterns.getQuestionPattern.length)]);
            }
        });

    }
}