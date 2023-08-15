package problem1;

import java.util.*;

public class SmartPhoneLists {
    private ArrayList<Phone> smartPhonesList = new ArrayList<>();
    Scanner kb = new Scanner(System.in);


    public void addSmartPhone(Phone phone) {
        smartPhonesList.add(phone);
    }

    public void addSmartPhone() {
        System.out.println("Enter phone id");
        int phoneID = kb.nextInt();
        kb.nextLine();
        System.out.println("Enter phone manufacturer");
        String manufacturer = kb.nextLine();
        System.out.println("Enter phone price");
        double phonePrice = kb.nextDouble();
        kb.nextLine();
        System.out.println("Enter created date");
        String createdDate = kb.nextLine();
        System.out.println("Enter phone description");
        String phoneDescription = kb.nextLine();

        Phone phone = new Phone(phoneID, manufacturer, phonePrice, createdDate, phoneDescription);

        if (smartPhonesList.size() == 0) {
            smartPhonesList.add(phone);
        } else {
            boolean existed = false;
            for (int i = 0; i < smartPhonesList.size(); i++) {
                if (phone.getPhoneID() == smartPhonesList.get(i).getPhoneID()) {
                    existed = true;
                }
            }
            if (!existed) {
                smartPhonesList.add(phone);
                System.out.println("Phone has been added\n");
            } else {
                System.out.println("Phone ID already existed\n");
            }
        }
    }

    public void deletePhone() {

        System.out.println("Enter phone ID you want to delete");
        int phoneID = kb.nextInt();

        for (int i = 0; i < smartPhonesList.size(); i++) {
            if (smartPhonesList.get(i).getPhoneID() == phoneID) {
                smartPhonesList.remove(i);
                System.out.println("Phone Deleted\n");
                break;
            } else {
                System.out.println("Phone was not found\n");
            }
        }
    }

    public void viewPhoneList() {
        for (Phone list : smartPhonesList) {
            System.out.println(list + "\n");
        }
    }

    public void sortPhone() {
        smartPhonesList.sort(new Comparator<Phone>() {
            @Override
            public int compare(Phone o1, Phone o2) {
                return (int) (o1.getPrice() - o2.getPrice());
            }
        });
    }

    public void searchPhoneByID() {

        boolean existed = false;
        System.out.println("Enter phone ID you want to search");
        int phoneID = kb.nextInt();
        for (int i = 0; i < smartPhonesList.size(); i++) {
            if (smartPhonesList.get(i).getPhoneID() == phoneID) {
                System.out.println(smartPhonesList.get(i) + "\n");
                break;
            } else {
                System.out.println("Phone ID not found\n");
            }
        }
    }

    public void searchPhoneByMinMaxPrice() {

        System.out.println("Enter your minimum price");
        int min = kb.nextInt();
        System.out.println("Enter your maximum price");
        int max = kb.nextInt();
        for (Phone list : smartPhonesList) {
            if (min <= list.getPrice() && list.getPrice() <= max) {
                System.out.println(list + "\n");
            }
        }
//        double lowest = 0;
//        double highest = 0;
//        lowest = smartPhonesList.get(0).getPrice();
//        highest = smartPhonesList.get(0).getPrice();
//
//        //get Min Price
//        for (Phone smartPhone : smartPhonesList) {
//            if (smartPhone.getPrice() < lowest) {
//                lowest = smartPhone.getPrice();
//            }
//        }
//        System.out.println(lowest + "\n");
//
//        //get Max Price
//        for (Phone smartPhone : smartPhonesList) {
//            if (smartPhone.getPrice() > highest) {
//                highest = smartPhone.getPrice();
//            }
//        }
//        System.out.println(highest + "\n");
    }

    public void listPhoneByManufacturer() {
        System.out.println("Enter phone manufacturer you search");
        String phoneManufacturer = kb.nextLine().toLowerCase();

        for (int i = 0; i < smartPhonesList.size(); i++) {
            if (smartPhonesList.get(i).getManufacturer().equals(phoneManufacturer)) {
                System.out.println(smartPhonesList.get(i) + "\n");
            } else {
                System.out.println("No phone manufacturer was not found\n");
                break;
            }
        }
    }
}

