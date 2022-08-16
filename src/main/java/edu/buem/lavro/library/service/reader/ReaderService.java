package edu.buem.lavro.library.service.reader;

import edu.buem.lavro.library.model.Reader;

import java.util.List;

public interface ReaderService {
    Reader add(Reader reader);
    void delete(String id);
    Reader update(Reader reader);
    Reader get(String id);
    List<Reader> getAll();
}
