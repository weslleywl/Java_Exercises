package com.example.ava2;

import androidx.annotation.NonNull;

import java.io.Serializable;

public class Veiculo implements Serializable {
    private long id;
    private String nome;
    private String cor;
    private double preco;
    private int velocidadeMaxima;
    private boolean combustao;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public boolean isCombustao() {
        return combustao;
    }

    public void setCombustao(boolean combustao) {
        this.combustao = combustao;
    }

    public Veiculo(String n,String c,double p,int v,boolean i)
    {
        setNome(n);
        setCor(c);
        setPreco(p);
        setVelocidadeMaxima(v);
        setCombustao(i);
    }

    @Override
    public String toString() {
        return "NOME --> "+nome+"   COR --> "+cor+"   PREÇO --> R$"+preco+"   VELOCIDADE MÁXIMA --> "+velocidadeMaxima+"Km/h   COMBUSTAO --> "+combustao;
    }
}
