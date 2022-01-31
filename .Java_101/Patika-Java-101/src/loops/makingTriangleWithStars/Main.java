package loops.makingTriangleWithStars;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please Enter an number: ");
        int n = scanner.nextInt();

        for (int i=0;i<n;i++) {
            for (int j=0; j<(n-i); j++) {
                System.out.print(" ");
            }

            for (int k=0; k<(2*i+1);k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i=1; i<n; i++) {

            for (int k=0; k<(i+1);k++) {
                System.out.print(" ");
            }
            for (int j=1; j<(2*(n-i));j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
