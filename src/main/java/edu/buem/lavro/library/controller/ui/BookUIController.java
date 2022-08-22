package edu.buem.lavro.library.controller.ui;

import edu.buem.lavro.library.model.Book;
import edu.buem.lavro.library.service.book.impl.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequestMapping("/ui/books/")
@Controller
public class BookUIController {
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


}
