import javax.swing.JOptionPane;

public class Prompt
{
	public static void main(String [] args)
	{
		int min = 10000;
		int max = 99999;
		int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
        System.out.println(random_int);
		int count = 0;
		
		int PinGen = Integer.parseInt(JOptionPane.showInputDialog("Enter special code"));
		
		if (random_int == PinGen){
		JOptionPane.showMessageDialog(null, "Transaction success");
		}
		while(random_int != PinGen && count<2){//body of the loop }(random_int != PinGen){
		JOptionPane.showMessageDialog(null, "You have 2 more attempts");
		Integer.parseInt(JOptionPane.showInputDialog("Enter special code"));
		}
		
		if(count == 2 ){
		JOptionPane.showMessageDialog(null,  "Transaction failed");
		}
	}
}