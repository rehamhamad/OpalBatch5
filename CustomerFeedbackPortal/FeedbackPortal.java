
import java.util.Scanner;
public class FeedbackPortal{
    
//  Create arrays
    static String[] names =new String [100];
    static int[] ratings = new int[100];
    static String[] comments = new String[100];
    static int count =0;

    //Scanner
    static Scanner input = new Scanner(System.in); 

    public static void main(String[] args) {
        boolean system = true;
        while(system == true) { 
            showmenu();
            System.out.print("Choose:");
            int Choice = input.nextInt();
            switch (Choice){
                case 1: AddFeedback(); break;
                case 2: showAll();break;
                case 3: showAverage();break;
                case 4: searchByRating();break;
                case 5:
                case 6:
                case 7:
                default:
            }            
        }
    }
    //Show Menu
    public static void showmenu(){
        System.out.println("====CUSTOMER FEEDBACK PORTAL====");
        System.out.println("1.Add feedback");
        System.out.println("2.Show all feedback");
        System.out.println("3.Show average rating");
        System.out.println("4.Search by rating");
        System.out.println("5.Delete feedback");
        System.out.println("6.Save to file");
        System.out.println("7.Save and exit");
    }

    //Add Feedback 
    public static int  AddFeedback(){
        if(count<100){
            // Name
            System.out.print("Enter your name: ");
            input.nextLine();
            String name = input.nextLine();

            // Rating
            System.out.print("Enter your rating from 1-5: ");
            int rating = input.nextInt();

            while (true){
                    if(rating >5 || rating <1){
                    System.out.print("Enter A Valid Number ");
                    rating = input.nextInt();
                    }
                    else{
                        break;
                    }
                } 
                
            // Clear the Enter key
            input.nextLine();

            // Comment
            System.out.print("Enter your comment: ");
            String comment = input.nextLine();

            //Store them to the arrays 
            names[count]=name;
            ratings[count]=rating;
            comments[count]=comment;
            count++;

            System.out.println("Feedback added successfully!");
            return 1;
        } else {
            System.out.println("Feedback storage is full!");
            return 0;
        }            
    }

    //ShowAll
    public static void showAll(){
        System.out.println("\nAll of our feedbacks: ");
       for (int i =0 ; i<count ; i++){
        System.out.println("Name: "+ names[i]);
        System.out.println("Rating: "+ ratings[i]);
        System.out.println("Comment: "+ comments[i]);
        System.out.println("-------------------------");
       }

        
    }

    //ShowAverage 
    public static double showAverage(){
        double sum=0;
        for (int i=0 ; i<count ; i++){
           sum += ratings[i];
        }
        double avg = sum / count;
        System.out.println("Rating Average : "+ avg);

        return avg;
        
    }

    //Search by rating

    public static void searchByRating(){
        //Enter rating and validaion:
        System.out.print("Enter your rating ");
        int rating = input.nextInt();
        while (true){
                    if(rating >5 || rating <1){
                    System.out.print("Enter A Valid Number ");
                    rating = input.nextInt();
                    }
                    else{
                        break;
                    }
                } 
        System.out.println("Feedback with rating "+ rating);
        //checkes the feedbacks based on already given feedback 
        for (int i=0 ; i< count ; i++ ){
            // Check if the entered rating matches the rating stored in the array
            if (ratings[i]==rating){
                System.out.println("Name: "+ names[i]);
                System.out.println("Rating: "+ ratings[i]);
                System.out.println("Comment: "+ comments[i]);
                System.out.println("-------------------------");
            }
        
        }
    }


}



    

