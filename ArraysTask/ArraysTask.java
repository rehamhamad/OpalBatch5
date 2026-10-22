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
        System.out.println("Avarage : "+ avg);
        int max = findMax(numbers);
        System.out.println("Max Number: "+max);
        int min = findMin(numbers);
        System.out.println("min Number: "+min);
        int diff = max-min;
        System.out.println("Difference: "+diff);


    }
    //Qustion 1 Sum and Average
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

    //Qustion 2 Largesr and Smallest 
    static int findMax(int [] arr){
        int max = arr[0];
        for (int i = 0 ; i<arr.length ;i++){
            if (arr[i]>max){
                max=arr[i];
            }

        }
        return max;
    }

    static int findMin(int[] arr){
        int min =arr[0];
        for (int i =0 ; i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
}