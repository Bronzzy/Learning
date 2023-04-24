package telemarketingphonenumberlist;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        String[] nameArray = {"Harrison, Rose", "James, Jean", "Smith, William", "Smith, Brad"};
        String[] phoneArray = {"555-2234", "555-9098", "555-1785", "555-9224"};

        System.out.println("Enter the first few characters of the last name to look up");
        String input = kb.nextLine().trim().toLowerCase();
        String modInput = input.substring(0, 1).toUpperCase() + input.substring(1);

//        System.out.println("Matching name");
//        for (String person : nameArray) {
//            if (person.startsWith(modInput) || person.endsWith(modInput)) {
//                System.out.println(person);
//                for (int i = 0; i < phoneArray.length;i++){
//                    if(nameArray[i].equals(person)){
//                        System.out.println(phoneArray[i]);
//                    }
//                }
//            }
//        }

    }
}