package vas_p1_atm;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalTime;

public class ATM {

	public static void main(String[] args) 
	{
		int balance=0, amount_withdrawl, amount_deposited=0;
		boolean condition=true;
		Scanner s= new Scanner(System.in);
		while(condition) 
		{
			System.out.println("Automated Teller Machine");
			System.out.println("choose 1 for Deposit");
			System.out.println("choose 2 for withdrawl");
			
			System.out.println("choose 3 for Check Balance");
			System.out.println("Choose 4 for exit");
			System.out.println("Choose the operation you want to perform:");
			int n=s.nextInt();
			switch(n){
			case 1:
				System.out.println("--------------------------------------");

				System.out.println("Enter the money to be deposited:");
				amount_deposited=s.nextInt();
				balance = balance + amount_deposited;
				System.out.println("your money have been successfully deposited");
				System.out.println("The current balance"+balance);

			break;
			
				case 2:
					System.out.println("--------------------------------------");
					System.out.println("how much amount you want to withdraw:");
					amount_withdrawl = s.nextInt();
					if(balance>=amount_withdrawl)
					{
						balance-=amount_withdrawl;
						System.out.println("Please collect your amount: "+ amount_withdrawl);
						System.out.println("The current balance is: "+ balance);
					}
					else 
					{
						System.out.println("In-Sufficient Balance");
					}
				break;
				
				case 3:
					System.out.println("--------------------------------------");
	                System.out.println("Balance : "+balance);
	                System.out.println("");
	            break;
	 
	            case 4:
	            	Scanner Receipt = new Scanner(System.in);
	            	System.out.println("--------------------------------------");
	            	
	            	System.out.println("Do you want any Receipt, "
	            			+ "say NO to Receipt - save TREE - save NATURE");
	            	String printing = Receipt.nextLine();
	            	
	            	switch(printing) {
	            	
	            	case "yes" : 
	            		LocalDate myobj1 = LocalDate.now();
	            		LocalTime myobj2 = LocalTime.now();
	            		
	            		System.out.println("--------------------------------------");
	            		System.out.println("Transaction Date: "+ myobj1  +  "Transaction Time:" + myobj2 );
	            		System.out.println("current balance: " + balance);
	            		System.out.println("--------------------------------------");
	            		
	            	case "no"  :    System.exit(0);
	            	Receipt.close();
	            	}
	            	
	            	condition=false;
	            	s.close();
			}
			
		}
		

	}

}
