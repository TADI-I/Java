import java.util.Scanner;
public class FloatingPoint
{
	public static void main(String []args)
	{
		Scanner scanner = new Scanner(System.in);
		float fVal;
		
		System.out.println("Enter Value ");
		fVal = scanner.nextFloat();
		
		
		if (fVal == 0)
			System.out.println("Zero");
		
		else if (fVal < 0 )
		{
			if (Math.abs(fVal) <10)
				System.out.println("Negative small number");
		
			else if (Math.abs(fVal) > 1000000)
				System.out.println("Negative large number");
			
			else if (Math.abs(fVal) >10 && Math.abs(fVal) < 1000000 )
				System.out.println("Negative number");
		}
		
		else if (fVal > 0 )
			System.out.println("Posetive number entered");
		
	
	}
}