package com.app.pokedex.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.pokedex.model.Pokemon;
import com.app.pokedex.service.PokemonService;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;

@RestController
@RequestMapping("/api/Pokemon")
public class PokemonController {
    private final PokemonService pokemonService;

    public PokemonController(PokemonService pokemonService) {
        this.pokemonService = pokemonService;
    }

    @GetMapping
    public List<Pokemon> getAll() throws IOException {
        return pokemonService.getAll();
    }

    @GetMapping("/{id}")
    public Pokemon getById(@PathVariable Long id) throws IOException {
        return pokemonService.getById(id);
    }

    @PostMapping(value = "/add", consumes = "application/json", produces = "application/json")
    public Pokemon createItem(@RequestBody Pokemon pokemon)
            throws CsvDataTypeMismatchException, CsvRequiredFieldEmptyException, IOException {
        return pokemonService.saveItem(pokemon);
    }
}
