package com.example.lingkaran;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
private Button btnKeliling, btnLuas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnKeliling = findViewById(R.id.btn_keliling);
        btnLuas = findViewById(R.id.btn_luas);

        btnLuas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent moveIntent = new Intent(MainActivity.this,LuasActivity.class);
                startActivity(moveIntent);
            }
        });

        btnKeliling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent moveIntent = new Intent(MainActivity.this,KelilingActivity.class);
                startActivity(moveIntent);
            }
        });


    }
}
