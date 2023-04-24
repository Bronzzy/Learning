package arrayoperations;

public class ArrayOperation {

    private int[] testData;

    public ArrayOperation(int[] testData) {
        this.testData = testData;
    }

    public int getTotal() {
        int sum = 0;
        for (int index = 0; index < testData.length; index++) {
            sum += testData[index];
        }
        return sum;
    }

    public double getAverage() {
        int average = 0;
        int sum = 0;
        for (int index = 0; index < testData.length; index++) {
            sum += testData[index];
            average = sum / testData.length;
        }
        return average;
    }

    public double getLowest() {
        int lowest = testData[0];
        for (int index = 1; index < testData.length; index++) {
            if (testData[index] < lowest) {
                testData[index] = lowest;
            }
        }
        return lowest;
    }

    public double getHighest() {
        int highest = testData[0];
        for (int index = 1; index < testData.length; index++) {
            if (testData[index] > highest) {
                testData[index] = highest;
            }
        }
        return highest;
    }
}
