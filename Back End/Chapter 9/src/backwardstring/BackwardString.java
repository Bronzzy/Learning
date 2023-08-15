package backwardstring;

public class BackwardString {
    String str;

    public BackwardString(String str) {
        this.str = str;
    }

    public void getBackwardString() {
        char ch;
        String temp = "";
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i); //extracts each character
            temp = ch + temp; //adds each character in front of the existing string
        }
        System.out.println("Reversed word: " + temp);
    }
}
