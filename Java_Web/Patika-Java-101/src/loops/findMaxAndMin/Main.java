package loops.findMaxAndMin;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int smallest,largest;
        Scanner scan = new Scanner(System.in);
        System.out.print("How many numbers do you want to input? :");
        int n= scan.nextInt();
        System.out.print("Enter a number:");
        int inputNumbers = scan.nextInt();
        smallest=inputNumbers;
        largest=inputNumbers;
        for (int i = 1; i < n; i++) {
            System.out.print("Enter a number:");
            inputNumbers=scan.nextInt();
            if(inputNumbers<smallest){
                smallest=inputNumbers;
            }
            if (inputNumbers>largest){
                largest=inputNumbers;
            }
        }
        System.out.println("Max Value is: "+largest);
        System.out.println("Min Value is: "+smallest);
    }
}
