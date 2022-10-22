package com.example.mobile_tugas1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Biodata extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biodata);

        final EditText nama = (EditText)findViewById(R.id.input_nama);
        final EditText alamat = (EditText)findViewById(R.id.input_alamat);
        final EditText kontak = (EditText)findViewById(R.id.input_kontak);
        final EditText usia = (EditText)findViewById(R.id.input_usia);

        final TextView nama_t = (TextView)findViewById(R.id.output_nama);
        final TextView alamat_t = (TextView)findViewById(R.id.output_alamat);
        final TextView kontak_t = (TextView)findViewById(R.id.output_kontak);
        final TextView usia_t = (TextView)findViewById(R.id.output_usia);

        final Button tampil =
                (Button)findViewById(R.id.btn_simpan);
        tampil.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String nama1 = nama.getText().toString();
                String alamat1 = alamat.getText().toString();
                String kontak1 = kontak.getText().toString();
                String usia1 = usia.getText().toString();
                nama_t.setText(nama1);
                alamat_t.setText(alamat1);
                kontak_t.setText(kontak1);
                usia_t.setText(usia1);
            }
        });
    }
}

