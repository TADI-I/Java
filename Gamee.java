import java.util.Scanner ; 

public class Gamee
{
	public static void main(String[]args)
	{
		Scanner scanner=new Scanner (System.in); 
		
		int iComputerGenerate, iGuess ;
		
		System.out.println("Guess between 1 and 100");
		iGuess = scanner.nextInt();
		
		while( iGuess !< 1 && iGuess !>100)
		{
			System.out.println("enter number between 1 and 100");
			iGuess = scanner.nextInt();
		}
	}
}