package edu.buem.lavro.library.model;


import java.util.Objects;

public class Reader {
    private String ReaderID;
    private String firstName;
    private String middleName;
    private String lastName;
    private String Address;
    private String TelephoneNumber;

    public Reader() {
    }

    public Reader(String firstName, String middleName, String lastName, String address, String telephoneNumber) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        Address = address;
        TelephoneNumber = telephoneNumber;
    }

    public String getReaderID() {
        return ReaderID;
    }

    public void setReaderID(String readerID) {
        ReaderID = readerID;
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
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getTelephoneNumber() {
        return TelephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        TelephoneNumber = telephoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reader reader = (Reader) o;
        return ReaderID.equals(reader.ReaderID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ReaderID);
    }

    @Override
    public String toString() {
        return "Reader{" +
                "ReaderID='" + ReaderID + '\'' +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", Address='" + Address + '\'' +
                ", TelephoneNumber='" + TelephoneNumber + '\'' +
                '}';
    }
}
