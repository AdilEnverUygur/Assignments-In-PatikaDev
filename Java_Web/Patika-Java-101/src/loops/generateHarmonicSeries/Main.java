package loops.generateHarmonicSeries;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double total =0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please Enter a Number: ");
        int number = scanner.nextInt();

        for (double i=1;i<=number;i++) {
            total += (1/i) ;
        }
        System.out.println("Total: "+total);
    }
}
