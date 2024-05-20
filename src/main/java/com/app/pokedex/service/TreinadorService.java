package com.app.pokedex.service;

import java.io.IOException;
import java.util.List;

import org.springframework.stereotype.Service;
import com.app.pokedex.model.Treinador;
import com.app.pokedex.service.base.FileService;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;

@Service
public class TreinadorService extends FileService<Treinador>{
    @Override
    protected String getFileName() {
        return "src\\main\\resources\\data\\treinador.csv";
    }

    @Override
    protected Class<Treinador> getClassModel() {
        return Treinador.class;
    }

    public List<Treinador> getAll() throws IOException {
        return this.getAllFromFile();
    }

    public Treinador getById(Long id) throws IOException {
        return this.getItemByIdFromFile(id);
    }

    public Treinador saveItem(Treinador e) throws CsvDataTypeMismatchException, CsvRequiredFieldEmptyException, IOException {
        return this.saveItemInFile(e);
    }
}


