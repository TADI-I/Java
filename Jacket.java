import java.util.Scanner ; 

public class Jacket
{
	public static void main(String[]args)
	{
		Scanner scanner=new Scanner (System.in); 
		
		int iAns;
		
		System.out.println("Is it hot\t (1) Yes \t (2) No");
		iAns = scanner.nextInt();
		
		switch(iAns)
		{
			case 1:
			System.out.println("Do not take a Jacket");
			break;
			
			case 2:
			System.out.println("Do take a Jacket");
			break;
			
			default:
			System.out.println("Enter valid ans");
		}
	}
}