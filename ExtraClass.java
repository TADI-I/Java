import java.util.Scanner;

public class ExtraClass
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int iAns;
		String sName = " ";
		int iNameLength;
		
		System.out.println("Select\n1.Student\n2.Lecture");
		iAns = scan.nextInt();
		
		if (iAns == 1 || iAns == 2)
		{
			System.out.println("Enter Name?");
			sName = scan.next();
			
			iNameLength = sName.length();
		
			if(iNameLength <3)
			{
				System.out.println("Your Name is invalid");
			}
			else
			{
				System.out.println("Success");
			}
		}
		else
		{
			System.out.println("You can not Use This System");
		}
		
	}
}