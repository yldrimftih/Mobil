package com.example.seekbarornegi;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {
    View background;
    SeekBar seekBar,seekBar2,seekBar3;
    int redV,greenV,blueV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        background=findViewById(R.id.background);
        seekBar=findViewById(R.id.seekBar);
        seekBar2=findViewById(R.id.seekBar2);
        seekBar3=findViewById(R.id.seekBar3);
        redV=seekBar.getProgress();
        greenV=seekBar2.getProgress();
        blueV=seekBar3.getProgress();

        seekBar.setMax(255);
        seekBar2.setMax(255);
        seekBar3.setMax(255);

        background.setBackgroundColor(Color.rgb(redV,greenV,blueV));
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                redV=progress;
                background.setBackgroundColor(Color.rgb(redV,greenV,blueV));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        seekBar2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                greenV=progress;
                background.setBackgroundColor(Color.rgb(redV,greenV,blueV));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        seekBar3.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                blueV=progress;
                background.setBackgroundColor(Color.rgb(redV,greenV,blueV));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}
