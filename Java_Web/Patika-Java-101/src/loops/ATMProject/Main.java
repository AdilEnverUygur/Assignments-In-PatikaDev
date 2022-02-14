package loops.ATMProject;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password;
        int attempt = 3;
        int money;
        int balance = 1500;
        int select;
        Scanner input = new Scanner(System.in);

        while (attempt != 0) {
            System.out.print("Please enter your username  :");
            userName = input.nextLine();
            System.out.print("Please enter your password  :");
            password = input.nextLine();

            if (userName.equals("patika") && password.equals("123")) {
                System.out.println("Welcome to your account");
                do {
                    System.out.println("1-Add money to your account\n" +
                            "2-Withdraw money from your account\n" +
                            "3-See your account balance\n" +
                            "4- Exit");
                    System.out.print("Please select your choice  :");
                    select = input.nextInt();
                    switch (select) {
                        case 1:
                            System.out.print("Please enter your money to add  :");
                            money = input.nextInt();
                            balance += money;
                            break;
                        case 2:
                            System.out.print("Please enter your money to withdraw  :");
                            money = input.nextInt();
                            if (money <= balance)
                                balance -= money;
                            else{
                                System.out.println("Insufficient Balance");
                                System.out.println("Check your balance first");
                            }
                            break;
                        case 3:
                            System.out.println("Your balance is " + balance);
                            break;
                        case 4:
                            System.out.println("See you later");
                            break;
                    }
                } while (select != 4);
                break;
            } else {
                attempt--;
                if (attempt == 0) {
                    System.out.println("You have blocked your account");
                } else {
                    System.out.println("Wrong Entry");
                    System.out.println("You have " + attempt + " attempt left");
                }
            }
        }
    }
}
