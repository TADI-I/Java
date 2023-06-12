import java.util.Scanner;
public class Id_Age
{
	public static void main(String [] args)
	{
		Scanner scanner = new Scanner(System.in);
		int iYear ,iDay , iMonth, iLength;
		String iId;
		
		System.out.print("Enter your ID (First six digits):");
		iId= scanner.nextLine();
		
		iLength = iId.length(); 
		
		while(iLength != 6)
		{	System.out.print("Enter your ID (First six digits):");
			iId= scanner.nextLine();
		}
		
		
		
		
	}
	
}