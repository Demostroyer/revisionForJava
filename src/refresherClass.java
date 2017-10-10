import java.util.Arrays;

/**
 * 
 * @author demps
 * This class is based on the refresher class in MU
 * date: 11/09/17
 */
public class refresherClass {
	/**
	 * Here i am doing multiple things. Firstly I am printing out a 2d array
	 * then I go onto the ternary operator
	 * i am then calling the counter method, which just goes through the counter and prints its values
	 * then in arrayThings will set values to 42, then prints them out.
	 * the sum method is called on a data array to sum up all of the information
	 * the arrayThings2 creates an array with 50 as its size, sets all values to true. If the value of index is 3 then set it back to false.
	 * i set this value by using module of 3, if the value of this expression is 0, then it is a multiple of 3.   
	 * @param args
	 */
	public static void main(String [] args){
		int[][] myValues = {
				{23,38,14,7},
				{-3,0,14,4},
				{9,13,0,3},
				
		};
		
		int rows=0;
		int cols=4;
		for(int i =0;i<myValues.length;i++)
		{
			rows++;
			
		}
		//print it out
		for(int i = 0;i <rows;i++ ){
			for(int k =0;k<cols;k++){
				System.out.print(myValues[i][k]+ " ");
			}
		}
		
		/*for(int[] row : myValues){
			System.out.println(Arrays.toString(row));
		}*/
		
		/**
		 * Ternary operator
		 * gateSign is assgned the vale y when the Q (count>10) returns true
		 * gateSign is assigned the val n when the Q returns false.
		 */
		int count =25;
		char gateSign = (count >10)?'y':'n';
		System.out.println("\n"+gateSign);
		//equivalent in if code
		if(count>10){
			gateSign ='y';
		}
		
		counter();
		arrayThing();
		
		//creating an array with numbers random numbers; finds the sum of the numbers. 
		double[] data = new double[10];
		for(int i =0;i<data.length;i++){
			data[i] = (Double) (Math.random() * 10);
		}
		
		for(double i : data){
			System.out.println("The original array is:" + data[(int) i]);
		}
		
		double total = sum(data);
		System.out.println("Data sum is: " + total );
		
		/*double[] data2= reverse(data);
		for(double i : data2){
			System.out.println("The reversed array is "+data2[(int) i]);
		
		
		} */
		
		arrayThing2();
		/*
		 * Create instances of the dog class.
		 * this is from day 11 lab 1
		 */
		Dog dog1 = new Dog("golden retriever",false,10);
		Dog dog2 = new Dog("Irish Terrier",false,2);
		Dog dog3 = new Dog("Jack Russel",true,4);
		
		int dog1Age= dog1.dogAge();
		boolean dogDanger =dog1.dogOk();
		String dogType =dog1.dogBreed();
		dog1.bark();
		System.out.println("Dog age is : " +dog1Age + " , is the dog safe? " + dogDanger + " , and the dog breed is : " + dogType);
		//i can do this for them all if I want. 
	}
	public static void counter(){
		int counter=0;
		System.out.println("Before entering the loop the value of the counter is 0");
		while(counter<5){
			
			if(counter==3){
				System.out.println("Three is the magic number");
			}else{
				System.out.println("The value of the counter is -> " + counter);
			}
			counter++;
		}
		System.out.println("Just after leaving the loop because it has finished");
	}
	//day6 lab 1
	
	public static void arrayThing(){
		//basic array, size 10. I will set all vals to 42, then print it out.
		int[] myArray=new int[10];
		for(int row =0;row<myArray.length;row++){
			myArray[row] =42;
		}
		//printing out the array
		for(int row :myArray){
			System.out.println(row);
		}
		//now onto printing out the first and last values of an array
		boolean[] flags = new boolean[20];
		System.out.println(flags[0]);
		System.out.println(flags[19]);
		
}
	
	
	public static double sum(double [] data){
		double total = 0;
		for(double i : data){
			total = total + i;
		}
		return total;
	}
	
	public static double[] reverse(double [] data){
		double[] reverseArray = data;
		int k=0;
		for(int i =data.length; i > data.length;i--){
			reverseArray[k] = data[i];
					k++;
		}
		return reverseArray;
	}
	
	//day 11, lab 1
	/**
	 * The following will create an array of 50 booleans and give each element value of true
	 * I then print it out.
	 * @return array
	 */
	public static boolean[] arrayThing2(){
		System.out.println(" ");
		boolean[] myArray = new boolean[50];
		for(int i =0;i<myArray.length;i++){
			
			myArray[i] =true;
			if(i%3==0){
				myArray[i]=false;
			}
			System.out.println("The index is:" + i + " and the value is " + myArray[i]);
		}
		return null;
	}
	
}
