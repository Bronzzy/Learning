import java.util.*;

public class WordSet {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = kb.nextLine();

        Set<String> mySet = new TreeSet<String>();

        for (String s : str.split(" ")) {
            mySet.add(s);
        }
        for (String s : mySet) {
            System.out.println(s);
        }
        List<Integer> list = new ArrayList<>();
    }
}
