import java.util.Scanner;
import java.text.DecimalFormat;

public class WakeUp
{
	public static void main(String[] args)
	{
		//declare
		Scanner kb = new Scanner(System.in);
		
		
		String Time = "07:00" ;
		String CurrentTime ;
		
		//prompt
		System.out.print("Enter time : ");
		CurrentTime = kb.nextLine();
		
		//if statements
		if (CurrentTime.equals ("07:00") )
		{
			System.out.println("wake up!!");
		}
		else 
		{
			System.out.println("Sleep");
		}
		//display
	
	}

}