package com.example.toggleornegi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    ToggleButton toggleButton,toggleButton2;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toggleButtontikla();
    }
    public void toggleButtontikla()
    {
        toggleButton=findViewById(R.id.toggleButton);
        toggleButton2=findViewById(R.id.toggleButton2);
        button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder result = new StringBuilder();
                result.append("Toggle Buton 1: ").append(toggleButton.getText());
                result.append("\nToggle Buton 2: ").append(toggleButton2.getText());
                Toast.makeText(getApplicationContext(),result.toString(),Toast.LENGTH_SHORT).show();
            }
        });
    }
}
