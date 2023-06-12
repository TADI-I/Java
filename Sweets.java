import java.util.Scanner;

public class Sweets
{
	public static void main(String  [] args)
	{
		Scanner scanner = new Scanner(System.in);
		final double LOLLY_PRICE =  1.43;
		final double SMALL_SWEET_PRICE = .25;
		double iLolly, iSmallSweet , iTotSweets = 0;
		double rCashGiven, rCashReturned ;

		int rCustomer_no = (int)Math.ceil(100 + Math.random()*899);
		int rBarcode =  (int)Math.floor(10000000 +Math.random() * 89999999);
		
		
		System.out.println("Customer no  ****"+rCustomer_no + "****");
		
		System.out.print("How many lolly pops did you take : ");
		iLolly = scanner.nextInt();
		System.out.println();
		
		System.out.print("How many small sweets did you take : ");
		iSmallSweet = scanner.nextInt();
		
		
		
		iTotSweets = iLolly * LOLLY_PRICE + iSmallSweet*SMALL_SWEET_PRICE ;
		
		
		
		System.out.println("your balance is : R" + Math.round(iTotSweets*10)/10.0);
		System.out.println();
		
		System.out.print("How much did the customr give : R");
		rCashGiven = scanner.nextInt();
		System.out.println();
		
		rCashReturned = rCashGiven - iTotSweets;
		
		System.out.println("customer change : R"+ Math.round(rCashReturned * 10)/ 10.0);
		
		
		System.out.println("Barcode for reciept  ****"+ rBarcode + "****");
		
	}
}