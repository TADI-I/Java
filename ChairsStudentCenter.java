import java.util.Scanner;
public class ChairsStudentCenter
{
	public static void main(String [] args)
	{
		Scanner scanner  = new Scanner(System.in);
		
		final int MAX_CHAIRS = 54;
		int noChairs;
		int MaxRows;
		int Remainder;
	
		
		System.out.print("How many chairs are available? ");
		noChairs = scanner.nextInt();
		
		MaxRows = noChairs/  MAX_CHAIRS;
		System.out.println("The max  numbers of rows is "+ MaxRows);
		
		Remainder = noChairs % MAX_CHAIRS;
		System.out.println(Remainder + " chairs will be left");
		
	}
}
//ACTIVITY_COMPLETED 24
//copmiling is converting your code into machine language