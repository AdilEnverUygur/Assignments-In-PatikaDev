package userLogin;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String oldUserName = "patikaDev",oldPassword = "java123";
        String inputUserName,inputPassword,newPassword;
        int select;

        Scanner input = new Scanner(System.in);

        System.out.print("Your User Name: ");
        inputUserName = input.nextLine();
        System.out.print("Your Password: ");
        inputPassword = input.nextLine();

        if (inputUserName.equals(oldUserName) && inputPassword.equals(oldPassword)){
            System.out.println("Login Successfully!");
        }else if (inputUserName.equals(oldUserName) && inputPassword != oldPassword){
            System.out.println("Wrong Password!");
            System.out.println("1-Reset Password\n2-Cancle Menu");
            System.out.print("Your selection is: ");
            select = input.nextInt();
            if (select == 1){
                System.out.print("Please enter your new Password: ");
                Scanner scan = new Scanner(System.in);
                newPassword = scan.nextLine();
                if (newPassword.equals(inputPassword)){
                    System.out.println("password did not reset! please check and re-enter password");
                }else if (newPassword.contains(oldPassword)){
                    System.out.println("password did not reset! please check and re-enter password");
                }else {
                    System.out.println("Reset password successfully!");
                }
            }else if (select == 2){
                System.out.println("Canlce successfully!");
            }
        }else if (inputUserName != oldUserName && inputPassword.equals(oldPassword)){
            System.out.println("Wrong user name!");
        }else {
            System.out.println("Wrong Login!");
        }
        }
    }

