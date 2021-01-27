package com.siddiqei.workshop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView nametext;
    EditText editText;
    Button buttonshow;
    String name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nametext = findViewById(R.id.nametext);
        editText=findViewById(R.id.editTextTextPersonName);
        buttonshow =findViewById(R.id.showbutton);

        buttonshow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    if(editText.getText().length()<1)
                    {
                        editText.setError("Please Enter Something");
                    }
                    else
                    {
                        nametext.setText("Welcome "+editText.getText().toString()+" to");
                    }

            }
        });


    }
}