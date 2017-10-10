package Section5;
/*
 * Just an example of recursion!
 */
public class fractalRecursion {
	public static void main(String [] args) {
		System.out.println(" "+factorial(3));
	}
	//returns the total after recurively foing through the factorial
	public static int factorial(int n) throws IllegalArgumentException {
		if(n<0) {//if <0, then it cant be worked on, based on def of factorial
			throw new IllegalArgumentException();
		}
		else if(n==0) {//if n is 0, then we return 1
			return 1;
			
		}else {//else perform the math, whici is n*(n-1)	*(n-2)*....1
			return n * factorial(n-1);
		}
	}
}
