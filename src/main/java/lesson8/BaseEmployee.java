package lesson8;

public abstract class BaseEmployee {
    private String name;
    private int age;
    private String sex;
    private double salaryPerDay;

    public BaseEmployee(String name, double salaryPerDay) {
        this.name = name;
        this.salaryPerDay = salaryPerDay;
    }

    public BaseEmployee(String name, double salaryPerDay, int age) {
        this.name = name;
        this.salaryPerDay = salaryPerDay;
        this.age = age;
    }

    public BaseEmployee(String name, double salaryPerDay, int age, String sex) {
        this.name = name;
        this.salaryPerDay = salaryPerDay;
        this.age = age;
        this.sex = sex;
    }

    public double getSalaryPerDay() {
        return salaryPerDay;
    }

    public abstract double getSalary(Month[] monthArray);

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }
}
