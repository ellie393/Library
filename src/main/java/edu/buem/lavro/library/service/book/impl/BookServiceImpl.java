package edu.buem.lavro.library.service.book.impl;

import edu.buem.lavro.library.model.Book;
import edu.buem.lavro.library.repository.BookMongoRep;
import edu.buem.lavro.library.service.book.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    BookMongoRep repository;

    @Override
    public Book add(Book book) {
        return repository.save(book);
    }

    @Override
    public void delete(String id) {
        repository.deleteById(id);
    }


    @Override
    public Book update(Book book) {
        return repository.save(book);
    }

    @Override
    public Book get(String id) {
        return repository.findById(id).get();
    }


    @Override
    public List<Book> seeAll() {
        return repository.findAll();
    }

    public List<Book> saveAll(List<Book> books) {
        return repository.saveAll(books);
    }
}
