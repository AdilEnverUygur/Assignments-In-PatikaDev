package passStatus;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Create Variables
        int math,physic,chemical,turkish,history;

        //define scanner
        Scanner scan = new Scanner(System.in);

        //get value from user
        System.out.print("your math grade is : ");
        math = scan.nextInt();

        System.out.print("your physic grade is : ");
        physic = scan.nextInt();

        System.out.print("your chemical grade is : ");
        chemical = scan.nextInt();

        System.out.print("your turkish grade is : ");
        turkish = scan.nextInt();

        System.out.print("your history grade is : ");
        history = scan.nextInt();


        int sum = math + physic + chemical + turkish + history ;
        double result = sum / 5;

        if (result <= 55){
            System.out.println("Staied down! see you next year!");
            System.out.print("Your Average grade is: " + result);
        }else {
            System.out.println("Passed! Congratulations！");
            System.out.print("Your Average grade is: " + result);
        }
    }
}
