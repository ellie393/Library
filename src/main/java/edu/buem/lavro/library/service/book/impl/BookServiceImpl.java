package edu.buem.lavro.library.service.book.impl;

import edu.buem.lavro.library.model.Book;
import edu.buem.lavro.library.repository.BookFakeRepos;
import edu.buem.lavro.library.service.book.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    BookFakeRepos repository;

    @Override
    public Book add(Book book) {
        return repository.addBook(book);
    }

    @Override
    public void delete(String id) {
        repository.deleteByID(id);
    }


    @Override
    public Book update(Book book) {
        return repository.update(book);
    }

    @Override
    public Book get(String id) {
        return repository.getByID(id);
    }


    @Override
    public List<Book> seeAll() {
        return repository.getAll();
    }
}
