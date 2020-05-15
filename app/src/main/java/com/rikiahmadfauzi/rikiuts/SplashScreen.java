package com.rikiahmadfauzi.rikiuts;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class SplashScreen extends AppCompatActivity {
    /*
    Tanggal Pengerjaan : Sabtu, 9-05-2020
    Nim : 10117153
    Nama : Riki Ahmad Fauzi
    Kelas : IF4
     */

    private int waktu_loading=4000;

    //4000=4 detik

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.splashscreen);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                //setelah loading maka akan langsung berpindah ke main activity
                Intent main=new Intent(SplashScreen.this, MainActivity.class);
                startActivity(main);
                finish();

            }
        },waktu_loading);
    }
}
