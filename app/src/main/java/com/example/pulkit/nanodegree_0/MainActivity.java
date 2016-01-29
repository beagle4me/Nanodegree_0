package com.example.pulkit.nanodegree_0;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button app1,app2,app3,app4,app5,final_app;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialize();

        app1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = "This button will launch my Spotify Streamer App!!";
                createToast(s);
            }
        });

        app2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = "This button will launch my Football Scores App!!";
                createToast(s);
            }
        });

        app3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = "This button will launch my Library App!!";
                createToast(s);
            }
        });

        app4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = "This button will launch my Build it bigger App!!";
                createToast(s);
            }
        });

        app5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = "This button will launch my XYZ Reader App!!";
                createToast(s);
            }
        });

        final_app.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = "This button will launch my Capstone App!!";
                createToast(s);
            }
        });
    }

    private void createToast(String s) {
        Toast.makeText(getApplicationContext(),s, Toast.LENGTH_SHORT).show();
    }

    private void initialize() {

        app1 = (Button)findViewById(R.id.app_name_1);
        app2 = (Button)findViewById(R.id.app_name_2);
        app3 = (Button)findViewById(R.id.app_name_3);
        app4 = (Button)findViewById(R.id.app_name_4);
        app5 = (Button)findViewById(R.id.app_name_5);
        final_app = (Button)findViewById(R.id.final_app);

    }
}
