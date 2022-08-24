package edu.buem.lavro.library.controller.ui;

import edu.buem.lavro.library.form.BookForm;
import edu.buem.lavro.library.model.Book;
import edu.buem.lavro.library.model.Genres;
import edu.buem.lavro.library.service.book.impl.BookServiceImpl;
import lombok.var;
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
        return "redirect:/ui/books/";
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String create(Model model) {
        BookForm bookForm = new BookForm();
        var genres = Genres.values();
        model.addAttribute("form", bookForm);
        model.addAttribute("genres", genres);
        return "addBooks";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String create(@ModelAttribute("form") BookForm form) {
        Book book = new Book();
        book.setTitle(form.getTitle());
        book.setAuthor(form.getAuthor());
        book.setGenres(form.getGenres());
        book.setRentalPrice(form.getRentalPrice());
        book.setCollateralValue(form.getCollateralValue());
        bookService.add(book);
        return "redirect:/ui/books/";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public String update(Model model, @PathVariable("id") String id) {
        Book bookToUpdate = bookService.get(id);
        BookForm bookForm = new BookForm();
        bookForm.setBookID(bookToUpdate.getBookID());
        bookForm.setTitle(bookToUpdate.getTitle());
        bookForm.setAuthor(bookToUpdate.getAuthor());
        bookForm.setGenres(bookToUpdate.getGenres());
        bookForm.setCollateralValue(bookToUpdate.getCollateralValue());
        bookForm.setRentalPrice(bookToUpdate.getRentalPrice());
        var genres = Genres.values();
        model.addAttribute("form", bookForm);
        model.addAttribute("genres", genres);
        return "updateBook";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.POST)
    public String update(@ModelAttribute("form") BookForm form) {
        System.out.println(form);
        Book bookToUpdate = new Book();
        bookToUpdate.setBookID(form.getBookID());
        bookToUpdate.setTitle(form.getTitle());
        bookToUpdate.setAuthor(form.getAuthor());
        bookToUpdate.setGenres(form.getGenres());
        bookToUpdate.setRentalPrice(form.getRentalPrice());
        bookToUpdate.setCollateralValue(form.getCollateralValue());

        bookService.update(bookToUpdate);
        return "redirect:/ui/books/";
    }


}
