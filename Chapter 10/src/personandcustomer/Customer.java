package personandcustomer;

public class Customer extends Person{
    private int customerNumber;
    private boolean onMailingList;

    public Customer(String personName, String personAddress, String personTelephoneNumber,
                    int customerNumber, boolean onMailingList) {
        super(personName, personAddress, personTelephoneNumber);
        this.customerNumber = customerNumber;
        this.onMailingList = onMailingList;
    }

    public int getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }

    public boolean isOnMailingList() {
        return onMailingList;
    }

    public void setOnMailingList(boolean onMailingList) {
        this.onMailingList = onMailingList;
    }
    public String onMailingList(boolean onMailingList){
        String str = "";
        if (onMailingList == true){
            str = "Yes";
        }else{
            str = "No";
        }
        return str;
    }
}
