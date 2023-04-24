package monthclass;

public class Month {

    private int monthNumber;


    public Month() {
        this.monthNumber = 1;
    }

    public Month(int month) throws InvalidMonthNumber {
        this.monthNumber = month;
        if (month < 1 || month > 12)
            throw new InvalidMonthNumber("Month number can't be less than 1 or greater than 12");

    }

    public Month(String monthName) {
        if (monthName.equalsIgnoreCase("January")) {
            this.monthNumber = 1;
        }
        if (monthName.equalsIgnoreCase("February")) {
            this.monthNumber = 2;
        }
        if (monthName.equalsIgnoreCase("March")) {
            this.monthNumber = 3;
        }
        if (monthName.equalsIgnoreCase("April")) {
            this.monthNumber = 4;
        }
        if (monthName.equalsIgnoreCase("May")) {
            this.monthNumber = 5;
        }
        if (monthName.equalsIgnoreCase("June")) {
            this.monthNumber = 6;
        }
        if (monthName.equalsIgnoreCase("July")) {
            this.monthNumber = 7;
        }
        if (monthName.equalsIgnoreCase("August")) {
            this.monthNumber = 8;
        }
        if (monthName.equalsIgnoreCase("September")) {
            this.monthNumber = 9;
        }
        if (monthName.equalsIgnoreCase("October")) {
            this.monthNumber = 10;
        }
        if (monthName.equalsIgnoreCase("November")) {
            this.monthNumber = 11;
        }
        if (monthName.equalsIgnoreCase("December")) {
            this.monthNumber = 12;
        }
    }

    public void setMonthNumber(int argument) {
        if (argument < 1 || argument > 12) {
            this.monthNumber = 1;
        }
        this.monthNumber = argument;
    }

    public int getMonthNumber() {
        return this.monthNumber;
    }

    public String getMonthName() throws InvalidMonthName {
        String result = "";
        if(getMonthName() != "January" || getMonthName() != "February" || getMonthName() != "March"
                || getMonthName() != "April" || getMonthName() != "May"
                || getMonthName() != "June" || getMonthName() != "July"
                || getMonthName() != "August" || getMonthName() != "September"
                || getMonthName() != "October" || getMonthName() != "November"
                || getMonthName() != "December") throw new InvalidMonthName("Invalid name of the month");
        switch (monthNumber) {
            case 1:
                result = "January";
                break;
            case 2:
                result = "February";
                break;
            case 3:
                result = "March";
                break;
            case 4:
                result = "April";
                break;
            case 5:
                result = "May";
                break;
            case 6:
                result = "June";
                break;
            case 7:
                result = "July";
                break;
            case 8:
                result = "August";
                break;
            case 9:
                result = "September";
                break;
            case 10:
                result = "October";
                break;
            case 11:
                result = "November";
                break;
            case 12:
                result = "December";
                break;
        }
        return result;
    }

    public boolean equals(Month m) {
        if (this.monthNumber == m.getMonthNumber())
            return true;
        else
            return false;
    }

    public boolean greaterThan(Month m) {
        if (this.monthNumber > m.getMonthNumber())
            return true;
        else
            return false;
    }

    public boolean lessThan(Month m) {
        if (this.monthNumber < m.getMonthNumber())
            return true;
        else
            return false;
    }
}