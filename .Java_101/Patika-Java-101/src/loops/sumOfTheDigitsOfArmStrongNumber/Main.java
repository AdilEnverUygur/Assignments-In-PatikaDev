package loops.sumOfTheDigitsOfArmStrongNumber;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num;
        int digit = 0,result = 0 ;
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        num = input.nextInt();

        while (num != 0) {
            digit = num % 10;
            num = num / 10;
            result += digit;
            System.out.print(digit + " + ");
        }
        System.out.println("\b\b= " + result);
    }
}
