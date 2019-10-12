package com.example.notetaker;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Activity2 extends AppCompatActivity {
    private Button btnaddnote;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        findViews();
        setListeners();

        }

        private void findViews(){

        btnaddnote = findViewById(R.id.btnAddNote);

        }


        private void setListeners(){
            btnaddnote.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i =new Intent(Activity2.this, AddNoteActivity.class);
                    startActivity(i);
                }
            });
        }
    }

