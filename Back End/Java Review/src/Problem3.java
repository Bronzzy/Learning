import java.util.ArrayList;

public class Problem3 {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();

        for(int i = 1; i <= 6; i++){
            arrayList.add(i);
        }
        for(int i = 0; i < arrayList.size(); i++){
            int firstNumber = arrayList.get(0);
            arrayList.remove(0);
            arrayList.add(firstNumber);
            arrayList.add(firstNumber);
            arrayList.add(firstNumber);
            System.out.println(arrayList);
        }
    }
}
