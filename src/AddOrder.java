import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

import Singleton.ItemOrder;



class AddOrder {
	@Test
	void test() throws IOException {
		ItemOrder Itemobj = new ItemOrder();
    	String msg = Itemobj.addOrder("Order Details");
		assertEquals("Order Added!", msg);
	}

}
