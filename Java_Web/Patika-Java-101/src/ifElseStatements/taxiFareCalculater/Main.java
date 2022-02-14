package ifElseStatements.taxiFareCalculater;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int km;
        double perKm = 2.20, startPrice = 10, totalPrice;

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the distance in km: ");
        km = scan.nextInt();

        totalPrice = km * perKm;
        totalPrice += startPrice;

        totalPrice = (totalPrice < 20)? 20 :totalPrice;
        System.out.println("Total price is: " + totalPrice);
    }
}
