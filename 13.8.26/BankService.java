package bank_app;



public class BankService {
	double currentBalance=89766543;
	long []nums= {345,678,899,865};
	void searchAccount(long accNo)throws AccountNotFoundExpection
	{
		boolean flag=false;
		for(long num:nums)
		{
			if(num==accNo)
			{
				System.out.println("account found");
				flag=true;
				break;
			}
		}
		if(!flag)
			throw new AccountNotFoundExpection ("account not found");
	}
	void withDrawl(float amount) throws InsufficenBalance, InvalidAmountException {
		if(amount<=0)
			throw new InvalidAmountException("invalid amount");
		if(amount>currentBalance)
			throw new InsufficenBalance("insufficient");
		currentBalance=currentBalance-amount;
	}
	void login(int cardNo,int pin) throws InvalidPinExpection
	{
		if(cardNo==12345678)
		{
		if(pin==2020)
			
			System.out.println("logged in successfully");
		else
			throw new InvalidPinExpection("inncorrect pin number");
		
		}
		else
		{
			System.out.println("card is dummy");
		}
	}
}


