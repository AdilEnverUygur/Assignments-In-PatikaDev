package arrays.harmonicAverage;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        double sum=0.0;

        for (int i=0;i<numbers.length;i++){
            sum+=1/(1.0+numbers[i]);
        }

        double harmonicAverage=numbers.length/sum;
        System.out.println(harmonicAverage);
    }
}
