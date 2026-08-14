import java.util.List;

import javax.security.auth.login.AccountNotFoundException;

import banksystemapplication.BankCalculation;
import java.util.ArrayList;

public class Bankconnection implements bankinterfaceimp{

	

	    List<BankCalculation> accounts = new ArrayList<>(List.of(new BankCalculation(233,"exzh",344566,789,5433,466789) ));

	    @Override
	    public List<BankCalculation> getAccout() {
	        return accounts;
	    }

	    @Override
	    public void login(int accountNo) throws AccountNotFoundException {
	        for (BankCalculation account : accounts) {
	            if (account.getAccountNo() == accountNo) {
	                System.out.println("Login successful");
	               
	               
	            }
	        }

	        throw new AccountNotFoundException("not found");
	    }

	    @Override
	    public void withDrawal(double withdrawlAmou, double balance) {
	        if (withdrawlAmou <= balance) {
	            balance = balance - withdrawlAmou;
	            System.out.println("Withdrawal successful");
	            System.out.println("Remaining balance: " + balance);
	        } else {
	            System.out.println("Insufficient balance");
	        }
	    }

	    @Override
	    public void deposit(double depositAmou, double balance) {
	        balance = balance + depositAmou;
	        System.out.println("Deposit successful");
	        System.out.println("Updated balance: " + balance);
	    }
	}
	
	


