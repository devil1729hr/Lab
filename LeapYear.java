import java.util.Scanner;
class LeapYear {
    public static void main(String[]args){
    	
        // Declaring Scanner to as new, new data will be given by User
        Scanner num = new Scanner(System.in);

        // Asking user to give two float value using num object as a float using nextFloat function predifined in java
        System.out.println("Enter Number:");

         // Declaring Int variable from user
        int year = num.nextInt();
        
        // Check whether it is leap year or not
        if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
            System.out.println("year is a leap year");
         else
            System.out.println("year is not a leap year");        
        
    }
    
   
}