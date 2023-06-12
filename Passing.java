import java.util.Scanner;

public class Passing
{
	public static void main(String [] args)
		{
			Scanner scanner = new Scanner(System.in);
			int iMark;
			
			System.out.println("Please enter mark : ");
			iMark = scanner.nextInt();
			
			if(iMark < 50)
			{
				System.out.println("You have failed");
			}
			if(iMark > 49 && iMark < 75)
			{
				System.out.println("You have passed");
			}
			if(iMark >74)
			{
				System.out.println("You passed with a distinction");
			}
		}
} 