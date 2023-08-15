package problem2;

import java.util.Date;

public class Student {
    private int studentID;
    private String studentLastAndMiddleName;
    private String studentFirstName;
    private String studentBirthday;
    private int studentAdmissionYear;

    public Student(int studentID, String studentLastAndMiddleName, String studentFirstName, String studentBirthday, int studentAdmissionYear) {
        this.studentID = studentID;
        this.studentLastAndMiddleName = studentLastAndMiddleName;
        this.studentFirstName = studentFirstName;
        this.studentBirthday = studentBirthday;
        this.studentAdmissionYear = studentAdmissionYear;
    }

    public Student() {
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getStudentLastAndMiddleName() {
        return studentLastAndMiddleName;
    }

    public void setStudentLastAndMiddleName(String studentLastAndMiddleName) {
        this.studentLastAndMiddleName = studentLastAndMiddleName;
    }

    public String getStudentFirstName() {
        return studentFirstName;
    }

    public void setStudentFirstName(String studentFirstName) {
        this.studentFirstName = studentFirstName;
    }

    public String getStudentBirthday() {
        return studentBirthday;
    }

    public void setStudentBirthday(String studentBirthday) {
        this.studentBirthday = studentBirthday;
    }

    public int getStudentAdmissionYear() {
        return studentAdmissionYear;
    }

    public void setStudentAdmissionYear(int studentAdmissionYear) {
        this.studentAdmissionYear = studentAdmissionYear;
    }

    @Override
    public String toString() {
        return "Student" +
                "\nstudentID: " + studentID +
                "\nStudent last and middle name: " + studentLastAndMiddleName + '\'' +
                "\nStudent first name: " + studentFirstName + '\'' +
                "\nStudent birthday: " + studentBirthday + '\'' +
                "\nStudent admission year: " + studentAdmissionYear +
                '}';
    }
}
