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
import java.util.Optional;
import java.util.stream.Stream;

@Service
public abstract class FileService<T extends BaseModel> {

    protected abstract String getFileName();

    protected abstract Class<T> getClassModel();

    private char separator = ';';

    protected List<T> getAllFromFile() throws IOException {
        try {
            List<T> list = new CsvToBeanBuilder<T>(new FileReader(getFileName()))
                    .withSeparator(separator)
                    .withType(getClassModel())
                    .build()
                    .parse();

            return list;
        } catch (IOException e) {
            e.printStackTrace();
            throw new IOException("Erro ao ler o arquivo CSV", e);
        }
    }

    protected Optional<T> getItemByIdFromFile(Long id) throws IOException {
        try {
            List<T> list = this.getAllFromFile();
            Stream<T> filteredItem = list.stream().filter(item -> item.getId().equals(id));
                                  
            if(filteredItem == null) {
                return null;
            }
            
            return filteredItem.findFirst();
        } catch (IOException e) {
            e.printStackTrace();
            throw new IOException("Erro ao ler o arquivo CSV", e);
        } catch (RuntimeException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    protected T saveItemInFile(T newItem)
            throws IOException, CsvDataTypeMismatchException, CsvRequiredFieldEmptyException {
        try {
            List<T> list = this.getAllFromFile();

            long newId = generateNewId(list);
            newItem.setId(newId);
            list.add(newItem);

            Writer writer = new FileWriter(getFileName());
            StatefulBeanToCsv<T> beanToCsv = new StatefulBeanToCsvBuilder<T>(writer)
                    .withSeparator(separator)
                    .build();
            beanToCsv.write(list);
            writer.close();

            return newItem;
        } catch (IOException e) {
            e.printStackTrace();
            throw new IOException("Erro ao salvar o novo item no arquivo CSV", e);
        }
    }

    private long generateNewId(List<T> list) {
        long maxId = 0;

        for (T item : list) {
            if (item.getId() > maxId) {
                maxId = item.getId();
            }
        }

        return maxId + 1;
    }
}