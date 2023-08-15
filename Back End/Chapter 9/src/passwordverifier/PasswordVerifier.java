package passwordverifier;

public class PasswordVerifier {
    private String str;
    private final int PASSWORD_LENGTH = 10;

    public PasswordVerifier(String str) {
        this.str = str;
    }

    public boolean checkPassWordQualified(String str) {
        if (str.length() < PASSWORD_LENGTH) {
            return false;
        }
        int charCount = 0;
        int number = 0;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (Character.isDigit(ch)) {
                number++;
            }
        }
        if (number <= 0) {
            return false;
        }
        return true;
    }

    public boolean checkUppercase(char ch) {
        ch = Character.toUpperCase(ch);
        return (ch >= 'A' && ch <= 'Z');
    }

    public boolean checkNumber(char ch) {
        return (ch >= '0' && ch <= '9');
    }
}
