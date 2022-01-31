package loops.exponentCalculatorProgram;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number,exponent, result=1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number to be exponentiated: ");
        number = scanner.nextInt();
        System.out.print("Enter the number to be the exponent: ");
        exponent = scanner.nextInt();
        for(int i = 1; i<=exponent; i++){
            result *= number;
        }
        System.out.println(number + " over " + exponent + " = " + result);
    }
}
