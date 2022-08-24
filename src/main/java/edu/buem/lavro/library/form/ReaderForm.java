package edu.buem.lavro.library.form;

import edu.buem.lavro.library.model.Types;

public class ReaderForm {
    private String readerID;
    private String firstName;
    private String middleName;
    private Types types;
    private String lastName;
    private String address;
    private String telephoneNumber;

    public ReaderForm() {
    }

    public ReaderForm(String readerID, String firstName, String middleName, Types readerTypes, String lastName, String address, String telephoneNumber) {
        this.readerID = readerID;
        this.firstName = firstName;
        this.middleName = middleName;
        this.types = readerTypes;
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

    public Types getTypes() {
        return types;
    }

    public void setTypes(Types types) {
        this.types = types;
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
                ", readerTypes=" + types +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", telephoneNumber='" + telephoneNumber + '\'' +
                '}';
    }
}
