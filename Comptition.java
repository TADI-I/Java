//you are in a competition they say using an if statement you are given two numbers display decide the highest and loswest and then display them.

import java.util.Scanner;

public class Comptition
{
	public static void main(String [] args)
	{
		//decleration
		Scanner scan = new Scanner(System.in);
		int iVal1 , iVal2;
		String sBig = "This is the highest Value: ";
		String sSmall = "This is the Lowest Value: ";
		
		System.out.println("Enter Value 1");
		iVal1 = scan.nextInt();
		
		System.out.println("Enter Value 2");
		iVal2 = scan.nextInt();
		
		if (iVal1 > iVal2 && iVal2 < iVal1 )
		{
			System.out.println(sBig + iVal1);
			System.out.println(sSmall + iVal2);
		}
		if(iVal1 < iVal2 && iVal2 > iVal1 )
		{
			System.out.println(sBig + iVal2);
			System.out.println(sSmall + iVal1);
		}
	}
}