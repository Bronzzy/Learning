package preferredcustomer;

import personandcustomer.Customer;

public class PreferredCustomer extends Customer {
    private int amountPurchased;
    private double discountLevel;


    public PreferredCustomer(String personName, String personAddress, String personTelephoneNumber,
                             int customerNumber, boolean onMailingList,
                             int amountPurchased) {
        super(personName, personAddress, personTelephoneNumber, customerNumber, onMailingList);
        this.amountPurchased = amountPurchased;
    }

    public int getAmountPurchased() {
        return amountPurchased;
    }

    public void setAmountPurchased(int amountPurchased) {
        this.amountPurchased = amountPurchased;
    }

    public double getDiscountLevel() {
        if (amountPurchased < 1000 && amountPurchased >= 500) {
            discountLevel = amountPurchased / 100 * 5;
        }
        if (amountPurchased >= 1000 && amountPurchased < 1500) {
            discountLevel = amountPurchased / 100 * 6;
        }
        if (amountPurchased >= 1500 && amountPurchased < 2000) {
            discountLevel = amountPurchased / 100 * 7;
        } else {
            discountLevel = amountPurchased / 100 * 10;
        }
        return discountLevel;
    }

    public void setDiscountLevel(double discountLevel) {
        this.discountLevel = discountLevel;
    }
}
