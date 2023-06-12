public class Students
{
	public static void main(String[] args)
	{
		int iStudent1, iStudent2, iStudent3, iCounter = 0;
		
		do
		{
			iStudent1 = 18 + (int)(Math.random() * 8);
			iStudent2 = 18 + (int)(Math.random() * 8);
			iStudent3 = 18 + (int)(Math.random() * 8);
			
			System.out.println("The student's ages were " + iStudent1 + ", " + iStudent2 + " and " + iStudent3);
			
			iCounter++;
		}
		
		while ( (iStudent1 != iStudent2) || (iStudent1 != iStudent3) || (iStudent2 != iStudent3));
			System.out.println("I had to find the 3 students' " + iCounter + " to get a triple");
	}
}