import java.util.Scanner;
public class Average
{public static void main(String [] args)
	{ Scanner scanner = new  Scanner(System.in);
		String sStudentN;
		int iPPA;
		int iCOH;
		int iCFA;
		double rAverage;
		
		System.out.println("Enter name of student:");
		String StudentN = scanner.nextLine();
		
		System.out.println("Enter marks for PPA:");
		int PPA = scanner.nextInt();
		
		System.out.println("Enter marks for COH:");
		int COH = scanner.nextInt();
		
		System.out.println("Enter marks for CFA:");
		int CFA = scanner.nextInt();
		
		rAverage =(CFA + COH + PPA)/3;
		
		System.out.println("In the 3 tests conducted " +  StudentN +" scored an average of  " + rAverage + "%");
	}
}