package com.example.luga_luga.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.luga_luga.R;

public class MainActivity extends AppCompatActivity {

    private ListView listCidades;

    private String[] cidades = {
            "São Carlos", "Araraquara", "Ibaté",
            "Ribeirão Preto", "Dourado", "Descalvado",
            "Porto Ferreira", "Santa Rita do Passa Quatro",
            "Tambaú", "Pirassununga", "Bauru", "Franca",
            "Jaboticabal", "São Paulo", "Itirapina",
            "Brotas" ,"Rio Claro", "Jaú"

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listCidades = findViewById(R.id.ListaNomes);

        ArrayAdapter <String> adapter = new ArrayAdapter<>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                cidades
        );

        listCidades.setAdapter(adapter);

        listCidades.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String itemSelecionado = listCidades.getItemAtPosition(position).toString();
                Toast.makeText(getApplicationContext(), itemSelecionado,Toast.LENGTH_LONG).show();

            }
        });
    }
}