package com.example.kamusnetbeans;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Pencarian extends AppCompatActivity {
    EditText netbeans, arti;
    private Button tombol; // Membuat Variable Button

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pencarian);

        netbeans = (EditText) findViewById(R.id.txtnetbeans);
        arti = (EditText) findViewById(R.id.txtarti);
        tombol = findViewById(R.id.btntranslate);

        tombol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(netbeans.getText().toString().equals(""))
                {
                    Toast.makeText(Pencarian.this, "Data Kosong, Silahkan Masukan Data Terlebih Dahulu..", Toast.LENGTH_SHORT).show();
                }
                else {
                    if(netbeans.getText().toString().equals("New Project"))
                    {
                        arti.setText("membuat sebuah rancangan baru yang berisi kumpulan berkas pemrograman");
                    }
                    else if(netbeans.getText().toString().equals("New file"))
                    {
                        arti.setText("membuat sebuah berkas pemrograman");
                    }
                    else if(netbeans.getText().toString().equals("Open Project"))
                    {
                        arti.setText("membukan rancangan yang sudah ada");
                    }
                    else if(netbeans.getText().toString().equals("Open recent project"))
                    {
                        arti.setText("membuka rancangan yang sudah dibuka akhir-akhir ini");
                    }
                    else if(netbeans.getText().toString().equals("Close Project"))
                    {
                        arti.setText("menutup rancangan yang sudah ada");
                    }
                    else if(netbeans.getText().toString().equals("Close Other Project"))
                    {
                        arti.setText("menutup rancangan lainnya");
                    }
                    else if(netbeans.getText().toString().equals("Close All Project"))
                    {
                        arti.setText("menutup semua rancangan");
                    }
                    else if(netbeans.getText().toString().equals("Open File"))
                    {
                        arti.setText("membukan berkas yang sudah ada");
                    }
                    else if(netbeans.getText().toString().equals("Project Group"))
                    {
                        arti.setText("kumpulan rancangan yang sudah ataupun akan dijadikan satu kesatuan");
                    }
                    else if(netbeans.getText().toString().equals("Import Project"))
                    {
                        arti.setText("untuk mengmpor sebuah rancangan yang sudah dibuat");
                    }
                    else
                    {
                        Toast.makeText(Pencarian.this, "Data Belum Terdaftar..", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

    }
}
