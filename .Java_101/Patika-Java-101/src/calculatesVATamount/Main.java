package calculatesVATamount;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double amount,vatRate = 0.18,vatAmount,amountWithVat;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the fee amount: ");
        amount = scan.nextDouble();
        vatAmount = amount * vatRate;
        amountWithVat = amount + vatAmount;

        System.out.println("Without VAT amount is: " + amount);
        System.out.println("VAT rate is: " + vatRate);
        System.out.println("VAT amount is: " + vatAmount);
        System.out.println("Amount with VAT is: " + amountWithVat);

    }
}
