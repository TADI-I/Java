import java.util.Scanner;

public class Switch1
{
	public static void main(String [] args)
		{
			Scanner scanner = new Scanner(System.in);
			char cSysmbol;
			
			System.out.println("Enter letter from (A) to (F)");
			cSysmbol = scanner.nextLine().toUpperCase().charAt(0);
			
				switch(cSysmbol)
				{
					case 'F':
						System.out.println("\n>50\nFail");
					break;
					
					case 'B':
						System.out.println("\n84 - 75\nDistinction");
					break;
					
					case 'C':
						System.out.println("\n74 - 65\nPass");
					break;
					
					case 'A':
						System.out.println("\n>= 85\nDistinction");
					break;
					
					case 'D':
						System.out.println("\n64 - 55\nPass");
					break;
					
					case 'E':
						System.out.println("\n54 - 50\nPass");
					break;
					
					default:
						System.out.println("\nEnter valid letter");
				}

		}
}