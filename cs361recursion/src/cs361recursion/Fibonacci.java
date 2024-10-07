/**
 * 
 */
package cs361recursion;

/**
 * @author cscharff
 *
 */
public class Fibonacci {

	/**
	 * fibonacci function
	 * 
	 * @param n
	 * @return the fibonacci of n
	 * @throws IllegalArgumentException if n < 0 or n > 46. Fibonacci should not
	 *                                  accept a negative number as an argument. For
	 *                                  n > 45, fibonacci(n) is not an int anymore.
	 */
	public static int fibonacci(int n) {
		if (n < 0 || n > 45) {
			throw new IllegalArgumentException("n should be between 0 and 45");
		} else {
			if (n == 0) {
				return 0; //Fibonacchi of 0 is 0
			} else if (n == 1) {
				return 1; //Fibonacchi of 1 is 1
			}
			{
				return fibonacci(n - 1) + fibonacci(n - 2);
			}
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//45 is the limit for fibonachi
		for (int i = 0; i <= 45; i++) {
			System.out.println("Fibonacci(" + i + ") = " + fibonacci(i));
		}

	}

}
