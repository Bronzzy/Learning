import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        System.out.println("Tìm chữ số đầu tiên của số nguyên dương n.");
        System.out.println("Enter a number");
        int input = kb.nextInt();

        System.out.println(findFirstNumber(input));
    }

    public static int findFirstNumber(int number) {
        if(number /10 == 0){
            return number;
        }else{
            return findFirstNumber(number / 10);
        }
    }
}
