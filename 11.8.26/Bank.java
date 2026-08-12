package objectoriented;
class Bank
{
	int userAccountNo;
	String userName;
	int age;
	String dob;
	String gender;
	String accType;
	String Ifsc;
	String branchName;
	String address;
	String email;
	long mobile;
	double balance;
	double creditAmo;
	double debitAmo;
	double loan;
	double intersest;
    double amount;
    
	
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getCreditAmo() {
		return creditAmo;
	}

	

	public double getDebitAmo() {
		return debitAmo;
	}

	

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public int getUserAccountNo() {
		return userAccountNo;
	}

	public void setUserAccountNo(int userAccountNo) {
		this.userAccountNo = userAccountNo;
	}

	void withdrawal(int userAccountNo, double amount)
	{
	    balance = balance - amount;
	    debitAmo = amount;

	    System.out.println("Account No: " + userAccountNo);
	    System.out.println("Amount withdrawn: " + amount);
	    System.out.println("Remaining balance: " + balance);
	}

	void deposit(int userAccountNo, double amount)
	{
	    balance = balance + amount;
	    creditAmo = amount;

	    System.out.println("Account No: " + userAccountNo);
	    System.out.println("Amount deposited: " + amount);
	    System.out.println("Current balance: " + balance);
	}
}

	
	


