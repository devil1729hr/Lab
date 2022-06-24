import java.util.Scanner;
class User {
    public static void main(String[]args){
        
        // Declaring Scanner to as new, new data will be given by User
        Scanner num = new Scanner(System.in);
        // Asking user to give two String value using num object as a String using nextLine function predifined in java
        System.out.println("What's your name:");
        
        // Asking user to give two String value using num object as a String using nextLine function predifined in java
        String name = num.nextLine();
        //pring name
        System.out.println("My name is" + " : " + name);
        
        // Asking user to give two String value using num object as a String using nextLine function predifined in java
        System.out.println("What's your branch:");
        String branch = num.nextLine();
        //pring branch
        System.out.println("My branch is" + " : " + branch);
    }
}