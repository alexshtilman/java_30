package recursive;
import static recursive.LimitedFunctions.*;
public class RecursiveTestAppl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("pow(10,3) = " + pow(10, 3));
		System.out.println("square(-10) = " + square(10));
		System.out.println("string bala is substring of ballaballaballa " +
		isSubstring("ballaballaballa", "bala"));
		System.out.println("string bala is substring of ballaballabala " +
				isSubstring("ballaballabala", "bala"));
	}

	
}
