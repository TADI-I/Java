import java.util.Scanner;
public class Fa1
{
	public static void main(String [] args)
	{
		int rReward = 0, rRemaining, rFirstDistinction = 400, rFirstTwo = 800, rAvailable = 3000, rDis = 440, rNoOfDistinction;
		Scanner scanner  = new Scanner(System.in);
		
		System.out.println("how many distinctions did you get?");
		rNoOfDistinction = scanner.nextInt();
		
		if(rNoOfDistinction <=2){
		rReward = rNoOfDistinction * rFirstDistinction;
		}
		else if(rNoOfDistinction >2){
		rReward = (rNoOfDistinction - 2) * rDis + rFirstTwo;
		}
		rRemaining = rAvailable - rReward;
		
		System.out.println("you will recive R"+ rReward + " and the remaining amount will be R"+ rRemaining);
		
	}
}
// in button
Form1 form1 = new Form1();
this.setVisible(false);