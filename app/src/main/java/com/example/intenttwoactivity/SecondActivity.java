package com.example.intenttwoactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SecondActivity extends AppCompatActivity {

    TextView ShowMessagge;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        Bundle extras = getIntent().getExtras();

        ShowMessagge = (TextView) findViewById(R.id.textView);

        if(extras != null){
            String messagge = extras.getString("Message");
            int valueInt = extras.getInt("Value");

           ShowMessagge.setText(messagge);
           ShowMessagge.append(" / Stringa aggiunta nella seconda Activity");
           ShowMessagge.append(String.valueOf(valueInt));


        }

    }
}
