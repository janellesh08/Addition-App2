package com.example.additionapp2;

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

        Button AddBtn = (Button) findViewById(R.id.AddBtn);
        AddBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText FirstNumET = (EditText) findViewById(R.id.FirstNumET);
                EditText SecondNumET = (EditText) findViewById(R.id.SecondNumET);
                TextView RestultsTV = (TextView) findViewById(R.id.ResultsTV+
                        );

                int num1 = Integer.parseInt(FirstNumET.getText().toString());
                int num2 = Integer.parseInt(SecondNumET.getText().toString());
                int result = num1 + num2;
                RestultsTV.setText(result + "");

            }
        });
    }
}
