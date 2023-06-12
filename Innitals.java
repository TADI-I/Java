import java.util.Scanner;

public class Innitals
{
	public static void main(String [] args)
	{
		String sName;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("what is your name?");
		sName = scanner.nextLine();
		
		System.out.println(sName.charAt(0));
		System.out.println(" "+sName.charAt(1));
		System.out.println("  "+sName.charAt(2));
		System.out.println("   "+sName.charAt(3));
		System.out.println("    "+sName.charAt(4));
		System.out.println("    "+sName.charAt(4));
		System.out.println("   "+sName.charAt(3));
		System.out.println("  "+sName.charAt(2));
		System.out.println(" "+sName.charAt(1));
		System.out.println(""+sName.charAt(0));
        
		
		/*System.out.println("     "+sName);
		System.out.println("    "+sName);
		System.out.println("   "+sName);
		System.out.println("  "+sName);
		System.out.println(" "+sName);
		System.out.println(""+sName);
	*/
		
		
	}
}