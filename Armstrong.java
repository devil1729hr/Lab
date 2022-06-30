import java.util.Scanner;
class Armstrong {
    public static void main(String[]args){
       
        // Declaring Scanner to as new, new data will be given by User
        Scanner num = new Scanner(System.in);

        // Asking user to give two float value using num object as a float using nextFloat function predifined in java
        System.out.println("Enter Number:");

         // Declaring Int variable from user
        int num1 = num.nextInt();
        //storing user number in original number to determine the sum of cubes of userNumber digits
        int mainNumber = num1;
        int sum = 0;
        int singleDigit = 0;
        while(mainNumber != 0) {
        	singleDigit = mainNumber % 10; // it will return the last digit from original number
        	sum += Math.pow(singleDigit, 3); // it will give the power of single digit and store the sum of digits till originalNumber is 0
        	mainNumber /= 10; // it will return the reamaining digits after removing the last digit
        };
        
        if(sum == num1) {
        	System.out.println(sum + " " + "=" + " " +num1 + " " + "therefore it is Armstrong Number");
        } else {
        	System.out.println(sum + " " + "!=" + " " + num1 + " " + "therefore not a Armstrong Number");
        }   
    }
}