package com.example.radiobuttonornegi;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
     RadioGroup Rg;
     RadioButton radioButton1;
     RadioButton radioButton2;
     RadioButton radioButton3;
     Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Rg=findViewById(R.id.radioGroup);
        radioButton1=findViewById(R.id.radioButton);
        radioButton2=findViewById(R.id.radioButton2);
        radioButton3=findViewById(R.id.radioButton3);
        button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedid = Rg.getCheckedRadioButtonId();
                radioButton1=findViewById(selectedid);
                Toast.makeText(MainActivity.this,radioButton1.getText(),Toast.LENGTH_SHORT).show();
                radioButton2=findViewById(selectedid);
                Toast.makeText(MainActivity.this,radioButton2.getText(),Toast.LENGTH_SHORT).show();
                radioButton3=findViewById(selectedid);
                Toast.makeText(MainActivity.this,radioButton3.getText(),Toast.LENGTH_SHORT).show();
            }
        });
    }
}
