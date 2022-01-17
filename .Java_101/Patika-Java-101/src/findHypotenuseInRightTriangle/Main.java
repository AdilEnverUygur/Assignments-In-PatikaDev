package findHypotenuseInRightTriangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Create Variables
        int a, b;
        double c;

        //Get values from User
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the first edge: ");
        a = scanner.nextInt();
        System.out.print("Please enter the second edge: ");
        b = scanner.nextInt();
        c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
        System.out.println("The hypotenusel in right triangle is: " + c);
    }
}
