import java.util.Scanner;

public class MathProb {
	public static void main (String [] args)
		{ Scanner scanner = new Scanner(System.in);
		  double v1;
		  double v2;
		  double ans;
		  
		  System.out.println("Enter value 1");
		  v1= scanner.nextDouble();
		  
		  System.out.println("Enter value 2");
		  v2=  scanner.nextDouble();
		  
		  ans= (32 * v1) + v2;
		  
		  System.out.println("Your answer is "  + ans);
		 
		  
		
		}
}
