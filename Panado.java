import java.util.Scanner ; 

public class Panado
{
	public static void main(String[]args)
	{
		Scanner scanner = new Scanner(System.in);
		int iCategory;
		String sAge1 = "1. 2 -3 Months ";
		String sAge2 ="2. 3 Months to 1 Year ";
		String sAge3 ="3. 1 Year to 5 Years ";
		String sAge4 ="4. 6 years to 12 Year ";
	
		
		System.out.println("Select Category " + "\n" + sAge1 + "\n"  + sAge2 + "\n" + sAge3 + "\n" +  sAge4);
		iCategory = scanner.nextInt();
		
		switch(iCategory)
		{
			case 1: case 2: case 3:
			System.out.println("\nDosage in mg\n10mg/kg");
			break;
			
			/* case 2:
			System.out.println("\nDosage in mg\n60mg");
			break;
			
			case 3:
			System.out.println("\nDosage in mg\n120mg");
			break;
			 */
			case 4:
			System.out.println("\nDosage in mg\n240mg");
			break;
			
			default:
			System.out.println("\nInvalid Category");
		}
	}
}
