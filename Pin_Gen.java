public class Pin_Gen
{
	public static void main(String  [] args){
		int min = 10000;
		int max = 99999;
		int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
      System.out.println(random_int);
	}
}