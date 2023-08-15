package rainfallclass;

public class RainFall {

    private double[] rainFallArr;

    public RainFall(double[] rainFallArr) {
        this.rainFallArr = rainFallArr;
    }

    public void totalRain() {
        double total = 0;
        for (int index = 0; index < rainFallArr.length; index++) {
            total += rainFallArr[index];
        }
        System.out.println("The total rain fall for the year is: " + total);
    }

    public void averageRain() {
        double total = 0;
        double average = 0;
        for (int index = 0; index < rainFallArr.length; index++) {
            total += rainFallArr[index];
            average = total / rainFallArr.length;
        }
        System.out.println("The average monthly rainfall is: " + average);
    }

    public void mostRain() {
        int temp = 0;
        int highest = (int) rainFallArr[0];
        for (int index = 1; index < rainFallArr.length; index++) {
            if (rainFallArr[index] > highest) {
                highest = (int) rainFallArr[index];
                temp = index + 1;
            }
        }
        System.out.println("Month " + temp + " has the most rainfall of " + highest + " millimeters");
    }

    public void leastRain() {

        int temp = 0;
        int lowest = (int) rainFallArr[0];
        for (int index = 1; index < rainFallArr.length; index++) {
            if (rainFallArr[index] < lowest) {
                lowest = (int) rainFallArr[index];
                temp = (index + 1);
            }
        }
        System.out.println("Month " + temp + " has the least rainfall of " + lowest + " millimeters");
    }
}

