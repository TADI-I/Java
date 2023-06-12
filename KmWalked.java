/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tadii_ant;

import java.util.Scanner;
public class KmWalked {
    public static void main(String[] args){
    
    int iDistance;
    int iDays;
    double iTotDistace ;
    double rDistanceInKm;
    
   Scanner scanner = new Scanner(System.in);
   
   System.out.println("What is the distance form home to school? **in meters**");
   iDistance = scanner.nextInt();
   iTotDistace = iDistance*2;
   
   
   System.out.println("How many days do you walk to school?");
   iDays = scanner.nextInt();
   rDistanceInKm = (iDays*iTotDistace)/1000;
   
   System.out.println("You walked "+(rDistanceInKm)+" KM");
   
    
    
    
    
    
    
    }
    
}
