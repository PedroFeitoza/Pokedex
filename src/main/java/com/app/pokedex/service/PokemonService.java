package com.app.pokedex.service;
import java.io.IOException;
import java.util.List;

import org.springframework.stereotype.Service;

import com.app.pokedex.model.ExemploModel;
import com.app.pokedex.model.Pokemon;
import com.app.pokedex.service.base.FileService;

@Service
public class PokemonService extends FileService<Pokemon>{


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

        public  Pokemon getById(Long id) throws IOException {
            return this.getItemByIdFromFile(id);

    }
    


}
