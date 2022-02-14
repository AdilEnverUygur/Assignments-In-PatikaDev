package loops.invertedTriangleConstruction;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter number of rows");
        int rows = scanner.nextInt();

        for(int i = rows; i >= 1; --i) {
            for(int space = 1; space <= rows - i; ++space) {
                System.out.print("  ");
            }
            for(int j=i; j <= 2 * i - 1; ++j) {
                System.out.print("* ");
            }
            for(int j = 0; j < i - 1; ++j) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
