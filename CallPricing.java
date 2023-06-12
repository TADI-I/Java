//package tadii_ant;

import java.util.Scanner;

public class CallPricing {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int min ;
        float f1 =1.50f ;
        float B3 =.50f;
        float pricing;
        float f2;
        float f3;
        float A3 = 0.15f;
     
        System.out.println("How long was your call? **in min**");
        min = scanner.nextInt();
        
       
        if (min >= 3){ 
        
        f2 = min - 3;
        
        f3 = f2 *A3;
        
        pricing = f3 + f1;}
        else {
            pricing = min * B3;
        }
        
        System.out.println("your call is worth R"+ pricing);
        
        
        
       
        
       
        
         
    }
    
}
