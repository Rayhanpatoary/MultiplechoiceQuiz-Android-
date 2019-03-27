package com.example.rayhanpatoary.multiplequiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button starting_button = (Button)findViewById(R.id.button1);
        starting_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                start_question_activity();
            }
        });
    }

    private void start_question_activity() {
        Intent intent = new Intent(MainActivity.this,Questions.class);
        startActivity(intent);
    }
}
