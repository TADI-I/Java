import java.util.Scanner;
import java.text.DecimalFormat;

public class HolidayBooking
{
	public static void main(String [] args)
	{
		int iNumDays;
		double rAmount = 0 , rCost = 0, rTotalCost = 0.0;
		char cAns;
		
		Scanner scanner = new Scanner(System.in);
		DecimalFormat format = new DecimalFormat("R ###,###,###.00");
		
		System.out.print("How many days would you like to stay? : ");
		iNumDays = scanner.nextInt();
		
		System.out.print("Cost per room per night? (in rands): ");
		rCost = scanner.nextDouble();
		
		System.out.print("Are you a member of the holiday club <Y/N> : ");
		cAns = Character.toUpperCase(scanner.next().charAt(0));
		
		if(cAns == 'Y')
		{
			if(iNumDays<=7)
			{
				rTotalCost = 0;
			}
			else
			{
				rTotalCost = rCost * ((iNumDays - 7) * 0.75);
			}	
			
		}
		else if(cAns =='N')
		{
			rTotalCost = rCost * iNumDays;
		}
		
		System.out.print("Your holiday reservation for " + iNumDays + " will cost "+ format.format(rTotalCost ));
	}
}