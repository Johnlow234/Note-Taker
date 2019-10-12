package com.example.notetaker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText edtUsername, edtPassword;
    private Button btnLogin;
    String username= "Johnlow234" , password = "12345";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findviews();
        setLister();
    }

    private void findviews(){
        edtUsername = findViewById(R.id.ed_username);
        edtPassword = findViewById(R.id.ed_password);
        btnLogin = findViewById(R.id.brn_login);

    }




    private  void setLister(){
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String inputUsername = edtUsername.getText().toString();
                String inputPassword = edtPassword.getText().toString();

                if(inputUsername.equals(username) && inputPassword.equals(password)){
      //              Toast.makeText(MainActivity.this, "Login Successful ", Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(MainActivity.this, Activity2.class);
                    startActivity(i);
                    finish();
                }else{
                    Toast.makeText(MainActivity.this, "Login Fail ", Toast.LENGTH_SHORT).show();
                }
            }

        });


    }

}
