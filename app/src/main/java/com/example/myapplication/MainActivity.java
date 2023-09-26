package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText edtName;
    private EditText edtPass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtName = findViewById(R.id.editText0);
        edtPass = findViewById(R.id.editText1);
    }

    public void btnSubmitOnClick(View view) {
        String name = edtName.getText().toString();
        String pass = edtPass.getText().toString();

        String msg = "name :" + name + "Pass : "+pass;
        Toast.makeText(this,msg,Toast.LENGTH_LONG).show();
    }
}