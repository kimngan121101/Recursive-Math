public class RecursiveMath {
	// Return sum of numbers from 1 to num
	public static int sum(int num) {
		int result;
		
		if (num == 1)
			result = 1;
		else
			result = num + sum(num - 1);
		
		return result;
	}

	// Implement factorial return num!
	public static int factorial(int num) {
		int result;
		
		if (num == 1)
			result = 1;
		else 
			result = num * factorial(num-1);
		
		return result;
	}
	
	// Implement integer exponents raising x to the power of y
	public static int power(int x, int y) {
		int result;
		
		if (y != 0)
			result = x * power(x, y - 1);
		else 
			result = 1;
		
		return result;
	}

	// Implement Fibonacci sequence
	// fib(0) = 0
	// fib(1) = 1
	// fib(num) = fib(num - 1) + fib(num - 2)
	public static int fib(int num) {
		int result;
		
		if ((num == 0) || (num == 1))
	         result = num;
	     else
	         result = fib(num - 1) + fib(num - 2);
		
		return result;
	}
	
	// Implement Euclidean Greatest Common Divisor (GCD)
	// when y is 0, the value is x
	// otherwise, the value is gcd(y, x % y)
	// 
	public static int gcd(int x, int y) {
		int result;

		if (y == 0)
			result = x;
        else
        	result = gcd(y, x % y);
            
		return result;
	}

	static int testRun = 0;
	static int testPassed = 0;
	static int testFailed = 0;
	
	public static void test(String description, int computedValue, int correctValue) {
		String prefix;
		String suffix;
		
		testRun++;
		
		if (computedValue == correctValue) {
			testPassed++;
			prefix = "+";
			suffix = "";
		} else {
			testFailed++;
			prefix = "-";
			suffix = ", expected " + correctValue;
		}
		
		System.out.println(prefix + " " + description + " returned " + computedValue + suffix);
	}
	
	public static void main(String[] args) {
		test("sum(5)", sum(5), 15);
		test("factorial(5)", factorial(5), 120); 
		test("power(10, 0)", power(10, 0), 1);
		test("power(2, 3)", power(2, 3), 8);
		test("power(3, 2)", power(3, 2), 9);
		test("fib(0)", fib(0), 0);
		test("fib(1)", fib(1), 1);
		test("fib(2)", fib(2), 1); 
		test("fib(3)", fib(3), 2);
		test("fib(4)", fib(4), 3);
		test("fib(5)", fib(5), 5);
		test("gcd(3, 6)", gcd(3, 6), 3);
		test("gcd(8, 60)", gcd(8, 60), 4);
		
		System.out.println();
		System.out.println(
				"For " + testRun + " tests, " +
				testPassed + " passed and " +
				testFailed + " failed"
		);
	}
}
