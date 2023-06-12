import java.util.Scanner;
public class FoodCost
{
	public static void main(String [] args)
		{
			Scanner scanner = new Scanner(System.in);
			final double PLATE = 1.05;
			final double FOOD_UNIT = 100.0;
			final double COST_PER_UNIT = 7.35;
			final double VAT_PERC = 0.15;
			double TotWeight;
			double FoodWeight;
			double TotAmount;
			double TotWVat;
			
			System.out.print( "Weight of food plus plate in kg: ");
			TotWeight = scanner.nextDouble();
			
			FoodWeight = TotWeight-PLATE;
			
			System.out.println("Weight of food : "+FoodWeight);
			
			TotAmount=((FoodWeight*1000)/FOOD_UNIT)*COST_PER_UNIT;
			TotWVat = TotAmount + (TotAmount*VAT_PERC);
			
			System.out.println("Amount to pay : R"+TotWVat);
		}
}