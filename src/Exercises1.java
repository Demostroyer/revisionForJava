import java.util.*;
/**
 * @author demps
 * This program will be used for completing the exercises in the Data Structures & Algorithms in Java , 6th Edition book
 * page 55, 1.10 Exercises.
 */
public class Exercises1 {
	
	public static void main(String [] args){
		//working on the isMultiple exercise
		Scanner scan = new Scanner(System.in);
		/*System.out.println("Please enter your first number");
		float n= scan.nextFloat();
		
		System.out.println("Please enter your second number, which should be bigger than your first");
		float m= scan.nextFloat();
		
		boolean answer = false;
		
		answer = isMultiple(n,m);
		if(answer == false){
			System.out.println("The two numbers are not multiples");
		}else{
			System.out.println("Your second number is a multiple of your first number");
		}
		
		boolean answer2 = false;
		int a = 11;
		answer2 = isEven(a);
		if(answer2 == false){
			System.out.println("It is odd");
			
		}else{
			System.out.println("It is even!");
		}*/
		
		int sum;
		System.out.println("Please enter a positive integer, and the summation of all positive integers below your number will be outputted.");
		int number = scan.nextInt();
		sum=sumUp(number);
		System.out.println("The answer is: " + sum);
		
		int oddSum;
		System.out.println("Please enter a positive integer, and the summation of all positive ODD integers below your number will be outputted.");
		int numberSum = scan.nextInt();
		oddSum=sumOdd(number);
		System.out.println("The answer is: " + oddSum);
		
	}
	
	/*
	 * This method will find out of a number is a multiple of another method. 
	 * 
	 */
	public static boolean isMultiple(float n, float m){
		boolean answer = false;
		for(int i =0; i<=n;i++){
			if(m%n ==0){//if the remainder when you divide m by n is 0, its a factor
				answer = true;
			}else{
				answer=false;
			}
		}
		return answer;
		
	}
	/*
	 * This method will find out if the number given to it is an even number, It uses bitwise operators.
	 * bitwise operators convert the value into its binary representation and then completes the task with this value
	 * Ex: below converts the num n into its binary rep, then adds 1. Adding will make the last digit change, if it changes to 1
	 * then it was an even number. if it changes to 0 it was an odd number.
	 */
	public static boolean isEven(int n){
		return (n &1) ==0;
	}
	
	/**
	 * This method sums up all numbers below a given value
	 * @param n
	 * @return count
	 */
	public static int sumUp(int n){
		int count=0;
		for(int i =0;i<n;i++){
			count +=i;
		}
		return count;
	}
	/**
	 * This method will be given a number, then only sum up odd numbers that are less than the given value
	 * @param n
	 * @return count
	 */
	public static int sumOdd(int n){
		int count=0;
		for(int i =0;i<n;i++){
			if(i%2==1){
			count +=i;
			}
		}
		return count;
	}
	
	/**
	 * The following method sums up the number of vowels in a inputted sentence
	 * @param s
	 * @return count
	 */
	public static int sumVowels(String s){
		int count=0;
		String[] vowels={"a,e,i,o,u"};
		for(int i=0;i<s.length();i++){
			for(int j=0;j<vowels.length;j++){
			
			}
		}
		return count;
	}
}
