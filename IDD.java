//if above 16 can get an ID
import java.util.Scanner;

public class IDD
{
public static void main(String [] args)
{
	int iAge;
	String sMessage = " ";
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("Enter age :");
	iAge = scanner.nextInt();
	
	if (iAge >= 16)
	{
		sMessage = "You can get an ID";
	}
	else
	{
		sMessage = "You dont get an ID");
	}
}
} 

(iAge >= 16) ? System.out.println("You can get an ID") : System.out.println("You dont get an ID");