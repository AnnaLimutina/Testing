package lesson8;

public final class Manager extends BaseEmployee {

    public static final double MANAGER_RATE = 0.01;
    private int subordinates;

    public Manager(String name, double salaryPerDay, int subordinates) {
        super(name, salaryPerDay);
        this.subordinates = subordinates;
    }

    public Manager(String name, double salaryPerDay, int age, int subordinates) {
        super(name, salaryPerDay, age);
        this.subordinates = subordinates;
    }

    public Manager(String name, double salaryPerDay, int age, String sex, int subordinates) {
        super(name, salaryPerDay, age, sex);
        this.subordinates = subordinates;
    }

        public void setSubordinates(int subordinates) {
        this.subordinates = subordinates;
    }

    public int getSubordinates() {
        return subordinates;
    }

    @Override
    public double getSalary(Month[] monthArray) {
        int numberOfDays = 0;
        for (int i = 0; i < monthArray.length; i++){
            numberOfDays += monthArray[i].getWorkingDays();
        }
        return numberOfDays * getSalaryPerDay() + numberOfDays * getSalaryPerDay() * MANAGER_RATE;
    }
}
