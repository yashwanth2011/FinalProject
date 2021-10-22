package NullObjectPattern;
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

public class OrderRepository {

	public static AbstractOrder getOrder(String orderId) throws IOException
	{
		BufferedReader bufReader = new BufferedReader(new FileReader("order.txt"));
		ArrayList<String> orders = new ArrayList<>();
		String line = bufReader.readLine();
		while (line != null)
		{
			orders.add(line);
			line = bufReader.readLine();
		}
		bufReader.close();

		boolean exists = orders.contains(orderId);
		if (exists)
			return new RealOrder(orderId);
		return new FakeOrder();
	}
}
