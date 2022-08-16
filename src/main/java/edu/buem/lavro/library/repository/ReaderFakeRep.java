package edu.buem.lavro.library.repository;

import edu.buem.lavro.library.model.Reader;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@Repository
public class ReaderFakeRep {
    private List<Reader> readers = new ArrayList<>(
            Arrays.asList(
                    new Reader("1", "Olena", "Yuriivna", "Lavro","Hlinicka 1, Bratislava", "+380963563289"),
                    new Reader("2", "Daria", "Ivaniivna", "Ivanienko","Donetsk, Ukraine", "+380963563281"),
                    new Reader("3", "Anastasiia", "Vitalievna", "Litvinets","Kharkiv, Ukraine", "+380963563289"),
                    new Reader("4", "Evgenia", "Romanivna", "Logvinovich","Kharkiv, Ukraine", "+380963563229")
            )
    );

    public Reader addReader(Reader reader) {
        reader.setReaderID(UUID.randomUUID().toString());
        this.readers.add(reader);
        return reader;
    }

    public void deleteByID(String id) {
        Reader reader = this.getByID(id);
        int index = readers.indexOf(reader);
        this.readers.remove(index);
    }

    public Reader update(Reader reader) {
        this.deleteByID(reader.getReaderID());
        this.readers.add(reader);
        return reader;
    }

    public Reader getByID(String id) {
        return this.readers.stream().filter(reader -> reader.getReaderID().equals(id)).findFirst().orElse(null);
    }

    public List<Reader> getAll() {
        return this.readers;
    }
}
