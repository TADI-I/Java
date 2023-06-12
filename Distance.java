package tadii_ant;

import java.util.Scanner;
public class Distance {
    public static void main(String[] args){
    
        float fkm;
        float fm;
        float fcm;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("How many km did you walk today ?");
        fkm = scanner.nextFloat();
        
        fm = fkm*1000;
        fcm = fkm*10000;
        
        System.out.println("You walked "+fm+"m and walked "+ fcm +" in centimeters");
        
    
    
    
    
    
    
    
        
        
    }
        
        
}
