package Section8;
/**
 * Making my own mergeSort method. 
 * This method will use the idea of recursion to split the area we are working on into halves.
 * This will work until we reach the single value , this is sorted obviously! 
 * merge method:
  	•theArray is the array being sorted
	•first, second and upperBound define the edges of the two halves being sorted. 
		•first and second are incremented as items are copied into the workspace
	•first until second - 1 is the first half
	•second until upperBound is the second half
	•workSpace is the intermediate array into which values are copied
 * recMergeSort method:
	•Computes the midpoint
	•Calls recMergeSort method on each of the halves
	•Calls merge method to merge the two sorted halves back together
	•Base case is when the range contains only one element (lowerBound==upperBound)
	•A single element is always sorted (obviously!) so it just returns itself
 * @author demps
 *
 */
public class merge_Sort {
	static int[] theArray= {111,2,54,34,78,0,23};
	static int[] workSpace= new int[theArray.length];
	public static void main(String[] args) {
		recMergeSort(workSpace,0,theArray.length-1);//has to be -1 because we start at index 0!
		System.out.print("[");
		for(int i =0;i<theArray.length;i++) {
			if(i!=0) {
				System.out.print(","+theArray[i]);
			}else {
				System.out.print(theArray[i]);
			}
		}System.out.println("]");
	}
		
	
	public static void merge(int[] workSpace,int first, int second, int upperBound) {
		int j=0;//workspace index
		int lowerBound=first;
		int mid=second -1;
		int n=upperBound-lowerBound+1;//number of items
		
		while(first<=mid && second<=upperBound) {//halves are not empty
			if(theArray[first] < theArray[second]) {
				workSpace[j++]= theArray[first++];//j++ or first++ or second++ means the current index of each is used,
				//THEN after using this index, we increment the value of j,first or second. 
			
			}else {
				workSpace[j++]=theArray[second++];
			}
		}
		while(first<=mid) {//check first half for remaining
			workSpace[j++]=theArray[first++];
		}
		while(second<=upperBound) {//check second half for remaining
			workSpace[j++]=theArray[second++];
		}
		for(j=0;j<n;j++) {
			theArray[lowerBound+j]=workSpace[j];//copy the workSpace array back into the original
		}	
	}
	public static int[] recMergeSort(int[] workSpace1,int lowerBound,int upperBound) {
		if(lowerBound==upperBound) {
			return workSpace1;//if range is 1, no use sorting as it already is!
		}
		else {
			//find midpoint!
			int mid =(lowerBound+upperBound) /2;
			recMergeSort(workSpace1,lowerBound,mid);//sort the lower half
			recMergeSort(workSpace1,mid+1,upperBound);//sort the upper half
			//now merge them!
			merge(workSpace1,lowerBound,mid+1,upperBound);
		
		}
		return workSpace1;
		
	}
}

