import java.util.Scanner ; 
import java.text.DecimalFormat;

public class Full_ATM_App
{
	public static void main(String[]args)
	{
		Scanner scanner  = new Scanner(System.in);
		DecimalFormat format = new DecimalFormat("R#,##0.00");
		
		double rBalance = 1500.0, rOBalance = 1500.0;
		double rDepositAmt=0, rWithdrawAmt=0;
		int iPin =1234, iPinCheck, iTrasaction , iNewPin, iNewPinVerify;
		int iPinCount = 2, iNumOfWithdraw = 0, iNumOfDeposit = 0;
		
		System.out.println("TwoCent Bank ATM\nPIN: ");
			iPinCheck = scanner.nextInt();
		
			
				while(iPin != iPinCheck){
						
				while(iPinCount<1)
				{
					System.out.println("\t\tYOU HAVE ENTERED INCORRECT PIN 3 TIMES\n\n\t\tACCOUNT HAS BEEN BLOCKED\n\n\t\tCONTACT YOUR NEAREST BRANCH");
					System.out.println("\n\t\t>>---------------END-----------------<<");
					System.exit(0);
				}
			
					System.out.println("Incorrect PIN!!! "+ iPinCount +" attempt(s) remaining! : ");
					iPinCheck = scanner.nextInt();
					iPinCount--;
				}

				System.out.println("Select transaction");
				System.out.print("\t\t1 - DEPOSIT\t\t2 - WITHDRAW "+"\n\t\t3 - VIEW BALANCE\t4 - MINI-STATEMENT "+"\n\t\t5 - CHANGE PIN\t\t0 - QUIT "+ "\n\t\t>>");
				iTrasaction = scanner.nextInt();
				
				while(iTrasaction != 0)
				{
					System.out.println("Select transaction");
					System.out.print("\t\t1 - DEPOSIT\t\t2 - WITHDRAW "+"\n\t\t3 - VIEW BALANCE\t4 - MINI-STATEMENT "+"\n\t\t5 - CHANGE PIN\t\t0 - QUIT "+ "\n\t\t>>");
					iTrasaction = scanner.nextInt();
				switch(iTrasaction)
				{
					case 1:
						System.out.print("\t\t--------------DEPOSIT------------\n\t\tDeposit: R");
						rDepositAmt = scanner.nextDouble();
						iNumOfDeposit++;
						rBalance = rBalance + rDepositAmt;
						System.out.println("\n\t\tTransaction Succesful...\n\n\t\tNew Balance: " +format.format(rBalance) +"\n\t\t>>---------------END-----------------<<");
					break;
					
					case 2:
						System.out.print("\t\t--------------WITHDRAW------------\n\t\tWithdraw: R");
						rWithdrawAmt = scanner.nextDouble();
						
						while(rWithdrawAmt>rBalance)
						{
							System.out.println("\t\tError!!  not sufficient!!");
							System.out.print("\n\t\tWithdraw: R");
							rWithdrawAmt = scanner.nextDouble();
						}
							iNumOfWithdraw++;
							rBalance = rBalance  - rWithdrawAmt;
							System.out.println("\n\t\tTransaction Succesful...\n\n\t\tNew Balance: " +format.format(rBalance) +"\n\t\t>>---------------END-----------------<<");
						
					break;
					
					case 3:
						System.out.print("\t\t--------------BALANCE------------\n\n\t\tAccount Balance: "+ format.format(rBalance)+"\n\t\t>>---------------END-----------------<<");
					break;
					
					case 4:
						System.out.print("\t\t--------------MINI-STATEMENT------------\n\t\tOpening Balance : "+ format.format(rOBalance));
			
						System.out.println("\n\t\t"+ iNumOfDeposit + " Deposit transaction(s)\t\t: " + format.format(rDepositAmt));
						System.out.println("\n\t\t" + iNumOfWithdraw + " Withdrawal transaction(s)\t\t: " + format.format(rWithdrawAmt));
						System.out.println("\n\t\t Closing Balance\t\t: " + format.format(rBalance)+"\n\t\t>>---------------END-----------------<<");
					break;
					
					case 5:
						System.out.print("\t\t--------------CHANGE PIN------------\n\n\t\tEnter New Pin : ");
						iNewPin = scanner.nextInt();
						
						System.out.print("\t\tRe-enter New PIN : ");
						iNewPinVerify = scanner.nextInt();
						
						while(iNewPin != iNewPinVerify)
						{
							System.out.print("\n\n\t\tPIN MISMATCH! ");
							
							System.out.print("\n\t\tEnter New Pin : ");
							iNewPin = scanner.nextInt();
						
							System.out.print("\n\t\tRe-enter New PIN : ");
							iNewPinVerify = scanner.nextInt();
						}
						iPin = iNewPin;
						
						System.out.print("\n\n\t\tPIN  successfully changed!\n\t\tLogin to Activate new PIN! \n\t\tPIN: ");
						iPin = scanner.nextInt();
						
						while(iPin != iNewPin){
							iPinCount = 3;
						
							while(iPinCount<1)
							{
								System.out.println("\t\tYOU HAVE ENTERED INCORRECT PIN 3 TIMES\n\n\t\tACCOUNT HAS BEEN BLOCKEDn\n\t\tCONTACT YOUR NEAREST BRANCH");
								System.out.println("\n\t\t>>---------------END-----------------<<");
								System.exit(0);
							}
							
							
								System.out.println("Incorrect PIN!!! "+ iPinCount +" attempt(s) remaining! : ");
								iPinCheck = scanner.nextInt();
								iPinCount--;
							}
							System.out.println("\n\t\t>>---------------END-----------------<<");
						
					break;
						
					case 0:
						System.out.println("\n\t\t>>---------------END-----------------<<");
						System.exit(0);
					break;
					
					default:
						System.out.println("\t\tSomething went wrong !!! Did you select the correct option!\n\t\t>>---------------END-----------------<<");

				}
			}
	}
}