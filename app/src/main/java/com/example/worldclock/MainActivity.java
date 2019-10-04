package com.example.worldclock;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextClock;

public class MainActivity extends AppCompatActivity {

    private Button button6;
    private Button button5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button5 = findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                TextClock tc1 = findViewById(R.id.textClock7);
                tc1.setFormat12Hour("hh:mm:ss a");
                tc1.setFormat24Hour(null);

                TextClock tc2 = findViewById(R.id.textClock1);
                tc2.setFormat12Hour("hh:mm:ss a");
                tc2.setFormat24Hour(null);

                TextClock tc3 = findViewById(R.id.textClock2);
                tc3.setFormat12Hour("hh:mm:ss a");
                tc3.setFormat24Hour(null);

                TextClock tc4 = findViewById(R.id.textClock3);
                tc4.setFormat12Hour("hh:mm:ss a");
                tc4.setFormat24Hour(null);

                TextClock tc5 = findViewById(R.id.textClock4);
                tc5.setFormat12Hour("hh:mm:ss a");
                tc5.setFormat24Hour(null);


            }
        });        button6= findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v){
                TextClock tc6 = findViewById(R.id.textClock7);
                        tc6.setFormat12Hour(null);
                        tc6.setFormat24Hour("k:mm");

                TextClock tc7 = findViewById(R.id.textClock1);
                tc7.setFormat12Hour(null);
                tc7.setFormat24Hour("k:mm");

                TextClock tc8 = findViewById(R.id.textClock2);
                tc8.setFormat12Hour(null);
                tc8.setFormat24Hour("k:mm");

                TextClock tc9 = findViewById(R.id.textClock3);
                tc9.setFormat12Hour(null);
                tc9.setFormat24Hour("k:mm");

                TextClock tc10 = findViewById(R.id.textClock4);
                tc10.setFormat12Hour(null);
                tc10.setFormat24Hour("k:mm");
    }
});
    }
}