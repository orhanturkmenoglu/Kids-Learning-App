package com.example.kidslearning;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    private LinearLayout lnrNumbers, lnrColors, lnrAnimals, lnrVehicles, lnrFruits, lnrInstruments, lnrItems, lnrMix;
    int kategori = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findView();

    }





    @Override
    public void onBackPressed() {

        final AlertDialog.Builder ao = new AlertDialog.Builder(MainActivity.this);
        ao.setCancelable(true);
        ao.setIcon(R.drawable.info);
        ao.setTitle("EXIT");
        ao.setMessage("Do you Want to exit");
        ao.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();
            }
        });
        ao.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        AlertDialog alert = ao.create();
        alert.show();

    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.lnrNumbers:
                kategori = Constant.NUMBERS;
                break;
            case R.id.lnrColors:
                kategori = Constant.COLORS;
                break;
            case R.id.lnrAnimals:
                kategori = Constant.ANIMALS;
                break;
            case R.id.lnrVehicles:
                kategori = Constant.VEHICLES;
                break;
            case R.id.lnrFruitds:
                kategori = Constant.FRUITS;
                break;
            case R.id.lnrInstruments:
                kategori = Constant.INSTRUMENTS;
                break;
            case R.id.lnrItems:
                kategori = Constant.ITEMS;
                break;
            case R.id.lnrMix:
                kategori = Constant.MIX;
                break;
            default:
                kategori = Constant.NUMBERS;
                break;
        }
        startNextActivity();


    }

    private void startNextActivity() {
        Intent intent = new Intent(MainActivity.this, Tasarim.class);
        intent.putExtra("kategori", kategori);
        startActivity(intent);
    }


    private void findView() {
        lnrNumbers = findViewById(R.id.lnrNumbers);
        lnrColors = findViewById(R.id.lnrColors);
        lnrAnimals = findViewById(R.id.lnrAnimals);
        lnrVehicles = findViewById(R.id.lnrVehicles);
        lnrFruits = findViewById(R.id.lnrFruitds);
        lnrInstruments = findViewById(R.id.lnrInstruments);
        lnrItems = findViewById(R.id.lnrItems);
        lnrMix = findViewById(R.id.lnrMix);

    }


}