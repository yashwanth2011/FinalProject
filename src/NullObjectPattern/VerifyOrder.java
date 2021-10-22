package NullObjectPattern;

import java.io.IOException;

public class VerifyOrder {
	
	public String verify(String orderDetails) throws IOException
	{
		AbstractOrder order = OrderRepository.getOrder(orderDetails);
		return order.getOrderDetails();
	}

}
