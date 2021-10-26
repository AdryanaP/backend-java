package com.company.service;

public class Serie implements ISerie{

    private String nome;
    private int quantidadeViews;

    public Serie(String nome, int quantidadeViews) {
        this.nome = nome;
        this.quantidadeViews = quantidadeViews;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidadeViews() {
        return quantidadeViews;
    }

    public void setQuantidadeViews(int quantidadeViews) {
        this.quantidadeViews = quantidadeViews;
    }

    @Override
    public String getSerie(Serie serie) {

        return "www." + nome + ".com.br";
    }
}
