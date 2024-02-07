package com.example.uygulama7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText editTextyas=findViewById(R.id.editTextyas);
        Button buttonkaydet=findViewById(R.id.buttonkaydet);
        TextView textViewsonuc=findViewById(R.id.textViewsonuc);
        buttonkaydet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int yas =Integer.parseInt(editTextyas.getText().toString());
                personel persanel =new personel();
                persanel.setYas(yas);
                textViewsonuc.setText(Integer.toString(persanel.getYas()));
            }
        });
    }
}