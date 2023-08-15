package essay;

public class Essay extends GradeActivity {
    private int grammar;
    private int spelling;
    private int correctLength;
    private int content;

    public Essay(double score, int grammar, int spelling, int correctLength, int content) {
        super(score);
        this.grammar = grammar;
        this.spelling = spelling;
        this.correctLength = correctLength;
        this.content = content;
    }
    public double totalScores(){
        double totalScore = grammar + spelling + correctLength + content;
        return totalScore;
    }
}
