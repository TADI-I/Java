import java.util.Scanner ; 

public class Game
{
	public static void main(String[]args)
	{
		Scanner scanner=new Scanner (System.in); 
		
		int iComputerGenerate ;
		iComputerGenerate = Math.random(iComputerGenerate * 1)/1.0 ;
		int iGuess;
		
		System.out.println("Guess between 1 and 100");
		iGuess = scanner.nextInt();
		
		if (iGuess != iComputerGenerate ){
			if (iGuess > iComputerGenerate)
				System.out.println("your number is too High ");
			else
				System.out.println("your number is too low ");
			
			System.out.println("Yes the number is " + iGuess);
		}
		else if (iGuess >
		
		
	}
}