package shop;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SellingItem {
    private String itemID;
    private double cost;
    private int itemNum;
    private String description;
    private String sellDate;
    private List<Drink> drinkList = new ArrayList<>();
    private List<Food> foodList = new ArrayList<>();
    private List<Other> otherList = new ArrayList<>();

    public SellingItem() {
    }

    public SellingItem(String itemID, double cost, int itemNum, String description, String sellDate) throws PositiveNumber, OutOfRange {
        if (isValidID(itemID)) {
            this.itemID = itemID;
        } else {
            System.out.println(" The itemID is in the format LL-XXXX, " +
                    "where each X is a digit and each L is a letter");
        }
        if (cost < 0) {
            throw new PositiveNumber(cost);
        }
        this.cost = cost;
        if (itemNum < 1 || itemNum > 20) {
            throw new OutOfRange(itemNum);
        }
        this.itemNum = itemNum;
        this.description = description;
        this.sellDate = sellDate;
    }

    public static boolean isValidID(String id) {
        String regex = "^[a-z]{2}" + "-" + "[0-9]{4}";
        Pattern p = Pattern.compile(regex);
        if (id == null) {
            return false;
        }
        Matcher m = p.matcher(id);
        return m.matches();
    }

    public double getCost() {
        return cost;
    }

    public int getItemNum() {
        return itemNum;
    }

    public String getItemID() {
        return itemID;
    }

    public void addDrink(Drink drink) {
        if (drinkList.contains(drink.getItemID())) {
            System.out.println("This item ID already exit " + drink.getItemID());
        } else
            drinkList.add(drink);
    }

    public void addFood(Food food) {
        if (foodList.contains(food.getItemID())) {
            System.out.println("This item ID already exit" + food.getItemID());
        } else
            foodList.add(food);
    }

    public void addOther(Other other) {
        if (otherList.contains(other.getItemID())) {
            System.out.println("This item ID already exit" + other.getItemID());
        } else
            otherList.add(other);
    }

    public void highestPrice() {
        int temp = drinkList.size() + foodList.size() + otherList.size();
        double[] drinkTemp = new double[temp];
        double[] foodTemp = new double[temp];
        double[] otherTemp = new double[temp];
        for (int i = 0; i < drinkList.size(); i++) {
            drinkTemp[i] = drinkList.get(i).getPrice();
        }
        for (int i = 0; i < foodList.size(); i++) {
            foodTemp[i] = foodList.get(i).getPrice();
        }
        for (int i = 0; i < otherList.size(); i++) {
            otherTemp[i] = otherList.get(i).getPrice();
        }
        double max = 0;
        String tempID = "";
        for (int i = 0; i < temp; i++) {
            if (drinkTemp[i] > max) {
                max = drinkTemp[i];
                tempID=drinkList.get(i).getItemID();
            }  if (foodTemp[i] > max) {
                max = foodTemp[i];
                tempID=foodList.get(i).getItemID();
            }  if (otherTemp[i] > max) {
                max = otherTemp[i];
                tempID=otherList.get(i).getItemID();
            }
        }
        System.out.println(tempID +" " +max);
    }

    public void calcAverage() {
        double sumDrink = 0;
        double sumFood = 0;
        double sumOther = 0;

        for (int i = 0; i < drinkList.size(); i++) {
            sumDrink += drinkList.get(i).getPrice();
        }
        for (int i = 0; i < foodList.size(); i++) {
            sumFood += foodList.get(i).getPrice();
        }
        for (int i = 0; i < otherList.size(); i++) {
            sumOther += otherList.get(i).getPrice();
        }
        double average = (sumOther + sumFood + sumDrink) / 3;
        System.out.println("Average selling price= " + average);
    }
}
