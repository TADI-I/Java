import java.util.Scanner;

public class EngineeringReq
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		boolean bFlag1 , bFlag2 , bFlag3 , bFlag4; 
		int iMath , iPhysics , iLO , iSub1 , iSub2 , iSub3 , iSub4;
		double rAverage;
		
		System.out.
		
		System.out.println("Enter Math Mark");
		iMath = scan.nextInt();
		
		System.out.println("Enter Physics Mark");
		iPhysics = scan.nextInt();
		
		System.out.println("Enter LO Mark");
		iLO = scan.nextInt();
		
		System.out.println("Enter Other subject 1 Mark");
		iSub1 = scan.nextInt();
		
		System.out.println("Enter Other subject 2 Mark");
		iSub2 = scan.nextInt();
		
		System.out.println("Enter Other subject 3 Mark");
		iSub3 = scan.nextInt();
		
		System.out.println("Enter Other subject 4 Mark");
		iSub4 = scan.nextInt();
		
		rAverage = (iMath + iPhysics + iSub1 + iSub2 + iSub3 + iSub4) /6;
		
		//The average of the learner’s marks should be at least 65%
		if (rAverage >=65)
		{
			bFlag1 = true;
		}
		else
		{
			bFlag1 = false;
		}
		
		//No subject may be lower than 60%.
		if (iMath >= 60 && iPhysics >= 60 && iSub1 >= 60 && iSub2 >= 60 && iSub3 >= 60 && iSub4 >= 60)
		{
			bFlag2 = true;
		}
		else
		{
			bFlag2 = false;
		}
		
		//Math and Phy above 70%
		if (iMath >70 && iPhysics>70)
		{
			bFlag3 = true;
		}
		else
		{
			bFlag3 = false;
		}
		
		//Final Out put
		if (bFlag1 && bFlag2 && bFlag3)
		{
			System.out.println("You Qualify !");
		}
		else 
		{
			System.out.println("You do not Qualify !");
		}
	
	}
	
}