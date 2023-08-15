package wordcounter;

public class WordCounter {
    private String str;

    public WordCounter(String str) {
        this.str = str;
    }

    public int countWord() {
        String[] words = str.trim().split("\\s");
        return words.length;
    }
}