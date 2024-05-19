package com.app.pokedex.service;
import org.springframework.stereotype.Service;

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
    


}
