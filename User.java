import java.util.Scanner;
class User {
    public static void main(String[]args){
        
        Scanner num = new Scanner(System.in);
        System.out.println("What's your name:");
        String name = num.nextLine();
        System.out.println("My name is" + " : " + name);
        
        System.out.println("What's your branch:");
        String branch = num.nextLine();
        System.out.println("My branch is" + " : " + branch);
    }
}