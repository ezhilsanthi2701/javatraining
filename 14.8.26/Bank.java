

	import java.util.Scanner;
	import javax.security.auth.login.AccountNotFoundException;
	public class Bank {

	public class BankScanner {

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        Bankconnection bank = new Bankconnection();

	        int choice;
	        int accountNo;
	        double balance = 5000;

	        do {

	            System.out.println("\n===== BANK APPLICATION =====");
	            System.out.println("1. Login");
	            System.out.println("2. Withdrawal");
	            System.out.println("3. Deposit");
	            System.out.println("4. Exit");
	            System.out.print("Enter your choice: ");

	            choice = sc.nextInt();

	            switch (choice) {

	            case 1:

	                System.out.print("Enter Account Number: ");
	                accountNo = sc.nextInt();

	                try {
	                    bank.login(accountNo);
	                } 
	                catch (AccountNotFoundException e) {
	                    System.out.println(e.getMessage());
	                }

	                break;


	            case 2:

	                System.out.print("Enter withdrawal amount: ");
	                double withdrawAmount = sc.nextDouble();

	                bank.withDrawal(withdrawAmount, balance);

	                break;


	            case 3:

	                System.out.print("Enter deposit amount: ");
	                double depositAmount = sc.nextDouble();

	                bank.deposit(depositAmount, balance);

	                break;


	            case 4:

	                System.out.println("Thank you for using Bank Application!");

	                break;


	            default:

	                System.out.println("Invalid choice");

	            }

	        } while (choice != 4);

	        sc.close();
	    }
	}

}
