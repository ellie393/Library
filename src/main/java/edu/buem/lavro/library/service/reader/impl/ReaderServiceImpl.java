package edu.buem.lavro.library.service.reader.impl;

import edu.buem.lavro.library.model.Reader;
import edu.buem.lavro.library.repository.ReaderFakeRep;
import edu.buem.lavro.library.service.reader.ReaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReaderServiceImpl implements ReaderService {
    @Autowired
    ReaderFakeRep repository;

    @Override
    public Reader add(Reader reader) {
        return repository.addReader(reader);
    }

    @Override
    public void delete(String id) {
        repository.deleteByID(id);
    }

    @Override
    public Reader update(Reader reader) {
        return repository.update(reader);
    }

    @Override
    public Reader get(String id) {
        return repository.getByID(id);
    }

    @Override
    public List<Reader> getAll() {
        return repository.getAll();
    }
}
