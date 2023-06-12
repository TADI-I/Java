package tadii_ant;

import java.util.Scanner;
public class CalculationsRedo {
    public static void main(String[] args){
    float iMark;
    float iTotal;
    double percent;
    float avarage;
    Scanner scanner= new Scanner(System.in);
    
    System.out.println("What is the score you obtained?");
    iMark = scanner.nextInt();
  
    
    System.out.println("What is the test out of?");
    iTotal = scanner.nextInt();
    
    avarage = iMark / iTotal ;
  // Note my code is perfect i wrote it twice to ensure no errors but its seems like im flopping some where
  // I shall consult some one.
   
   
    percent = avarage * 100;
    
    System.out.println("You obtained  "+percent+"% Out of 100%");
    
    
    
    }
    
}
