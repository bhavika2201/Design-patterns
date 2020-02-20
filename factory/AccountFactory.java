package factory;

import account.Account;
import account.CurrentAccount;
import account.SavingAccount;
import util.AccountType;

public class AccountFactory implements Factory {
public Account getAccount(AccountType type)
{
	Account obj=null;
	switch (type) {
	case CURRENT:
		obj=new CurrentAccount();
		break;
	case SAVING:
		obj=new SavingAccount();
		break;
	default:
		obj=new SavingAccount();
	}
	return obj;
}
}
