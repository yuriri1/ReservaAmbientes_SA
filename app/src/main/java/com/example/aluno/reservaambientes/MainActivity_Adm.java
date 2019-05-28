package com.example.aluno.reservaambientes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity_Adm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main__adm);

        final ArrayList<String> lista = new ArrayList<>();
        lista.add("Salão");
        lista.add("Sala");
        lista.add("Salinha");
        lista.add("Salete");

        final ListView listaView = findViewById(R.id.listSalas1);
        final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_1, lista);

        listaView.setAdapter(arrayAdapter);

        listaView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int intPosition = position;
                String value = (String) listaView.getItemAtPosition(position);

                switch (value) {
                    case "Sala":
                        Intent it = new Intent(getApplicationContext(), MainActivity_Sala.class);
                        startActivity(it);
                }
            }
        });

    }
}


