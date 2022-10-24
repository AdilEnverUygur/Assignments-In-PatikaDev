package methods.exponentCalculatorProgram;

import java.util.Scanner;

public class Main {
    static void exponentCalculation(){
        double base,exponent;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter base value: ");
        base = input.nextDouble();
        System.out.print("Please enter exponent value: ");
        exponent = input.nextDouble();
        int result = (int)Math.pow(base, exponent);
        System.out.println(result);
    }

    public static void main(String[] args) {
        exponentCalculation();
    }
}
