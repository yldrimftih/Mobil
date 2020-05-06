package com.example.switchornegi;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Switch aSwitch;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        aSwitch = findViewById(R.id.switch1);
        textView=findViewById(R.id.textView);
        aSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                {
                    textView.setText("Switch açık konuma getirildi.");
                }
                else
                {
                    textView.setText("Switch kapalı konuma getirildi");
                }
            }
        });
    }
}
