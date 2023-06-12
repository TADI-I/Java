import java.util.Scanner;
 class Demo
{
	public static void main(String [] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Tadii");
		
		int iAge;
		String sSurname;
		
		System.out.println("Input age");
		iAge = scanner.nextInt();
		
		scanner.nextLine();
		
		System.out.println("Input Surname");
		sSurname = scanner.nextLine();
		
		System.out.println("you are " + iAge + " years old and your surname is " + sSurname);
	}
}