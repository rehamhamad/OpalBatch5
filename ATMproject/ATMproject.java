package ATMproject;

import java.util.Scanner;

public class ATMproject {
    static Scanner Sc = new Scanner(System.in);
    static double balance = 1000.00;
    static int pin=1234;
    static double count_depo=0;
    static double total_depo=0;
    static double count_withdraw=0;
    static double total_withdraw=0;

    static boolean accsess;

    public static void main(String[] args) {
        login();
    }
    
    public static boolean  login(){
        
        for (int i = 2 ; i>=0; i--){
            System.out.print("Enter your password: ");
            int pass = Sc.nextInt();
            if(pass==pin){
                accsess = true;
                System.out.println("Welcom");
                break;
            }else{
                System.out.println("You have "+ i +" attempts left");
            }
        }
        System.out.println("Card blocked");
        return accsess;
        
    }



    
}
