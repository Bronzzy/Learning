package instructorset;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        List<Instructor> instructorList = new ArrayList<>();


        Instructor binh = new Instructor("Binh", "Dao", "19195");
        Instructor an = new Instructor("Truong", "An", "30495");
        Instructor vu = new Instructor("Bui", "Vu", "23195");
        Instructor kiet = new Instructor("Chuong", "Kiet", "65495");
        Instructor nhut = new Instructor("Tran", "Nhut", "45495");


        instructorList.add(binh);
        instructorList.add(an);
        instructorList.add(vu);
        instructorList.add(kiet);
        instructorList.add(nhut);

        Set<Instructor> instructorSet = new HashSet<>(instructorList);

        System.out.println("Enter instructor last name you want to search");
        String lastname = kb.nextLine();
        System.out.println("Enter instructor first name you want to search");
        String firstname = kb.nextLine();
        System.out.println("Enter instructor number you want to search");
        String officeNumber = kb.nextLine();

        Instructor searchInstructor = new Instructor(lastname,firstname,officeNumber);

        boolean exists = false;
        System.out.println("Searching for instructor");
        for (Instructor ins : instructorSet) {
            if(ins.equals(searchInstructor)){
                exists = true;
                break;
            }
        }
        if(exists){
            System.out.println("\n" + searchInstructor);
        }
        else{
            System.out.println("No instructor was found");
        }
    }
}
