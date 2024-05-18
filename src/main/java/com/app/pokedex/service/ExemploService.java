package com.app.pokedex.service;

import java.io.IOException;
import java.util.List;

import org.springframework.stereotype.Service;

import com.app.pokedex.model.ExemploModel;
import com.app.pokedex.service.base.FileService;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;

@Service
public class ExemploService extends FileService<ExemploModel> {
    @Override
    public String getFileName() {
        return "src\\main\\resources\\data\\exemplo.csv";
    }

    @Override
    protected Class<ExemploModel> getClassModel() {
        return ExemploModel.class;
    }

    public List<ExemploModel> getAll() throws IOException {
        return this.getAllFromFile();
    }

    public ExemploModel getById(Long id) throws IOException {
        return this.getItemByIdFromFile(id);
    }

    public ExemploModel saveItem(ExemploModel e) throws CsvDataTypeMismatchException, CsvRequiredFieldEmptyException, IOException {
        return this.saveItemInFile(e);
    }
}