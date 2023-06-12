import java.util.Scanner;

public class MusicSelection
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		/* String sA = "Xigubu";
		String sB = "Single Ladies";
		String sC = "For Tonight";
		String sD = "Lost me"; */
		char cSelection;
		
		System.out.println("Select a Song\nA.Xigubu\nB.Single Ladies\nC.For Tonight\nD.Lost me");
		cSelection = scan.next().toUpperCase().charAt(0);
		
		if(cSelection == 'A' || cSelection == 'C')
		{
			System.out.println("Xigubu");
			{
				
		else if(cSelection == 'B' || cSelection == 'D')
		{
			System.out.println("Single Ladies");
		}
		else if(cSelection == 'C' || cSelection == 'B')
		{
			System.out.println("For Tonight");
		}
		else if(cSelection == 'D' || cSelection == 'A')
		{
			System.out.println("Lost Me");
		}
	}
}