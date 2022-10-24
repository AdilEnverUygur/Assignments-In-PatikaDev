package eBebek.firstCase;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee = new Employee("Kemal",2000.0,45,1985);
        System.out.println(employee.toString());
        employee.tax();
        employee.bonus();
        employee.raiseSalary();
    }
}
