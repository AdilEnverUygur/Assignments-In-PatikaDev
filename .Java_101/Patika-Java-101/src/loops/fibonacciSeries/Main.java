package loops.fibonacciSeries;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int num1 = 0, num2 = 1;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter Fibonacci series of count: ");
        int count = scan.nextInt();
        System.out.print("Fibonacci Series of "+count+" numbers:");
        int i=1;
        while(i<=count)
        {
            System.out.print(num1+" ");
            int sumOfPrevTwo = num1 + num2;
            num1 = num2;
            num2 = sumOfPrevTwo;
            i++;
        }
    }
}
