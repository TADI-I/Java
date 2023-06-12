import java.util.Scanner ; 

public class NameLen
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		String sName1 = "John";
		String sName2;
		
		System.out.print("Enter the name: ");
		sName2 = keyboard.nextLine();
		
		if (sName1.equals(sName2))
			System.out.println("Same name");
		else
			System.out.println(sName1 + " is not the same as " + sName2);
	}
}