package problem2;

import java.util.*;

public class StudentList {
    private List<Student> listStudent = new ArrayList<>();
    private Student student;
    private static Scanner keyboard = new Scanner(System.in);

    public StudentList() {
    }

    public void addNewStudent() {

        boolean exist = false; //default
        System.out.println("How many student do you want to add: ");
        int numberOfStudent = keyboard.nextInt();
        //create students first
        for (int i = 0; i < numberOfStudent; i++) {
            System.out.println("Enter student ID: ");
            int studentID = keyboard.nextInt();
            keyboard.nextLine();

            System.out.println("Enter student's last and middle name: ");
            String studentLastAndMiddleName = keyboard.nextLine();
            System.out.println("Enter student's first name: ");
            String studentFirstName = keyboard.nextLine();
            System.out.println("Enter student's birthday: ");
            String studentBirthday = keyboard.nextLine();
            System.out.println("Enter student's admission year: ");
            int studentAdmissionYear = keyboard.nextInt();
            Student newStudent = new Student(studentID, studentLastAndMiddleName, studentFirstName, studentBirthday, studentAdmissionYear);
            //check database
            if (listStudent.size() == 0) {
                listStudent.add(newStudent);
            } else {
                for (int j = 0; j < listStudent.size(); j++) {
                    if (listStudent.get(i).getStudentID() == studentID) {
                        exist = true;
                        System.out.println("This student already existed in the database");
                        break;
                    } else {
                        exist = false;
                        listStudent.add(newStudent);
                        System.out.println("New student is added to the list");
                        break;
                    }
                }
            }
        }
    }

    public void viewStudentList() {
        if (listStudent.size() == 0) {
            System.out.println("There is no student in the list");
        } else {
            for (int i = 0; i < listStudent.size(); i++) {
                System.out.println(listStudent.get(i).toString());
            }
        }
    }

    public void sortByAdmissionYear() {
        Collections.sort(listStudent, new StudentComparator<Student>());
        System.out.println("Sorted by admission year: " + listStudent.toString());
    }

    public void searchByID() {
        System.out.println("Enter student ID: ");
        int studentID = keyboard.nextInt();
        boolean exist = false; //default
        if (listStudent.size() == 0) {
            System.out.println("There's no student in the list");
        } else {
            for (int i = 0; i < listStudent.size(); i++) {
                if (listStudent.get(i).getStudentID() == studentID) {
                    exist = true;
                    System.out.println(listStudent.get(i).toString());
                    break;
                } else {
                    exist = false;
                }
            }
            if (!exist) {
                System.out.println("There's no student with such ID.");
            }
        }
    }

    public void searchByYear() {
        boolean exist = false;
        if (listStudent.size() == 0) {
            System.out.println("There's no student in the list");
        } else {
            for (int i = 0; i < listStudent.size(); i++) {
                if (2019 <= listStudent.get(i).getStudentAdmissionYear() && listStudent.get(i).getStudentAdmissionYear() <= 2021) {
                    exist = true;
                    System.out.println(listStudent.get(i).toString());
                } else {
                    exist = false;
                }
            }
            if (!exist) {
                System.out.println("There's no student in the list admitted from 2019 to 2021");
            }
        }
    }

    public void lazyinit() {
        listStudent.add(new Student(1, "Kennedy", "John", "29-05-1917", 1937));
        listStudent.add(new Student(2, "Hart", "Kevin", "06-07-1979", 1999));
        listStudent.add(new Student(3, "Bond", "James", "11-11-1920", 1940));
        listStudent.add(new Student(4, "Westbrook", "Luka", "05-06-1907", 1925));
        listStudent.add(new Student(5, "DiCaprio", "Leonardo", "11-11-1974", 1980));
    }
}

