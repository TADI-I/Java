package tadii_ant;

import java.util.Scanner;
public class AgeCaluclation {
    public static void main(String[] args){
    
    Scanner scanner = new Scanner(System.in);
    
    int iYear;
    int iBirth;
    int iAge;
    String sName;
    
    
    System.out.println("What is your name?");
    sName = scanner.nextLine();
    
    System.out.println("What year are we in?");
    iYear = scanner.nextInt();
    
    
   System.out.println("What year were you born in?");
   iBirth = scanner.nextInt();
   
   
   iAge = iYear-iBirth;
   
   System.out.println(sName +" you are "+iAge+" years old.");
    
    
 
    
    
    
    
    
    }
    
}
