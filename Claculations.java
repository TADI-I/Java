package tadii_ant;

import java.util.Scanner;
public class Claculations {
    public static void main(String[] args){
        float iScore;
        float iTotal ;
         double avarage ;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your score ");
         iScore = scanner.nextInt();
        
        System.out.println("What is the test out of?");
         iTotal = scanner.nextInt();
       
        
        avarage = iScore/iTotal;
      
      
    
        System.out.println("You obtained "+ "  "+avarage*100 +"% out of 100%");
                
    
    
    
    
    
    
    
    }
    
}
