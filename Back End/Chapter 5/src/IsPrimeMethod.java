import java.util.Scanner;

public class IsPrimeMethod {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int number = keyboard.nextInt();
        isPrime(number);
    }

    public static void isPrime(int number) {
        int i,flag=0;

        if(number == 0||number == 1){
            System.out.println(number + " is not prime number");
        }else{
            for(i = 2; i <= number; i++){
                if(number % i == 0){
                    System.out.println(number + " is not prime number");
                    flag = 1;
                    break;
                }
            }
            if(flag == 0) {
                System.out.println(number + " is prime number");
            }
        }
    }
}
