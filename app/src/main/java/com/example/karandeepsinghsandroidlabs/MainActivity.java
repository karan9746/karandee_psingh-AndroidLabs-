package com.example.karandeepsinghsandroidlabs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button loginButton;
    EditText emailEditText;
    @Override
    protected void onStart() {
        super.onStart();
        Log.w( "MainActivity", "In onCreate() - Loading Widgets" );
    }


    @Override
    protected void onStop() {
        super.onStop();
        Log.w( "MainActivity", "In onCreate() - Loading Widgets" );
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.w( "MainActivity", "In onCreate() - Loading Widgets" );
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.w( "MainActivity", "In onCreate() - Loading Widgets" );
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.w( "MainActivity", "In onCreate() - Loading Widgets" );
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.w( "MainActivity", "In onCreate() - Loading Widgets" );
        loginButton = findViewById(R.id.loginButton);
        emailEditText = findViewById(R.id.edit1);

        loginButton.setOnClickListener( clk-> {

            Intent nextPage = new Intent( MainActivity.this, SecondActivity.class);
            nextPage.putExtra( "EmailAddress", emailEditText.getText().toString() );
            startActivity(nextPage);
        } );
    }
}