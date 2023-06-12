import java.util.Scanner;
public class Activity_36_e
{
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		int iStudent, iAmount;
		
		System.out.print("How many students :");
		iStudent =  scan.nextInt();
		
		iAmount =  (double)48.0/ iStudent;
		
		System.out.println("You each student will recive   :" +  iAmount);
	}
}