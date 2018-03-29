import static org.junit.Assert.*;

import org.junit.Test;

public class OperatorsTest {

	@Test
	public void test() {
		
		int output = Operators.getInstance().Add(3, 5);
		
		int expected = 8;
		
		assertEquals(expected, output);
	}
}