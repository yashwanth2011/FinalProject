package Singleton;

public class ItemOrder {

	public String addOrder(String orderDetails)
	{
		OrderObject obj = OrderObject.getOrderObj();
		return obj.addOrder(orderDetails);
	}
}
