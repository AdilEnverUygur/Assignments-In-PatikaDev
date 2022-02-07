package arrays.findRepeatingEvenNumbers;

import java.util.Arrays;

public class Main {
    static boolean isFind(int[] arr,int value){
        for (int idx : arr){
            if (idx == value){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] list = {1,4,2,3,4,5,6,6,7,8,9,8,88,21,22,22};
        int[] repeatList = new int[list.length];
        int indexNumber = 0;
        for (int i = 0;i < list.length;i++){
            for (int j = 0;j < list.length;j++){
                if ((i != j) && list[i] == list[j] && list[i] % 2 == 0){
                    if (isFind(repeatList,list[i])){
                        repeatList[indexNumber] = list[i];
                        indexNumber++;
                    }
                }
            }
        }
        for (int value : repeatList){
            if (value != 0){
                System.out.println(value);
            }
        }
    }
}
