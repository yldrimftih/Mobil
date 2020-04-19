package com.example.ikinciornek;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Bu bir acil durum mesajıdır.", Toast.LENGTH_LONG).show();
            }
        });

        Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView kedicik = new ImageView(getApplicationContext());// getApplicationContext() yerine MainActivity.this yazsak da olur.
                kedicik.setImageResource(R.drawable.kedi);
                Toast toast = new Toast(getApplicationContext());
                toast.setView(kedicik);
                toast.setDuration(Toast.LENGTH_LONG);
                toast.show();
            }
        });

        Button button4 = findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView textView = new TextView(getApplicationContext());
                textView.setText("Bu bir dramdır..");
                textView.setBackgroundColor(Color.parseColor("#009688"));
                textView.setTextColor(Color.WHITE);
                textView.setPadding(30,10,10,10);
                Toast toast = new Toast(getApplicationContext());
                toast.setView(textView);
                
                toast.setDuration(Toast.LENGTH_LONG);
                toast.show();
            }
        });

    }
}
