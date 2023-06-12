import java.util.Scanner;

public class Integerss
{
	public static void main(String []args)
	{
		Scanner scanner = new Scanner(System.in);
		int iNum, iCounter = 1, iNegCounter = 0, iPosCounter = 0, iZeroCounter = 0 ;
		
			
		for(iCounter = 1; iCounter<11; iCounter++)
		{
			System.out.print("Enter integer number " + iCounter + ": ");
			iNum = scanner.nextInt();
			
			if(iNum<0)
			{
				iNegCounter++;
			}
			else if(iNum>0)
			{
				iPosCounter++;
			}
			else
			{
				iZeroCounter++;
			}
		}
		
		System.out.println("\n\nZeros: " + iZeroCounter);
		System.out.println("Posetive number: " + iPosCounter);
		System.out.println("negative number: " + iNegCounter);
	}
}