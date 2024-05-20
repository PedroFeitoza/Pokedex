package com.app.pokedex.model;

import com.app.pokedex.model.base.BaseModel;
import com.opencsv.bean.CsvBindByName;

public class Treinador implements BaseModel {
    @CsvBindByName(column = "Nome Treinador")
    private String nome;
    @CsvBindByName(column = "Liga")
    private String liga;
    @CsvBindByName(column = "Id")
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLiga() {
        return liga;
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