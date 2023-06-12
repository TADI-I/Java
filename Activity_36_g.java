import java.util.Scanner;
public class Activity_36_g
{
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		double rRadi , rArea, rCirc;
		
		System.out.print("Enter radius : ");
		rRadi = scan.nextDouble();
		
		rCirc = Math.round((2 * Math.PI * rRadi)*100) / 100.0 ;
		rArea = Math.round((Math.PI* Math.pow(rRadi , 2))*100) / 100.0;
		
		System.out.print("Area =" + rArea +" Circum =" + rCirc);
	}
}
		