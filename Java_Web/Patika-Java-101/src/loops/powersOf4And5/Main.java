package loops.powersOf4And5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please Enter a Number ");
        int number = scanner.nextInt();

        for (int i = 1, j = 1; i <= number && j <= number; i *= 4, j *= 5) {

            if (i != 1 && j!=1) {
                System.out.println(i);
                System.out.println(j);
            }
        }
    }
}
