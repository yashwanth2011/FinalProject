package NullObjectPattern;

public class RealOrder extends AbstractOrder{
	public RealOrder(String orderId)
	{
		this.orderId = orderId;
	}
   
	@Override
	public String getOrderDetails()
	{
		return orderId;
	}
		   
	@Override
	public boolean isNull()
	{
		return false;
	}
}
