package patientcharges;

public class main {
    public static void main(String[] args) {
        Patient binh = new Patient("Dao", "Hoa", "Binh", "40 duong 81",
                "Ho Chi Minh", "Ho Chi Minh",
                "70000", "0909301777",
                "Bui Minh Hoang Vu", "0908392211");

        Procedure procedure1 = new Procedure("Physical Exam", 21,
                "Dr. Irvine", 250.00);
        Procedure procedure2 = new Procedure("X-ray", 21,
                "Dr. Jamison", 500.00);
        Procedure procedure3 = new Procedure("Blood test", 21,
                "Dr.Smith", 200.00);

        System.out.println(procedure1);
        System.out.println(procedure2);
        System.out.println(procedure3);
    }
}
