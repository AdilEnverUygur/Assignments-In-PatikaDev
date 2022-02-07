package classes.salaryCalculator;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Ali" , 2200, 60, 1985);
        Employee employee2 = new Employee("Hakan" , 5000, 50, 2009);
        System.out.println(employee1.printInfo());
        System.out.println(employee2.printInfo());

    }
}
