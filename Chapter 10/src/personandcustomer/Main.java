package personandcustomer;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Jack", "101 11th Avenue", "929512",
                193953, false);

        System.out.println("Person name: " + customer.getPersonName());
        System.out.println("Person address: " + customer.getPersonAddress());
        System.out.println("Person telephone number: " + customer.getPersonTelephoneNumber());
        System.out.println("Customer number " + customer.getCustomerNumber());
        System.out.println("Do person want to be on mailing list: " + customer.onMailingList(false));
    }
}
