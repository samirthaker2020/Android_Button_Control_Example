package com.example.button_control_example;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnclick;
    TextView txtdisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnclick=findViewById(R.id.btn_click);
        txtdisplay=findViewById(R.id.txtdisplay);

        btnclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtdisplay.setText("You click the Button");
            }
        });
    }
}
