package edu.buem.lavro.library.model;


import java.util.Objects;

public class Reader {
    private String readerID;
    private String firstName;
    private String middleName;
    private String lastName;
    private String address;
    private String telephoneNumber;
    private int amountOfDiscount;
    public Reader() {
    }

    public Reader(String firstName, String middleName, String lastName, String address, String telephoneNumber, int amountOfDiscount) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.address = address;
        this.telephoneNumber = telephoneNumber;
        this.amountOfDiscount = amountOfDiscount;
    }

    public int getAmountOfDiscount() {
        return amountOfDiscount;
    }

    public void setAmountOfDiscount(int amountOfDiscount) {
        this.amountOfDiscount = amountOfDiscount;
    }

    public String getReaderID() {
        return readerID;
    }

    public void setReaderID(String readerID) {
        this.readerID = readerID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reader reader = (Reader) o;
        return readerID.equals(reader.readerID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(readerID);
    }

    @Override
    public String toString() {
        return "Reader{" +
                "ReaderID='" + readerID + '\'' +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", Address='" + address + '\'' +
                ", TelephoneNumber='" + telephoneNumber + '\'' +
                '}';
    }
}
