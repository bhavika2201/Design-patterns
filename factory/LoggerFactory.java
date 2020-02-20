package factory;



import logger.DbLogger;
import logger.FileLogger;
import logger.Logger;
import util.LoggerType;

public class LoggerFactory implements Factory {
public Logger getLogger(LoggerType type)
{
	
		Logger obj1=null;
		switch (type) {
		case FILE:
			obj1=new FileLogger();
			break;
		case DB:
			obj1=new DbLogger();
			break;
		default:
			//obj=new SavingAccount();
			break;
		}
		return obj1;

}
}
