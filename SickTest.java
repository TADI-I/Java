import java.util.Scanner;

public class SickTest
{
	public static void main(String [] args)
	{
		Scanner scanner = new Scanner(System.in);
		int iNum;
		double rNewNum = 0.0;
		
		System.out.println("Enter number >= 1");
		iNum = scanner.nextInt();
		
		while(iNum<1)
		{
			System.out.println(" Error!!\nEnter number >= 1");
			iNum = scanner.nextInt();
		}
		
		if(iNum >= 1 && iNum <= 20)
		{
			rNewNum = (double)((iNum*0.08) + iNum);
		}
		
		else if (iNum >= 20)
		{
			rNewNum = (double)(iNum - (iNum * 0.11));
		}
		
		System.out.println("The new value is " + rNewNum); 
	}
}