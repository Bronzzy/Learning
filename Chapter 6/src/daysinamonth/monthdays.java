package daysinamonth;

public class monthdays {

    private static int month;
    private int year;

    public monthdays(int month, int year) {
        this.month = month;
        this.year = year;
    }

    public void numberOfDays() {

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31 days");
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30 days");

            case 2:
                if (this.year % 100 == 0 && this.year % 400 == 0) {
                    System.out.println("29 days");
                }
                if (this.year % 4 == 0 && this.year % 100 != 0) {
                    System.out.println("29 days");
                } else {
                    System.out.println("28 days");
                }
        }
    }
}
