import java.util.Scanner;
class FloatMultiple {
    public static void main(String[]args){
         // Declaring float variable harcoded
        float num1 = 1.2f;
        float num2 = 1.6f;
        // sum of float number hardcoded
        float sum = num1 * num2;
        // Printing Sum harcoded
        System.out.println("Multiply of two float numbers" + " : " + sum);

        // Declaring Scanner to as new, new data will be given by User
        Scanner num = new Scanner(System.in);

        // Asking user to give two float value using num object as a float using nextFloat function predifined in java
        System.out.println("Enter Number:");

         // Declaring float variable from user
        float num3 = num.nextFloat();
        float num4 = num.nextFloat();

        // sum of user defined float value
        float sum2 = num3 * num4;

         // printing sum of user defined float value
        System.out.println("Multiply of two float number from user" + " : " + sum2);
        
    }
}