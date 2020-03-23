package com.agilsantosa.mynavigation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ResultIntentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_intent);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        TextView tvresult = findViewById(R.id.tv_result);

        String result = getIntent().getStringExtra(MainActivity.MESSAGE);
        tvresult.setText(result);
    }
}
