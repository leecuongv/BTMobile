package com.hcmute.broadcast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private final String CUSTOM_ACTION = "hcmute.edu.ACTION";
    private final String CUSTOM_KEY = "hcmute.edu.KEY";
    Button btnSend;
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.textMessage);
        btnSend = findViewById(R.id.btnSend);
        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CUSTOM_ACTION);
                intent.putExtra(CUSTOM_KEY,editText.getText().toString());
                sendBroadcast(intent);
            }
        });

    }
}