import java.util.Scanner ; 

public class DiceMathWhile
{
	public static void main(String[]args)
	{
		Scanner scanner = new Scanner(System.in);
		
		int iCounter = 0;
		int iAdded , iComputerGen1, iComputerGen2;
	
		iComputerGen1 = (int)(Math.random() * 6) + 1;
		iComputerGen2 = (int)(Math.random() * 6) + 1;
		
		//iAdded = iComputerGen1 + iComputerGen2;
		while ((iComputerGen1 + iComputerGen2) != 7)
		{
			System.out.println(iComputerGen1 + " + " + iComputerGen2 + " = " + (iComputerGen1 + iComputerGen2));
			
			iComputerGen1 = (int)(Math.random() * 6) + 1;
			iComputerGen2 = (int)(Math.random() * 6) + 1;
			iCounter ++ ;
		}
		
		System.out.println(iComputerGen1 + " + " + iComputerGen2 + " = " + (iComputerGen1 + iComputerGen2));
		System.out.println("All done -  i had to roll the dice "+ iCounter + " times");
	}
}