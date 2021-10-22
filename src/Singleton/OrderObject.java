package Singleton;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;  

public class OrderObject {

	private static OrderObject obj = new OrderObject();
	private OrderObject() {}
	public static OrderObject getOrderObj()
	{
		return obj;
	}
	public String addOrder(String orderDetails)
	{
		try
		{
		    FileWriter myWriter = new FileWriter("order.txt", true);
		    myWriter.write(orderDetails + "\n");
		    myWriter.close();
		    return "Order Added!";

		}
		catch (IOException e)
		{
		    return "An error occurred.";
		}
	}
}
