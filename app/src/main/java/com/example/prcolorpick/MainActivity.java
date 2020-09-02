package com.example.prcolorpick;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button bbtn1,bbtn2,bbtn3,bbtn4,bbtn5,bbtn6,bbtn7,bbtn8,bbtn9,bbtn10,bbtn11,bbtn12,bbtn13,bbtn14,bbtn15;
    Button gbtn1,gbtn2,gbtn3,gbtn4,gbtn5,gbtn6,gbtn7,gbtn8,gbtn9,gbtn10,gbtn11,gbtn12,gbtn13,gbtn14,gbtn15;
    Button rbtn1,rbtn2,rbtn3,rbtn4,rbtn5,rbtn6,rbtn7,rbtn8,rbtn9,rbtn10,rbtn11,rbtn12,rbtn13,rbtn14,rbtn15;
    Button ybtn1,ybtn2,ybtn3,ybtn4,ybtn5,ybtn6,ybtn7,ybtn8,ybtn9,ybtn10,ybtn11,ybtn12,ybtn13,ybtn14,ybtn15;
    Button abtn1,abtn2,abtn3,abtn4,abtn5,abtn6,abtn7,abtn8,abtn9,abtn10,abtn11,abtn12,abtn13,abtn14,abtn15;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bbtn1 = findViewById(R.id.blue1);
        bbtn2 = findViewById(R.id.blue2);
        bbtn3 = findViewById(R.id.blue3);
        bbtn4 = findViewById(R.id.blue4);
        bbtn5 = findViewById(R.id.blue5);
        bbtn6 = findViewById(R.id.blue6);
        bbtn7 = findViewById(R.id.blue7);
        bbtn8 = findViewById(R.id.blue8);
        bbtn9 = findViewById(R.id.blue9);
        bbtn10 = findViewById(R.id.blue10);
        bbtn11= findViewById(R.id.blue11);
        bbtn12= findViewById(R.id.blue12);
        bbtn13 = findViewById(R.id.blue13);
        bbtn14= findViewById(R.id.blue14);
        bbtn15 = findViewById(R.id.blue15);

        gbtn1 = findViewById(R.id.green1);
        gbtn2 = findViewById(R.id.green2);
        gbtn3 = findViewById(R.id.green3);
        gbtn4 = findViewById(R.id.green4);
        gbtn5 = findViewById(R.id.green5);
        gbtn6 = findViewById(R.id.green6);
        gbtn7 = findViewById(R.id.green7);
        gbtn8 = findViewById(R.id.green8);
        gbtn9 = findViewById(R.id.green9);
        gbtn10 = findViewById(R.id.green10);
        gbtn11= findViewById(R.id.green11);
        gbtn12= findViewById(R.id.green12);
        gbtn13 = findViewById(R.id.green13);
        gbtn14= findViewById(R.id.green14);
        gbtn15 = findViewById(R.id.green15);

        rbtn1 = findViewById(R.id.red1);
        rbtn2 = findViewById(R.id.red2);
        rbtn3 = findViewById(R.id.red3);
        rbtn4 = findViewById(R.id.red4);
        rbtn5 = findViewById(R.id.red5);
        rbtn6 = findViewById(R.id.red6);
        rbtn7 = findViewById(R.id.red7);
        rbtn8 = findViewById(R.id.red8);
        rbtn9 = findViewById(R.id.red9);
        rbtn10 = findViewById(R.id.red10);
        rbtn11= findViewById(R.id.red11);
        rbtn12= findViewById(R.id.red12);
        rbtn13 = findViewById(R.id.red13);
        rbtn14= findViewById(R.id.red14);
        rbtn15 = findViewById(R.id.red15);

        ybtn1 = findViewById(R.id.yellow1);
        ybtn2 = findViewById(R.id.yellow2);
        ybtn3 = findViewById(R.id.yellow3);
        ybtn4 = findViewById(R.id.yellow4);
        ybtn5 = findViewById(R.id.yellow5);
        ybtn6 = findViewById(R.id.yellow6);
        ybtn7 = findViewById(R.id.yellow7);
        ybtn8 = findViewById(R.id.yellow8);
        ybtn9 = findViewById(R.id.yellow9);
        ybtn10 = findViewById(R.id.yellow10);
        ybtn11= findViewById(R.id.yellow11);
        ybtn12= findViewById(R.id.yellow12);
        ybtn13 = findViewById(R.id.yellow13);
        ybtn14= findViewById(R.id.yellow14);
        ybtn15 = findViewById(R.id.yellow15);

        abtn1 = findViewById(R.id.grey1);
        abtn2 = findViewById(R.id.grey2);
        abtn3 = findViewById(R.id.grey3);
        abtn4 = findViewById(R.id.grey4);
        abtn5 = findViewById(R.id.grey5);
        abtn6 = findViewById(R.id.grey6);
        abtn7 = findViewById(R.id.grey7);
        abtn8 = findViewById(R.id.grey8);
        abtn9 = findViewById(R.id.grey9);
        abtn10 = findViewById(R.id.grey10);
        abtn11= findViewById(R.id.grey11);
        abtn12= findViewById(R.id.grey12);
        abtn13 = findViewById(R.id.grey13);
        abtn14= findViewById(R.id.grey14);
        abtn15 = findViewById(R.id.grey15);

    }
