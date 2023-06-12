import java.util.Scanner;

public class Genderr
{
		public static void main(String[] args)
		{
			char sGender;
			Scanner scan  = new Scanner(System.in);
			
			System.out.println("Hi i am Sam");
			
			System.out.println("Are you M or F or N? (male or Female or Non Binary)");
			sGender  = scan.next().toUpperCase().charAt(0);
			
			if(sGender == 'M')
			{
				System.out.println("Male");
			}
			if(sGender == 'F')
			{
				System.out.println("Female");
			}
			if(sGender == 'N')
			{
				System.out.println("non Binary");
			}
			
			System.out.println("non ");
		}
}