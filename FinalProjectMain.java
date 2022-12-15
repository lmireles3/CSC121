//Luis Mireles lmireles3@toromail.csudh.edu
//Anthony Morales amorales296@toromail.csudh.edu

import java.util.Scanner;

public class FinalProjectMain {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int choices;
		
		Bank bankcs=new Bank();
		do {
			
			displayMenu();
			choices=sc.nextInt();
			sc.nextLine();
			switch(choices) {
			
			case 1:
				System.out.print("\nEnter first name: ");
				String fn=sc.nextLine();
				System.out.print("\nEnter last name: ");
				String ln=sc.nextLine();
				System.out.print("\nEnter social security number: ");
				String ssn=sc.nextLine();
				System.out.print("\nEnter Account Name: ");
				String accountName=sc.nextLine();
				bankcs.addAccount(new Account(new Customer(fn,ln,ssn),accountName));
				break;
				
			case 2:
				bankcs.listAccounts();
				break;
				
			case 3:
				System.out.print("Enter account number: ");
				int acctNo=sc.nextInt();
				System.out.print("Enter the amount to deposit: ");
				double amount=sc.nextDouble();
				bankcs.depositAccount(acctNo, amount);
				break;
				
			case 4:
				System.out.print("Enter account number: ");
				acctNo=sc.nextInt();
				System.out.print("Enter the withdrawal amount: ");
				amount=sc.nextDouble();
				bankcs.withdrawAccount(acctNo, amount);
				break;
				
			case 5:
				System.out.print("Enter account number: ");
				acctNo=sc.nextInt();
				bankcs.closeAccount(acctNo);
				break;
				
			case 6:
				System.exit(0);
				break;
			
			default:
				System.out.println("Invalid choice. please Try Again");
				break;
			}
		}while(choices!=8);

	}	
	
	private static void displayMenu() {
		System.out.println("1 - Open Account");
		System.out.println("2 - List accounts");
		System.out.println("3 - Deposit funds");
		System.out.println("4 - Withdraw funds");
		System.out.println("5 - Close an account");
		System.out.println("6 - Exit");
		System.out.print("\nPlease enter your choice: ");

	}

}

