package com.psv.pvrs;

import androidx.appcompat.app.AppCompatActivity;
import com.psv.pvrs.R;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainActivity extends AppCompatActivity {
    int open = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Starts(View v)
    {
        Startss();
    }
    public void Startss()
    {
        open = 0;
        setContentView(R.layout.opens);

    }
    public void R_1(View v){
        open = 1;
        setContentView(R.layout.s1);
    }
    public void R_2(View v){
        open = 1;
        setContentView(R.layout.s2);
    }
    public void R_3(View v){
        open = 1;
        setContentView(R.layout.s3);
    }
    public void R_4(View v){
        open = 1;
        setContentView(R.layout.s4);
    }
    public void R_5(View v){
        open = 1;
        setContentView(R.layout.s5);
    }
    public void R_6(View v){
        open = 1;
        setContentView(R.layout.s6);
    }
    public void R_7(View v){
        open = 1;
        setContentView(R.layout.s7);
    }
    public void R_8(View v){
        open = 1;
        setContentView(R.layout.s8);
    }
    public void R_9(View v){
        open = 1;
        setContentView(R.layout.s9);
    }
    public void R_10(View v){
        setContentView(R.layout.s10);
    }
    public void R_11(View v){
        open = 1;
        setContentView(R.layout.s11);
    }

    public void Adds(View v){
        open = 1;
        setContentView(R.layout.addition);
    }
    public void R_1_1(View v){
        open = 1;
        Texts("sizo/I/1");
    }
    public void R_1_2(View v){
        open = 1;
        Texts("sizo/I/2");
    }
    public void R_1_3(View v){
        open = 1;
        Texts("sizo/I/3");
    }
    public void R_1_4(View v){
        open = 1;
        Texts("sizo/I/4");
    }
    public void R_1_5(View v){
        open = 1;
        Texts("sizo/I/5");
    }
    public void R_2_1(View v){
        open = 1;
        Texts("sizo/II/1");
    }
    public void R_2_2(View v){
        open = 1;
        Texts("sizo/II/2");
    }
    public void R_2_3(View v){
        open = 1;
        Texts("sizo/II/3");
    }
    public void R_2_4(View v){
        open = 1;
        Texts("sizo/II/4");
    }
    public void R_3_1(View v){
        open = 1;
        Texts("sizo/III/1");
    }
    public void R_3_2(View v){
        open = 1;
        Texts("sizo/III/2");
    }
    public void R_4_1(View v){
        open = 1;
        Texts("sizo/IV/1");
    }
    public void R_4_2(View v){
        open = 1;
        Texts("sizo/IV/2");
    }
    public void R_4_3(View v){
        open = 1;
        Texts("sizo/IV/3");
    }
    public void R_4_4(View v){
        open = 1;
        Texts("sizo/IV/4");
    }
    public void R_4_5(View v){
        open = 1;
        Texts("sizo/IV/5");
    }
    public void R_4_6(View v){
        open = 1;
        Texts("sizo/IV/6");
    }
    public void R_4_7(View v){
        open = 1;
        Texts("sizo/IV/7");
    }
    public void R_4_8(View v){
        open = 1;
        Texts("sizo/IV/8");
    }
    public void R_4_9(View v){
        open = 1;
        Texts("sizo/IV/9");
    }
    public void R_5_1(View v){
        open = 1;
        Texts("sizo/V/1");
    }
    public void R_5_2(View v){
        open = 1;
        Texts("sizo/V/2");
    }
    public void R_5_3(View v){
        open = 1;
        Texts("sizo/V/3");
    }
    public void R_5_4(View v){
        open = 1;
        Texts("sizo/V/4");
    }
    public void R_6_1(View v){
        open = 1;
        Texts("sizo/VI/1");
    }
    public void R_6_2(View v){
        open = 1;
        Texts("sizo/VI/2");
    }
    public void R_6_3(View v){
        open = 1;
        Texts("sizo/VI/3");
    }
    public void R_6_4(View v){
        open = 1;
        Texts("sizo/VI/4");
    }
    public void R_7_1(View v){
        open = 1;
        Texts("sizo/VII/1");
    }
    public void R_7_2(View v){
        open = 1;
        Texts("sizo/VII/2");
    }
    public void R_7_3(View v){
        open = 1;
        Texts("sizo/VII/3");
    }
    public void R_7_4(View v){
        open = 1;
        Texts("sizo/VII/4");
    }
    public void R_8_1(View v){
        open = 1;
        Texts("sizo/VIII/1");
    }
    public void R_8_2(View v){
        open = 1;
        Texts("sizo/VIII/2");
    }
    public void R_8_3(View v){
        open = 1;
        Texts("sizo/VIII/3");
    }
    public void R_8_4(View v){
        open = 1;
        Texts("sizo/VIII/4");
    }
    public void R_8_5(View v){
        open = 1;
        Texts("sizo/VIII/5");
    }
    public void R_8_6(View v){
        open = 1;
        Texts("sizo/VIII/6");
    }
    public void R_8_7(View v){
        open = 1;
        Texts("sizo/VIII/7");
    }
    public void R_9_1(View v){
        open = 1;
        Texts("sizo/IX/1");
    }
    public void R_9_2(View v){
        open = 1;
        Texts("sizo/IX/2");
    }
    public void R_9_3(View v){
        open = 1;
        Texts("sizo/IX/3");
    }
    public void R_9_4(View v){
        open = 1;
        Texts("sizo/IX/4");
    }
    public void R_9_5(View v){
        open = 1;
        Texts("sizo/IX/5");
    }
    public void R_9_6(View v){
        open = 1;
        Texts("sizo/IX/6");
    }
    public void R_10_1(View v){
        open = 1;
        Texts("sizo/X/1");
    }
    public void R_10_2(View v){
        open = 1;
        Texts("sizo/X/2");
    }
    public void R_10_3(View v){
        open = 1;
        Texts("sizo/X/3");
    }
    public void R_11_1(View v){
        open = 1;
        Texts("sizo/XI/1");
    }
    public void R_11_2(View v){
        open = 1;
        Texts("sizo/XI/2");
    }
    public void R_11_3(View v){
        open = 1;
        Texts("sizo/XI/3");
    }
    public void A_1(View v){
        open = 1;
        Texts("sizo/Add/1");
    }
    public void A_2(View v){
        open = 1;
        Texts("sizo/Add/2");
    }
    public void A_3(View v){
        open = 1;
        Texts("sizo/Add/3");
    }
    public void A_4(View v){
        open = 1;
        Texts("sizo/Add/4");
    }
    public void A_5(View v){
        open = 1;
        Texts("sizo/Add/5");
    }

    //Читае файли

    public void Texts(String ins) {
        open = 1;
        setContentView(R.layout.text_fild);
        TextView textv = findViewById(R.id.text_teads);
        BufferedReader reader;
        try {
            reader = new BufferedReader(
                    new InputStreamReader(getAssets().open(ins)));

            // do reading, usually loop until end of file reading
            StringBuilder sf = new StringBuilder();
            String mLine = reader.readLine();
            while (mLine != null) {
                //process line
                sf.append(mLine);
                sf.append(System.lineSeparator());
                mLine = reader.readLine();
            }
            textv.setText(sf.toString());
        } catch (IOException e) {
            //log the exception
        }
    }
    @Override
    public void onBackPressed()
    {
        if(open == 1){
            Startss();
        }
        else if(open == 0){
            super.onBackPressed();
        }
    }
}