import java.util.List;

import javax.security.auth.login.AccountNotFoundException;

import banksystemapplication.BankCalculation;
public interface bankinterfaceimp {
List<BankCalculation> getAccout();
void login(int accountNo) throws AccountNotFoundException;
void withDrawal(double withdrawlAmou,double balance);
void deposit(double depositAmou,double balance);
}


	


 