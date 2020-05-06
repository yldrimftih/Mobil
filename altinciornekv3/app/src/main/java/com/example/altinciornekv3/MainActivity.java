package com.example.altinciornekv3;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.ArrayAdapter;

public class MainActivity extends AppCompatActivity {
   private String[] ulcer = {"Türkiye","Almanya","Amerika","İsveç"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView lister = (ListView)findViewById(R.id.listView1);
        ArrayAdapter <String> adp = new ArrayAdapter <String> (this,android.R.layout.simple_list_item_1,android.R.id.text1, ulcer);
        lister.setAdapter(adp);
        lister.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                AlertDialog.Builder dialogOldster=
                        new AlertDialog.Builder(MainActivity.this);
                dialogOldster.setMessage(ulcer[position]).setCancelable(false).setPositiveButton("Tamam", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
                dialogOldster.show();
                }
            });
        };
    }



