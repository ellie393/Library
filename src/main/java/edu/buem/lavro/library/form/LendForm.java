package edu.buem.lavro.library.form;

import edu.buem.lavro.library.model.Book;
import edu.buem.lavro.library.model.Reader;

import java.time.LocalDate;

public class LendForm {
    private String id;
    private Book book;
    private Reader reader;
    private LocalDate issuedDate;
    private LocalDate expectedReturnDate;
    private int amountOfDiscount;
    private LocalDate actualReturnDate;
    private boolean isOverOrDamaged;
    private int finalSum;

    public LendForm() {
    }

    public LendForm(String id, Book book, Reader reader, LocalDate issuedDate, LocalDate expectedReturnDate, int amountOfDiscount, LocalDate actualReturnDate, boolean isOverOrDamaged, int finalSum) {
        this.id = id;
        this.book = book;
        this.reader = reader;
        this.issuedDate = issuedDate;
        this.expectedReturnDate = expectedReturnDate;
        this.amountOfDiscount = amountOfDiscount;
        this.actualReturnDate = actualReturnDate;
        this.isOverOrDamaged = isOverOrDamaged;
        this.finalSum = finalSum;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isOverOrDamaged() {
        return isOverOrDamaged;
    }

    public void setOverOrDamaged(boolean overOrDamaged) {
        isOverOrDamaged = overOrDamaged;
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
        return issuedDate;
    }

    public void setIssuedDate(LocalDate issuedDate) {
        this.issuedDate = issuedDate;
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
        return actualReturnDate;
    }

    public void setActualReturnDate(LocalDate actualReturnDate) {
        this.actualReturnDate = actualReturnDate;
    }

    public int getFinalSum() {
        return finalSum;
    }

    public void setFinalSum(int finalSum) {
        this.finalSum = finalSum;
    }

    @Override
    public String toString() {
        return "LendForm{" +
                "book=" + book +
                ", reader=" + reader +
                ", IssuedDate=" + issuedDate +
                ", expectedReturnDate=" + expectedReturnDate +
                ", amountOfDiscount=" + amountOfDiscount +
                ", ActualReturnDate=" + actualReturnDate +
                ", finalSum=" + finalSum +
                '}';
    }
}
