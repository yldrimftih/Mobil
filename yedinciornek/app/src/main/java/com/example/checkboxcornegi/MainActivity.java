package com.example.checkboxcornegi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox checkBox7;
    CheckBox checkBox8;
    CheckBox checkBox9;
    CheckBox checkBox10;
    CheckBox checkBox11;
    CheckBox checkBox12;
    Button button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        checkBox7 = findViewById(R.id.checkBox7);
        checkBox8=findViewById(R.id.checkBox8);
        checkBox9=findViewById(R.id.checkBox9);
        checkBox10=findViewById(R.id.checkBox10);
        checkBox11=findViewById(R.id.checkBox11);
        checkBox12=findViewById(R.id.checkBox12);
        // checkboxlar için listener özelliği
        checkBox7.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(checkBox7.isChecked())
                    Toast.makeText(getApplicationContext(),buttonView.getText(),Toast.LENGTH_SHORT).show();
            }
        });
        checkBox8.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(checkBox8.isChecked())
                    Toast.makeText(getApplicationContext(),buttonView.getText(),Toast.LENGTH_SHORT).show();
            }
        });
        checkBox9.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (checkBox9.isChecked())
                    Toast.makeText(getApplicationContext(),buttonView.getText(),Toast.LENGTH_SHORT).show();
            }
        });
        checkBox10.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (checkBox10.isChecked())
                    Toast.makeText(getApplicationContext(),buttonView.getText(),Toast.LENGTH_SHORT).show();
            }
        });
        checkBox11.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (checkBox11.isChecked())
                    Toast.makeText(getApplicationContext(),buttonView.getText(),Toast.LENGTH_SHORT).show();
            }
        });
        checkBox12.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (checkBox12.isChecked())
                    Toast.makeText(getApplicationContext(),buttonView.getText(),Toast.LENGTH_SHORT).show();
            }
        });
        button2 =(Button)findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String cevaplar = "Cevaplar: ";
                if (checkBox7.isChecked())
                    cevaplar+=" "+checkBox7.getText();
                if (checkBox8.isChecked())
                    cevaplar+=" "+checkBox8.getText();
                if (checkBox9.isChecked())
                    cevaplar+=" "+checkBox9.getText();
                if (checkBox10.isChecked())
                    cevaplar+=" "+checkBox10.getText();
                if (checkBox11.isChecked())
                    cevaplar+=" "+checkBox11.getText();
                if (checkBox12.isChecked())
                    cevaplar+=" "+checkBox12.getText();
                Toast.makeText(getApplicationContext(),cevaplar,Toast.LENGTH_SHORT).show();
            }
        });
    }
}
