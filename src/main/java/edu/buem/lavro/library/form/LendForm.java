package edu.buem.lavro.library.form;

import edu.buem.lavro.library.model.Book;
import edu.buem.lavro.library.model.Reader;

import java.time.LocalDate;

public class LendForm {
    private Book book;
    private Reader reader;
    private LocalDate IssuedDate;
    private LocalDate expectedReturnDate;
    private int amountOfDiscount;
    private int amountOfFine;
    private LocalDate ActualReturnDate;
    private boolean isOverOrDamaged;
    private int finalSum;

    public LendForm() {
    }

    public LendForm(Book book, Reader reader, LocalDate issuedDate, LocalDate expectedReturnDate, int amountOfDiscount, int amountOfFine, LocalDate actualReturnDate, boolean isOverOrDamaged, int finalSum) {
        this.book = book;
        this.reader = reader;
        IssuedDate = issuedDate;
        this.expectedReturnDate = expectedReturnDate;
        this.amountOfDiscount = amountOfDiscount;
        this.amountOfFine = amountOfFine;
        ActualReturnDate = actualReturnDate;
        this.isOverOrDamaged = isOverOrDamaged;
        this.finalSum = finalSum;
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

    public int getAmountOfFine() {
        return amountOfFine;
    }

    public void setAmountOfFine(int amountOfFine) {
        this.amountOfFine = amountOfFine;
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

    @Override
    public String toString() {
        return "LendForm{" +
                "book=" + book +
                ", reader=" + reader +
                ", IssuedDate=" + IssuedDate +
                ", expectedReturnDate=" + expectedReturnDate +
                ", amountOfDiscount=" + amountOfDiscount +
                ", amountOfFine=" + amountOfFine +
                ", ActualReturnDate=" + ActualReturnDate +
                ", finalSum=" + finalSum +
                '}';
    }
}
