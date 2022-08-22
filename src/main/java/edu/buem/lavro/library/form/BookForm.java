package edu.buem.lavro.library.form;

import edu.buem.lavro.library.model.Genres;

public class BookForm {
    private String bookID;
    private String title;
    private String author;
    private int collateralValue;
    private int rentalPrice;
    private Genres genres;

    public BookForm() {
    }

    public BookForm(String bookID, String title, String author, int collateralValue, int rentalPrice, Genres genres) {
        this.bookID = bookID;
        this.title = title;
        this.author = author;
        this.collateralValue = collateralValue;
        this.rentalPrice = rentalPrice;
        this.genres = genres;
    }

    public String getBookID() {
        return bookID;
    }

    public void setBookID(String bookID) {
        this.bookID = bookID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getCollateralValue() {
        return collateralValue;
    }

    public void setCollateralValue(int collateralValue) {
        this.collateralValue = collateralValue;
    }

    public int getRentalPrice() {
        return rentalPrice;
    }

    public void setRentalPrice(int rentalPrice) {
        this.rentalPrice = rentalPrice;
    }

    public Genres getGenres() {
        return genres;
    }

    public void setGenres(Genres genres) {
        this.genres = genres;
    }
}
