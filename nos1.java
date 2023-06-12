import java.util.Scanner;
public class nos1
{
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		int iHours, iGross , iNet;
		//double 
		
		System.out.print("how many hours :");
		iHours = scan.nextInt();
		
		iGross = (int)(((iHours - 5) *30)* 1.15)+ (5 * 30);
		iNet = (int)(iGross - iGross*.225);
		
     
		System.out.print(" net wage is R" + iNet); 
	}
}