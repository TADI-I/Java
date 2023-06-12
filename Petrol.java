import java.util.Scanner;

public class Petrol
{
		public static void main(String[] args)
		{
			double rPetrol = 0;
			Scanner scan  = new Scanner(System.in);
			
			System.out.print("How many liters of petrol do you have?");
			rPetrol  = scan.nextDouble();
			
			if(rPetrol >=50)
			{
				System.out.println("you have enough Petrol");
			}
			 if(rPetrol < 50)
			{
				System.out.println("you dont have enough Petrol!! \n stay home");
			}
		}
}