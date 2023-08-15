package instructorset;

/**
 * This class stores data about an instructor.
 */

public class Instructor {
    private String lastName;     // Last name
    private String firstName;    // First name
    private String officeNumber; // Office number



    public Instructor(String lname, String fname,
                      String office) {
        lastName = lname;
        firstName = fname;
        officeNumber = office;
    }

    public Instructor(Instructor object2) {
        lastName = object2.lastName;
        firstName = object2.firstName;
        officeNumber = object2.officeNumber;
    }

    public void set(String lname, String fname,
                    String office) {
        lastName = lname;
        firstName = fname;
        officeNumber = office;
    }

    public String getOfficeNumber(){
        return officeNumber;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public int hashCode(){
        return officeNumber.hashCode();
    }

    public boolean equals (Object obj){
        if(obj == null || !(obj instanceof Instructor)){
            return false;
        }else {
            Instructor tempInstructor = (Instructor) obj;
            return this.officeNumber.equals(tempInstructor.officeNumber);
        }
    }

    public String toString() {
        // Create a string representing the object.
        return "\nOffice number: " + officeNumber +
                "\nLast name: " + lastName +
                "\nFirst name: " + firstName;
    }

}