
public final class Operators {

	private static final Operators INSTANCE = new Operators();

    private Operators() {}

    public static Operators getInstance() {
        return INSTANCE;
    }
	
	public int Add(int x, int y) {
		return x - y;
	}
	
	public float Add(float x, float y) {
		return x + y;
	}
	
	public String Add(String x, String y) {
		return x + y;
	}
	
	public char Add(char x, char y) {
		return (char) (x + y);
	}
	
	public double Add(double x, double y) {
		return x + y;
	}
	
	public int Subtract(int x, int y) {
		return x - y;
	}
	
	public float Subtract(float x, float y) {
		return x - y;
	}
	
	public char Subtract(char x, char y) {
		return (char) (x - y);
	}
	
	public double Subtract(double x, double y) {
		return x - y;
	}
	
	public int Multiply(int x, int y) {
		return x * y;
	}
	
	public float Multiply(float x, float y) {
		return x * y;
	}
	
	public String Multiply(String x, int y) {
		
		String temp = "";
		for(int i = 0; i < y; i++) {
			temp += x;
		}
		return temp;
	}
	
	public double Multilply(double x, double y) {
		return x * y;
	}
	
	public int Divide(int x, int y) {
		return x / y;
	}
	
	public float Divide(float x, float y) {
		return x / y;
	}
	
	public double Divide(double x, double y) {
		return x / y;
	}
	
	public int Modulus(int x, int y) {
		return x % y;
	}

	public float Modulus(float x, float y) {
		return x % y;
	}
	
	public double Modulus(double x, double y) {
		return x % y;
	}
	
	public int Increment(int x) {
		return ++x;
	}
	
	public float Increment(float x) {
		return ++x;
	}
	
	public double Increment(double x) {
		return ++x;
	}
	
	public int Decrement(int x) {
		return --x;
	}
	
	public float Decrement(float x) {
		return --x;
	}
	
	public double Decrement(double x) {
		return --x;
	}
	
	public boolean Equal(int x, int y) {
		return x == y;
	}
	
	public boolean Equal(float x, float y) {
		return x == y;
	}
	
	public boolean Equal(double x, double y) {
		return x == y;
	}
	
	public boolean Equal(String x, String y) {
		return x == y;
	}
	
	public boolean NotEqual(int x, int y) {
		return x != y;
	}
	
	public boolean NotEqual(float x, float y) {
		return x != y;
	}
	
	public boolean NotEqual(double x, double y) {
		return x != y;
	}
	
	public boolean NotEqual(String x, String y) {
		return x != y;
	}

	public boolean LessThan(int x, int y) {
		return x < y;
	}
	
	public boolean LessThan(float x, float y) {
		return x < y;
	}
	
	public boolean LessThanEqual(int x, int y) {
		return x <= y;
	}
	
	public boolean LessThanEqual(float x, float y) {
		return x <= y;
	}
	
	public boolean GreaterThan(int x, int y) {
		return x > y;
	}
	
	public boolean GreaterThan(float x, float y) {
		return x > y;
	}
	
	public boolean GreaterThanEqual(int x, int y) {
		return x >= y;
	}
	
	public boolean GreaterThanEqual(float x, float y) {
		return x >= y;
	}
	
	public boolean LogicalAnd(boolean x, boolean y) {
		return x && y;
	}
	
	public boolean LogicalOr(boolean x, boolean y) {
		return x || y;
	}
	
	public boolean LogicalNot(boolean x) {
		return !x;
	}
	
	public int BitwiseAnd(int x, int y) {
		return x & y;
	}
	
	public int BitwiseOr(int x, int y) {
		return x | y;
	}
	
	public int BitwiseXor(int x, int y) {
		return x ^ y;
	}
	
	public int BitwiseComplement(int x) {
		return ~x;
	}
	
	public int LeftShiftOperator(int x, int y) {
		return x << y;
	}
	
	public int RightShiftOperator(int x, int y) {
		return x >> y;
	}
	
	public static void main(String[] args) {
		System.out.println(Operators.getInstance().Add(4, 5));
	}
}