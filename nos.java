import java.util.Scanner;
public class nos
{
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		double m = 4, n = 11;
		
      double p = m+n/4;
      double r = m % 3;
       m = r+p*3;

		System.out.print(" m is " + m + "p-r is " + (p- r) + " " + p +" " + r);
	}
}