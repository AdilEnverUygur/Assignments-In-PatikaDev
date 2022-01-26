package ifElseStatements.leapYearCalculation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int year;
        String result = "";

        System.out.println("Enter a year : ");
        year = input.nextInt();

        if (year % 4 == 0) {
            if (year % 100 == 0 && year % 400 != 0) {
                result = " It's not a leap year! ";
            } else {
                result = " It's a leap year";
            }
        }
        else {
            result = " It's not a leap year! ";
        }
        System.out.println(year + " " + result);
    }
}
