/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//package tadii_ant;

/**
 *
 * @author tadiw
 */
public class Opearators {
    public static void main(String[] args) {
        // && = (and) both must be true
        // || = (or ) either one must be true
        //  ! = (not) reverses boolean value of condition 
        int temp = 26;
        
        if(temp <= 15){
            System.out.println("its cold");
        }
        // basically inbetween statement
        else if(temp>15 && temp<=25){ 
            System.out.println("its warm");
        }
        else if(temp<=26 ){
        System.out.println("Its really hot!!");
        
        }
    }
    
}
