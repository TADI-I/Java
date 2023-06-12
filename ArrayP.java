public class ArrayP
{
	public static void main(String[] args)
	{
		int nums[] = {2, 4, 6, 8, 10};
		int total = 0 ;
		for(int i=0; i <nums.length; i++)
		{
			total += nums[i];
		}
		
		System.out.println("The average is: " + total/nums.length);
	}
	
}