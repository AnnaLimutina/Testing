package lesson8;

public class SalaryUtils {
    public static double getTotalSalary(Employee[] employees, Month[] months){
        double sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary(months);
        }
        return sum;
    }
}
