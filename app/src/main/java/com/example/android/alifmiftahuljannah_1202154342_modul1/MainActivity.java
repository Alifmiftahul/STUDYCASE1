package com.example.android.alifmiftahuljannah_1202154342_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText nasi;
    private EditText jmlh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void eatbus(View view) {
        Intent intent = new Intent(this, SecondActivity.class);

        nasi = (EditText)findViewById(R.id.editTextNasi);
        String makan = nasi.getText().toString();

        jmlh = (EditText)findViewById(R.id.editTextJmlh);
        String jumlah = jmlh.getText().toString();

        intent.putExtra("lokasi", "Eatbus");
        intent.putExtra("menu", makan);
        intent.putExtra("jumlah", jumlah);
        intent.putExtra("harga", "50000");
        startActivity(intent);
    }

    public void apnormal(View view) {
        Intent intent = new Intent(this, SecondActivity.class);

        nasi = (EditText)findViewById(R.id.editTextNasi);
        String makan = nasi.getText().toString();

        jmlh = (EditText)findViewById(R.id.editTextJmlh);
        String jumlah = jmlh.getText().toString();

        intent.putExtra("lokasi", "Apnormal");
        intent.putExtra("menu", makan);
        intent.putExtra("jumlah", jumlah);
        intent.putExtra("harga", "30000");
        startActivity(intent);
    }
}
