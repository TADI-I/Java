import java.util.Scanner;
public class Activity_36_h
{
	public static void main(String [] args)
	{ 
		Scanner scan = new Scanner(System.in);
		double iBox, rArea;
		
		System.out.print("Enter Floor area : ");
		rArea = scan.nextDouble();
		
		iBox = Math.ceil(rArea / 2.0);
		
		System.out.print("Boxes needed =  " + (int)iBox);
	}
}