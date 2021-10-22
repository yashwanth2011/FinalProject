import java.io.IOException;
import java.util.Scanner;

import Iterator.PrintOrder;
import NullObjectPattern.VerifyOrder;
import Singleton.ItemOrder;

public class SupplyChain {
	public static void main(String[] args) throws IOException
	{
		ItemOrder Itemobj = new ItemOrder();
		VerifyOrder verifyObj = new VerifyOrder();
		PrintOrder traverseObj = new PrintOrder();

		System.out.println("Enter 1 for add order: ");
	    System.out.println("Enter 2 for verify order: ");
	    System.out.println("Enter 3 for traverse of orders: ");
	    Scanner myObj = new Scanner(System.in);
	    System.out.println("Enter Choice: ");

	    String choice = myObj.nextLine();
	    if (choice.equals("1"))
	    {
		    Scanner myObjOne = new Scanner(System.in);
		    System.out.println("Enter Order Details: ");	    	
		    String orderDetails = myObjOne.nextLine();
	    	String msg = Itemobj.addOrder(orderDetails);
	    	System.out.println(msg);
	    }
	    else if (choice.equals("2"))
	    {
		    Scanner myObjOne = new Scanner(System.in);
		    System.out.println("Enter Order Details: ");
		    String orderDetails = myObjOne.nextLine();
	    	String msg = verifyObj.verify(orderDetails);	
		    System.out.println(msg);
	    }
	    else if (choice.equals("3"))
	    {
		    System.out.println("---Order Details---");
		    traverseObj.traverse();
	    }
	    
	}
}
