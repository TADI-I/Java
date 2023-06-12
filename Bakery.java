import java.util.Scanner;

public class Bakery 
{
	public static void main(String [] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		double rCups, rRaisins, rButter, rPrice, rFlour;
		
		
		System.out.println("Enter how many Kgs of flour is needed");
		rFlour = scanner.nextDouble();
		
		rCups = (4 / 1)  * rFlour;
		
		rRaisins = (80 / 1)  * rFlour;
		
		rButter = 0 ;//(100 / 1)  * rFlour;
		if (rFlour != 1.99){
			rButter = 100;
			}
		else if(rFlour !=2){
		rButter = 200;
		}
		
		rPrice = (55 / 1.25)  * rFlour;
		
		System.out.println("Self-raising flour... " + rFlour + " kgs");
		System.out.println("Bran flour ..............." + rCups + " Cup(s)");
		System.out.println("Raisins or dates..... " + rRaisins + " grams");
		System.out.println("Butter................. ....." + rButter + " grams");
		System.out.println();
		System.out.println("Price................ .... R" + rPrice  );
		
		
	}
}