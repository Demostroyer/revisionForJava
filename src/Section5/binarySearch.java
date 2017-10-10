package Section5;

public class binarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]array= {1,2,3,4,5,6,8};
		
		System.out.println("Is 5 in the array? "+binarySearch(array,5,0,array.length-1));
	}
	
	public static boolean binarySearch(int[] array, int target,int start, int end) {
		if(start>end)return false;//so it was not found
		int mid =(start+end) /2;
		if(target==array[mid]) {
			return true;
		}else if(target< array[mid]) {
			return binarySearch(array,target,start,mid-1);
		}else {
			return binarySearch(array,target,mid+1,end);
		}
	}

}
