package com.example.study;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {
    Button btnlogin;
    EditText etname,etpassword;

    TextView tvmotdepasseoublie,tvinscription,message;
    int counter = 3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnlogin= (Button)findViewById(R.id.btnlogin);
        etname = (EditText)findViewById(R.id.etname);
        etpassword = (EditText)findViewById(R.id.etpassword);
        tvmotdepasseoublie = (TextView)findViewById(R.id.tvmotdepassoublier);
        tvinscription = (TextView)findViewById(R.id.tvinscription);
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                if(etname.getText().toString().equals("admin") &&
//                        etpassword.getText().toString().equals("admin")) {
//                            Toast.makeText(getApplicationContext(),
//                            "Redirecting...",Toast.LENGTH_SHORT).show();
                    Intent home= new Intent(MainActivity.this, Home.class);
                    startActivities(new Intent[]{home});
//                }else{
//                    Toast.makeText(getApplicationContext(), "Wrong Credentials",Toast.LENGTH_SHORT).show();
//                    }
         }

        });
    }

}



