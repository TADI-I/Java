public class StudentCard
{
	public static void main(String [] args)
	{
		double Stdnt_Nmbr;
		final int begin = 22000000;
		
		Stdnt_Nmbr = Math.random() * 999999;
		
		System.out.print(begin + (int)Math.floor(Stdnt_Nmbr));
	}
}