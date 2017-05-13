package com.example.shchang18.kistickets;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class TicketActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ticket);
        Intent intent = getIntent();
        String message = intent.getStringExtra("data");
        TextView tv = (TextView)findViewById(R.id.ticketID);
        tv.setText(message);
        setResult(1);
    }
}
