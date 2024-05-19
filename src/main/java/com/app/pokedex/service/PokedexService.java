package com.app.pokedex.service;

import java.io.IOException;
import java.util.List;

import com.app.pokedex.model.Pokedex;
import com.app.pokedex.model.Pokemon;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;

public class PokedexService {
     @Override
    public String getFileName() {
        return "src\\main\\resources\\data\\pokedex.csv";
    }

    @Override
    protected Class<Pokedex> getClassPokedex() {
        return Pokedex.class;
    }

    public List<Pokedex> getAll() throws IOException {
        return this.getAllFromFile();
    }

    public Pokedex getById(Long id) throws IOException {
        return this.getItemByIdFromFile(id);
    }

    public Pokedex saveItem(Pokedex e) throws CsvDataTypeMismatchException, CsvRequiredFieldEmptyException, IOException {
        return this.saveItemInFile(e);
    }
}

