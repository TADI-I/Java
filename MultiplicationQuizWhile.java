import java.util.Scanner ; 

public class MultiplicationQuizWhile
{
	public static void main(String[]args)
	{
		Scanner scanner = new Scanner(System.in);
		int iCorrectCount = 0;
		int iWrongCount = 0;
		int iMultiply , iAns1, iRandom1, iRandom2;
		char cAns = ' ';
		
		System.out.println("CALCULATIONS START...");
		
			iRandom1 = (int)(Math.random() * 15) +1;
			iRandom2 = (int)(Math.random() * 15) +1;
			iMultiply = iRandom1 * iRandom2;
		
			System.out.print( "------------------\n"+ iRandom1 + " x " + iRandom2 + " = ");
			iAns1 = scanner.nextInt();
			
			if(iAns1 == iMultiply)
			{	System.out.print("Correct - Continue: <Y>, Stop:<N>:  ");
				cAns = Character.toUpperCase(scanner.next().charAt(0));
				iCorrectCount++;
			}
			else 
			{	System.out.print("Wrong - Continue: <Y>, Stop:<N>:  ");
				cAns = Character.toUpperCase(scanner.next().charAt(0));
				iWrongCount++;
			}
		
		while(cAns == 'Y')
		{ 
			iRandom1 = (int)(Math.random() * 15) +1;
			iRandom2 = (int)(Math.random() * 15) +1;
			iMultiply = iRandom1 * iRandom2;
			
			System.out.println(" ");
			System.out.println( "------------------\n"+ iRandom1 + " x " + iRandom2 + " = ");
			iAns1 = scanner.nextInt();
			
		
			
		if(iAns1 == iMultiply)
			{	System.out.print("Correct - Continue: <Y>, Stop:<N>:  ");
				cAns = Character.toUpperCase(scanner.next().charAt(0));
				iCorrectCount++;
			}
			else 
			{	System.out.print("Wrong - Continue: <Y>, Stop:<N>:  ");
				cAns = Character.toUpperCase(scanner.next().charAt(0));
				iWrongCount++;
			}
			
		}
		
		System.out.println("------------------\nYou got " + iCorrectCount +" questions correct and " + iWrongCount +" questions Wrong!"); 
		
	}
}