//package tadii_ant;

import java.util.Scanner;
public class WorkPay {
    public static void main(String[] args){
    
    Scanner scanner = new Scanner(System.in);
    
    String sName;
    int ihours;
    int iPerHour;
    int incomeD;
    int incomeM;
    
    System.out.println("Please input your name");
    sName = scanner.nextLine();
    
    System.out.println("Please input how many hours you work?");
    ihours = scanner.nextInt();
    
    System.out.println("How much do you get paid per hour?");
    iPerHour = scanner.nextInt();
    
    incomeD = ihours*iPerHour;
    incomeM = (ihours*iPerHour)*30;
    
    System.out.println("Employee "+sName+ " is paid R"+incomeD+ " per day");
    System.out.println("Employee "+sName+ " makes an average of R"+incomeM+ " per Month");
   
    if (incomeD <=1400){
    System.out.println("impressive amount");}
    
    else if (incomeD <1500 && incomeD <=2500){   
    System.out.println("Very impressive amount");}
    
    else if (incomeD <2500 && incomeD <=3500){        
    System.out.println("Outstanding amount");}
   
    
    else if (incomeD >=3500){
    System.out.println("You a rich MF (-_-) help me out with money");}
    
   
    
    
    
    
    
    
    
    
    }
    
}
