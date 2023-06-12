package tadii_ant;




import java.util.Scanner;
public class InputClass {
    
       
 public static void main(String[] args){

 
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Whats your name ?");
        String name = scanner.nextLine();
        System.out.println("How old are you?");
        int age = scanner.nextInt();
        
        
        System.out.println("hello"+" "+name);
        System.out.println("You are "+age+" years old");
        

                
}

}

