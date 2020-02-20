package factory;

import util.FactoryType;

public class AbstractFactory {
public Factory getFactory(FactoryType factoryType)
{
	Factory factory=null;
	switch (factoryType) {
	case ACCOUNT:
		factory=new AccountFactory();
		break;
	case LOGGER:
		factory=new LoggerFactory();
		break;

	default:
		break;
	}
	return factory;
}
}
