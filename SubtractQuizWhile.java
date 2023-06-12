import java.util.Scanner ; 

public class SubtractQuizWhile
{
	public static void main(String[]args)
	{
		Scanner scanner = new Scanner(System.in);
		int iCorrectCount = 0;
		int iCounter = 1;
		int iSubtraction , iAns1, iAns2 , iAns, iRandom1, iRandom2;
		for(iCounter=1; iCounter <= 4;iCounter++)

		{ 
			iRandom1 = (int)(Math.random() * 9) +1;
			iRandom2 = (int)(Math.random() * 9) +1;
			iSubtraction = iRandom1 - iRandom2;
		
			System.out.println("\nThis is Q "+ iCounter +"\nWhat is " + iRandom1 + " - " + iRandom2 + " ?");
			iAns1 = scanner.nextInt();
			
			
			
			if(iAns1 == iSubtraction)
			{	System.out.println("Correct!");
				iCorrectCount++;
			}
			else 
				System.out.println("No! " + iRandom1 + " - " + iRandom2 + " = " + iSubtraction);
			
		}
		
		System.out.println("\nYou had " + iCorrectCount +" correct answers"); 
		
	}
}