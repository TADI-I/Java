/* they give clients A 10% discount for all construction above R300000, for any construction below that amount they only give a 2% discount 
manager says when displyin the total amount and discounted amount to display an additional message when the client qualified for the 10% discount ("Thanks" , if you  use if cannot display in if state ment1) */

import java.util.Scanner;

public class Zolisa
{
		public static void main(String[] args)
		{
			Scanner scan  = new Scanner(System.in);
			//decalre
			double rTotAmt = 0, rDiscount = 0;
			
			System.out.print("How much is your construction? ");
			rTotAmt  = scan.nextInt();
			
			
			if (rTotAmt > 300000)
			{
				rDiscount = rTotAmt * .10;
			}
			else if (rTotAmt < 300000)
			{
				rDiscount = rTotAmt * .02;
			}
			
			System.out.println("Your total is R"+rTotAmt+" Your discount is R"+ rDiscount);
			
			if(rTotAmt > 300000)
			System.out.println("Thanks ");
		}
}