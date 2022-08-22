package edu.buem.lavro.library.controller.ui;

import edu.buem.lavro.library.form.BookForm;
import edu.buem.lavro.library.model.Book;
import edu.buem.lavro.library.service.book.impl.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@RequestMapping("/ui/books/")
@Controller
public class BookUIController {
    @Autowired
    BookServiceImpl bookService;

    @GetMapping("")
    public String getAll(Model model) {
        model.addAttribute("books", bookService.seeAll());
        return "books";
    }

    @GetMapping("/{id}")
    public Book getBookByID(@PathVariable String id) {
        return bookService.get(id);
    }

    @GetMapping("/delete/{id}")
    public String deleteBook(@PathVariable("id") String id) {
        bookService.delete(id);
        return "redirect:/ui/books/";//можливо треба буде просто замінити на сторінку з книжками(треба подивтися чи так буде відображатись кнопки повернення, і т.д)
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String create(Model model) {
        BookForm bookForm = new BookForm();
        model.addAttribute("form", bookForm);
        return "addBook";
    }

    @PutMapping()
    public Book update(@RequestBody Book book) {
        return bookService.update(book);
    }


}
