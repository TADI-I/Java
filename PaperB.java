import java.util.Scanner;
import java.text.DecimalFormat;

public class PaperB
{
	public static void main(String [] args)
	{
		Scanner scanner = new Scanner(System.in);
		DecimalFormat format = new DecimalFormat("R ###,###,###.00");
		
		double rBalance, rWithdraw, rDeposit;
		int iOpt;
		
		System.out.print("How much is your inital balance: R");
		rBalance = scanner.nextDouble();
		
		System.out.println("Options \tAction\n\n1. \t\tWithdraw\n2. \t\tDeposit\n0. \t\tExit");
		
		System.out.println("\nSelect an option ");
		iOpt = scanner.nextInt();
		
		while(iOpt != 0 && iOpt != 1 && iOpt != 2)
		{
			System.out.println("You should only enter an Integer from 0 to 2");
			System.out.print("please re-enter your option ");
			iOpt = scanner.nextInt();
		}
		
		while(iOpt == 1 || iOpt == 2)
		{
			switch(iOpt)
			{
				case 1:
					System.out.print("How much do you want to withdraw or deposit? R ");
					rWithdraw = scanner.nextDouble();
					rBalance -= rWithdraw;
				break;
				
				case 2:
					System.out.print("How much do you want to withdraw or deposit? R ");
					rDeposit = scanner.nextDouble();
					rBalance += rDeposit;
				break;
		
			}
			
			System.out.println("Select an option ");
			iOpt = scanner.nextInt();
			
		}
		System.out.print("\nYour updated balance is: " + format.format(rBalance));
		
	}
}