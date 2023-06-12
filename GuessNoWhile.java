import java.util.Scanner ; 

public class GuessNoWhile
{
	public static void main(String[]args)
	{
		Scanner scanner = new Scanner(System.in);
		
		int iCounter = 0;
		int iGuess , iComputerGen;
		
		iComputerGen = (int)(Math.random() * 100) + 1 ;
		
		System.out.println("Guess the number between 1 - 100");
		iGuess = scanner.nextInt();
		
		while (iGuess != iComputerGen)
		{
			if(iGuess > iComputerGen)
				System.out.println("Your number is too high");
			else 
				System.out.println("Your numberis too low");
				iCounter++;
			
			System.out.println("\n\nTry again - Guess the number between 1 - 100");
			iGuess = scanner.nextInt();
		}
		
		System.out.println("YES - the number is  " + iGuess);
		
	}
}