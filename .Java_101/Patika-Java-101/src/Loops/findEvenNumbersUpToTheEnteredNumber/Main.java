package Loops.findEvenNumbersUpToTheEnteredNumber;

import java.util.Scanner;

public class Main {

        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            int enteredNumber = 0, sum = 0, validNumber = 0;
            double avg;

            System.out.println("Please Enter an Integer Number : ");
            enteredNumber = input.nextInt();
            for (int i = 0; i <= enteredNumber; i++){
                if(i % 3 == 0 && i % 4 == 0){
                    sum += i;
                    validNumber ++;
                }
            }
            avg = sum / (validNumber - 1);
            System.out.println("Average: " + avg );
            input.close();
        }
    }

