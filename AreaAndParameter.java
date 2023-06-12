/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tadii_ant;

import java.util.Scanner;
public class AreaAndParameter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        float iLength;
        float iBreath;
        float iArea;
        float iParameter;
        
        System.out.println("What is the length of the rectengale?");
        iLength = scanner.nextFloat();
        
        System.out.println("What is the breath of the rectengle?");
        iBreath = scanner.nextFloat();
        
        iArea = iBreath*iLength;
        iParameter=(iBreath*2)+(iLength*2);
        
        System.out.println("The area = "+ iArea);
        System.out.println("The Parameter = "+ iParameter);
    }
   
    
}
