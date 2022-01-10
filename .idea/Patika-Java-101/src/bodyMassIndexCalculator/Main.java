package bodyMassIndexCalculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double weight,height,result;
        Scanner input = new Scanner(System.in);


        System.out.print("Please enter your height(in metre): ");
        height = input.nextDouble();

        System.out.print("Please enter your weight: ");
        weight = input.nextDouble();

        result = weight / (height * height);
        System.out.println("Your mass index is: " + result);

    }

}
