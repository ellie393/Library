package edu.buem.lavro.library.form;

public class LendForm {
    private String id;
    private String book;
    private String reader;
    private String issuedDate;
    private String expectedReturnDate;
    private int amountOfDiscount;
    private String actualReturnDate;
    private String isOvertimedOrDamaged;
    private int finalSum;

    public LendForm() {
    }

    public LendForm(String id, String book, String reader, String issuedDate, String expectedReturnDate, int amountOfDiscount, String actualReturnDate, String isOverOrDamaged, int finalSum) {
        this.id = id;
        this.book = book;
        this.reader = reader;
        this.issuedDate = issuedDate;
        this.expectedReturnDate = expectedReturnDate;
        this.amountOfDiscount = amountOfDiscount;
        this.actualReturnDate = actualReturnDate;
        this.isOvertimedOrDamaged = isOverOrDamaged;
        this.finalSum = finalSum;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIsOvertimedOrDamaged() {
        return isOvertimedOrDamaged;
    }

    public void setIsOvertimedOrDamaged(String isOvertimedOrDamaged) {
        this.isOvertimedOrDamaged = isOvertimedOrDamaged;
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
        return issuedDate;
    }

    public void setIssuedDate(String issuedDate) {
        this.issuedDate = issuedDate;
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
        return actualReturnDate;
    }

    public void setActualReturnDate(String actualReturnDate) {
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
