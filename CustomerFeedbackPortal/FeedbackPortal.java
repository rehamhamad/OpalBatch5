import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
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
                case 5: deleteFeedback();break;
                case 6: saveFeedback();break;
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

    //Delete Feedback
    public static void deleteFeedback(){
        showAll();
        input.nextLine();
        System.out.print("Enter the name of the rating you want to delete: ");
        String name = input.nextLine();
        
        for (int i=0 ; i< count ; i++){ //Search for the name 
            if (names[i].equalsIgnoreCase(name)){
                for (int j=0 ; j<count-1 ; j++){
                    names[j]=names[j+1];
                    ratings[j]=ratings[j+1];
                    comments[j]=comments[j+1];
                    System.out.println("Deleted successfully  ");
                } 
                count --; 
            }    
            break;
        }   
    }

    //Save Feedback
    public static void saveFeedback(){
        String SourceFile = "C:\\CodelineOpalBatch5\\OpalBatch5\\CustomerFeedbackPortal\\Feedback.txt";
        try(
            BufferedWriter write = new BufferedWriter( new FileWriter(SourceFile));
            ){

            for (int i=0 ; i < count ; i ++){
                write.write(names[i]);
                write.newLine();
                //String.valueOf => used to convert the value to string because buffers epexts Strings not numbers
                write.write(String.valueOf(ratings[i]));
                write.newLine();
                write.write(comments[i]);
                write.newLine();                
            }
            write.close();   
        }catch (IOException exception){
            System.out.println("Error saveing feedback");
        }   
    }

    

}