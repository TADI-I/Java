import java.util.Scanner;
	
	public class Wagess
	{
		public static void main(String  [] args)
		{
			Scanner scanner = new Scanner(System.in);
			 double Wage  = 0.0  ;
			 final double income=100;
			 double noh;
			 double ah;
			 final double  inAf = 115;
			 double netSal;
			 double tax;
			 final double taxRate = 0.225;
			 
			 System.out .print("how many hrs have you worked: ");
			 noh = scanner.nextDouble();
			 
			 if (noh <=5){ 
				Wage = (income  * noh);
				}
			 else if(noh > 5){
				 ah= noh-5; 
				 Wage = 500 + ((inAf  * ah));
				 }
			 
			 
			tax = (Wage  * taxRate);
			netSal = Wage - tax;
			
			System.out.println("Gross salary: "+ Wage);
			System.out.println("Tax: "+ tax);
			System.out.println(" NettSalary: "+ netSal);
		}
	}