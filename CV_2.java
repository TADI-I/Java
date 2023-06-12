package tadii_ant;

import javax.swing.JOptionPane;
public class CV_2 { 
    
    public static void main(String [] args){
        
        int age = Integer.parseInt(JOptionPane.showInputDialog("How old are you?"));
        if (age >18) {JOptionPane.showMessageDialog(null, "You may proceed to making your CV");

            
        } 
        if (age < 18) {JOptionPane.showMessageDialog(null, "You may not proceed to making your CV you are too young");
        System.exit(age);
            
        }
        
        String name = JOptionPane.showInputDialog("What is your name?");
        JOptionPane.showMessageDialog(null, "Thank you "+ name +" for entering your age");

        String surname = JOptionPane.showInputDialog("Please enter Surname");
        // String iyear = JOptionPane.showInputDialog("Please enter Current year");
        
        
        int byear = Integer.parseInt(JOptionPane.showInputDialog("Please enter year of birth.  eg**YYYY** "));
        String DOB = JOptionPane.showInputDialog("Please enter birthday  eg**MM/DD** ");
        
        //int ageY = iyear - byear;
        
        //if (ageY = age) {System.out.println(" ");
            
        //4}
 
        String addy = JOptionPane.showInputDialog("Please input address");
        int addy1 = Integer.parseInt(JOptionPane.showInputDialog("Please input Postal Code"));
 
        String gender =  JOptionPane.showInputDialog("Gender M/F");
        // this will loop gender until user imputs their gender
        while(gender.isBlank()){
            gender =  JOptionPane.showInputDialog("Gender M/F");
            
        }
        
        int cell = Integer.parseInt(JOptionPane.showInputDialog("Enter Phone number"));
        
        String edu = JOptionPane.showInputDialog("highest level of education");
        
        JOptionPane.showMessageDialog(null, "You are required to input matric results.");
        JOptionPane.showMessageDialog(null, "input subject name");
        
        
        
        String sub1 = JOptionPane.showInputDialog("Subject 1");
        JOptionPane.showMessageDialog(null, "input subject Symbol ** 4, 5, 6 ,7");
        int sym1 = Integer.parseInt(JOptionPane.showInputDialog("Subject symbol 1"));
        
        String sub2 = JOptionPane.showInputDialog("Subject 2");
        
        int sym2 = Integer.parseInt(JOptionPane.showInputDialog("Subject symbol 2"));
       
        
        String sub3 = JOptionPane.showInputDialog("Subject 3");
        
        int sym3 = Integer.parseInt(JOptionPane.showInputDialog("Subject symbol 3"));
        
        
        String sub4 = JOptionPane.showInputDialog("Subject 4");
        
        int sym4 = Integer.parseInt(JOptionPane.showInputDialog("Subject symbol 4"));
       
        
        String sub5 = JOptionPane.showInputDialog("Subject 5");
        
        int sym5 = Integer.parseInt(JOptionPane.showInputDialog("Subject symbol 5"));
       
        
        String sub6 = JOptionPane.showInputDialog("Subject 6");
        
        int sym6 = Integer.parseInt(JOptionPane.showInputDialog("Subject symbol 6"));
        
        
        String sub7 = JOptionPane.showInputDialog("Subject 7");
        
        int sym7 = Integer.parseInt(JOptionPane.showInputDialog("Subject symbol 7"));
 
        // OUT PUT LINES
        
        
        
        System.out.println("       CURRICULUM ");
        System.out.println("          VITAE    ");
        System.out.println("           OF     ");
        System.out.println("        "+name     );
        System.out.println("       "+surname     );
       
        System.out.println(  ""    );
       
        
        System.out.println("Personal Details");
    System.out.println("Name"+"*************"+name);
    System.out.println("Surname"+"*************"+surname);
    System.out.println("Age"+"*************"+age);
    System.out.println("Gender"+"*************"+gender);
    System.out.println("Date of birth"+"*************"+byear+"/"+DOB);
    System.out.println("Address"+"*************"+addy+" "+addy1);
    System.out.println("Phone Number"+"*************"+"+27 "+cell);
        
  System.out.println("Education");
       System.out.println("Highest level if education"+"*************"+edu);
       
       System.out.println(" ");
      
       System.out.println("Matric results");
         System.out.println("Subject"+"*************"+"Symbol");
         System.out.println(sub1+"******************"+sym1);
         System.out.println(sub2+"******************"+sym2);
         System.out.println(sub3+"******************"+sym3);
         System.out.println(sub4+"******************"+sym4);
         System.out.println(sub5+"******************"+sym5);
         System.out.println(sub6+"******************"+sym6);
         System.out.println(sub7+"******************"+sym7);
         
         System.out.println(" ");
         
         System.out.println("APS"+"******************"+(sym1+sym2+sym3+sym4+sym5+sym6+sym7));
         System.out.println("**CV COMPILED SUCCESFULLY** ");



}
    
}
