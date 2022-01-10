package calculatesGradePointAverage;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Create Variables
        int math,physic,chemical,turkish,history,music;

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

        System.out.print("your music grade is : ");
        music = scan.nextInt();

        int sum = math + physic + chemical + turkish + history + music;
        double result = sum / 6;
        System.out.println("Your Average Grade is : " + result);

    }
}
