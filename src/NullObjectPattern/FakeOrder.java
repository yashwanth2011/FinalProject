package NullObjectPattern;

public class FakeOrder extends AbstractOrder{

	@Override
	public String getOrderDetails()
	{
		return "Fake Order";
	}
	
	@Override
	public boolean isNull()
	{
		return true;
	}
	
}
