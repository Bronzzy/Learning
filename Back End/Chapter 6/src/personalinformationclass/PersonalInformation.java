package personalinformationclass;

public class PersonalInformation {

    private String name;
    private String address;
    private int age;
    private String number;

    public PersonalInformation(String name, String address, int age, String number) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "PersonalInformation{" +
                "name = '" + name + '\'' +
                ", address = '" + address + '\'' +
                ", age = " + age +
                ", number = '" + number + '\'' +
                '}';
    }
}
