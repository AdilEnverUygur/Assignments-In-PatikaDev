package ifElseStatements.chineseZodiacCalculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int birthYear;
        String result = "";

        System.out.println("Enter Your Birth Year : ");
        birthYear = input.nextInt();

        switch (birthYear % 12) {
            case 0:
                result = "Monkey";
                break;
            case 1:
                result = "Cockerel";
                break;
            case 2:
                result = "Dog";
                break;
            case 3:
                result = "Pig";
                break;
            case 4:
                result = "Mouse";
                break;
            case 5:
                result = "Bull";
                break;
            case 6:
                result = "Tiger";
                break;
            case 7:
                result = "Rabbit";
                break;
            case 8:
                result = "Dragon";
                break;
            case 9:
                result = "Snake";
                break;
            case 10:
                result = "Horse";
                break;
            case 11:
                result = "Sheep";
                break;
        }
        System.out.println("Your Chinese Zodiac Sign is: " + result);
    }
}
