import java.util.Scanner;
public class Activity_36_i
{
	public static void main(String [] args)
	{ 
		Scanner scan = new Scanner(System.in);
		double r50c, rRemain , rChange;
		
		//System.out.print("Enter change : ");
		//rChange = scan.nextDouble();
		
		//r50c = (int)Math.floor(rChange / 0.5) ;
		rRemain = Math.round((1 + Math.random() *24)*100)/100.0;
		
		//System.out.println("Number of  50c : " + r50c);
		System.out.println("Change remaiinng : " + rRemain);
		
	}
}