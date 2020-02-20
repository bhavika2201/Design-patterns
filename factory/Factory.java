package factory;

import account.Account;
import logger.Logger;
import util.AccountType;
import util.LoggerType;

public interface Factory {
default Account getAccount(AccountType type)
{
	return null;
}
default Logger getLogger(LoggerType type)
{
	return null;
}

}
