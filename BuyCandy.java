/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tadii_ant;

import java.util.Scanner;
public class BuyCandy {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       
       double iAmount;
       float iCandyWeight;
       
       
       
        System.out.println("How heavy is the candy? ** in grams**");
        iCandyWeight = scanner.nextFloat();
       
        iAmount= (6.50*iCandyWeight)/100;
        
        System.out.println("You need to pay R"+iAmount);
        
    }
    
}
