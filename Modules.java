import java.util.Scanner;
public class Modules
{
	public static void main(String [] args)
	{   //variables
		String sName, sSurname;
		double rOverallAverageMath, rOverallAverageCAP, rOverallAveragePPA, rOverallAverageCFA ,rOverallAverageLFX;
		double rClassT1_math, rClassT2_math, rClassT3_math;
		double rClassT1_CAP, rClassT2_CAP, rClassT3_CAP;
		double rClassT1_PPA, rClassT2_PPA, rClassT3_PPA;
		double rClassT1_CFA, rClassT2_CFA, rClassT3_CFA;
		double rClassT1_LFX, rClassT2_LFX, rClassT3_LFX;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter name:");
		sName = scanner.nextLine();
		
		System.out.println("Enter Surname:");
		sSurname = scanner.nextLine();
		System.out.println();
		
		System.out.println("Enter Overall Average for Math:");
		rOverallAverageMath = scanner.nextDouble();
		System.out.println();
		
		System.out.println("Enter Overall Average for English:");
		rOverallAverageCAP = scanner.nextDouble();
		System.out.println();
		
		System.out.println("Enter Overall Average for Computing Fund:");
		rOverallAverageCFA = scanner.nextDouble();
		System.out.println();
		
		System.out.println("Enter Overall Average for Life Skills:");
		rOverallAverageLFX = scanner.nextDouble();
		System.out.println();
		
		System.out.println("Enter Overall Average for Prigraming:");
		rOverallAveragePPA = scanner.nextDouble();
		
		//calculations
		System.out.println();
		rClassT1_math = rOverallAverageMath * .25;
		rClassT2_math= rOverallAverageMath * .40;
		rClassT3_math = rOverallAverageMath * .35;
		
		rClassT1_CAP = rOverallAverageCAP * .25;
		rClassT2_CAP = rOverallAverageCAP * .40;
		rClassT3_CAP = rOverallAverageCAP * .35;
		
		rClassT1_CFA = rOverallAverageCFA * .25;
		rClassT2_CFA = rOverallAverageCFA * .40;
		rClassT3_CFA = rOverallAverageCFA * .35;
		
		rClassT1_LFX = rOverallAverageLFX * .25;
		rClassT2_LFX = rOverallAverageLFX * .40;
		rClassT3_LFX = rOverallAverageLFX * .35;
		
		rClassT1_PPA = rOverallAveragePPA * .25;
		rClassT2_PPA = rOverallAveragePPA * .40;
		rClassT3_PPA = rOverallAveragePPA * .35 ;
		
		
		//Output
		System.out.println(sName+ " " + sSurname + " Your results are as follows:" );
		System.out.println();
		System.out.println("Math");
		System.out.println("Class test 1 : " + rClassT1_math + "% out of 25%  || Class test 2 : " + rClassT2_math + "%  out of 40%  ||  Class test 3:" + rClassT3_math + "%  out of  35%" );
		System.out.println();
		
		System.out.println("English");
		System.out.println("Class test 1 : " + rClassT1_CAP + "% out of 25%  || Class test 2 : " + rClassT2_CAP + "%  out of 40%  ||  Class test 3:" + rClassT3_CAP + "%  out of  35%" );
		System.out.println();
		
		System.out.println("Computing Fund");
		System.out.println("Class test 1 : " + rClassT1_CFA + "% out of 25%  || Class test 2 : " + rClassT2_CFA+ "%  out of 40%  ||  Class test 3:" + rClassT3_CFA + "%  out of  35%" );
		System.out.println();
		
		System.out.println("Life Skills");
		System.out.println("Class test 1 : " + rClassT1_LFX + "% out of 25%  || Class test 2 : " + rClassT2_LFX + "%  out of 40%  ||  Class test 3:" + rClassT3_LFX + "%  out of  35%" );
		System.out.println();
		
		System.out.println("Programing");
		System.out.println("Class test 1 : " + rClassT1_PPA + "% out of 25%  || Class test 2 : " + rClassT2_PPA + "%  out of 40%  ||  Class test 3:" + rClassT3_PPA + "%  out of  35%" );
		
	}
}