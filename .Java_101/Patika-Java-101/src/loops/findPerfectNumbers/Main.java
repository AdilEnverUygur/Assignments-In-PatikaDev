package loops.findPerfectNumbers;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i, Number, Sum = 0 ;
        Scanner scan = new Scanner(System.in);
        System.out.println("\n Please Enter any Number: ");
        Number = scan.nextInt();

        for(i = 1 ; i < Number ; i++) {
            if(Number % i == 0)  {
                Sum = Sum + i;
            }
        }
        if (Sum == Number) {
            System.out.format("\n% d is a Perfect Number", Number);
        }
        else {
            System.out.format("\n% d is NOT a Perfect Number", Number);
        }
    }
}
