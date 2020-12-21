package com.dns.sample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private TextView txt;
    private PackageInfo pi;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt = findViewById(R.id.txt);
        try {
            pi = getPackageManager().getPackageInfo("com.android.chrome",0);
            String version = pi.versionName;
            txt.setText("Your Chrome Version is "+version);

        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }


    }
}
