package lesson8;

public final class Employee extends BaseEmployee{

    public Employee(String name, double salaryPerDay) {
        super(name, salaryPerDay);
    }

    public Employee(String name, double salaryPerDay, int age) {
        super(name, salaryPerDay, age);
    }

    public Employee(String name, double salaryPerDay, int age, String sex) {
        super(name, salaryPerDay, age, sex);
    }

    @Override
    public double getSalary(Month[] monthArray) {
        int numberOfDays = 0;
        for (int i = 0; i < monthArray.length; i++){
            numberOfDays += monthArray[i].getWorkingDays();
        }
        return numberOfDays * getSalaryPerDay();
    }

    public Manager convertToManager(int subordinates) {
        return new Manager(this.getName(), this.getSalaryPerDay(), subordinates);
    }

}
