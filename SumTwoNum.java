import java.util.Scanner;
class SumTwoNum {
    public static void main(String[]args){
        int num1 = 10;
        int num2 = 20;
        int sum = num1 + num2;

        System.out.println("Sum of two numbers" + " : " + sum);
        Scanner num = new Scanner(System.in);
        System.out.println("Enter Number:");
        int num3 = num.nextInt();
        int num4 = num.nextInt();
        int sum2 = num3 + num4;

        System.out.println("Sum of two number from user" + " : " + sum2);
        
    }
}