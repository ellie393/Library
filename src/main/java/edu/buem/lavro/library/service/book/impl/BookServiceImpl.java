package edu.buem.lavro.library.service.book.impl;

import edu.buem.lavro.library.model.Book;
import edu.buem.lavro.library.model.Genres;
import edu.buem.lavro.library.repository.BookMongoRep;
import edu.buem.lavro.library.service.book.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    private List<Book> bookList = new ArrayList<>(
            Arrays.asList(
                    new Book("1","In Search of Lost Time", "Marcel Proust", 200, 100, Genres.Biography, 60),
                    new Book("2","Ulysses", "James Joyce", 100, 50, Genres.Fantasy, 70),
                    new Book("3","Don Quixote", "Miguel de Cervantes", 150, 100, Genres.History, 100),
                    new Book("4"," The Great Gatsby", "F. Scott Fitzgerald", 200, 150, Genres.Biography, 70),
                    new Book("5","One Hundred Years of Solitude", "Gabriel Garcia Marquez", 120, 130, Genres.Action_and_Adventure, 60)
            )
    );
    @Autowired
    BookMongoRep repository;

//    @PostConstruct
//    void init(){
//        repository.saveAll(bookList);
//    }

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
}
