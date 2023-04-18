package shop;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String sellDate;
        double cost;
        int itemNum;
        String itemID;
        String description;
        int menu;
        System.out.println("Enter number of item you want to enter");
        int n = keyboard.nextInt();
        SellingItem shop = new SellingItem();
        Drink drink;
        Food food;
        Other other;

        try {
            numberItem(n);
        } catch (OutOfItemNumber e) {
            System.out.println(e.getMessage());
        }
        try {
            for (int i = 0; i < n; i++) {
                System.out.println("Menu");
                System.out.println("1. Enter drink detail");
                System.out.println("2. Enter food detail");
                System.out.println("3. Enter other detail");
                menu = keyboard.nextInt();
                keyboard.nextLine();
                switch (menu) {
                    case 1: {
                        System.out.println("Enter drink item ID");
                        itemID = keyboard.nextLine();
                        System.out.println("Enter item cost");
                        cost = keyboard.nextDouble();
                        System.out.println("Enter number of item");
                        itemNum = keyboard.nextInt();
                        keyboard.nextLine();
                        System.out.println("Enter item description");
                        description = keyboard.nextLine();
                        System.out.println("Enter selling date");
                        sellDate = keyboard.nextLine();
                            drink = new Drink(itemID, cost, itemNum, description, sellDate);
                            shop.addDrink(drink);
                        break;
                    }
                    case 2: {
                        System.out.println("Enter food item ID");
                        itemID = keyboard.nextLine();
                        System.out.println("Enter item cost");
                        cost = keyboard.nextDouble();
                        System.out.println("Enter number of item");
                        itemNum = keyboard.nextInt();
                        keyboard.nextLine();
                        System.out.println("Enter item description");
                        description = keyboard.nextLine();
                        System.out.println("Enter selling date");
                        sellDate = keyboard.nextLine();
                            food = new Food(itemID, cost, itemNum, description, sellDate);
                            shop.addFood(food);
                        break;
                    }
                    case 3: {
                        System.out.println("Enter other item ID");
                        itemID = keyboard.nextLine();
                        System.out.println("Enter item cost");
                        cost = keyboard.nextDouble();
                        System.out.println("Enter number of item");
                        itemNum = keyboard.nextInt();
                        keyboard.nextLine();
                        System.out.println("Enter item description");
                        description = keyboard.nextLine();
                        System.out.println("Enter selling date");
                        sellDate = keyboard.nextLine();
                            other = new Other(itemID, cost, itemNum, description, sellDate);
                            shop.addOther(other);
                        break;
                    }
                }
            }
            Drink a = new Drink("aa-1234", 45, 15, "asd45", "ad46");
            Food b = new Food("bb-4567", 52, 4, "da6", "da4");
            Other c = new Other("cc-2467", 72, 3, "da6", "da4");
            Other d = new Other("ec-2467", 62, 3, "da6", "da4");
            shop.addDrink(a);
            shop.addFood(b);
            shop.addOther(c);
            shop.addOther(d);
            shop.highestPrice();
            shop.calcAverage();
        }catch (PositiveNumber e) {
            System.out.println(e.getMessage());
        } catch (OutOfRange e) {
            System.out.println(e.getMessage());
        }
    }

    public static void numberItem(int n) throws OutOfItemNumber {
        if (n < 1 || n > 100) {
            throw new OutOfItemNumber(n);
        }
    }

}
