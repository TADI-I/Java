//package tadii_ant;

//Author TADII CV with matric results.


import java.util.Scanner;
public class CvClass {
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        
        
        
        
        
           System.out.println("_______");
     
        System.out.println("Input Age");
        int  age = scanner.nextInt(); 
        if (age <=17 ) {
      System.out.println("Access denied - You are not old enough!");
      System.out.println("*****SESSION TERMINATED*****");
       System.exit(0);
       
        }
        if (age >40){  System.out.println("Access denied - You are too old!");
      System.out.println("*****SESSION TERMINATED*****");
       System.exit(0);}
      else {
      System.out.println("Access granted !");
        }
        
        
           System.out.println("");
        String gap = scanner.nextLine(); // insted of gap i can use  scanner.nextLine(); without a string.
         //solution to skipping input. insert filler or gap inpit which it will jus skip automatically and will not affect code.
         
         
     System.out.println("_______");
     // inputing _ dose not  solve prob :( 
        System.out.println("Gender M/F");
        char gender = scanner.nextChar();
    
        
             System.out.println("_______"); 
        System.out.println("Input name");
        String name = scanner.nextLine();
        
        System.out.println("_______");
        System.out.println("Input surname");
        String surname = scanner.nextLine();
        
    
        System.out.println("_______");
        System.out.println("Input Year of Birth");
        int  b_year = scanner.nextInt();
        if (b_year > 2003){  System.out.println("Access denied - You are not old enough!");
        System.out.println("*****SESSION TERMINATED*****");
       System.exit(0);
        } 
        if (b_year < 1981){  System.out.println("Access denied - You are not old enough!");
        System.out.println("*****SESSION TERMINATED*****");
       System.exit(0);
        } 

        System.out.println("");
         String gap1 = scanner.nextLine();
         //solution to skipping input. insert filler or gap input which it will jus skip automatically and will not affect code.
        System.out.println("_______");
        System.out.println("Input Month of birth *FIRST 3 LETTERS*");
        String  moth = scanner.nextLine();
        
        System.out.println("_______");
        System.out.println("Input Day of birth");
        int  day = scanner.nextInt();
        if (day >31) { System.out.println("invalid!");
        
        }
       
        System.out.println("_______");
        System.out.println("Input Phone Number");
        int phoneNumber  = scanner.nextInt();
        
        System.out.println("_______");
        System.out.println("Input House number");
        int house_number  = scanner.nextInt();
       
            System.out.println("");
         String gap2 = scanner.nextLine();
         //solution to skipping input. insert filler or gap inpit which it will jus skip automatically and will not affect code.
         
        System.out.println("_______");
        System.out.println("Input Street name");
        String street = scanner.nextLine();
        
        System.out.println("_______");
        System.out.println("Input Postal code");
        int postal_code = scanner.nextInt();
       
         System.out.println("");
         String gap3 = scanner.nextLine();
         //solution to skipping input. insert filler or gap inpit which it will jus skip automatically and will not affect code.   
        System.out.println("_______");
        System.out.println("Input highest level  education");
        String edu = scanner.nextLine();
        
        System.out.println("_______");
        System.out.println("Input matric sibjects and symbols");
        System.out.println("*If you have not completed type N/A*");
        System.out.println("*Only symbols 4 ,5 ,6 ,7*");
          System.out.println("_______");
          
          // gap will always be inserted after inerger input
          System.out.println("Subject 1");
        String sub1 = scanner.nextLine();
        System.out.println("Symbol for Subject 1 ");
        int sym1=scanner.nextInt();
        System.out.println("");
         String gap4 = scanner.nextLine();
        
        System.out.println("Subject 2");
        String sub2 = scanner.nextLine();
         System.out.println("Symbol for Subject 2 ");
         int sym2=scanner.nextInt();
         System.out.println("");
         String gap5 = scanner.nextLine();
         
         System.out.println("Subject 3");
        String sub3 = scanner.nextLine();
         System.out.println("Symbol for Subject 3 ");
         int sym3=scanner.nextInt();
         System.out.println("");
         String gap6 = scanner.nextLine();
         
         System.out.println("Subject 4");
        String sub4 = scanner.nextLine();
         System.out.println("Symbol for Subject  4 ");
         int sym4=scanner.nextInt();
         System.out.println("");
         String gap7 = scanner.nextLine();
         
         System.out.println("Subject 5");
        String sub5 = scanner.nextLine();
         System.out.println("Symbol for Subject 5 ");
         int sym5=scanner.nextInt();
         System.out.println("");
         String gap8 = scanner.nextLine();
         
         System.out.println("Subject 6");
        String sub6 = scanner.nextLine();
         System.out.println("Symbol for Subject 6  ");
         int sym6=scanner.nextInt();
         System.out.println("");
         String gap9 = scanner.nextLine();
         
         System.out.println("Subject 7");
        String sub7 = scanner.nextLine();
         System.out.println("Symbol for Subject 7  ");
         int sym7=scanner.nextInt();
         System.out.println("");
         String gap10 = scanner.nextLine();
        
          
    
   
    System.out.println("Personal Details");
    System.out.println("Name"+"*************"+name);
    System.out.println("Surname"+"*************"+surname);
    System.out.println("Age"+"*************"+age);
    System.out.println("Gender"+"*************"+gender);
    
 
    
    System.out.println("Date of birth");
    System.out.println("D.O.B"+"*************"+day+" "+moth+" "+b_year);
    System.out.println("Phone Number"+"*************"+"+27"+phoneNumber);
       
    System.out.println( gap + gap2 + gap1);//where i put in the fillers so it can sepatate info/
    
    System.out.println("Address");
    System.out.println("House Number"+"*************"+house_number);
    System.out.println("Street name"+"*************"+street);
    System.out.println("Postal code"+"*************"+postal_code);
    
    System.out.println(gap3+gap4+gap5+gap6+gap7+gap8+gap9+gap10);
    
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
