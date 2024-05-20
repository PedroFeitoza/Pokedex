package com.app.pokedex.service;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import com.app.pokedex.model.Pokemon;
import com.app.pokedex.service.base.FileService;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;

@Service
public class PokemonService extends FileService<Pokemon> {

    @Override
    protected String getFileName() {
        return "src\\main\\resources\\data\\pokemon.csv";
    }

    @Override
    protected Class<Pokemon> getClassModel() {
        return Pokemon.class;

    }

    public List<Pokemon> getAll() throws IOException {
        return this.getAllFromFile();
    }

    public Optional<Pokemon> getById(Long id) throws IOException {
        return this.getItemByIdFromFile(id);

    }

    public Pokemon saveItem(Pokemon e)
            throws CsvDataTypeMismatchException, CsvRequiredFieldEmptyException, IOException {
        return this.saveItemInFile(e);
    }
}
