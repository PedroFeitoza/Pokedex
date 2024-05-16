package com.app.pokedex.service.base;

import org.springframework.stereotype.Service;

import com.app.pokedex.model.base.BaseModel;
import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;

import java.io.*;
import java.util.List;

@Service
public abstract class FileService<T extends BaseModel> {

    public abstract String getFileName();

    private char separator = ';';

    protected List<T> getAllFile() throws IOException {
        try {
            List<T> lista = new CsvToBeanBuilder<T>(new FileReader(getFileName()))
                    .withSeparator(separator)
                    .withType(getGenericClass())
                    .build()
                    .parse();

            return lista;
        } catch (IOException e) {
            e.printStackTrace();
            throw new IOException("Erro ao ler o arquivo CSV", e);
        }
    }

    protected T getItemByIdFromFile(Long id) throws IOException {
        try {
            List<T> lista = this.getAllFile();

            return lista.stream().filter(item -> item.getId().equals(id))
                    .findFirst()
                    .orElseThrow(() -> new RuntimeException("Item não encontrado"));
        } catch (IOException e) {
            e.printStackTrace();
            throw new IOException("Erro ao ler o arquivo CSV", e);
        }
    }

    protected T saveItemInFile(T novoItem) throws IOException, CsvDataTypeMismatchException, CsvRequiredFieldEmptyException {
        try {
            List<T> lista = this.getAllFile();

            long novoId = gerarNovoId(lista);
            novoItem.setId(novoId);
            lista.add(novoItem);

            Writer writer = new FileWriter(getFileName());
            StatefulBeanToCsv<T> beanToCsv = new StatefulBeanToCsvBuilder<T>(writer)
                    .withSeparator(separator)
                    .build();
            beanToCsv.write(lista);
            writer.close();

            return novoItem;
        } catch (IOException e) {
            e.printStackTrace();
            throw new IOException("Erro ao salvar o novo item no arquivo CSV", e);
        }
    }

    protected abstract Class<T> getGenericClass();

    private long gerarNovoId(List<T> lista) {
        long maxId = 0;

        for (T item : lista) {
            if (item.getId() > maxId) {
                maxId = item.getId();
            }
        }

        return maxId + 1;
    }
}