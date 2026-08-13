package bank_app;
import java.util.*;
public class BankPortal {

	public static void main(String[] args)  {
		Scanner sc=new Scanner(System.in);
		System.out.println("you have choice"+"  "
				+ "1 serach"+"  "
				+ "2 withdrawl"+"  "
				+ "3 login");
		int a=sc.nextInt();
		BankService d=new BankService();
		switch(a)
		{  
		case 1:
			try {
			System.out.println("type account");
			int accNo=sc.nextInt();
			d.searchAccount(accNo);	
			}
			catch(AccountNotFoundExpection e)
			{
				System.out.println(e.getMessage());
			}
			break;
		case 2:
		{
			try {
				System.out.println("enter a amount");
				float amount=sc.nextFloat();
				d.withDrawl(amount);
			}
			catch(InvalidAmountException e) {
				System.out.println(e.getMessage());
			} catch (InsufficenBalance e) {
				System.out.println(e.getMessage());
			}
			break;
		}
		case 3:
		{
			try {
				System.out.println("enter card no");
				int cardNo=sc.nextInt();
				System.out.println("enter pin no");
				int pin=sc.nextInt();
				d.login(cardNo, pin);
			}
			catch(InvalidPinExpection e)
			{
				System.out.println(e.getMessage());
			}
			break;
		}
		default:
			System.out.println("invalid");
		
		}
		// TODO Auto-generated method stub

	}

}
