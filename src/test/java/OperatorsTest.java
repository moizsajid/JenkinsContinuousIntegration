import static org.junit.Assert.*;

import org.junit.Test;

public class OperatorsTest {

	@Test
	public void test01() {
		
		int x = 3;
		int y = 5;
		
		int output = Operators.getInstance().Add(x, y);
		
		int expected = 8;
		
		assertEquals(expected, output);
	}
	
	@Test
	public void test02() {
		
		float x = 3.0f;
		float y = 5.0f;
		
		float output = Operators.getInstance().Add(x, y);
		
		float expected = 8;
		
		assertEquals(expected, output, 0f);
	}
	
	@Test
	public void test03() {
		
		String x = "Hello";
		String y = "World";
		
		String output = Operators.getInstance().Add(x, y);
		
		String expected = "HelloWorld";
		
		assertEquals(expected, output);
	}
	
	@Test
	public void test04() {
		
		double x = 3.0f;
		double y = 5.0f;
		
		double output = Operators.getInstance().Add(x, y);
		
		double expected = 8;
		
		assertEquals(expected, output, 0f);
	}
	
	@Test
	public void test05() {
		
		char x = '0';
		char y = '1';
		
		char output = Operators.getInstance().Add(x, y);
		
		char expected = 'a';
		
		assertEquals(expected, output);
	}
	
	@Test
	public void test06() {
		
		int x = 5;
		int y = 3;
		
		int output = Operators.getInstance().Subtract(x, y);
		
		int expected = 2;
		
		assertEquals(expected, output);
	}
	
	@Test
	public void test07() {
		
		float x = 5f;
		float y = 3f;
		
		float output = Operators.getInstance().Subtract(x, y);
		
		float expected = 2f;
		
		assertEquals(expected, output, 0f);
	}
	
	@Test
	public void test08() {
		
		double x = 5f;
		double y = 3f;
		
		double output = Operators.getInstance().Subtract(x, y);
		
		double expected = 2f;
		
		assertEquals(expected, output, 0f);
	}
	
	@Test
	public void test09() {
		
		char x = 'a';
		char y = '0';
		
		char output = Operators.getInstance().Subtract(x, y);
		
		char expected = '1';
		
		assertEquals(expected, output);
	}
	
	@Test
	public void test10() {
		
		int x = 3;
		int y = 5;
		
		int output = Operators.getInstance().Multiply(x, y);
		
		int expected = 15;
		
		assertEquals(expected, output);
	}
	
	@Test
	public void test11() {
		
		float x = 3f;
		float y = 5f;
		
		float output = Operators.getInstance().Multiply(x, y);
		
		float expected = 15f;
		
		assertEquals(expected, output, 0f);
	}
	
	@Test
	public void test12() {
		
		String x = "Hello";
		int y = 2;
		
		String output = Operators.getInstance().Multiply(x, y);
		
		String expected = "HelloHello";
		
		assertEquals(expected, output);
	}
	
	@Test
	public void test13() {
		
		int x = 15;
		int y = 3;
		
		int output = Operators.getInstance().Divide(x, y);
		
		int expected = 5;
		
		assertEquals(expected, output);
	}
	
	@Test
	public void test14() {
		
		float x = 15f;
		float y = 3f;
		
		float output = Operators.getInstance().Divide(x, y);
		
		float expected = 5f;
		
		assertEquals(expected, output, 0f);
	}
	
	@Test
	public void test15() {
		
		double x = 15f;
		double y = 3f;
		
		double output = Operators.getInstance().Divide(x, y);
		
		double expected = 5f;
		
		assertEquals(expected, output, 0f);
	}
	
	@Test
	public void test16() {
		
		int x = 15;
		int y = 3;
		
		int output = Operators.getInstance().Modulus(x, y);
		
		int expected = 0;
		
		assertEquals(expected, output);
	}
	
	@Test
	public void test17() {
		
		int x = 15;
		
		int output = Operators.getInstance().Increment(x);
		
		int expected = 16;
		
		assertEquals(expected, output);
	}
	
	@Test
	public void test18() {
		
		float x = 15f;
		
		float output = Operators.getInstance().Increment(x);
		
		float expected = 16f;
		
		assertEquals(expected, output, 0f);
	}
	
	@Test
	public void test19() {
		
		double x = 15f;
		
		double output = Operators.getInstance().Increment(x);
		
		double expected = 16f;
		
		assertEquals(expected, output, 0f);
	}
	
	@Test
	public void test20() {
		
		int x = 15;
		
		int output = Operators.getInstance().Decrement(x);
		
		int expected = 14;
		
		assertEquals(expected, output);
	}
	
	@Test
	public void test21() {
		
		float x = 15f;
		
		float output = Operators.getInstance().Decrement(x);
		
		float expected = 14f;
		
		assertEquals(expected, output, 0f);
	}
	
	@Test
	public void test22() {
		
		double x = 15f;
		
		double output = Operators.getInstance().Decrement(x);
		
		double expected = 14f;
		
		assertEquals(expected, output, 0f);
	}
	
	@Test
	public void test23() {
		
		int x = 15;
		int y = 15;
		
		boolean output = Operators.getInstance().Equal(x, y);
		
		boolean expected = true;
		
		assertEquals(expected, output);
	}
	
	@Test
	public void test24() {
		
		float x = 15f;
		float y = 15f;
		
		boolean output = Operators.getInstance().Equal(x, y);
		
		boolean expected = true;
		
		assertEquals(expected, output);
	}
	
	@Test
	public void test25() {
		
		double x = 15f;
		double y = 15f;
		
		boolean output = Operators.getInstance().Equal(x, y);
		
		boolean expected = true;
		
		assertEquals(expected, output);
	}
	
	@Test
	public void test26() {
		
		int x = 15;
		int y = 14;
		
		boolean output = Operators.getInstance().NotEqual(x, y);
		
		boolean expected = true;
		
		assertEquals(expected, output);
	}
	
	@Test
	public void test27() {
		
		float x = 15f;
		float y = 14f;
		
		boolean output = Operators.getInstance().NotEqual(x, y);
		
		boolean expected = true;
		
		assertEquals(expected, output);
	}
	
	@Test
	public void test28() {
		
		double x = 15f;
		double y = 14f;
		
		boolean output = Operators.getInstance().NotEqual(x, y);
		
		boolean expected = true;;
		
		assertEquals(expected, output);
	}
	
	
}