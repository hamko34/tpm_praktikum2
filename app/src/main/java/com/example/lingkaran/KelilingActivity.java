package com.example.lingkaran;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class KelilingActivity extends AppCompatActivity {
private Button btnHitung;
private EditText etJari;
private TextView tvHasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_keliling);

        btnHitung = findViewById(R.id.btn_hitung);
        etJari = findViewById(R.id.et_jari);
        tvHasil = findViewById(R.id.tv_hasil);

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    String sJari = etJari.getText().toString();

                    double dJari = Double.parseDouble(sJari);

                    double dHasil = (2*3.14*dJari);

                    String sHasil = String.valueOf(dHasil);
                    tvHasil.setText(sHasil);
                }catch (NumberFormatException nfe){
                    Toast.makeText(getApplicationContext(),"Field tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
