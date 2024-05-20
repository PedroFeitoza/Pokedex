// package com.app.pokedex.controller;

// import java.io.IOException;
// import java.util.List;

// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestBody;

// import com.app.pokedex.model.Pokemon;
// import com.app.pokedex.service.PokemonService;
// import com.opencsv.exceptions.CsvDataTypeMismatchException;
// import com.opencsv.exceptions.CsvRequiredFieldEmptyException;

// public class PokedexController {
//     private final PokedexService pokedexService;

//     public PokedexController(PokedexService pokedexService) {
//         this.pokedexService = pokedexService;
//     }

//         @GetMapping
//     public List<Pokemon> getAll() throws IOException {
//         return pokedexService.getAll();
//     }

//     @GetMapping("/{id}")
//     public Pokemon getById(@PathVariable Long id) throws IOException {
//         return pokedexService.getById(id);
//     }

//     @PostMapping(value = "/add", consumes = "application/json", produces = "application/json")
//     public Pokemon createItem(@RequestBody Pokemon pokemon) throws CsvDataTypeMismatchException, CsvRequiredFieldEmptyException, IOException {
//        return pokedexService.saveItem(pokemon);
//     }
// }

