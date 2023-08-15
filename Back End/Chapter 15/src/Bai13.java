import java.util.Scanner;

public class Bai13 {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        System.out.println("Tính S(n) = 1 + 1/2 + 1/3 + ... + 1/n với n>0");
        System.out.println("Nhap so n");
        double input = kb.nextInt();
        System.out.println(tinhSoThapPhan(input));
    }

    public static double tinhSoThapPhan(double input){
        if (1/input == 1){
            return 1;
        }else{
            return tinhSoThapPhan(input - 1) + (1/input);
        }
    }
}
