package testscoresmodificationforserialization;

import java.io.Serializable;

public class TestScores implements Serializable {
    private double[] testScore;

    public TestScores(double[] testScore) {
        this.testScore = testScore;
    }

    public Object getScores() {
        return testScore;
    }


    public void getAverage() {
        double total = 0;
        double average;
        for (int i = 0; i < testScore.length; i++) {
            if (testScore[i] < 0 || testScore[i] > 100) {
                throw new IllegalArgumentException(
                        "Score can't be less than 0 or greater than 100"
                );
            }
            total = total + testScore[i];
        }
        average = total / testScore.length;
        System.out.println(average);
    }
}
