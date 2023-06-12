import java.util.Scanner;
public class Largest
{
	public static void main(String []args)
	{
		Scanner scanner = new Scanner(System.in);
		int iVal1, iVal2, iVal3;
		
		System.out.println("Enter Value 1");
		iVal1 = scanner.nextInt();
		
		System.out.println("Enter Value 2");
		iVal2 = scanner.nextInt();
		
		System.out.println("Enter Value 3");
		iVal3 = scanner.nextInt();
		
		if (iVal1 > iVal2 )
		{
			if (iVal1 > iVal3)
			{
				System.out.println("Value 1 is the largest " + iVal1);
			}
		}
		
		 else if (iVal2 > iVal1)
		{
			if (iVal2 > iVal3)
			{
				System.out.println("Value 2 is the largest " + iVal2);
			}
		}
		
		 else if (iVal3 > iVal1)
		{
			if (iVal3 > iVal2)
			{
				System.out.println("Value 3 is the largest " + iVal3);
			}
		}
	}
}

