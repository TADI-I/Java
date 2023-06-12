import java.util.Scanner ; 

public class TutorialSessionsWhile
{
	public static void main(String[]args)
	{
		Scanner scanner = new Scanner(System.in);
		int iAns, iCounter = 1, iValA = 2;
		char cAns;
		double  rValA = 2, rValB = 1.5, rValC = 1, rTothrs = 0;
		
		System.out.print("How many tutorial sessions do you neeed?  (1, 2, or 3) : ");
		iAns = scanner.nextInt();
		
		while (iAns>3)
		{
			System.out.print(iAns + " is invalid.\nProvide a valid number (1, 2, or 3) :");
			iAns = scanner.nextInt();
		}
		
		System.out.println("\nOptions\t\tSubjects\tHours per session\nA\t\tProgramming\t2\nB\t\tMath\t\t1.5\nC\t\tEnglish\t\t1 ");
		
		for (iCounter = 1; iCounter <=3; iCounter++)
		{
		while (iCounter <= iAns)
		{
			System.out.print("\n\nWhat  subject do you chose for session : " + iCounter + "?\nChoose option A, B or C :");
			cAns = Character.toUpperCase(scanner.next().charAt(0));
			
			if(cAns =='A' || cAns == 'B' || cAns == 'C')
			{
				iCounter++;
		
			switch(cAns){
				case 'A':
					rTothrs += rValA;
				break;
				case 'B':
					rTothrs += rValB;
				break;
				case 'C':
					rTothrs += rValC;
				break;	
			}
			}
			else 
				System.out.print("\n" + cAns + " is invalid. Choose the correct option : A, B or C !");
		}
		}
		
		System.out.println("The total number of  hours you need is :" + rTothrs + " hours");
		
	}
}