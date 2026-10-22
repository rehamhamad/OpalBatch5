package ArraysTask;

import java.util.Scanner;

public class ArraysTask{
    // Scanner
    Scanner Sc = new Scanner(System.in);
    //main
    public static void main(String []args){
        int[] numbers = {12,7,25,3,18,9,30,14};

        int sum= sumArray(numbers);
        System.out.println("Sum: "+ sum);
        double avg = avarageArray(numbers);
        System.out.println("The avarage is : "+ avg);

    }
    //Qustion 1 SuM and Average
    static int sumArray(int[] arr){
        int sum=0;
        for (int i= 0; i<arr.length;i++){
            sum = sum + arr[i];
        }
        
        return sum;
    }
    static double avarageArray(int[] arr){
        sumArray(arr);
        double avg = sumArray(arr)/arr.length;
        return avg;
    }
}