//    blue buttons
    public void bbtn1(View v){
        ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
        ClipData clip = ClipData.newPlainText("Button", bbtn1.getText().toString());
        clipboard.setPrimaryClip(clip);
        Toast.makeText(this,"Blue color copied to clipboard", Toast.LENGTH_SHORT).show();
    }
    public void bbtn2(View v){
        ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
        ClipData clip = ClipData.newPlainText("Button", bbtn2.getText().toString());
        clipboard.setPrimaryClip(clip);
        Toast.makeText(this,"Color copied to clipboard", Toast.LENGTH_SHORT).show();
    }
    public void bbtn3(View v){
        ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
        ClipData clip = ClipData.newPlainText("Button", bbtn3.getText().toString());
        clipboard.setPrimaryClip(clip);
        Toast.makeText(this,"Blue color copied to clipboard", Toast.LENGTH_SHORT).show();
    }
    public void bbtn4(View v){
        ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
        ClipData clip = ClipData.newPlainText("Button", bbtn4.getText().toString());
        clipboard.setPrimaryClip(clip);
        Toast.makeText(this,"Color copied to clipboard", Toast.LENGTH_SHORT).show();
    }
    public void bbtn5(View v){
        ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
        ClipData clip = ClipData.newPlainText("Button", bbtn5.getText().toString());
        clipboard.setPrimaryClip(clip);
        Toast.makeText(this,"Blue color copied to clipboard", Toast.LENGTH_SHORT).show();
    }
    public void bbtn6(View v){
        ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
        ClipData clip = ClipData.newPlainText("Button", bbtn6.getText().toString());
        clipboard.setPrimaryClip(clip);
        Toast.makeText(this,"Color copied to clipboard", Toast.LENGTH_SHORT).show();
    }
    public void bbtn7(View v){
        ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
        ClipData clip = ClipData.newPlainText("Button", bbtn7.getText().toString());
        clipboard.setPrimaryClip(clip);
        Toast.makeText(this,"Blue color copied to clipboard", Toast.LENGTH_SHORT).show();
    }
    public void bbtn8(View v){
        ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
        ClipData clip = ClipData.newPlainText("Button", bbtn8.getText().toString());
        clipboard.setPrimaryClip(clip);
        Toast.makeText(this,"Color copied to clipboard", Toast.LENGTH_SHORT).show();
    }
    public void bbtn9(View v){
        ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
        ClipData clip = ClipData.newPlainText("Button", bbtn9.getText().toString());
        clipboard.setPrimaryClip(clip);
        Toast.makeText(this,"Blue color copied to clipboard", Toast.LENGTH_SHORT).show();
    }
    public void bbtn10(View v){
        ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
        ClipData clip = ClipData.newPlainText("Button", bbtn10.getText().toString());
        clipboard.setPrimaryClip(clip);
        Toast.makeText(this,"Color copied to clipboard", Toast.LENGTH_SHORT).show();
    }
    public void bbtn11(View v){
        ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
        ClipData clip = ClipData.newPlainText("Button", bbtn11.getText().toString());
        clipboard.setPrimaryClip(clip);
        Toast.makeText(this,"Blue color copied to clipboard", Toast.LENGTH_SHORT).show();
    }
    public void bbtn12(View v){
        ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
        ClipData clip = ClipData.newPlainText("Button", bbtn12.getText().toString());
        clipboard.setPrimaryClip(clip);
        Toast.makeText(this,"Color copied to clipboard", Toast.LENGTH_SHORT).show();
    }
    public void bbtn13(View v){
        ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
        ClipData clip = ClipData.newPlainText("Button", bbtn13.getText().toString());
        clipboard.setPrimaryClip(clip);
        Toast.makeText(this,"Blue color copied to clipboard", Toast.LENGTH_SHORT).show();
    }
    public void bbtn14(View v){
        ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
        ClipData clip = ClipData.newPlainText("Button", bbtn14.getText().toString());
        clipboard.setPrimaryClip(clip);
        Toast.makeText(this,"Color copied to clipboard", Toast.LENGTH_SHORT).show();
    }
    public void bbtn15(View v){
        ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
        ClipData clip = ClipData.newPlainText("Button", bbtn15.getText().toString());
        clipboard.setPrimaryClip(clip);
        Toast.makeText(this,"Blue color copied to clipboard", Toast.LENGTH_SHORT).show();
    }

