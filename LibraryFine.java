/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tadii_ant;

import java.util.Scanner;
public class LibraryFine {
    public static void main(String[] args) {
      
       float iCharge = .50f;
       int iDaysLate;
       int iNoOfBooks;
       double iOutStandingFee;
       
       Scanner scanner = new Scanner(System.in);
       
       System.out.print("How many books are late?");
       iNoOfBooks = scanner.nextInt();
       
       
       System.out.println("How many days late are the books?");
       iDaysLate = scanner.nextInt();
       
       iOutStandingFee = iCharge*iDaysLate*iNoOfBooks;
       
       System.out.println("Please pay R "+iOutStandingFee);
        
        
        
        
        
    }
    
}
