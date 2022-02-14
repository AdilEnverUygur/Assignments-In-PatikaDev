package arrays.sortingElementsInAnArray;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int count,size;

        Scanner scan=new Scanner(System.in);

        System.out.print("Array Size :");
        size=scan.nextInt();

        int[] arr=new int[size];
        System.out.println("List Employee Enter :");

        for (int i=0;i< arr.length;i++){
            System.out.print(i+1+"."+"Employee Enter :");
            count=scan.nextInt();
            arr[i]=count;
        }
        System.out.println("Sorting :"+sortArrays(arr) );
    }

    public static String sortArrays(int[] arr){
        Arrays.sort(arr);
        return Arrays.toString(arr);

    }
}
