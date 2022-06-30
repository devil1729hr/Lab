import java.util.Scanner;
class Pattern {
    public static void main(String[]args){
    	
        // Declaring Scanner to as new, new data will be given by User
        Scanner num = new Scanner(System.in);

        // Asking user to give two float value using num object as a float using nextFloat function predifined in java
        System.out.println("Enter Rows:");

         // Declaring Int variable from user
        int rows = num.nextInt();
        int i,j;
        // Check whether it is leap year or not
        for(i=0; i<rows;i++) {
        	for(j=rows-i;j>1;j--) {
        		System.out.print(" ");
        	}
        	for(j=0;j<=i;j++) {
        		System.out.print("* ");
        	}
        	System.out.println();
        }
        
    }
    
   
}