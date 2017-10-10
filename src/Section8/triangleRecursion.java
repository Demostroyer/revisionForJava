package Section8;

public class triangleRecursion {

	
	public static void main(String[]args) {
		
		System.out.println(triangle(10));
	}

		public static int triangle(int n) {
			int total=0;
			while(n>=1) {
				total+=n;
				n--;
			}
			return total;
			
		}
	}


