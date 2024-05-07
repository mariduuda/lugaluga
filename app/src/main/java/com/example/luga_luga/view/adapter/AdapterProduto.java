package com.example.luga_luga.view.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.luga_luga.R;
import com.example.luga_luga.model.Produto;

import java.util.List;

public class AdapterProduto extends RecyclerView.Adapter<AdapterProduto.viewHolder> {

    private List<Produto> produtoList;

    public AdapterProduto(List<Produto> produtoList) {
        this.produtoList = produtoList;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View listaProdutos = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.adapter_produto,parent, false);

        return new viewHolder(listaProdutos);

    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        holder.nomeProd.setText(produtoList.get(position).getNome());
        holder.precoProd.setText(String.valueOf(produtoList.get(position).getNome()));
        holder.descProd.setText(produtoList.get(position).getDescricao());
    }

    @Override
    public int getItemCount() {
        return produtoList.size();
    }

    public class ViewHolder {
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        TextView nomeProd, precoProd, descProd;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            nomeProd = itemView.findViewById(R.id.tv_nomeProduto);
            precoProd =itemView.findViewById(R.id.tv_nomeProduto);
            descProd =itemView.findViewById(R.id.tv_descProd);
        }
    }
}



