import java.util.Scanner ; 

public class DiceWhile
{
	public static void main(String[]args)
	{
		Scanner scanner = new Scanner(System.in);
		
		int iCounter = 0;
		int iGuess , iComputerGen1, iComputerGen2;
	
		iComputerGen1 = (int)(Math.random() * 6) + 1;
		iComputerGen2 = (int)(Math.random() * 6) + 1;
		
		while (iComputerGen1 != iComputerGen2)
		{
		 iCounter++;
		 System.out.println("Roll number " + iCounter + " and the numbers " + iComputerGen1 + " and " + iComputerGen2 + " were rolled");
		 
		 iComputerGen1 = (int)(Math.random() * 6) + 1;
		iComputerGen2 = (int)(Math.random() * 6) + 1;
		}
		
		System.out.println("The dice was rolled "+ iCounter +" times for a pair of  " + iComputerGen1);
	}
}