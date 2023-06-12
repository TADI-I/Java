import java.util.Scanner;
public class Activity_36_b
{
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		double rAmount, rConvert, rRound;

			System.out.print("Pounds : ");
			rAmount =  scan.nextDouble();
			
			rConvert = rAmount *22;
			rRound = Math.round( rConvert * 100)/100.0;
			
			System.out.println("You will have R" +  rRound );
	}
}	