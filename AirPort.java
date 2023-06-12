// cape town to ORT air p  = seat + maintance(18%)  additionaly when 1st flight or the last (add 2% to total cost)    
// cPT to Lanas Air P =  seat 
import java.util.Scanner;


public class AirPort
{
	public static void main(String [] args)
	{
		//decleration
		Scanner scan = new Scanner(System.in);
		double rORT_TO_CAPETOWN = 759.39;
		double rCAPETOWN_TO_LANS = 1499.99;
		final double MAINTENENCE = 0.18;
		final double FIRST_OR_LAST = 0.02;
		int iAns , iNumOfSeats = 0;
		double rTotal = 0;
		
		
		System.out.println("Number of seats Needed?");
		iNumOfSeats = scan.nextInt();
		
		//Calculations
		rORT_TO_CAPETOWN = ((rORT_TO_CAPETOWN * MAINTENENCE) + rORT_TO_CAPETOWN) * iNumOfSeats;
		rCAPETOWN_TO_LANS = rCAPETOWN_TO_LANS * iNumOfSeats;

		//Prompt
		System.out.println("\nSelect 1 for ORT to CT\t\tSelect 2 for CT to Lanas");
		iAns = scan.nextInt();
		
		//nested if statement 
		//OR Tambo to Cape town
		if (iAns == 1)
		{
			System.out.println("\nIs this the fist or last flight?\nSelect 1 for Yes\tSelect 2 for No");
			iAns = scan.nextInt();
			
			if (iAns ==1)
			{
				rTotal = (rORT_TO_CAPETOWN * FIRST_OR_LAST) + rORT_TO_CAPETOWN;
			}
			if (iAns == 2)
			{
				rTotal = rORT_TO_CAPETOWN;
			}
		}
		//Capetown to Lans
		else if(iAns == 2)
		{
			System.out.println("\nIs this the first or last flight?\nSelect 1 for Yes\tSelect 2 for No");
			iAns = scan.nextInt();
			
			if (iAns ==1)
			{
				rTotal = (rCAPETOWN_TO_LANS * FIRST_OR_LAST) + rCAPETOWN_TO_LANS;
			}
			if (iAns == 2)
			{
				rTotal = rCAPETOWN_TO_LANS;
			}
		}
		
		//flight price
		System.out.println("\n\n\nYour flight will cost R" + rTotal);
		
		
	}
}