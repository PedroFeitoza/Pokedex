package com.app.pokedex.model;

public class Pokemon {

    private String nome; 
    public String tipo;
    private int id; 
    //getter e setter ID 
    public int getId() {
        return id;
    }

    public void setId(int PokeId) {
        id = PokeId;
    }

    //getter e setter Nome 
    public void setNome(String meuNome){
        nome = meuNome;
        
    }

    public String getNome() {
        return nome; 
    }


    //MOSTRAR NOME 
    public void mostraNome() {
        System.out.printf("O nome do seu pokemon é %s \n ", getNome());} 
    public void mostrarId() {
        System.out.printf("O ID do seu pokemon é %s \n", getId());
       
    }



public Pokemon(String nome, String tipo){
    this.nome = nome;
    this.tipo = tipo;
    this.id = id;
}

}
