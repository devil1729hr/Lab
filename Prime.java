import java.util.Scanner;
class Prime {
    public static void main(String[]args){
    	
        // Declaring Scanner to as new, new data will be given by User
        Scanner num = new Scanner(System.in);

        // Asking user to give two float value using num object as a float using nextFloat function predifined in java
        System.out.println("Enter Number:");

         // Declaring Int variable from user
        int num1 = num.nextInt();
        
        // will call isPrime function to check if it is true or not
        if(isPrime(num1)) {
        	System.out.println("Is a prime Number");
        } else {
        	System.out.println("Not a prime Number");
        }
       
        
        
        
    }
    
    // function declare as boolean to check for true and false only
    
    public static boolean isPrime(int n) {
    	 if(n <= 1) {
         	return false;
         }
         
         //loop will until squareroot of num1 to check divisible with all the iteration
         for(int i = 2; i<Math.sqrt(n); i++) {
         	if(n % i == 0) {
         		return false;
         	}
         };
         
         return true;
    }
}