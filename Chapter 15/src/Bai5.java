import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        System.out.println("Tìm ước số chung lớn nhất của 2 số nguyên a, b.");
        System.out.println("Enter ");
        System.out.println(uocSoChungLonNhat(15,9));
    }
    public static int uocSoChungLonNhat(int x, int y)
    {
        if (x % y == 0)
            return y;
        else
            return uocSoChungLonNhat(y, x % y);
    }
}
