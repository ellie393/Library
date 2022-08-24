package edu.buem.lavro.library.controller.ui;

import edu.buem.lavro.library.form.LendForm;
import edu.buem.lavro.library.model.Lend;
import edu.buem.lavro.library.service.issuedBooks.impl.LendServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@RequestMapping("/ui/lends/")
@Controller
public class LendUIController {
    @Autowired
    LendServiceImpl service;

    @GetMapping("")
    public String getAll(Model model) {
        model.addAttribute("lends", service.getAll());
        return "lends";
    }

    @GetMapping("/{id}")
    public Lend getLendByID(@PathVariable String id) {
        return service.getIssue(id);
    }

    @GetMapping("/delete/{id}")
    public String deleteLend(@PathVariable("id") String id) {
        service.deleteIssue(id);
        return "redirect:/ui/lends/";
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String create(Model model) {
        LendForm form = new LendForm();
        model.addAttribute("form", form);
        return "addLend";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String create(@ModelAttribute("form") LendForm form) {
        Lend lend = new Lend();
        lend.setBook(form.getBook());
        lend.setReader(form.getReader());
        lend.setIssuedDate(form.getIssuedDate());
        lend.setExpectedReturnDate(form.getExpectedReturnDate());
        lend.setAmountOfDiscount(form.getAmountOfDiscount());
        lend.setActualReturnDate(form.getActualReturnDate());
        lend.setOvertimedOrDamaged(form.getIsOvertimedOrDamaged());
        lend.setFinalSum(form.getFinalSum());
        service.addNewIssue(lend);
        return "redirect:/ui/lends/";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public String update(Model model, @PathVariable("id") String id) {
        Lend lendToUpdate = service.getIssue(id);
        LendForm form = new LendForm();
        form.setId(lendToUpdate.getId());
        form.setBook(lendToUpdate.getBook());
        form.setReader(lendToUpdate.getReader());
        form.setIssuedDate(lendToUpdate.getIssuedDate());
        form.setExpectedReturnDate(lendToUpdate.getExpectedReturnDate());
        form.setAmountOfDiscount(lendToUpdate.getAmountOfDiscount());
        form.setActualReturnDate(lendToUpdate.getActualReturnDate());
        form.setIsOvertimedOrDamaged(lendToUpdate.isOvertimedOrDamaged());
        form.setFinalSum(lendToUpdate.getFinalSum());


        model.addAttribute("form", form);
        return "updateLend";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.POST)
    public String update(@ModelAttribute("form") LendForm form) {
        System.out.println(form);
        Lend lendToUpdate = new Lend();
        lendToUpdate.setId(form.getId());
        lendToUpdate.setBook(form.getBook());
        lendToUpdate.setReader(form.getReader());
        lendToUpdate.setIssuedDate(form.getIssuedDate());
        lendToUpdate.setExpectedReturnDate(form.getExpectedReturnDate());
        lendToUpdate.setAmountOfDiscount(form.getAmountOfDiscount());
        lendToUpdate.setActualReturnDate(form.getActualReturnDate());
        lendToUpdate.setOvertimedOrDamaged(form.getIsOvertimedOrDamaged());
        lendToUpdate.setFinalSum(form.getFinalSum());


        service.updateIssue(lendToUpdate);
        return "redirect:/ui/lends/";
    }
}
