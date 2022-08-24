package edu.buem.lavro.library.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Document
public class Lend {
    @Id
    private String id;
    private Book book;
    private Reader reader;
    private LocalDate IssuedDate;
    private LocalDate expectedReturnDate;
    private int amountOfDiscount;
    private LocalDate ActualReturnDate;
    private boolean isOvertimedOrDamaged = false;
    private int finalSum;


    public Lend() {
    }

    public Lend(String id, Book book, Reader reader, LocalDate issuedDate, LocalDate expectedReturnDate, int amountOfDiscount, LocalDate actualReturnDate, boolean isOvertimedOrDamaged, int finalSum) {
        this.id = id;
        this.book = book;
        this.reader = reader;
        IssuedDate = issuedDate;
        this.expectedReturnDate = expectedReturnDate;
        this.amountOfDiscount = amountOfDiscount;
        ActualReturnDate = actualReturnDate;
        this.isOvertimedOrDamaged = isOvertimedOrDamaged;
        this.finalSum = finalSum;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isOvertimedOrDamaged() {
        return isOvertimedOrDamaged;
    }

    public void setOvertimedOrDamaged(boolean overtimedOrDamaged) {
        isOvertimedOrDamaged = overtimedOrDamaged;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Reader getReader() {
        return reader;
    }

    public void setReader(Reader reader) {
        this.reader = reader;
    }

    public LocalDate getIssuedDate() {
        return IssuedDate;
    }

    public void setIssuedDate(LocalDate issuedDate) {
        IssuedDate = issuedDate;
    }

    public LocalDate getExpectedReturnDate() {
        return expectedReturnDate;
    }

    public void setExpectedReturnDate(LocalDate expectedReturnDate) {
        this.expectedReturnDate = expectedReturnDate;
    }

    public int getAmountOfDiscount() {
        return amountOfDiscount;
    }

    public void setAmountOfDiscount(int amountOfDiscount) {
        this.amountOfDiscount = amountOfDiscount;
    }


    public LocalDate getActualReturnDate() {
        return ActualReturnDate;
    }

    public void setActualReturnDate(LocalDate actualReturnDate) {
        ActualReturnDate = actualReturnDate;
    }

    public int getFinalSum() {
        return finalSum;
    }

    public void setFinalSum(int finalSum) {
        this.finalSum = finalSum;
    }
}
