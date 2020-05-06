package com.example.alertdialogornegi;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button button;
    final Context context = this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
                alertDialogBuilder.setTitle("AlertDialog Örneği"); // Çıkan alertdialog için başlık
                // AlertDialog özellikleri oluşturuluyor.                                                                          Evet butonuna basılınca yapılacak işlem tanımlanıyor.
                alertDialogBuilder.setMessage("Çıkmak istiyor musunuz ?").setCancelable(false).setIcon(R.mipmap.ic_launcher_round).setPositiveButton("Evet", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                    //İptal butonuna basılınca ne yapılacağı tanımlanıyor.
                }).setNegativeButton("İptal", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
                //Alert Dialog nesnesi oluşturuluyor.
                AlertDialog alertDialog = alertDialogBuilder.create();
                // alerti gösteriyoruz.
                alertDialog.show();
            }
        });
    }
}
