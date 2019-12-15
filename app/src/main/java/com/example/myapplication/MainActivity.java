package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void  sendMessage(View view){
        EditText editText1;
        editText1 = (EditText) findViewById(R.id.editText);
        String text = editText1.getText().toString();

        Intent intent = new Intent( MainActivity.this, Main2Activity.class);
        startActivity(intent);
    }

}
