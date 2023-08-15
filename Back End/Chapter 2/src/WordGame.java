import java.util.Scanner;

public class WordGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name");
        String name = scanner.nextLine();

        System.out.println("Enter your age");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Input a city name");
        String cityName = scanner.nextLine();

        System.out.println("Input a college name");
        String collegeName = scanner.nextLine();

        System.out.println("Enter a profession");
        String profession = scanner.nextLine();

        System.out.println("Enter an animal type");
        String animalType = scanner.nextLine();

        System.out.println("Enter a pet's name");
        String petName = scanner.nextLine();

        System.out.println("\tThere once was a person name "+name+" who lived in "+"\n"+cityName+". At the age of "+age+", "+"\n\t"+name+" went to the college at "+collegeName+". "+name+" graduated and" +"\n"+ "went to work as a " +"\n\t"+profession+". Then, "+name+" adopted a "+animalType+" named "+"\n"+petName+". They both lived "+"\n"+ "happily ever after!");
    }
}
