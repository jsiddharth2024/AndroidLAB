package com.example.sjcet.loginpswd;

import android.app.Notification;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    private EditText unameET;
    private EditText pswdET;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        unameET=findViewById(R.id.uname);
        pswdET=findViewById(R.id.pswd);
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    public void Login(View view) {
        if (Objects.equals(unameET.getText().toString(), "admin") && Objects.equals(pswdET.getText().toString(), "admin")) {
            Toast.makeText(MainActivity.this, "You have Authenticated Successfully", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(MainActivity.this, "Authentication Failed", Toast.LENGTH_LONG).show();
        }
    }
}