package com.example.luga_luga.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.luga_luga.R;
import com.example.luga_luga.model.Produto;
import com.example.luga_luga.view.adapter.AdapterProduto;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private AdapterProduto adapterProduto;
    private List<Produto> produtoList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView.findViewById(R.id.listaProdutos);
    }
    public void CriarListaProdutos(){
        Produto produto= new Produto("Iphone 15", "Iphone 15 64gb", 200.00, "Disponível");
    }
}