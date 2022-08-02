package edu.buem.lavro.library.model;

import java.time.LocalDate;

public class IssuedBooks {
    private String BookID;
    private String ReaderID;
    private LocalDate IssuedDate;
    private LocalDate expectedReturnDate;
    private int amountOfDiscount;
    private int amountOfFine;
    private LocalDate ActualReturnDate;
    private int finalSum;

    public IssuedBooks() {
    }

    public IssuedBooks(String bookID, String readerID, LocalDate issuedDate, LocalDate expectedReturnDate, int amountOfDiscount, int amountOfFine, LocalDate actualReturnDate, int finalSum) {
        BookID = bookID;
        ReaderID = readerID;
        IssuedDate = issuedDate;
        this.expectedReturnDate = expectedReturnDate;
        this.amountOfDiscount = amountOfDiscount;
        this.amountOfFine = amountOfFine;
        ActualReturnDate = actualReturnDate;
        this.finalSum = finalSum;
    }

    public String getBookID() {
        return BookID;
    }

    public void setBookID(String bookID) {
        BookID = bookID;
    }

    public String getReaderID() {
        return ReaderID;
    }

    public void setReaderID(String readerID) {
        ReaderID = readerID;
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

}
