package com.example.project10_11;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity3 extends AppCompatActivity {

    int a = 10;
    int b = 20;
    int c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);


        initView();







        sfdhyfgthngvf
    }


    void initView() {

        Button btnSubmit = findViewById(R.id.btnSubmit);
        Button btnClickme = findViewById(R.id.btnClickme);
        EditText edtName=findViewById(R.id.edtName);
        EditText edtPassword=findViewById(R.id.edtPassword);

        btnSubmit.setOnClickListener(view -> {


           String name= edtName.getText().toString();
           String passsword=edtPassword.getText().toString();



            Log.e("Tag123", "username= "+name );
            Log.e("Tag123", "Paasword "+ passsword);
            Log.e("Tag123", "confirmPaasword "+ passsword);
        });


        btnClickme.setOnClickListener(v -> {

            c= a*b;
            Log.e("TAG", " Button click me is clicked   " + c);
        });


    }


}