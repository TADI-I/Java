import java.util.Scanner;
public class Moc_test
{
	public static void main(String [] args)
	{
		Scanner scanner = new Scanner(System.in);
			int  rMon, rTue, rWed, rThur, rFriday;
			final int HAIR_CUT = 50;
			final int RENT_UTILS = 8200;
			int rWorkersIncome = 5500;
			int TotCuts, TotCosts, TotIncome;
			int Profit;
			
			System.out.println("please enter number of haircuts completed on Monday; ");
			rMon = scanner.nextInt();
			
			System.out.println("please enter number of haircuts completed on Tuesday; ");
			rTue = scanner.nextInt();

			System.out.println("please enter number of haircuts completed on Wednesday; ");
			rWed = scanner.nextInt();

			System.out.println("please enter number of haircuts completed on Thursday; ");
			rThur = scanner.nextInt();

			System.out.println("please enter number of haircuts completed on Friday; ");
			rFriday = scanner.nextInt();

			TotCuts = rFriday + rThur + rWed + rTue + rMon;
			System.out.println( "Total cuts completed weekly; R" + TotCuts);
			
			TotCosts = RENT_UTILS +  (2 * rWorkersIncome);
			System.out.println("Total costs;  R" + TotCosts );
			
			TotIncome = TotCuts * HAIR_CUT;
			System.out.println("Total income: R" + TotIncome);
			
			Profit = TotIncome - TotCosts;
			System.out.println("Profit:  R" + Profit);
			
	}
}