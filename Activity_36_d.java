import java.util.Scanner;
public class Activity_36_d
{
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		int iVal1, iVal2, iVal3;
		
		System.out.print("Test 1  :");
		iVal1= scan.nextInt();
		
		System.out.print("Test 2  :");
		iVal2= scan.nextInt();
		
		System.out.print("Test 3  :");
		iVal3= scan.nextInt();
		
		
		System.out.println("You average  :" +  (iVal1 + iVal2 + iVal3)/3);
		
	}
}