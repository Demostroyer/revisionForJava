import java.util.*;
public class DoorTest{

	public static void main(String [] args){
		boolean status = false;
		//make a door
		door d = new door(status);
		
		//just going to mess to see what way is static and not. 
		//the below doesnt work, because isOpen is NOT static!! isOpen is an instance method.
		//door.isOpen();
		//instance vars/methods are not crated with the word STATIC. 
		
		//now to change door status to open
		status = d.isOpen();
		int decider = 0;
		//now to just run this a bit, using rand to make it switch between open and closed!
		for(int i =0; i < 10;i++){
			decider =(int) (Math.random() * 10);
			if(decider < 5){//0 = false, so us d.isClosed()
				status = d.isClosed();
			}else{
				status = d.isOpen();
			}
			//now print out each result
			System.out.println("Result of each instance is : " + status);
		}
		
		//some array messing around stuff
		double[] data = new double[10];
		for(int i =0;i<data.length;i++){
			data[i] = (Double) (Math.random() * 10);
		}
		//print out elements of data:
		for(int i =0;i<data.length;i++){
			System.out.println(i+" : "+data[i]);
		}
		
		double total = sum(data);
		System.out.println("Data sum is: " + total );
		
		double max = maxNum(data);
		System.out.println("Data max number is : " + max);
	}
	//sum up an array
	public static double sum(double [] data){
		double total = 0;
		for(double i : data){
			total = total + i;
		}
		return total;
	}
	//find max in a non empty array
	public static double maxNum(double [] data){
		double max = data[0];//current max is the first number
		for(int i = 0;i<data.length;i++){
			if(data[i] > max){
				max = data[i];
			}
		}
		return max;
	}




}