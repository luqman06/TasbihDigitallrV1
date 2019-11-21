package com.example.tasbihdigitallrv1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.sql.BatchUpdateException;

public class MainActivity extends AppCompatActivity {
private static long back_pressed;
public int nilai = 0;
public int reset = 0;
public int nilai1 =0;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView tampil = (TextView) findViewById(R.id.teks_tampil);

        final Vibrator vibrator = (Vibrator) getSystemService(VIBRATOR_SERVICE);
        final Button btn_start = (Button) findViewById(R.id.start);
        btn_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nilai++;
                nilai1++;
                if (nilai == 33 || nilai==66 || nilai== 99){
                    vibrator.vibrate(600);
                    btn_start.setTextColor(Color.RED);
                }else {
                    vibrator.vibrate(20);
                    btn_start.setTextColor(Color.BLUE);
                }
                if (nilai > 99){
                    nilai = 0;


                }
                String nilai_string = String.valueOf(nilai);
                btn_start.setText(nilai_string);
                String nilai1_string = String.valueOf(nilai1);
                tampil.setText(nilai1_string);
            }
        });

        Button btn_reset = (Button) findViewById(R.id.reset);
        btn_reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nilai = 0; reset++;
                nilai1 = 0;
                String nilai_string = String.valueOf(nilai);
                btn_start.setText(nilai_string);
                String nilai1_string = String.valueOf(nilai1);
                tampil.setText(nilai1_string);

                }

        });


    }


}
