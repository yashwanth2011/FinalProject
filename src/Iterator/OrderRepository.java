package Iterator;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OrderRepository implements Container {
	
	//public String orders[] = {"Order1", "Order2", "Order3"};
	ArrayList<String> orders = new ArrayList<>();

	OrderRepository() throws IOException
	{
		BufferedReader bufReader = new BufferedReader(new FileReader("order.txt"));
		String line = bufReader.readLine();
		while (line != null)
		{
			orders.add(line);
			line = bufReader.readLine();
		}
		bufReader.close();
		
	}
	@Override
	public Iterator getIterator()
	{
		return new OrderIterator();
	}
	
	private class OrderIterator implements Iterator 
	{
		int i;
		@Override
		public boolean hasNext()
		{
			if(i < orders.size())
				return true;
			return false;
		}
		
		@Override
		public Object next()
		{
			if (this.hasNext())
				return orders.get(i++);
			return null;
		}
		
	}

	
	
}
