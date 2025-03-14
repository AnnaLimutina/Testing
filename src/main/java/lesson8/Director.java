package lesson8;

public final class Director extends BaseEmployee{
    public static final double DIRECTOR_RATE = 0.03;
    private int subordinates;

    public Director(String name, double salaryPerDay, int subordinates) {
        super(name, salaryPerDay, subordinates);
    }

    public Director(String name, double salaryPerDay, int age, int subordinates) {
        super(name, salaryPerDay, age);
        this.subordinates = subordinates;
    }

    public Director(String name, double salaryPerDay, int age, String sex, int subordinates) {
        super(name, salaryPerDay, age, sex);
        this.subordinates = subordinates;
    }

    @Override
    public double getSalary(Month[] monthArray) {
        int numberOfDays = 0;
        for (int i = 0; i < monthArray.length; i++){
            numberOfDays += monthArray[i].getWorkingDays();
        }
        return numberOfDays * getSalaryPerDay() + numberOfDays * getSalaryPerDay() * DIRECTOR_RATE;
    }
}
