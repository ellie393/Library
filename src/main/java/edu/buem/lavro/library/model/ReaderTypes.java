package edu.buem.lavro.library.model;

public enum ReaderTypes {
    STUDENT(15), CLUBCARD(40), JUNIOR(20), PENSIONER(30);

    private final int discount;

    ReaderTypes(int discount) {
        this.discount = discount;
    }

    public int getDiscount() {
        return this.discount;
    }
}
