package edu.buem.lavro.library.controller.ui;

import edu.buem.lavro.library.form.ReaderForm;
import edu.buem.lavro.library.model.Reader;
import edu.buem.lavro.library.model.Types;
import edu.buem.lavro.library.service.reader.impl.ReaderServiceImpl;
import lombok.var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/ui/readers/")
@Controller
public class ReaderUIController {
    @Autowired
    ReaderServiceImpl service;

    @GetMapping("")
    public String getAll(Model model) {
        model.addAttribute("readers", service.getAll());
        return "readers";
    }

    @GetMapping("/{id}")
    public Reader getBookByID(@PathVariable String id) {
        return service.get(id);
    }

    @GetMapping("/delete/{id}")
    public String deleteBook(@PathVariable("id") String id) {
        service.delete(id);
        return "redirect:/ui/readers/";//можливо треба буде просто замінити на сторінку з книжками(треба подивтися чи так буде відображатись кнопки повернення, і т.д)
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String create(Model model) {
        ReaderForm readerForm = new ReaderForm();
        model.addAttribute("form", readerForm);
        var types = Types.values();
        model.addAttribute("types", types);
        return "addReader";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String create(@ModelAttribute("form") ReaderForm form) {
        Reader reader = new Reader();
        reader.setFirstName(form.getFirstName());
        reader.setMiddleName(form.getMiddleName());
        reader.setLastName(form.getLastName());
        reader.setAddress(form.getAddress());
        reader.setTelephoneNumber(form.getTelephoneNumber());
        reader.setReaderTypes(form.getTypes());
        service.add(reader);
        return "redirect:/ui/readers/";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public String update(Model model, @PathVariable("id") String id) {
        Reader readerToUpdate = service.get(id);
        ReaderForm readerForm = new ReaderForm();
        readerForm.setReaderID(readerToUpdate.getReaderID());
        readerForm.setFirstName(readerToUpdate.getFirstName());
        readerForm.setMiddleName(readerToUpdate.getMiddleName());
        readerForm.setLastName(readerToUpdate.getLastName());
        readerForm.setAddress(readerToUpdate.getAddress());
        readerForm.setTelephoneNumber(readerToUpdate.getTelephoneNumber());
        readerForm.setTypes(readerToUpdate.getReaderTypes());
        var types = Types.values();
        model.addAttribute("types", types);
        model.addAttribute("form", readerForm);
        return "updateReader";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.POST)
    public String update(@ModelAttribute("form") ReaderForm form) {
        System.out.println(form);
        Reader readerToUpdate = new Reader();
        readerToUpdate.setReaderID(form.getReaderID());
        readerToUpdate.setFirstName(form.getFirstName());
        readerToUpdate.setMiddleName(form.getMiddleName());
        readerToUpdate.setLastName(form.getLastName());
        readerToUpdate.setAddress(form.getAddress());
        readerToUpdate.setTelephoneNumber(form.getTelephoneNumber());
        readerToUpdate.setReaderTypes(form.getTypes());

        service.update(readerToUpdate);
        return "redirect:/ui/readers/";
    }

}
