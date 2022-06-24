import java.util.Scanner;
class SumTwoNum {
    public static void main(String[]args){
        // Declaring Int variable harcoded
        int num1 = 10;
        int num2 = 20;
        // Sum of int number hardcoded
        int sum = num1 + num2;
         // Printing Sum harcoded
        System.out.println("Sum of two numbers" + " : " + sum);
        // Declaring Scanner to as new, new data will be given by User
        Scanner num = new Scanner(System.in);
        // Asking user to give two Int value using num object as a Int using nextInt function predifined in java
        System.out.println("Enter Number:");

        // Declaring Int variable from user
        int num3 = num.nextInt();
        int num4 = num.nextInt();
        // Sum of user defined Int value
        int sum2 = num3 + num4;
        // printing Sum of user defined Int value
        System.out.println("Sum of two number from user" + " : " + sum2);
        
    }
}