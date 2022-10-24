package ifElseStatements.suggestingEventsBasedOnAirTemperature;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int heat;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a heat temperature: ");
        heat = scanner.nextInt();

        if (heat < 5){
            System.out.println("You can ski");
        } else if (heat <= 25) {
            if (heat <= 15){
                System.out.println("Go to sinema");
            }else if (heat >= 10){
                System.out.println("Go to picnic");
            }
        }else {
            System.out.println("Go to swimming");
        }

    }
}
