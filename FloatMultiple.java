import java.util.Scanner;
class FloatMultiple {
    public static void main(String[]args){
        float num1 = 1.2f;
        float num2 = 1.6f;
        float sum = num1 * num2;

        System.out.println("Multiply of two float numbers" + " : " + sum);
        Scanner num = new Scanner(System.in);
        System.out.println("Enter Number:");
        float num3 = num.nextFloat();
        float num4 = num.nextFloat();
        float sum2 = num3 * num4;

        System.out.println("Multiply of two float number from user" + " : " + sum2);
        
    }
}