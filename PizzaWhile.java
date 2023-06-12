import java.util.Scanner ; 

public class PizzaWhile
{
	public static void main(String[]args)
	{
		Scanner scanner = new Scanner(System.in);
		int iToppings = 0;
		char cAns;
		double rPizza = 40, rCostTopping = 7.50, rFinal;
		
		System.out.println("Do you want toppings <Y>es or <N>o");
		cAns = Character.toUpperCase(scanner.next().charAt(0));
		
		while ( cAns != 'Y' && cAns !='N')
		{
			System.out.println("Enter valid answer <Y>es or <N>o");
			cAns = Character.toUpperCase(scanner.next().charAt(0));
		}
		
		if(cAns == 'Y')
		{
		System.out.println("How many topping do you want");
		iToppings = scanner.nextInt();
		
		while ( iToppings >3)
		{
			System.out.println("Enter less than 3 Toppings \nHow many topping do you want");
			iToppings = scanner.nextInt();
		}
		
		rFinal = (iToppings * rCostTopping) + rPizza;
		}
		else
		rFinal = rPizza;
		
		System.out.println("You pizza will b Cost: R" + rFinal);
	}
}