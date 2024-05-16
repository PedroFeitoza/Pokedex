package com.app.pokedex.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.pokedex.model.ExemploModel;
import com.app.pokedex.service.ExemploService;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;

@RestController
@RequestMapping("/api/Exemplo")
public class ExemploController {

    private final ExemploService exemploService;

    public ExemploController(ExemploService exemploService) {
        this.exemploService = exemploService;
    }

    @GetMapping
    public List<ExemploModel> getAll() throws IOException {
        return exemploService.getAll();
    }

    @GetMapping("/{id}")
    public ExemploModel getById(@PathVariable Long id) throws IOException {
        return exemploService.getById(id);
    }

    @PostMapping(value = "/add", consumes = "application/json", produces = "application/json")
    public ExemploModel createItem(@RequestBody ExemploModel exemplo) throws CsvDataTypeMismatchException, CsvRequiredFieldEmptyException, IOException {
       return exemploService.saveItem(exemplo);
    }
}
