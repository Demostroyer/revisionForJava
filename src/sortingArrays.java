/*
 * This class is used to sort the arrays. I will list all of them as I complete & work on them
 * 1:Insertions sort;
 */
import java.math.*;
import java.util.Arrays;
public class sortingArrays {
	public static void main(String [] args) {
		//make an array size 100, fill it with random numbers. then call the insertion sort method. 
		//after we are just printing it. 
		int[] array = new int[100];
		for(int i =0;i<array.length;i++) {
			array[i]=(int) (Math.random()*100); 
		}
		
		int[] newA=new int[array.length];
		//newA=insertionSort(array); this would require the method to return something
		insertionSort(array);//whereas this does not require it to return anything.
		for(int i =0;i<array.length;i++) {
			System.out.print(array[i] + ", " );
		}
		//reverse a string in java
		String s = "hello";
		String reverse="";
		//convert our string to a char array
		char[] ch=s.toCharArray();
		//this says i starts at the length of ch, our char array. we work backwards till i =0,
		//and we append to reverse a char every iteration.
		for(int i =ch.length-1; i >=0;i--) {
			reverse +=ch[i];
		}
		
		System.out.println("\nUnreversed String is " + s + ", the reversed string is " + reverse);
	}
	//this will sort the array in ascending order
	public static void insertionSort(int[] a) {
		for(int i = 1;i<a.length;i++) {//begin with the second element
			//the current value we are trying to sort, so we see if it is bigger/smaller 
			//than where we are at with j checking the current val, and the val to the left
			int cur= a[i];
			int j=i;//get the index of cur, so work backwards from this index
			while(j >0 && a[j-1] > cur) {//thus a[j-1] must be bigger than cur, so go after cur.
					a[j] = a[j-1];//slide a[j-1] rightward
					j--;//now compare new j against cur and perform the check again to see if this is >/< 
			}//when this while loop finds out that cur is bigger than a[j-1] | that j=0. we place it
			//in the position of the current j. if j=0 then we are at the head. 
			a[j]= cur;//this is the proper place for cur.
		}
		//return a;
	}
}
