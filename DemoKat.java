import java.util.Scanner;

public class DemoKat
{
	public static void main(String [] args)
	{
		Scanner scanner = new Scanner(System.in); //input info
		
		String sName = " ";
		int  x, b, c, d ;
		int b; //16.36   16
		int c;
		final double rVat = .15;
		double  y = 0.0; // 15.36
		float  g = 1.5f;
		
		
		System.out.print("how old are you?");
		y = scanner.nextLine();
		
		/*
		sName = scanner.nextInt();
		sName = scanner.nextDouble();
		sName = scanner.nextFloat();
		*/
		
		System.out.println("Your name is" + sName ); //your name is Tadii
		
	}
}