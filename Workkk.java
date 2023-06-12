import java.util.Scanner ; 

public class Workkk
{
	public static void main(String[]args)
	{
		Scanner scan = new Scanner(System.in);
		String sDirector = "Jones" , sSecr = "Ali" , sJudge = "Dlamini";
		String sCheck;
		
		System.out.print("enter Surname :");
		sCheck = scan.nextLine();
		
		if (sCheck.equals(sDirector))
			System.out.println("You are the directors Son");
		
		else if (sCheck.equals(sJudge))
			System.out.println("You are the Judges Son");
		
		else if (sCheck.equals(sSecr))
			System.out.println("You are the Secretary's Son");
		
		else	
			System.out.println("Nice to meet you Mr/ Ms " + sCheck);
		
	
	}
}