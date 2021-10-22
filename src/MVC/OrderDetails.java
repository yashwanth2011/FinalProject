package MVC;

public class OrderDetails {
	
	public static void main(String[] args)
	{
		Order order = new Order();
		order.setorderDetails("Coca Cola Order");
		
		OrderView objView = new OrderView();
		OrderController objController = new OrderController(order, objView);
		
		objController.updateView();
		
		
	}

	

}
