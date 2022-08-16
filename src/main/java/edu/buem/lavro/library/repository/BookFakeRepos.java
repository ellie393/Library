package edu.buem.lavro.library.repository;

import edu.buem.lavro.library.model.Book;
import edu.buem.lavro.library.model.Genres;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@Repository
public class BookFakeRepos {
    private List<Book> bookList = new ArrayList<>(
            Arrays.asList(
                    new Book("1","In Search of Lost Time", "Marcel Proust", 200, 100, Genres.Biography, 60),
                    new Book("2","Ulysses", "James Joyce", 100, 50, Genres.Fantasy, 70),
                    new Book("3","Don Quixote", "Miguel de Cervantes", 150, 100, Genres.History, 100),
                    new Book("4"," The Great Gatsby", "F. Scott Fitzgerald", 200, 150, Genres.Biography, 70),
                    new Book("5","One Hundred Years of Solitude", "Gabriel Garcia Marquez", 120, 130, Genres.Action_and_Adventure, 60)
                    )
    );
    public Book update(Book book) {
        this.deleteByID(book.getBookID());
        this.bookList.add(book);
        return book;
    }


    public Book getByID(String id) {
        return this.bookList.stream().filter(book -> book.getBookID().equals(id)).findFirst().orElse(null);
    }

    public void deleteByID(String id) {
        Book book = this.getByID(id);
        int index = bookList.indexOf(book);
        this.bookList.remove(index);
    }

    public Book addBook(Book book) {
        book.setBookID(UUID.randomUUID().toString());
        this.bookList.add(book);
        return book;
    }

    public List<Book> getAll() {
        return this.bookList;
    }
}
