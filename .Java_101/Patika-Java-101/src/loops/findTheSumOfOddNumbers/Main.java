package loops.findTheSumOfOddNumbers;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int number, sum = 0;

        System.out.print("Please Enter an Integer : ");
        number = scan.nextInt();

        while (number % 2 == 0) {
            if (number % 4 == 0) {
                sum += number;
            }
            System.out.print("Please Enter an Integer: ");
            number = scan.nextInt();
        }
        System.out.println("Sum : " + sum);
    }
}
