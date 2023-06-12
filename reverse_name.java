import java.util.Scanner ; 
import java.text.DecimalFormat;

public class reverse_name
{
	public static void main(String[]args)
	{
		Scanner scanner  = new Scanner(System.in);
		DecimalFormat format = new DecimalFormat("R#,##0.00");
		
		String sSentence = " ", sLetter;
		int iLenght;
		char cLetter;
		
		System.out.print("Please enter sentence :");
		sSentence = scanner.next();
		
		iLenght = sSentence.length();
		System.out.print(iLenght);
		

		while(iLenght<0)
		{
			sSentence = scanner.next().CharAt(iLenght);
			System.out.print(sSentence);
			iLenght--;
		}

	}
}