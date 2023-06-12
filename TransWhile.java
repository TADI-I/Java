import java.util.Scanner ; 

public class TransWhile
{
	public static void main(String[]args)
	{
		Scanner scanner = new Scanner(System.in);
		double rPerKg = 5.5, rPerKmRoad = .80, rPerKmTrain = .50, rPerKmAir = 1.50; 
		double rVat  = 1.15, rInsure = 1.11;
		double rKg, rKM, rFinalCost, rCost = 0 ;
		int iAns;
		char cAns;
		
		System.out.println("How heavey is the parcel");
		rKg = scanner.nextDouble();
		
		System.out.println("How far are you traveling");
		rKM = scanner.nextDouble();
		
		
		System.out.println("Are you Travling\n1.Road\n2.Train\n3.Air");
		iAns = scanner.nextInt();
		
		while(iAns != 1 && iAns != 2 && iAns != 3)
		{
				System.out.println("Enter Valid Number\n1.Road\n2.Train\n3.Air");
				iAns = scanner.nextInt();
		}
		
		switch (iAns)
		{
			case 1 :
			rCost = ((rKg * rPerKg) + (rKM * rPerKmRoad));
			break;
			
			case 2:
			rCost = ((rKg * rPerKg) + (rKM * rPerKmTrain));
			break;
			
			case 3:
			rCost = ((rKg * rPerKg) + (rKM * rPerKmAir));
			break;
		}
		
		System.out.println("Would you like to Insure \n<Y>es or <N>o");
		cAns = Character.toUpperCase(scanner.next().charAt(0));
		
		while(cAns != 'Y' && cAns != 'N')
		{
			System.out.println("Enter Valid Answer \n<Y>es or <N>o");
			cAns = Character.toUpperCase(scanner.next().charAt(0));
		}
		
		if (cAns == 'Y')
		{
			rFinalCost =  (rCost * rInsure) * rVat;
			System.out.println(" Your final cost is R"+rFinalCost);
		}
		else 
		{
			rFinalCost = rCost * rVat;
			System.out.println(" Your final cost is R"+rFinalCost);
		}
		
			
	}
}