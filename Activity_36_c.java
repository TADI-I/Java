import java.util.Scanner;
public class Activity_36_c
{
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		int iVal1, iVal2;
		
		System.out.print("Test 1  :");
		iVal1= scan.nextInt();
		
		System.out.print("Test 2  :");
		iVal2= scan.nextInt();
		
		
		
		System.out.println("You Highest  :" +  Math.max(iVal1, iVal2));
		
	}
}