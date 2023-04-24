package problem1;

public class Phone {
    private int phoneID;
    private String manufacturer;
    private double price;
    private String createdDate;
    private String description;

    public Phone(int phoneID, String manufacturer, double price, String createdDate, String description) {
        this.phoneID = phoneID;
        this.manufacturer = manufacturer;
        this.price = price;
        this.createdDate = createdDate;
        this.description = description;
    }


    public int getPhoneID() {
        return phoneID;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public double getPrice() {
        return price;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Phone ID: " + phoneID +
                "\nManufacturer: " + manufacturer +
                "\nPhone price: " + price +
                "\nPhone created date: " + createdDate +
                "\nPhone description: " + description;
    }
}

