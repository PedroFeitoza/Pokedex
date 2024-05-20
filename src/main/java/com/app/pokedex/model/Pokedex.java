package com.app.pokedex.model;

import com.app.pokedex.model.base.BaseModel;
import com.opencsv.bean.CsvBindByName;

public class Pokedex implements BaseModel {
    @CsvBindByName(column = "ID Pokedex")
    private Long Id;

    @CsvBindByName(column = "ID Treinador")
    private Long Idtreinador;

    @CsvBindByName(column = "ID Pokemon")
    private Long Idpokemon;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        this.Id = id;
    }

    public Long getIdtreinador() {
        return Idtreinador;
    }

    public void setIdtreinador(Long IDtreinador) {
        this.Idtreinador = IDtreinador;
    }

    public Long getIdpokemon() {
        return Idpokemon;
    }

    public void setIdpokemon(Long IDpokemon) {
        this.Idpokemon = IDpokemon;
    }
}