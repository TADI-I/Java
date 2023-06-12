import java.util.Scanner ; 

public class WhileYn
{
	public static void main(String[]args)
	{
		Scanner scanner = new Scanner(System.in);
		
		char cAns;
		
		System.out.println("what is you answer?");
		cAns = Character.toUpperCase(scanner.next().charAt(0));
		
		while (cAns != 'Y' && cAns != 'N')
		{
			System.out.println("You should only enter Y or N");
			cAns = Character.toUpperCase(scanner.next().charAt(0));
		}
		
		if (cAns == 'Y')
			System.out.println(" your answer is Yes");
		
		else 
			System.out.println(" your answer is No");
		
	}
}
		