package createBasicCalculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n1,n2,select;

        Scanner scan = new Scanner(System.in);
        System.out.print("Please input first integer:");
        n1 = scan.nextInt();
        System.out.print("Please input second integer:");
        n2 = scan.nextInt();

        System.out.println("1-add\n2-subtract\n3-multiply\n4-divide");
        System.out.print("Your selection: ");
        select = scan.nextInt();

        switch (select){
            case 1:
                System.out.println("Add: " + (n1 + n2));
                break;
            case 2:
                System.out.println("Subtract: " + (n1 - n2));
                break;
            case 3:
                System.out.println("Multiply: " + (n1 * n2));
                break;
            case 4:
                System.out.println("Add: " + (n1 / n2));
                break;
            default:
                System.out.println("Wrong! Please re-enter!");
                break;
        }
    }
}
