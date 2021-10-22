package Iterator;

import java.io.IOException;

public class PrintOrder {
	public void traverse() throws IOException
	{
		OrderRepository orderrepository = new OrderRepository();
		
		for(Iterator i = orderrepository.getIterator(); i.hasNext();)
		{
			String order = (String)i.next();
			System.out.println(order);
		}
	}

}
