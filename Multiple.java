import java.util.Scanner;
class Multiple {
    public static void main(String[]args){
        int num1 = 4;
        int num2 = 2;
        int sum = num1 * num2;

        System.out.println("Multiply of two numbers" + " : " + sum);
        Scanner num = new Scanner(System.in);
        System.out.println("Enter Number:");
        int num3 = num.nextInt();
        int num4 = num.nextInt();
        int sum2 = num3 * num4;

        System.out.println("Multiply of two number from user" + " : " + sum2);
        
    }
}