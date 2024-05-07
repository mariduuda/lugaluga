package com.example.luga_luga.model;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

public class Produto implements Parcelable {
    private String nome;
    private Double preco;
    private String descricao;
    private  int quantidade;

    public Produto(String nome, Double preco, String descricao, int quantidade, String status) {
        this.nome = nome;
        this.preco = preco;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.status = status;
    }

    protected Produto(Parcel in) {
        nome = in.readString();
        if (in.readByte() == 0) {
            preco = null;
        } else {
            preco = in.readDouble();
        }
        descricao = in.readString();
        quantidade = in.readInt();
        status = in.readString();
    }

    public static final Creator<Produto> CREATOR = new Creator<Produto>() {
        @Override
        public Produto createFromParcel(Parcel in) {
            return new Produto(in);
        }

        @Override
        public Produto[] newArray(int size) {
            return new Produto[size];
        }
    };

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    private String status;

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel dest, int flags) {
        dest.writeString(nome);
        if (preco == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeDouble(preco);
        }
        dest.writeString(descricao);
        dest.writeInt(quantidade);
        dest.writeString(status);
    }

}
