package patientcharges;

public class Procedure {

    private String procedureName;
    private int procedureDate;
    private String practitionerName;
    private double procedureCharges;

    public Procedure(String procedureName, int procedureDate, String practitionerName, double procedureCharges) {
        this.procedureName = procedureName;
        this.procedureDate = procedureDate;
        this.practitionerName = practitionerName;
        this.procedureCharges = procedureCharges;
    }

    public String getProcedureName() {
        return procedureName;
    }

    public void setProcedureName(String procedureName) {
        this.procedureName = procedureName;
    }

    public int getProcedureDate() {
        return procedureDate;
    }

    public void setProcedureDate(int procedureDate) {
        this.procedureDate = procedureDate;
    }

    public String getPractitionerName() {
        return practitionerName;
    }

    public void setPractitionerName(String practitionerName) {
        this.practitionerName = practitionerName;
    }

    public double getProcedureCharges() {
        return procedureCharges;
    }

    public void setProcedureCharges(double procedureCharges) {
        this.procedureCharges = procedureCharges;
    }

    @Override
    public String toString() {
        return "Procedure{" +
                "procedureName = '" + procedureName + '\'' +
                ", procedureDate = " + procedureDate +
                ", practitionerName = '" + practitionerName + '\'' +
                ", procedureCharges = " + procedureCharges +
                '}';
    }
}
