package edu.buem.lavro.library.controller.api;

import edu.buem.lavro.library.model.Book;
import edu.buem.lavro.library.service.book.impl.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/books/")
@RestController
public class BookRestController {
    @Autowired
    BookServiceImpl bookService;

    @GetMapping("")
    public List<Book> getAll() {
        return bookService.seeAll();
    }

    @GetMapping("/{id}")
    public Book getBookByID(@PathVariable String id) {
        return bookService.get(id);
    }

    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable String id) {
        bookService.delete(id);
    }

    @PostMapping()
    public Book create(@RequestBody Book book) {
        return bookService.add(book);
    }

    @PutMapping()
    public Book update(@RequestBody Book book) {
        return bookService.update(book);
    }

//    @PostMapping("")
//    public List<Book> saveAll(List<Book> books) {
//        return bookService.saveAll(books);
//    }
}
