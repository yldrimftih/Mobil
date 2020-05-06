package com.example.toastmessageornegi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageView imageView ;
    Button button;
    int i=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tanimla();
        islemver();

    }
    public void tanimla()
    {
        imageView = findViewById(R.id.imageView);
        button=findViewById(R.id.button);
    }
    public void islemver()
    {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int rnd = (int)Math.random()+(i++);
                degistir(rnd);
                Toast.makeText(getApplicationContext(),String.valueOf(rnd)+" numaralı resim seçildi.",Toast.LENGTH_SHORT).show();
            }

            private void degistir(int rnd) {
                if(i==4) {
                    i=1;
                }
                if(rnd ==1){
                    imageView.setImageResource(R.mipmap.circuit);
                }
                if(rnd ==2)
                {
                    imageView.setImageResource(R.mipmap.kedi);
                }
                if (rnd==3)
                {
                    imageView.setImageResource(R.mipmap.ucak);
                }
            }
        });
    }
}
