package edu.buem.lavro.library.service.book;

import edu.buem.lavro.library.model.Book;

import java.util.List;

public interface BookService {
    Book add(Book book);
    void delete(String id);
    Book update(Book book);
    Book get(String id);
    List<Book> seeAll();
}
