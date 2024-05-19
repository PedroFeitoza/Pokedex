package com.app.pokedex.model;

import com.app.pokedex.model.base.BaseModel;
import com.opencsv.bean.CsvBindByName;

public class ExemploModel implements BaseModel {
    @CsvBindByName(column = "Id")
    private Long id;
   
    @CsvBindByName(column = "Nome")
    private String name;

    @CsvBindByName(column = "Tipo")
    private String type;
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
}
