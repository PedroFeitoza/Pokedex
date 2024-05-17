package com.app.pokedex.model;

public class Pokedex {
    private long Id;
    private long Idtreinador;
    private long Idpokemon;
        
     public long getId () {
       return Id;
     }
        
    public void setId(long ID) {
        this.Id = ID;
    }
        
    public long getIdtreinador () {
        return Idtreinador;
    }
        
    public void setIdtreinador(long IDtreinador) {
        this.Idtreinador = IDtreinador;
    }
        
    public long getIdpokemon () {
        return Idpokemon;
    }
        
    public void setIdpokemon (long IDpokemon) {
        this.Idpokemon = IDpokemon;
    }
         
}

