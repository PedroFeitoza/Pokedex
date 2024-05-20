package com.app.pokedex.model;

import com.app.pokedex.model.base.BaseModel;
import com.opencsv.bean.CsvBindByName;

public class Pokemon implements BaseModel {
    @CsvBindByName(column = "Nome Pokemon")
    private String nome; 
    @CsvBindByName(column = "Tipo Pokemon")
    private String tipo;
    @CsvBindByName(column = "ID Pokemon")
    private long id;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    //getter e setter ID 
    public Long getId() {
        return id;
    }

    public void setId(Long PokeId) {
        id = PokeId;
    }

    //getter e setter Nome 
    public void setNome(String meuNome){
        nome = meuNome;

    }

    public String getNome() {
        return nome; 
    }

}