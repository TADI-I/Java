import java.util.Scanner;

public class OutStanding
{
	public static void main(String [] args)
	{   
		Scanner scanner = new Scanner(System.in);
		
		int OutStanding = 0;
		
		System.out.println("How much is outstanding?");
		OutStanding = scanner.nextInt();
		
		System.out.println("Out Standing amount    R" + OutStanding);
		
	}
}