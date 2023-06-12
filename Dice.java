/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tadii_ant;

import java.util.Random;
public class Dice {
    public static void main(String[] args) {
        Random random = new Random();
        int iR1 = random.nextInt((6)+1);
        System.out.println(iR1);
        
        boolean T = random.nextBoolean();
        System.out.println(T);
    }
    
}
