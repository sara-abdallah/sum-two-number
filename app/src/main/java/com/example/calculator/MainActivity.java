package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText fnum = findViewById(R.id.calc_main_et_fnum);
        final EditText snum = findViewById(R.id.calc_main_et_snum);
        final Button sum = findViewById(R.id.calc_main_b_sum);
        final TextView result = findViewById(R.id.clac_main_tv_result);

        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double first = Double.parseDouble(fnum.getText().toString());
                double second = Double.parseDouble(snum.getText().toString());
                result.setText(String.valueOf(first+second));
            }
        });
    }
}