//    red buttons
    public void rbtn1(View v){
        ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
        ClipData clip = ClipData.newPlainText("Button", rbtn1.getText().toString());
        clipboard.setPrimaryClip(clip);
        Toast.makeText(this,"Red color copied to clipboard", Toast.LENGTH_SHORT).show();
    }
    public void rbtn2(View v){
        ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
        ClipData clip = ClipData.newPlainText("Button", rbtn2.getText().toString());
        clipboard.setPrimaryClip(clip);
        Toast.makeText(this,"Red color copied to clipboard", Toast.LENGTH_SHORT).show();
    }
    public void rbtn3(View v){
        ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
        ClipData clip = ClipData.newPlainText("Button", rbtn3.getText().toString());
        clipboard.setPrimaryClip(clip);
        Toast.makeText(this,"Red color copied to clipboard", Toast.LENGTH_SHORT).show();
    }
    public void rbtn4(View v){
        ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
        ClipData clip = ClipData.newPlainText("Button", rbtn4.getText().toString());
        clipboard.setPrimaryClip(clip);
        Toast.makeText(this,"Red color copied to clipboard", Toast.LENGTH_SHORT).show();
    }
    public void rbtn5(View v){
        ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
        ClipData clip = ClipData.newPlainText("Button", rbtn5.getText().toString());
        clipboard.setPrimaryClip(clip);
        Toast.makeText(this,"Red color copied to clipboard", Toast.LENGTH_SHORT).show();
    }
    public void rbtn6(View v){
        ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
        ClipData clip = ClipData.newPlainText("Button", rbtn6.getText().toString());
        clipboard.setPrimaryClip(clip);
        Toast.makeText(this,"Red color copied to clipboard", Toast.LENGTH_SHORT).show();
    }
    public void rbtn7(View v){
        ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
        ClipData clip = ClipData.newPlainText("Button", rbtn7.getText().toString());
        clipboard.setPrimaryClip(clip);
        Toast.makeText(this,"Red color copied to clipboard", Toast.LENGTH_SHORT).show();
    }
    public void rbtn8(View v){
        ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
        ClipData clip = ClipData.newPlainText("Button", rbtn8.getText().toString());
        clipboard.setPrimaryClip(clip);
        Toast.makeText(this,"Red color copied to clipboard", Toast.LENGTH_SHORT).show();
    }
    public void rbtn9(View v){
        ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
        ClipData clip = ClipData.newPlainText("Button", rbtn9.getText().toString());
        clipboard.setPrimaryClip(clip);
        Toast.makeText(this,"Red color copied to clipboard", Toast.LENGTH_SHORT).show();
    }
    public void rbtn10(View v){
        ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
        ClipData clip = ClipData.newPlainText("Button", rbtn10.getText().toString());
        clipboard.setPrimaryClip(clip);
        Toast.makeText(this,"Red color copied to clipboard", Toast.LENGTH_SHORT).show();
    }
    public void rbtn11(View v){
        ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
        ClipData clip = ClipData.newPlainText("Button", rbtn11.getText().toString());
        clipboard.setPrimaryClip(clip);
        Toast.makeText(this,"Red color copied to clipboard", Toast.LENGTH_SHORT).show();
    }
    public void rbtn12(View v){
        ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
        ClipData clip = ClipData.newPlainText("Button", rbtn12.getText().toString());
        clipboard.setPrimaryClip(clip);
        Toast.makeText(this,"Red color copied to clipboard", Toast.LENGTH_SHORT).show();
    }
    public void rbtn13(View v){
        ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
        ClipData clip = ClipData.newPlainText("Button", rbtn13.getText().toString());
        clipboard.setPrimaryClip(clip);
        Toast.makeText(this,"Red color copied to clipboard", Toast.LENGTH_SHORT).show();
    }
    public void rbtn14(View v){
        ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
        ClipData clip = ClipData.newPlainText("Button", rbtn14.getText().toString());
        clipboard.setPrimaryClip(clip);
        Toast.makeText(this,"Red color copied to clipboard", Toast.LENGTH_SHORT).show();
    }
    public void rbtn15(View v){
        ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
        ClipData clip = ClipData.newPlainText("Button", rbtn15.getText().toString());
        clipboard.setPrimaryClip(clip);
        Toast.makeText(this,"Red color copied to clipboard", Toast.LENGTH_SHORT).show();
    }

    //    green buttons
    public void gbtn1(View v){
        ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
        ClipData clip = ClipData.newPlainText("Button", gbtn1.getText().toString());
        clipboard.setPrimaryClip(clip);
        Toast.makeText(this,"Green color copied to clipboard", Toast.LENGTH_SHORT).show();
    }
    public void gbtn2(View v){
        ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
        ClipData clip = ClipData.newPlainText("Button", gbtn2.getText().toString());
        clipboard.setPrimaryClip(clip);
        Toast.makeText(this,"Green color copied to clipboard", Toast.LENGTH_SHORT).show();
    }
    public void gbtn3(View v){
        ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
        ClipData clip = ClipData.newPlainText("Button", gbtn3.getText().toString());
        clipboard.setPrimaryClip(clip);
        Toast.makeText(this,"Green color copied to clipboard", Toast.LENGTH_SHORT).show();
    }
    public void gbtn4(View v){
        ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
        ClipData clip = ClipData.newPlainText("Button", gbtn4.getText().toString());
        clipboard.setPrimaryClip(clip);
        Toast.makeText(this,"Green color copied to clipboard", Toast.LENGTH_SHORT).show();
    }
    public void gbtn5(View v){
        ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
        ClipData clip = ClipData.newPlainText("Button", gbtn5.getText().toString());
        clipboard.setPrimaryClip(clip);
        Toast.makeText(this,"Green color copied to clipboard", Toast.LENGTH_SHORT).show();
    }
    public void gbtn6(View v){
        ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
        ClipData clip = ClipData.newPlainText("Button", gbtn6.getText().toString());
        clipboard.setPrimaryClip(clip);
        Toast.makeText(this,"Green color copied to clipboard", Toast.LENGTH_SHORT).show();
    }
    public void gbtn7(View v){
        ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
        ClipData clip = ClipData.newPlainText("Button", gbtn7.getText().toString());
        clipboard.setPrimaryClip(clip);
        Toast.makeText(this,"Green color copied to clipboard", Toast.LENGTH_SHORT).show();
    }
    public void gbtn8(View v){
        ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
        ClipData clip = ClipData.newPlainText("Button", gbtn8.getText().toString());
        clipboard.setPrimaryClip(clip);
        Toast.makeText(this,"Green color copied to clipboard", Toast.LENGTH_SHORT).show();
    }
    public void gbtn9(View v){
        ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
        ClipData clip = ClipData.newPlainText("Button", gbtn9.getText().toString());
        clipboard.setPrimaryClip(clip);
        Toast.makeText(this,"Green color copied to clipboard", Toast.LENGTH_SHORT).show();
    }
    public void gbtn10(View v){
        ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
        ClipData clip = ClipData.newPlainText("Button", gbtn10.getText().toString());
        clipboard.setPrimaryClip(clip);
        Toast.makeText(this,"Green color copied to clipboard", Toast.LENGTH_SHORT).show();
    }
    public void gbtn11(View v){
        ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
        ClipData clip = ClipData.newPlainText("Button", gbtn11.getText().toString());
        clipboard.setPrimaryClip(clip);
        Toast.makeText(this,"Green color copied to clipboard", Toast.LENGTH_SHORT).show();
    }
    public void gbtn12(View v){
        ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
        ClipData clip = ClipData.newPlainText("Button", gbtn12.getText().toString());
        clipboard.setPrimaryClip(clip);
        Toast.makeText(this,"Green color copied to clipboard", Toast.LENGTH_SHORT).show();
    }
    public void gbtn13(View v){
        ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
        ClipData clip = ClipData.newPlainText("Button", gbtn13.getText().toString());
        clipboard.setPrimaryClip(clip);
        Toast.makeText(this,"Green color copied to clipboard", Toast.LENGTH_SHORT).show();
    }
    public void gbtn14(View v){
        ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
        ClipData clip = ClipData.newPlainText("Button", gbtn14.getText().toString());
        clipboard.setPrimaryClip(clip);
        Toast.makeText(this,"Green color copied to clipboard", Toast.LENGTH_SHORT).show();
    }
    public void gbtn15(View v){
        ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
        ClipData clip = ClipData.newPlainText("Button", gbtn15.getText().toString());
        clipboard.setPrimaryClip(clip);
        Toast.makeText(this,"Green color copied to clipboard", Toast.LENGTH_SHORT).show();
    }

    //    yellow buttons
    public void ybtn1(View v){
        ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
        ClipData clip = ClipData.newPlainText("Button", ybtn1.getText().toString());
        clipboard.setPrimaryClip(clip);
        Toast.makeText(this,"Yellow color copied to clipboard", Toast.LENGTH_SHORT).show();
    }
    public void ybtn2(View v){
        ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
        ClipData clip = ClipData.newPlainText("Button", ybtn2.getText().toString());
        clipboard.setPrimaryClip(clip);
        Toast.makeText(this,"Yellow color copied to clipboard", Toast.LENGTH_SHORT).show();
    }
    public void ybtn3(View v){
        ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
        ClipData clip = ClipData.newPlainText("Button", ybtn3.getText().toString());
        clipboard.setPrimaryClip(clip);
        Toast.makeText(this,"Yellow color copied to clipboard", Toast.LENGTH_SHORT).show();
    }
    public void ybtn4(View v){
        ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
        ClipData clip = ClipData.newPlainText("Button", ybtn4.getText().toString());
        clipboard.setPrimaryClip(clip);
        Toast.makeText(this,"Yellow color copied to clipboard", Toast.LENGTH_SHORT).show();
    }
    public void ybtn5(View v){
        ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
        ClipData clip = ClipData.newPlainText("Button", ybtn5.getText().toString());
        clipboard.setPrimaryClip(clip);
        Toast.makeText(this,"Yellow color copied to clipboard", Toast.LENGTH_SHORT).show();
    }
    public void ybtn6(View v){
        ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
        ClipData clip = ClipData.newPlainText("Button", ybtn6.getText().toString());
        clipboard.setPrimaryClip(clip);
        Toast.makeText(this,"Yellow color copied to clipboard", Toast.LENGTH_SHORT).show();
    }
    public void ybtn7(View v){
        ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
        ClipData clip = ClipData.newPlainText("Button", ybtn7.getText().toString());
        clipboard.setPrimaryClip(clip);
        Toast.makeText(this,"Yellow color copied to clipboard", Toast.LENGTH_SHORT).show();
    }
    public void ybtn8(View v){
        ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
        ClipData clip = ClipData.newPlainText("Button", ybtn8.getText().toString());
        clipboard.setPrimaryClip(clip);
        Toast.makeText(this,"Yellow color copied to clipboard", Toast.LENGTH_SHORT).show();
    }
    public void ybtn9(View v){
        ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
        ClipData clip = ClipData.newPlainText("Button", ybtn9.getText().toString());
        clipboard.setPrimaryClip(clip);
        Toast.makeText(this,"Yellow color copied to clipboard", Toast.LENGTH_SHORT).show();
    }
    public void ybtn10(View v){
        ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
        ClipData clip = ClipData.newPlainText("Button", ybtn10.getText().toString());
        clipboard.setPrimaryClip(clip);
        Toast.makeText(this,"Yellow color copied to clipboard", Toast.LENGTH_SHORT).show();
    }
    public void ybtn11(View v){
        ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
        ClipData clip = ClipData.newPlainText("Button", ybtn11.getText().toString());
        clipboard.setPrimaryClip(clip);
        Toast.makeText(this,"Yellow color copied to clipboard", Toast.LENGTH_SHORT).show();
    }
    public void ybtn12(View v){
        ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
        ClipData clip = ClipData.newPlainText("Button", ybtn12.getText().toString());
        clipboard.setPrimaryClip(clip);
        Toast.makeText(this,"Yellow color copied to clipboard", Toast.LENGTH_SHORT).show();
    }
    public void ybtn13(View v){
        ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
        ClipData clip = ClipData.newPlainText("Button", ybtn13.getText().toString());
        clipboard.setPrimaryClip(clip);
        Toast.makeText(this,"Yellow color copied to clipboard", Toast.LENGTH_SHORT).show();
    }
    public void ybtn14(View v){
        ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
        ClipData clip = ClipData.newPlainText("Button", ybtn14.getText().toString());
        clipboard.setPrimaryClip(clip);
        Toast.makeText(this,"Yellow color copied to clipboard", Toast.LENGTH_SHORT).show();
    }
    public void ybtn15(View v){
        ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
        ClipData clip = ClipData.newPlainText("Button", ybtn15.getText().toString());
        clipboard.setPrimaryClip(clip);
        Toast.makeText(this,"Yellow color copied to clipboard", Toast.LENGTH_SHORT).show();
    }

    //    grey buttons
    public void abtn1(View v){
        ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
        ClipData clip = ClipData.newPlainText("Button", abtn1.getText().toString());
        clipboard.setPrimaryClip(clip);
        Toast.makeText(this,"Grey color copied to clipboard", Toast.LENGTH_SHORT).show();
    }
    public void abtn2(View v){
        ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
        ClipData clip = ClipData.newPlainText("Button", abtn2.getText().toString());
        clipboard.setPrimaryClip(clip);
        Toast.makeText(this,"Grey color copied to clipboard", Toast.LENGTH_SHORT).show();
    }
    public void abtn3(View v){
        ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
        ClipData clip = ClipData.newPlainText("Button", abtn3.getText().toString());
        clipboard.setPrimaryClip(clip);
        Toast.makeText(this,"Grey color copied to clipboard", Toast.LENGTH_SHORT).show();
    }
    public void abtn4(View v){
        ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
        ClipData clip = ClipData.newPlainText("Button", abtn4.getText().toString());
        clipboard.setPrimaryClip(clip);
        Toast.makeText(this,"Grey color copied to clipboard", Toast.LENGTH_SHORT).show();
    }
    public void abtn5(View v){
        ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
        ClipData clip = ClipData.newPlainText("Button", abtn5.getText().toString());
        clipboard.setPrimaryClip(clip);
        Toast.makeText(this,"Grey color copied to clipboard", Toast.LENGTH_SHORT).show();
    }
    public void abtn6(View v){
        ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
        ClipData clip = ClipData.newPlainText("Button", abtn6.getText().toString());
        clipboard.setPrimaryClip(clip);
        Toast.makeText(this,"Grey color copied to clipboard", Toast.LENGTH_SHORT).show();
    }
    public void abtn7(View v){
        ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
        ClipData clip = ClipData.newPlainText("Button", abtn7.getText().toString());
        clipboard.setPrimaryClip(clip);
        Toast.makeText(this,"Grey color copied to clipboard", Toast.LENGTH_SHORT).show();
    }
    public void abtn8(View v){
        ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
        ClipData clip = ClipData.newPlainText("Button", abtn8.getText().toString());
        clipboard.setPrimaryClip(clip);
        Toast.makeText(this,"Grey color copied to clipboard", Toast.LENGTH_SHORT).show();
    }
    public void abtn9(View v){
        ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
        ClipData clip = ClipData.newPlainText("Button", abtn9.getText().toString());
        clipboard.setPrimaryClip(clip);
        Toast.makeText(this,"Grey color copied to clipboard", Toast.LENGTH_SHORT).show();
    }
    public void abtn10(View v){
        ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
        ClipData clip = ClipData.newPlainText("Button", abtn10.getText().toString());
        clipboard.setPrimaryClip(clip);
        Toast.makeText(this,"Grey color copied to clipboard", Toast.LENGTH_SHORT).show();
    }
    public void abtn11(View v){
        ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
        ClipData clip = ClipData.newPlainText("Button", abtn11.getText().toString());
        clipboard.setPrimaryClip(clip);
        Toast.makeText(this,"Grey color copied to clipboard", Toast.LENGTH_SHORT).show();
    }
    public void abtn12(View v){
        ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
        ClipData clip = ClipData.newPlainText("Button", abtn12.getText().toString());
        clipboard.setPrimaryClip(clip);
        Toast.makeText(this,"Grey color copied to clipboard", Toast.LENGTH_SHORT).show();
    }
    public void abtn13(View v){
        ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
        ClipData clip = ClipData.newPlainText("Button", abtn13.getText().toString());
        clipboard.setPrimaryClip(clip);
        Toast.makeText(this,"Grey color copied to clipboard", Toast.LENGTH_SHORT).show();
    }
    public void abtn14(View v){
        ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
        ClipData clip = ClipData.newPlainText("Button", abtn14.getText().toString());
        clipboard.setPrimaryClip(clip);
        Toast.makeText(this,"Grey color copied to clipboard", Toast.LENGTH_SHORT).show();
    }
    public void abtn15(View v){
        ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
        ClipData clip = ClipData.newPlainText("Button", abtn15.getText().toString());
        clipboard.setPrimaryClip(clip);
        Toast.makeText(this,"Grey color copied to clipboard", Toast.LENGTH_SHORT).show();
    }
}
