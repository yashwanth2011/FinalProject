package MVC;

public class OrderController {
	
	private Order model;
	private OrderView view;

	public OrderController(Order model, OrderView view)
	{
		this.model = model;
		this.view = view;
	}
	
	public void setOrderDetails(String orderDetails)
	{
		model.setorderDetails(orderDetails);
	}
	
	public String getOrderDetails()
	{
		return model.getorderDetails();
	}
	
	public void updateView()
	{
		view.printOrderDetails(model.getorderDetails());
	}
}
