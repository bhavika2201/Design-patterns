package app;

import account.Account;
import factory.AbstractFactory;
import factory.Factory;
import util.AccountType;
import util.FactoryType;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
new AbstractFactory().getFactory(FactoryType.ACCOUNT).getAccount(AccountType.CURRENT).accountType();//onfly method
	

AbstractFactory factory=new AbstractFactory();

Factory accountFactory=factory.getFactory(FactoryType.ACCOUNT);
Account CurrentFactory=accountFactory.getAccount(AccountType.CURRENT);
CurrentFactory.accountType();
	}

}
