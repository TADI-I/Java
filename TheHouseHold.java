import java.util.Scanner;

public class TheHouseHold 
{
	public static void main(String [] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		char  sGender;
		
		System.out.println("Enter gender : M/F");
		sGender = scanner.next().charAt(0);
		
		if(sGender == 'M')
		{
			System.out.println("You are the man of the house");
		}
		else if(sGender == 'F')
		{
		
			System.out.println("You are the mother of the house");
		}
		// page 67
	}
}