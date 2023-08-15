import java.util.Scanner;

public class PrimeNumberList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int number = 2; number <= 100; number++)
        isPrime(number);
    }

    public static void isPrime(int number) {
        int i, limit, flag=0;
        limit = number/2;
        if(number == 0|| number == 1){
            System.out.println(number+" is not prime number");
        }else{
            for(i = 2; i <= limit; i++){
                if(number % i == 0){
                    System.out.println(number+" is not prime number");
                    flag=1;
                    break;
                }
            }
            if(flag==0)  { System.out.println(number+" is prime number"); }
        }
    }
}
