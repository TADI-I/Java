import java.util.Scanner;
 
 public class PaperA
 {
	 public static void main(String [] args)
	 {
		 // declare
		Scanner scanner = new Scanner(System.in);
		
		int iOpt, iInitalScore;
		
		//prompt
		System.out.print("What is your inital score: ");
		iInitalScore = scanner.nextInt();
		
		System.out.println("Options	\tStatus\n1.	\tWin\n2.	\tLost\n3.	\tDraw\n4.	\tExit");
		
		System.out.print("\nSelect an Option ");
		iOpt = scanner.nextInt();
		
		//error control
		while(iOpt !=1 && iOpt !=2 && iOpt !=3 && iOpt !=4)
		{
			System.out.print("You should only enter an integer from 1 to 4\nPlease re-enter your option ");
			iOpt = scanner.nextInt();
		}
		
		//loops
		while(iOpt == 1 || iOpt ==2 || iOpt == 3)
		{
			switch(iOpt)
			{
				case 1:
					iInitalScore = (iInitalScore + 10);
				break;
				case 2:
					iInitalScore = (iInitalScore - 4);
				break;
				
				case 3:
					iInitalScore = iInitalScore ;
				break;
				
			}
			
			System.out.print("\nSelect an Option ");
			iOpt = scanner.nextInt();
			
			while(iOpt !=1 && iOpt !=2 && iOpt !=3 && iOpt !=4)
			{
				System.out.print("You should only enter an integer from 1 to 4\nPlease re-enter your option ");
				iOpt = scanner.nextInt();
			}
		}
		System.out.print("\nYour final score is: " + iInitalScore);
	 }
 }
 