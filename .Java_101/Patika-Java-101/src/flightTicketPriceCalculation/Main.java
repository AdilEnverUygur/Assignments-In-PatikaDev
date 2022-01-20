package flightTicketPriceCalculation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double discountForKids = .50, discountForAdults = .10, discountForOlds = .30, discountRoundTrip = .20, priceForKm = 0.10, discount, totalPrice = 0;

        int distance, age, typeOfTrip;

        System.out.print("Enter the distance in km: ");
        distance = input.nextInt();

        System.out.print("Enter your age: ");
        age = input.nextInt();

        System.out.print("Enter Type of Trip: ");
        typeOfTrip = input.nextInt();

        if( (distance > 0 && age > 0) && (typeOfTrip == 1 || typeOfTrip == 2 )) {

            totalPrice = distance * priceForKm;

            if(age < 12){
                discount = totalPrice * discountForKids;
                totalPrice = totalPrice - discount;

            }
            if(age >= 12 && age <=24){
                discount = totalPrice * discountForAdults;
                totalPrice = totalPrice - discount;
            }
            if(age > 65){
                discount = totalPrice * discountForOlds;
                totalPrice = totalPrice - discount;
            }
            if(typeOfTrip == 2){
                discount = totalPrice * discountRoundTrip;
                totalPrice = totalPrice - discount;
                totalPrice = totalPrice * 2;
            }
            System.out.println("Total Price is: " + totalPrice + " TL");
        }
        else {
            System.out.println("You entered incorrect data!");
        }


    }
}
