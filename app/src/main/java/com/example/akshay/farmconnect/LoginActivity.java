package com.example.akshay.farmconnect;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    Button loginButton;
    EditText input1 ;
    EditText input2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        loginButton=findViewById(R.id.login);
        input1 = findViewById(R.id.input_email);
        input2 = findViewById(R.id.input_password);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (input1.getText().toString().equals("admin") && input2.getText().toString().equals("admin")) {
                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                }
                else{
                    Toast.makeText(LoginActivity.this,"Authentication Failed",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
