package problem1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int input;

        Scanner kb = new Scanner(System.in);
        SmartPhoneLists smartPhonesList = new SmartPhoneLists();

        do {
            System.out.println("Menu: " +
                    "\n1. Add smart phone" +
                    "\n2. Delete smart phone" +
                    "\n3. View the list of all smart phones" +
                    "\n4. Sort the list of the smart phones by price" +
                    "\n5. Search smart phone by ID" +
                    "\n6. Search smart phone by min price and max price" +
                    "\n7. List of smart phones by manufacturer" +
                    "\n8. Exit");
            input = kb.nextInt();
            switch (input) {
                case 1:
                    System.out.println("Adding");
                    smartPhonesList.addSmartPhone();
                    break;
                case 2:
                    System.out.println("Deleting");
                    smartPhonesList.deletePhone();
                    break;
                case 3:
                    System.out.println("View the list of all smart phones");
                    smartPhonesList.viewPhoneList();
                    break;
                case 4:
                    System.out.println("Sorting");
                    smartPhonesList.sortPhone();
                    break;
                case 5:
                    System.out.println("Searching");
                    smartPhonesList.searchPhoneByID();
                    break;
                case 6:
                    System.out.println("Searching phone by min and max price");
                    smartPhonesList.searchPhoneByMinMaxPrice();
                    break;
                case 7:
                    System.out.println("List phone by manufacturer");
                    smartPhonesList.listPhoneByManufacturer();
                    break;
                case 99:
                    lazyinit(smartPhonesList);
                    break;
                default:
                    System.out.println("Invalid menu option");
                    break;
            }
        } while (input != 8);
    }

    public static void lazyinit(SmartPhoneLists smartPhonesList) {
        
        smartPhonesList.addSmartPhone(new Phone(1, "apple", 159.99, "2017", "no la dien thoai apple"));
        smartPhonesList.addSmartPhone(new Phone(2, "oppo", 300.99, "2018", "no la dien thoai oppo"));
        smartPhonesList.addSmartPhone(new Phone(3, "samsung", 100.99, "2019", "no la dien thoai samsung"));
        smartPhonesList.addSmartPhone(new Phone(4, "huawei", 200.99, "2020", "no la dien thoai huawei"));
        smartPhonesList.addSmartPhone(new Phone(5, "xiaomi", 250.99, "2021", "no la dien thoai xiaomi"));
    }
}
