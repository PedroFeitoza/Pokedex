package com.app.pokedex.model;

public class Treinador {
    private String nome;
    private String liga;
    private long id;

    public Long getId() {
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

    public String getLiga() {
        return nome;
    }

    public void setLiga(String liga) {
        this.liga = liga;
    }

    @Override
    public String toString() {
        return "Treinador{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", liga='" + liga + '\'' +
                '}';

    }
}