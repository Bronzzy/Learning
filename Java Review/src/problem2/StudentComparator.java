package problem2;

public class StudentComparator<S> implements java.util.Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return (int) (o1.getStudentAdmissionYear() - o2.getStudentAdmissionYear());
    }
}
