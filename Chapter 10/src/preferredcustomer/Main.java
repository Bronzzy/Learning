package preferredcustomer;

public class Main {
    public static void main(String[] args) {
        PreferredCustomer preferredCustomer = new PreferredCustomer("Vu",
                "766 Đ. Võ Văn Kiệt, Phường 1, Quận 5, Thành phố Hồ Chí Minh",
                "0909319241", 1929512,false,3000);
        System.out.print("Person name: " + preferredCustomer.getPersonName());
        System.out.print("\nPerson address: " + preferredCustomer.getPersonAddress());
        System.out.print("\nPerson number: " + preferredCustomer.getPersonTelephoneNumber());
        System.out.print("\nCustomer number: " + preferredCustomer.getCustomerNumber());
        System.out.print("\nDo person want to be on mailing list: " + preferredCustomer.onMailingList(false));
        System.out.print("\nAmount of purchases: " + preferredCustomer.getAmountPurchased());
        System.out.print("\nDiscount: " + preferredCustomer.getDiscountLevel());
    }
}
