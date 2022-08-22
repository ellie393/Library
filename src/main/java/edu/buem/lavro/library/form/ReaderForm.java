package edu.buem.lavro.library.form;

import edu.buem.lavro.library.model.ReaderTypes;

public class ReaderForm {
    private String readerID;
    private String firstName;
    private String middleName;
    private ReaderTypes readerTypes;
    private String lastName;
    private String address;
    private String telephoneNumber;

    public ReaderForm() {
    }

    public ReaderForm(String readerID, String firstName, String middleName, ReaderTypes readerTypes, String lastName, String address, String telephoneNumber) {
        this.readerID = readerID;
        this.firstName = firstName;
        this.middleName = middleName;
        this.readerTypes = readerTypes;
        this.lastName = lastName;
        this.address = address;
        this.telephoneNumber = telephoneNumber;
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

    public ReaderTypes getReaderTypes() {
        return readerTypes;
    }

    public void setReaderTypes(ReaderTypes readerTypes) {
        this.readerTypes = readerTypes;
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
    public String toString() {
        return "ReaderForm{" +
                "readerID='" + readerID + '\'' +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", readerTypes=" + readerTypes +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", telephoneNumber='" + telephoneNumber + '\'' +
                '}';
    }
}
