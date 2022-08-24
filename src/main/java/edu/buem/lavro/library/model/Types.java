package edu.buem.lavro.library.model;

public enum Types {
    STUDENT(15), CLUBCARD(40), JUNIOR(20), PENSIONER(30), NONE(0);

    private final int discount;

    Types(int discount) {
        this.discount = discount;
    }

    public int getDiscount() {
        return this.discount;
    }
}
