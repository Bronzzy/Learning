package sentencecapitalizer;

public class SentenceCapitalizer {

    String str;

    public SentenceCapitalizer(String str) {
        this.str = str;
    }

    public void getCapitalize() {
        int pos = 0;
        boolean capitalize = true;
        StringBuilder sb = new StringBuilder(str);

        while (pos < str.length()) {
            if (sb.charAt(pos) == '.') {
                capitalize = true;
            } else if (capitalize && !Character.isWhitespace(sb.charAt(pos))) {
                sb.setCharAt(pos, Character.toUpperCase(sb.charAt(pos)));
                capitalize = false;
            }
            pos++;
        }
        System.out.println(sb.toString());
    }
}
