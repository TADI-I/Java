package tadii_ant;

import java.util.Scanner;
public class LuGreetMe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String sName;
        
        System.out.println("What is your name?");
        sName = scanner.nextLine();
        
        System.out.println("Hello "+sName);
        
    }
    
}
