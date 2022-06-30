import java.util.Scanner;
class Factorial {
    public static void main(String[]args){
       
        // Declaring Scanner to as new, new data will be given by User
        Scanner num = new Scanner(System.in);

        // Asking user to give two float value using num object as a float using nextFloat function predifined in java
        System.out.println("Enter Number:");

         // Declaring Int variable from user
        int num1 = num.nextInt();
        
        int product = 1;
        
        //loop will run until i == 0
        for(int i=num1; i>0; i--) {
        	product *= i;
        };
        //printing factorial
        System.out.println("Factorial of User Number :" + product);
        
        
    }
}