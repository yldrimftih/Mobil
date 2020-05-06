package com.example.altinciornek;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    TextView textView;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tanimla ();
        tikla ();
    }
    private void tanimla (){
        editText = findViewById(R.id.editText);
        button =findViewById(R.id.button);
        textView=findViewById(R.id.textView2);

    }
    private void tikla (){
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String deger = editText.getText().toString();
                int fakHesaplanacaksayi = Integer.parseInt(deger);
                int faktoriyel = hesapla(fakHesaplanacaksayi);
                textView.setText("Sonuc =  "+faktoriyel);
            }
        });
    }
    private int hesapla (int sayi){
        int sonuc=1;
        int g=1;
        for (int i =sayi;i>1;i--){
            sonuc=sonuc*i;
        }

        return sonuc ;
    }
}
