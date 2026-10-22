package ArraysTask;

import java.util.Scanner;

public class ArraysTask{
    // Scanner
    //main
    static Scanner Sc = new Scanner(System.in);

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
        
        int count = countEven(numbers);
        System.out.println("Even Count: "+ count);
        
        System.out.print("Enter a number to Search :");
        int target = Sc.nextInt();
        int num = indexOf(numbers, target);
         if (num == -1) {
            System.out.println(target + " not found");
        } else {
            System.out.println(target + " found " );
        }


        System.out.print("Original: ");
        printArray(numbers);

        int[] reversed = reverseArray(numbers);

        System.out.print("Reversed: ");
        printArray(reversed);



        int[] grades = readGrades(5);

        int passed = countPassed(grades);
        int failed = grades.length - passed;

        System.out.println("Passed: " + passed);
        System.out.println("Failed: " + failed);




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

    //Question 3 Count and Search 
    static int countEven(int[] arr){
        int count = 0;
        for (int i = 0 ; i<arr.length;i++){
            if (arr[i]%2==0){
                count++;
            }
        }
        return count;
    }

    static int indexOf(int[] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    //Qustion 4 reverse the array 

    static int[] reverseArray(int[] arr) {
    int[] reversed = new int[arr.length];

    for (int i = 0; i < arr.length; i++) {
        reversed[i] = arr[arr.length - 1 - i];
    }

        return reversed;
    }
    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    static int[] readGrades(int size) {
    Scanner Sc = new Scanner(System.in);
    int[] grades = new int[size];

    for (int i = 0; i < grades.length; i++) {
        System.out.println("Enter grade " + (i + 1));
        grades[i] = Sc.nextInt();
    }

        return grades;
    }

    static int countPassed(int[] grades) {
        int count = 0;

        for (int i = 0; i < grades.length; i++) {
            if (grades[i] >= 50) {
                count++;
            }
        }

        return count;
    }


}