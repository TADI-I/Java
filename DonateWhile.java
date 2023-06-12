import java.util.Scanner ; 

public class DonateWhile
{
	public static void main(String[]args)
	{
		Scanner scanner = new Scanner(System.in);
		double rDonated;
		int iDonators = 0;
		
		System.out.println("How much will you donate?");
		rDonated = scanner.nextDouble();
		
		while (rDonated >= 1)
		{
			iDonators ++;
			System.out.println("You are donator no."+ iDonators + "and you have donated R" + rDonated);
			
		}
		
		if(rDonated < 1)
			System.exit(0);
			
		
	}
}