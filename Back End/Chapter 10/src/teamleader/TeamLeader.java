package teamleader;

import employeeandproductionworker.ProductionWorker;

public class TeamLeader extends ProductionWorker {

    private final double MONTHLY_BONUS;
    private double trainingHoursRequired;
    private double trainingHoursAttended;


    public TeamLeader(String employeeName, String employeeNumber, String hireDate,
                      int shift, double hourlyPayRate, double monthlyBonus,
                      double trainingHoursRequired, double trainingHoursAttended) {
        super(employeeName, employeeNumber, hireDate, shift, hourlyPayRate);

        MONTHLY_BONUS = monthlyBonus;
        this.trainingHoursRequired = trainingHoursRequired;
        this.trainingHoursAttended = trainingHoursAttended;
    }

    public double getMONTHLY_BONUS() {
        return MONTHLY_BONUS;
    }

    public double getTrainingHoursRequired() {
        return trainingHoursRequired;
    }

    public void setTrainingHoursRequired(double trainingHoursRequired) {
        this.trainingHoursRequired = trainingHoursRequired;
    }

    public double getTrainingHoursAttended() {
        return trainingHoursAttended;
    }

    public void setTrainingHoursAttended(double trainingHoursAttended) {
        this.trainingHoursAttended = trainingHoursAttended;
    }
}
