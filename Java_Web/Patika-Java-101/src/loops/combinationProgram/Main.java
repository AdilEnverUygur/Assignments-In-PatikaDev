package loops.combinationProgram;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int x = 1;
        int y = 1;
        int z = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Values of the Variables You Want Combination Calculation. C(n,r)");
        System.out.print("n: ");
        int n = scanner.nextInt();
        System.out.print("r: ");
        int r = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            x = x * i;
        }

        int j;
        for (j = 1; j <= r; j++) {
            y = y * j;
        }

        for (int k = 1; k <= (n-r); k++) {
            z = z * k;
        }

        int comb = (x) / (y * z);
        System.out.println("C(n,r): " + comb);
    }
}
