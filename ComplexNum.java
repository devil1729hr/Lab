import java.util.Scanner;
class ComplexNum {
    public static void main(String[]args){
        // Declaring Int variable for real and Img number
        int a1Real = 2;
        int a2Real = 4;
        int b1Img = 5;
        int b2Img = 4;
        // Sum of hardcoded value of real number
        int sumReal = a1Real + a2Real;
        // Sum of hardcoded value of Imaginary number
        int sumImg = b1Img + b2Img;
        // Printing Sum of Complex Number hardcoded
        System.out.println("Sum of two Complex Number 2 + i5 and 4 + i4 is " + " : " + sumReal + " + " + "i" + sumImg );
        // Declaring Scanner to as new, new data will be given by User
        Scanner num = new Scanner(System.in);

        // Asking user to get real number using num object as a Int using nextInt function predifined in java
        System.out.println("Enter two real numbers"); 
        int a3Real = num.nextInt();
        int a4Real = num.nextInt();

        //  Sum User defined real number
        int sum2Real = a3Real + a4Real;

        // Asking user to get imaginary number from user in using num object from line 17 as a Int using nextInt function predifined in java
        System.out.println("Enter two imaginary numbers");
        int b3Img = num.nextInt();
        int b4Img = num.nextInt();
         //  Sum User defined imaginary number
        int sum2Img = b3Img + b4Img;

        // Printing Sum of Complex Number User defined
        System.out.println("Sum of two Complex Numbers" + a3Real + " + " + "i" + b3Img + " & " + a4Real + " + " + "i" + b4Img + " : " + sum2Real + " + " + "i" + sum2Img);

    }
}