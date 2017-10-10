
public class refresherClass2 {

	public static void main(String [] args){
		int num = 256;
		System.out.println("The first digit is "+num/100);
		System.out.println("The second digit is "+ (num/10)%10);
		System.out.println("The third digit is "+num%10);
		int num1= 1001;
		boolean answer = isPalindrome(num1);
		if(answer == true){
			System.out.println("The number is a palindorome");
			
		}else{
			System.out.println("The number is not a palindrome.");
		}
		//This is just to show how the values change in a while loop.
		int count = 1;
		int result = 1;
		while(count <10)
		{
		 result = result + (result%count);
		 //System.out.println("Current value of result is: " + result);
		 count++;
		}
		System.out.println("Count: " + count);
		System.out.println("Result: " + result);
	}
	/**
	 * Checks if a given number is a palindrome. 
	 * @param num
	 * @return bool
	 */
	public static boolean isPalindrome(int num){
		int pal = num;
		int reverse=0;
		//computing the reverse
		while(pal !=0){
			int remainder = pal % 10;//getting each digit
			reverse = reverse *10 + remainder;//building up the possible reversed number.
			pal = pal/10;//cutting down the size of the number to check. 
		}
		return reverse == num;//and the final check. it will return true if this returns true. 
	}
}
