package loops.ebobAndEkok;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter first number :");
        int firstNumber = input.nextInt();
        System.out.print("Please Enter second number :");
        int secondNumber = input.nextInt();

        int k = firstNumber,ebob = 1,ekok = 1;

        while (k > 1) {
            if (firstNumber % k == 0 && secondNumber % k == 0) {
                ebob = k;
                ekok = (firstNumber * secondNumber) / ebob;
                break;
            }
            k--;
        }
        System.out.println("EBOB is :" + ebob + " EKOK is :" + ekok);


    }
}
