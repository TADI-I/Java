public class RollDiceDouble
{
	public static void main(String [] args)
	{
		int iNum1, iNum2, iCounter = 0;
		
		do
		{
			iNum1 = 20 + (int)(Math.random()*10) ;
			iNum2 = 20 + (int)(Math.random()*10);
			
			System.out.println("I threw "+ iNum1 + " and " +iNum2);
			iCounter++;
		}
		while(iNum1 != iNum2);
			System.out.println("I threw the dice " + iCounter + " times to get a double");
	}
}