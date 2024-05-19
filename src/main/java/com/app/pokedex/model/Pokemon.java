package com.app.pokedex.model;

import com.app.pokedex.model.base.BaseModel;

public class Pokemon implements BaseModel {

    private String nome; 
    private String tipo;
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