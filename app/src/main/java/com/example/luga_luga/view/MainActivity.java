package com.example.luga_luga.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;

import com.example.luga_luga.R;
import com.example.luga_luga.RecyclerItemClickListener;
import com.example.luga_luga.model.Produto;
import com.example.luga_luga.view.adapter.AdapterProduto;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private AdapterProduto adapterProduto;
    private List <Produto> produtoList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.listaProdutos);

        CriarListaProdutos();

        adapterProduto = new AdapterProduto(produtoList);

        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayout.VERTICAL));
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(adapterProduto);

        recyclerView.addOnItemTouchListener(
                new RecyclerItemClickListener(
                    getApplicationContext(),
                    recyclerView,
                new RecyclerItemClickListener.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                Intent intent = new Intent(MainActivity.this, ProdutoActivity.class);
                intent.putExtra("produto", produtoList.get(position));
                startActivity(intent);
            }

            @Override
            public void onLongItemClick(View view, int position) {
                Toast.makeText(getApplicationContext(),produtoList.get(position).getStatus(),Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            }

        }));




    }
    public void CriarListaProdutos(){
        Produto produto=
                new Produto (
                        "Iphone 13",
                        200.00,
                        "Iphone 13 64gb" ,
                        10,
                        "Disponível"
                );
            produtoList.add(produto);

            produto=
                new Produto (
                        "Computador",
                        500.00,
                        "Computador 65gb" ,
                        16,
                        "Disponível"
                );
            produtoList.add(produto);
            produto=
                new Produto (
                        "Smart Tv",
                        600.00,
                        " LED 4K UHD WebO 23" ,
                        25,
                        "Disponível"
                );
            produtoList.add(produto);

            produto=
                new Produto (
                        "Ventilador",
                        250.00,
                        "Air Silence 220V" ,
                        5,
                        "Disponível"
                );
            produtoList.add(produto);

            produto=
                new Produto (
                        "Ventilador de Teto",
                        800.00,
                        "3 velocidades, 220V" ,
                        22,
                        "Disponível"
                );
            produtoList.add(produto);

            produto=
                new Produto (
                        "Relogio smartwatch",
                        800.00,
                        "Tela 1,65,GPS, A prova D´Agua" ,
                        23,
                        "Disponível"
                );
            produtoList.add(produto);

            produto=
                new Produto (
                        "Relógio",
                        753.50,
                        "Smartwatch W28 Pro" ,
                        3,
                        "Disponível"
                );
            produtoList.add(produto);

            produto=
                new Produto (
                        "Mouse",
                        75.00,
                        "Mouse Sem Fio,Luz RGB" ,
                        14,
                        "Disponível"
                );
            produtoList.add(produto);

            produto=
                new Produto (
                        "Mouse pad",
                        76.89,
                        "Dragão Japonês,900x400, 700x300, XXL" ,
                        23,
                        "Disponível"
                );
            produtoList.add(produto);

            produto=
                new Produto (
                        "Alexa ",
                        314.10,
                        "O melhor som já lançado | Cor Preta" ,
                        10,
                        "Disponível"
                );
            produtoList.add(produto);
    }
}