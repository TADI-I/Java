import java.util.Scanner ; 

public class GreetingsWhile
{
	public static void main(String[]args)
	{
		Scanner scanner = new Scanner(System.in);
		
		int iCounter = 1;
		int iNoOfGreetings , iComputerGen1, iComputerGen2;
		
		System.out.println("how many greetings do you want?");
		iNoOfGreetings  = scanner.nextInt();
		
		while (iCounter < iNoOfGreetings)
		{
			System.out.println("This is greeting " + iCounter);
			iCounter ++;
		}
		
		System.out.println("Outside the loop the value of the Counter is " + iCounter + "\n\nBye!");
	}
}