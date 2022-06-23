import java.util.Scanner;
class ComplexNum {
    public static void main(String[]args){
        int a1Real = 2;
        int a2Real = 4;
        int b1Img = 5;
        int b2Img = 4;
        int sumReal = a1Real + a2Real;
        int sumImg = b1Img + b2Img;
        System.out.println("Sum of two Complex Number 2 + i5 and 4 + i4 is " + " : " + sumReal + " + " + "i" + sumImg );
        Scanner num = new Scanner(System.in);

        System.out.println("Enter two real numbers");
        int a3Real = num.nextInt();
        int a4Real = num.nextInt();
        int sum2Real = a3Real + a4Real;
        System.out.println("Enter two imaginary numbers");
        int b3Img = num.nextInt();
        int b4Img = num.nextInt();
        int sum2Img = b3Img + b4Img;

        System.out.println("Sum of two Complex Numbers" + a3Real + " + " + "i" + b3Img + " & " + a4Real + " + " + "i" + b4Img + " : " + sum2Real + " + " + "i" + sum2Img);

    }
}