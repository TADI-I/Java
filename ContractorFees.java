import java.util.Scanner;
 
public class ContractorFees
{
	public static void main(String [] args)
	{
		Scanner scanner = new Scanner(System.in);
		double rLenght;
		double rWidth;
		double rArea;
		double rTotCost;
		double rDeposit;
		double rBalance;
		final double tariff = 65.45;
		final double rPercent = 0.10;
		
		System.out.print("Lenght of room in meters: ");
		rLenght = scanner.nextDouble();
		
		System.out.print("Width of room in meters: ");
		rWidth= scanner.nextDouble();
		
		System.out.println("The room is "+rLenght+" x "+ rWidth);
		rArea = rLenght * rWidth;
		System.out.println("Area: "+rArea+ " square meters");
		
		rTotCost = rArea*tariff;
		System.out.println("Total cost: R"+rTotCost);
		
		rDeposit = rTotCost*rPercent;
		
		System.out.println("Deposit: R"+ rDeposit);
		
		rBalance = rTotCost-rDeposit;
		System.out.println("Balance :R"+rBalance);
		
	}
}