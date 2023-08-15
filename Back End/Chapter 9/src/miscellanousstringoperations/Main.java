package miscellanousstringoperations;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String string1 = "the dog jumped over the fence";
        String string2 = "the";
        String string3 = "that";

        char[] arrayChar = string1.toCharArray();
        for (char list : arrayChar) {
            System.out.println(list);
        }

        System.out.println(wordCount(string1));
        System.out.println(wordCount(string2));
        System.out.println(wordCount(string3));

        arrayToString(arrayChar);
    }

    public static int wordCount(String string) {
        String[] words = string.trim().split("\\s");
        return words.length;
    }

    public static String arrayToString(char[] charArray) {
        System.out.println(String.valueOf(charArray));
        return String.valueOf(charArray);
    }

    public static void mostFrequent(String string) {
        char[] arrayChar = string.toCharArray();
        Arrays.sort(arrayChar);
    }

    public static void replaceSubString(String string1, String string2, String string3) {

    }

}
