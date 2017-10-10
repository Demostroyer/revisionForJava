package Section3;

import java.util.Arrays;

public class sumArray {
	static int[]pair;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//make an int array and the target
		int[] myArray= {3,2,4};
		int sum=6;
		
		pair=twoSum(myArray,sum);
		System.out.println("The index of each element is: " + pair[0]+ " "+pair[1]);
	}
	public static int[] twoSum(int[] nums, int target) {
        //create upper and lower bounds.
		int[]solution = new int[2];
		int lowerBound = 0;
		int upperBound = nums.length-1;
        
		//so now we must go through the array, looping with pairs. Condition based on the two bounds crossing
		while(lowerBound< upperBound) {
            //sort the array in here, so that the unsorted array is still outside. and therefore we can pull the unsorted arrays index out
            //as the answer
            Arrays.sort(nums);//turns an array of say {3,2,4} into {2,3,4}, this sorted array is then checked.
			//if the total is bigger than target, move left
			if(nums[lowerBound] + (nums[upperBound]) > target) {
				upperBound--;
			//if the total is smaller that then target, move right 	
			}else if(nums[lowerBound] + (nums[upperBound]) <target) {
				lowerBound++;
			//it was found then.
			}else {
				solution[0]=lowerBound;
				solution[1]=upperBound;
				System.out.println("The pair of numbers totalling your target is " + nums[lowerBound] + " + "+ nums[upperBound]);
				break;
			}
		}
        
    return solution;}

}
