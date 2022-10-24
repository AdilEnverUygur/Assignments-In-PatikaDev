package arrays.findMinMaxValueInArray;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = {25, 14, 75, 1, 0, -75, 3, 2,15,19};
        Scanner scan = new Scanner(System.in);
        Arrays.sort(arr);

        System.out.println("Array: " + Arrays.toString(arr));
        System.out.print("Please input a number: ");
        int inputNumber = scan.nextInt();

        int min = arr[0];
        int max = arr[9];

        for (int indexNumber : arr){
            if (indexNumber < inputNumber){
                min = indexNumber;
            }
        }

        for (int indexNumber : arr){
            if (indexNumber > inputNumber){
                max = indexNumber;
                break;
            }
        }
        System.out.println("The min closet number is: "+min);
        System.out.println("The max closet number is: "+max);


    }

}
