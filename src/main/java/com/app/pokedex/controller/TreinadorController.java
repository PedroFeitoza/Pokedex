package com.app.pokedex.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.pokedex.model.Treinador;
import com.app.pokedex.service.TreinadorService;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;

@RestController
@RequestMapping("/api/treinador")
public class TreinadorController {

    private final TreinadorService treinadorService;

    public TreinadorController(TreinadorService treinadorService) {
        this.treinadorService = treinadorService;
    }

    @GetMapping
    public List<Treinador> getAll() throws IOException {
        return treinadorService.getAll();
    }

    @GetMapping("/{id}")
    public Treinador getById(@PathVariable Long id) throws IOException {
        return treinadorService.getById(id);
    }

    @PostMapping(value = "/add", consumes = "application/json", produces = "application/json")
    public Treinador createItem(@RequestBody Treinador treinador)
            throws CsvDataTypeMismatchException, CsvRequiredFieldEmptyException, IOException {
        return treinadorService.saveItem(treinador);
    }
}
