package problem2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        StudentList studentList = new StudentList();
        Scanner keyboard = new Scanner(System.in);
        int userOption;
        do {
            System.out.println("Menu options:\n"
                    + "1. Add new student\n"
                    + "2. Sort student by admission year\n"
                    + "3. Search student by ID\n"
                    + "4. Search student(s) by admission year from 2019 to 2021\n"
                    + "5. View current student list\n"
                    + "6. Exit\n");

            userOption = keyboard.nextInt();
            switch (userOption) {
                case 1:
                    System.out.println("Adding");
                    studentList.addNewStudent();
                    break;
                case 2:
                    System.out.println("Sorting");
                    studentList.sortByAdmissionYear();
                    break;
                case 3:
                    System.out.println("Searching");
                    studentList.searchByID();
                    break;
                case 4:
                    System.out.println("Searching");
                    studentList.searchByYear();
                    break;
                case 5:
                    studentList.viewStudentList();
                    break;
                case 6:
                    System.out.println("Exiting");
                    break;
                case 99:
                    studentList.lazyinit();
                    break;
                default:
                    System.out.println("Invalid menu option");
                    break;
            }
        }
        while (userOption != 6);
    }
}

