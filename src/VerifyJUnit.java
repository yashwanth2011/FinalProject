import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import NullObjectPattern.VerifyOrder;

class VerifyJUnit {

	@Test
	void test() throws IOException {
		VerifyOrder verifyObj = new VerifyOrder();
    	String msg = verifyObj.verify("Heyyalsdasld");	
		assertEquals("Fake Order", msg);
	}

}
