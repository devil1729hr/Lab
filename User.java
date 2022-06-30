import java.util.Scanner;
class User {
    public static void main(String[]args){
        Scanner a = new Scanner(System.in);
        System.out.println("Enter Two Number:");
        int num1 = a.nextInt();
        int num2 = a.nextInt();
        System.out.println(num1 + " " + num2);
        int temp;

        temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println(num1 + " " + num2);
    }
}