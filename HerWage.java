/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tadii_ant;

import java.util.Scanner;
public class HerWage {
    public static void main(String [] args){
    
        Scanner scanner = new Scanner(System.in);
    int rHrly;
    int iWeek;
    int iTips;
    int iTip = 50;
    int iDaysPweek = 5;
    
    System.out.println("How much do you get paid an hour?");
    rHrly = scanner.nextInt();
    
    iWeek = (rHrly*8*iDaysPweek)*4 + 5*(2*rHrly)*2;
    iTips = 8*iTip*iDaysPweek*4+5*iTip*2;
    
        System.out.println("She gets paid R"+ iWeek+" with out tips. with tips it's R"+ (iWeek + iTips));
    
    
    
    }
}
