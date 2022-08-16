package edu.buem.lavro.library.model;


import java.util.Objects;

public class Book {
    private String bookID;
    private String title;
    private String author;
    private int collateralValue;
    private int rentalPrice;
    private Genres genres;
    private int midTermOfReading;

    public Book() {
    }

    public int getMidTermOfReading() {
        return midTermOfReading;
    }

    public void setMidTermOfReading(int midTermOfReading) {
        this.midTermOfReading = midTermOfReading;
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

    public Enum<Genres> getGenres() {
        return genres;
    }

    public void setGenres(Genres genres) {
        this.genres = genres;
    }

    public Book(String id,String title, String author, int collateralValue, int rentalPrice, Genres genres, int midTermOfReading) {
        this.bookID = id;
        this.title = title;
        this.author = author;
        this.collateralValue = collateralValue;
        this.rentalPrice = rentalPrice;
        this.genres = genres;
        this.midTermOfReading = midTermOfReading;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return bookID.equals(book.bookID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookID);
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookID='" + bookID + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", collateralValue=" + collateralValue +
                ", rentalPrice=" + rentalPrice +
                ", genres=" + genres +
                ", midTermOfReading=" + midTermOfReading +
                '}';
    }
}
