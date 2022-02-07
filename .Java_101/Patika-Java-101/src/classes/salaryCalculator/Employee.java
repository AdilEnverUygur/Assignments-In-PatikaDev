package classes.salaryCalculator;

public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;

    Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public int tax() {
        if ( salary > 1000 ) {
            int tax = ( this.salary * 3 ) / 100 ;
            return tax ;
        }
        else {
            return 0 ;
        }
    }

    public int bonus() {
        if ( this.workHours > 40 ) {
            int bonus = (this.workHours - 40 ) * 30 ;
            return bonus;
        }
        else {
            return 0 ;
        }
    }

    public int raiseSalary() {
        int raise = 0;
        if ( 2022 - this.hireYear <= 9 ) {
            raise = this.salary / 20 ;
            return raise;
        }
        else if ( 2022 - this.hireYear > 9 && 2022 - this.hireYear <= 19 ) {
            raise = this.salary / 10 ;
            return raise;
        }
        else {
            raise = ( this.salary / 100 ) * 15 ;
            return raise;
        }
    }

    public String printInfo(){
        return "Employee's name is  \t\t\t: " + this.name + "\n" +
                "Employee's salary is  \t\t\t: " + this.salary + "\n" +
                "Employee's working hour is  \t\t: " + this.workHours + "\n" +
                "Starting year of employee is  \t\t: " + this.hireYear + "\n" +
                "Employee's tax is  \t\t\t: " + tax() + "\n" +
                "Employee's bonus salary is  \t\t: " + bonus() + "\n" +
                "Employee's raise is  \t\t\t: " + raiseSalary() + "\n" +
                "Employee's net salary is \t\t : " + (this.salary + bonus() - tax()) + "\n" +
                "Employee's raised salary is  \t\t: " + (this.salary + raiseSalary()) + "\n" +
                "============================";
    }

}
