package com.example.s;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.s.R;

public class MainActivity extends AppCompatActivity {

    private EditText inputTemperature;
    private Button buttonCtoF, buttonFtoC;
    private TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize UI components
        inputTemperature = findViewById(R.id.inputTemperature);
        buttonCtoF = findViewById(R.id.buttonCtoF);
        buttonFtoC = findViewById(R.id.buttonFtoC);
        resultText = findViewById(R.id.resultText);

        // Convert Celsius to Fahrenheit
        buttonCtoF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input = inputTemperature.getText().toString();
                if (!input.isEmpty()) {
                    double celsius = Double.parseDouble(input);
                    double fahrenheit = (celsius * 9/5) + 32;
                    resultText.setText("Result: " + fahrenheit + " °F");
                } else {
                    Toast.makeText(MainActivity.this, "Please enter a temperature", Toast.LENGTH_SHORT).show();
                }
            }
        });

        // Convert Fahrenheit to Celsius
        buttonFtoC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input = inputTemperature.getText().toString();
                if (!input.isEmpty()) {
                    double fahrenheit = Double.parseDouble(input);
                    double celsius = (fahrenheit - 32) * 5/9;
                    resultText.setText("Result: " + celsius + " °C");
                } else {
                    Toast.makeText(MainActivity.this, "Please enter a temperature", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
