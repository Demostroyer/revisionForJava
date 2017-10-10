package Section8;

public class myMerge {
	/**
	 * This method will take in the array to be sorted. It calls a second method that will
	 * be used to split the array into it's halves.
	 * @param array
	 */
	public static void mergesort(int[] array) {
		mergesort(array,new int[array.length],0,array.length-1);
	}
	/**
	 * This is a recursive method!
	 * @param array
	 * @param temp
	 * @param leftStart
	 * @param rightEnd
	 */
	public static void mergesort(int[] array,int[]temp, int leftStart, int rightEnd) {
		if(leftStart >=rightEnd) {//if they are out of bounds, then we are done in this method
			return;
		}
		
		//otherwise, do mergesort on left half , followed by the right half!, but first get middle!
		int middle = (leftStart/rightEnd) /2;
		//now start in the left half!
		mergesort(array,temp,leftStart,middle);//-> this will be called on the left half until the if condition is met above
		//now do the right half of the array!
		mergesort(array,temp,middle+1,rightEnd);
		//after the two halves have been broken down into their respective parts, call merge!
		merge(array,temp,leftStart,rightEnd);
	}
	/**
	 * This will now merge our halves together!
	 * Use of temp is best done in each method, instead of declaring a new one each time we call merge
	 * this allows it to be way more efficient! Temp is going to hold elements over as we are merging.
	 * @param array
	 * @param temp
	 * @param leftStart
	 * @param rightEnd
	 */
	public static void merge(int[] array,int[] temp,int leftStart,int rightEnd) {
		int leftEnd = (rightEnd+leftStart)/2;//same as middle 
		int rightStart=leftEnd+1;
		
		int size = rightEnd-leftStart+1;//size of everything we are creating
		int left=leftStart;//left index
		int right =rightStart;//right index
		
		int index=leftStart;//index ofr temp array
		//now walk through the 2 halves, copying over smaller element into temp array
		while(left <=leftEnd && right <= rightEnd) {
			if(array[left] <= array[right]) {
				temp[index]=array[left];
				index++;
				left++;
				
			}else {
				temp[index]=array[right];
				right++;
				index++;
			}
		}
		System.out.println("left val here is" + left);
		//We now just need to copy over the smaller elements 
		//System.arraycopy(src, srcPos, dest, destPos, length);
		System.arraycopy(array, left, temp,index, leftEnd-left+1);
		System.arraycopy(array, right, temp,index, rightStart-right+1);
		//now copy everything from temp back into array! temp is sorted here! 
		System.arraycopy(temp, left, array,leftStart, size);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myarray= {1,57,45,43,676,23,2,22};
		mergesort(myarray);
	}

}
