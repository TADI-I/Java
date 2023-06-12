import java.util.Scanner ; 

public class Switch2
{
	public static void main(String[]args)
	{
		Scanner scanner=new Scanner (System.in); 
		
		int sSubject;
		
		System.out.println("1.CFA\n2.PPA\n3.COH");
		sSubject = scanner.nextInt();
		
		switch(sSubject)
		{
			case 1:
				System.out.println("CFA Mr Glen\nMon 10h00 - 11h00\t10-G06\nTue none\nWed 08h00-10h00\t\t10-G06");
			break;
			
			case 2:
				System.out.println("PPA Mr Baloyi\nMon 12h00 - 13h00\t10-L35\nTue none\nWed 10h00-12h00\t\t10-L35");
			break;
			
			case 3:
				System.out.println("COH Mr Letegang\nMon 14h00 - 15h00\t10-L30\nTue none\nWed 12h00-16h00\t\t10-L30");
			break;
			
			default:
						System.out.println("\nEnter valid number");
		}
		
	}
}