package edu.buem.lavro.library.service.reader.impl;

import edu.buem.lavro.library.model.Reader;
import edu.buem.lavro.library.repository.ReaderMongoRep;
import edu.buem.lavro.library.service.reader.ReaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ReaderServiceImpl implements ReaderService {
    @Autowired
    ReaderMongoRep repository;

    @Override
    public Reader add(Reader reader) {
        return repository.save(reader);
    }

    @Override
    public void delete(String id) {
        repository.deleteById(id);
    }

    @Override
    public Reader update(Reader reader) {
        return repository.save(reader);
    }

    @Override
    public Reader get(String id) {
        return repository.findById(id).get();
    }

    @Override
    public List<Reader> getAll() {
        return repository.findAll();
    }
}
