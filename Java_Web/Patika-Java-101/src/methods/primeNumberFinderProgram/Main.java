package methods.primeNumberFinderProgram;

import java.util.Scanner;


public class Main {
    static int CheckPrime(int i,int num)
    {
        if(num==i)
            return 0;
        else
        if(num%i==0)
            return 1;
        else{
            return CheckPrime(i+1,num);
        }
    }
    public static void main(String[] args) {
        Scanner cs=new Scanner(System.in);
        int num;
        System.out.print("Enter your Number:");
        num=cs.nextInt();
        if(CheckPrime(2,num)==0)
            System.out.print("It is a Prime Number.");
        else
            System.out.print("It is not a Prime Number.");
        cs.close();
    }
}
