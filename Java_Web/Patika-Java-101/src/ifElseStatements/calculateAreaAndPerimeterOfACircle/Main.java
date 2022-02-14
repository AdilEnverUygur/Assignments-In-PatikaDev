package ifElseStatements.calculateAreaAndPerimeterOfACircle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int r;
        double pi = 3.14;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter radius of the circle: ");
        r = scanner.nextInt();
        double area = pi * r * r;
        double perimeter = 2 * pi * r;

        System.out.println("Circle's area is : " + area);
        System.out.println("Circle's perimeter is : " + perimeter);
    }
}
