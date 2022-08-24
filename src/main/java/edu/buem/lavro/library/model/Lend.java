package edu.buem.lavro.library.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Lend {
    @Id
    private String id;
    private String book;
    private String reader;
    private String IssuedDate;
    private String expectedReturnDate;
    private int amountOfDiscount;
    private String ActualReturnDate;
    private String isOvertimedOrDamaged;
    private int finalSum;


    public Lend() {
    }

    public Lend(String id, String book, String reader, String issuedDate, String expectedReturnDate, int amountOfDiscount, String actualReturnDate, String isOvertimedOrDamaged, int finalSum) {
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

    public String isOvertimedOrDamaged() {
        return isOvertimedOrDamaged;
    }

    public void setOvertimedOrDamaged(String overtimedOrDamaged) {
        this.isOvertimedOrDamaged = overtimedOrDamaged;
    }

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }

    public String getReader() {
        return reader;
    }

    public void setReader(String reader) {
        this.reader = reader;
    }

    public String getIssuedDate() {
        return IssuedDate;
    }

    public void setIssuedDate(String issuedDate) {
        IssuedDate = issuedDate;
    }

    public String getExpectedReturnDate() {
        return expectedReturnDate;
    }

    public void setExpectedReturnDate(String expectedReturnDate) {
        this.expectedReturnDate = expectedReturnDate;
    }

    public int getAmountOfDiscount() {
        return amountOfDiscount;
    }

    public void setAmountOfDiscount(int amountOfDiscount) {
        this.amountOfDiscount = amountOfDiscount;
    }


    public String getActualReturnDate() {
        return ActualReturnDate;
    }

    public void setActualReturnDate(String actualReturnDate) {
        ActualReturnDate = actualReturnDate;
    }

    public int getFinalSum() {
        return finalSum;
    }

    public void setFinalSum(int finalSum) {
        this.finalSum = finalSum;
    }
}
