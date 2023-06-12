import java.util.Scanner;
import java.text.DecimalFormat;

 class HotelBooking 
{
	public static void main(String [] args)
	{
		Scanner scanner = new Scanner(System.in);
		DecimalFormat format = new DecimalFormat("R ###,###,###,###.00");
		int iNights, iOpt, iAdults , iTotAdults = 0, iChildren , iTotChildren = 0;
		final double KIDS = 100, ADULTS =  200;
		double rAmount,rAdults,rChildren; 
		
		System.out.print("How many nights do you want to sleep?  :");
		iNights = scanner.nextInt();
		
		System.out.println("-------Menu-------\n[1] Add adults\n[2] Add children\n[3] Show balance\n[4] Quit");
		System.out.print("\nSelect an Option: ");
		iOpt = scanner.nextInt();
		
		while(iOpt >4 || iOpt<1)
		{
			System.out.print("\nYou should only enter integer 1 to 4\nPlease re-enter your option: ");
			iOpt = scanner.nextInt();
		}
		
		while(iOpt >0 && iOpt <4)
		{
			switch(iOpt)
			{
				case 1:
					System.out.print(">>>Number of adults to add :");
					iAdults = scanner.nextInt();
					iTotAdults += iAdults;
					System.out.println(">>>Total adults is: " + iTotAdults);
				
				break;
				
				case 2:
					System.out.print(">>>Number of Children to add :");
					iChildren = scanner.nextInt();
					iTotChildren += iChildren;
					System.out.println(">>>Total Children is: " + iTotChildren);
				break;
				
				case 3:
					rAdults = ADULTS * iTotAdults;
					rChildren = KIDS * iTotChildren;
					rAmount = iNights * (rAdults + rChildren);
					
					System.out.print("Total estimated cost for " + iNights +" nights : "+ iTotAdults + " Adults and "+ iTotChildren +" children = " +format.format(rAmount));

				break;
			}
			
			System.out.print("\nSelect an Option: ");
			iOpt = scanner.nextInt();
			
		}
	}
}