package recursive;

public class LimitedFunctions {
	private static int multiply(int a, int b) {
		if (b == 0)
			return 0;
		if (b < 0)
			return -multiply(a, -b);
		return a + multiply(a, b - 1);
	}
	/**
	 * 
	 * @param a
	 * @param b positive number
	 * @return a^b throws IllegalArgumentException if b is a negative limitations:
	 *         no operator *; no operator /; no cycles; no additional functions
	 *         applying above limitations; no standard functions
	 */
	public static long pow(int a, int b) {
		if (b < 0)
			throw new IllegalArgumentException();
		return b > 0 ? multiply(a , (int) pow(a, b - 1)) : 1;
	}

	/**
	 * 
	 * @param x
	 * @return x^2 limitations: no *, no /, no additional functions, no cycles
	 */
	public static int square(int x) {
		
		// (x - 1)^2 = x^2 - 2x + 1 => x^2 = (x-1)^2 + 2x -1
				if (x < 0 ) {
					return square(-x);
				}
				if (x == 0) {
					return 0;
				}
				return square(x - 1) + x + x - 1;
		
		
		/* more complex solution
		// i = x/2
		// if (x%2==1)
		// 		return square(i)*4 +i*4 + 1 // 4*i^2 + 4*i + 1
		// else
		//		return square (i) * 4
		// base case
		if (x < 0)
			x = -x;
		if (x < 2) {
			return x;
		}
		// drop last bit from num (divide it by 2)
		int i = x >> 1;

		// if num is even
		if ((x & 1) == 1) {
			return ((square(i) << 2) + (i << 2) + 1);
		}
		// if num is odd
		else {
			return (square(i) << 2);
		}
		*/
	}
	/**
	 * @return true if the second parameter is a substring of the first parameter 
	 * limitations: 
	 *    1. You may apply the following methods of the class String:
	 *       char charAt(int ind); String substring(int ind); int length(); 
	 *    2. No cycles; 
	 *    3. No static fields
	 */
	public static boolean isSubstring(String string, String substr) {
		if (substr.length() == 0)
			return true;
		if (string.length() < substr.length())
			return false;
		if (isPrefix(string, substr)) {
			return true;
		}
		return isSubstring(string.substring(1), substr);
	}

	private static boolean isPrefix(String s1, String s2) {
		if (s2.length() == 0)
			return true;
		if (s1.charAt(0) != s2.charAt(0))
			return false;
		return isPrefix(s1.substring(1), s2.substring(1));
	}
}
