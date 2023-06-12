public class EvenVsOdd
{
	public static void main(String [] args)
	{
		int iNum;
		int iCounter, iEvenCount = 0, iOddCount = 0;
		
		for(iCounter = 1 ; iCounter<6; iCounter++)
		{ System.out.println(iCounter);
			iNum = (int)(Math.random() * 20);

			if(iNum % 2 == 0)
			{	
				System.out.println("The number is " + iNum + " even");
				iEvenCount ++;
			}
			else 
			{
				System.out.println("The number is " + iNum + " Odd");
				iOddCount ++;
			}
		}
		
		System.out.println("We have "+ iOddCount +" odd numbers and "+ iEvenCount + " Even numbers");
	}
}