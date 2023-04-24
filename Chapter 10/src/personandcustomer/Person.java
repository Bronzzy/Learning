package personandcustomer;

public class Person {
    private String personName;
    private String personAddress;
    private String personTelephoneNumber;

    public Person(String personName, String personAddress, String personTelephoneNumber) {
        this.personName = personName;
        this.personAddress = personAddress;
        this.personTelephoneNumber = personTelephoneNumber;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getPersonAddress() {
        return personAddress;
    }

    public void setPersonAddress(String personAddress) {
        this.personAddress = personAddress;
    }

    public String getPersonTelephoneNumber() {
        return personTelephoneNumber;
    }

    public void setPersonTelephoneNumber(String personTelephoneNumber) {
        this.personTelephoneNumber = personTelephoneNumber;
    }
}
