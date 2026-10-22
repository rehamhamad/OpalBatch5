package ToolboxApp;
import java.util.Scanner;

public class ToolboxApp {

    static  Scanner Sc =new Scanner(System.in); 
    public static void main(String[] args){
        
            do { 
                Menu();
                System.out.print("Chose a number: ");
                int men = Sc.nextInt();
                switch(men) {
                    case 1:CelsiusToFahrenheit();break;
                    case 2:evenOrOdd();break;
                    case 3:maxOfThree();break;
                    case 4:factorial();break;
                    case 5:multiplicationTable();break;
                    case 6:starTriangle();break;
                    case 7:isPrime();break;
                    case 8:reverseNumber();break;
                    default:throw new AssertionError();
                }
                
            } while (true);   
        }
    public static void Menu(){
        System.out.println("\n1. Celsius to Fahrenheit");
        System.out.println("2. Even or Odd");
        System.out.println("3. Maximum of three numbers");
        System.out.println("4. Factorial");
        System.out.println("5. Multiplication Table");
        System.out.println("6. Triangle of Stars");
        System.out.println("7. Prime check");
        System.out.println("8. Revese a number");
        System.out.println("9. Number pyramid");
        System.out.println("0.Exit");
    }

    public static double CelsiusToFahrenheit(){
        System.out.println("\nEnter the Temperature in Celsiys\t");
        double ctemp = Sc.nextDouble();
        double ftemp = ((ctemp*9)/5)+ 32;
        System.out.println("The Temperature in Fahrenheit is: " + ftemp);
        return ftemp;
        
    }

    public static int evenOrOdd(){
        System.out.println("\nEnter your number to find out if it is even or odd");
        int num = Sc.nextInt();
        if (num%2==0){
            System.out.println("The number is even");
        }else{
            System.out.println("The number is odd");
        }
        return num ;
    }

    public static int maxOfThree(){
        System.out.println("\nEnter 3 values to find out the bigest numbers");
        System.out.print("number 1: ");
        int num1 = Sc.nextInt();
        System.out.print("number 2: ");
        int num2 = Sc.nextInt();
        System.out.print("number 3: ");
        int num3 = Sc.nextInt();
        if (num1>num2 && num1 >num3){
            System.out.println("Number "+num1+" is the big number." );
            return num1;
        }else if (num2>num1 && num2>num3){
            System.out.println("Number "+num2+" is the big number." );
            return num2;
        }else{
            System.out.println("Number "+num3+" is the big number." );
            return num3;
        }
    }

    public static int factorial(){
        System.out.print("\nEnter your number");
        int fnum =Sc.nextInt();
        int fact =1;
        for (int i=1;i<=fnum;i++){
            fact = fact *i;
        }
        System.out.println("Factorial of "+fnum+" is "+ fact);
        return fact;
    }

    public static int multiplicationTable(){
        System.out.print("\nEnter a number : ");
        int mulnum = Sc.nextInt();
        System.out.println("The multipliacton talbe of "+ mulnum +" is:");
        for (int i=0 ; i<=12; i++){
            int mul = mulnum * i;
            System.out.println(mulnum +" * "+ i +" = "+ mul);
        }
        return mulnum;

    }

    public static int  starTriangle(){
        System.out.print("\nEnter a number: ");
        int n =Sc.nextInt();
        for (int r=1;r<=n;r++){
            for ( int s=n-r;s>0;s--){
                System.out.print(" ");
            }
            for(int st=1;st<=2*r-1;st++){
                System.out.print("*");
            }
            System.out.println();
        }  
        return n ;      
    }

    public static boolean  isPrime(){
        System.out.print("Enter an integer greater than 1: ");
        int num = Sc.nextInt();

        if (num <= 1) {
            System.out.println("Please enter a number greater than 1.");
            return false;
        }

        boolean isPrime = true;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        System.out.println("Is " + num + " prime? " + isPrime);

        return isPrime;
    }
    
    public static int reverseNumber() {
    System.out.print("\nEnter a Positive number: ");
    int num = Sc.nextInt();
    int rev = 0;

    for (; num > 0; num = num / 10) {
        rev = rev * 10 + num % 10;
    }

    System.out.println("Reversed number: " + rev);
    return rev;
}

}



